/* ========================================================
   INTERACTIVE JS PLAYGROUND — SCRIPT
   Demonstrates: DOM Manipulation, Control Structures,
                 Loops, and Form Validation
   ======================================================== */

document.addEventListener('DOMContentLoaded', () => {

    /* ====================================================
       1. REGISTRATION FORM — REAL-TIME VALIDATION
       ==================================================== */
    const form = document.getElementById('reg-form');
    const nameIn = document.getElementById('fullname');
    const emailIn = document.getElementById('email');
    const passIn = document.getElementById('password');
    const confirmIn = document.getElementById('confirm-password');
    const submitBtn = document.getElementById('submit-btn');
    const successEl = document.getElementById('form-success');

    // Helper: set error state on an input
    function setError(input, errorId, message) {
        input.classList.add('input-error');
        input.classList.remove('input-valid');
        document.getElementById(errorId).textContent = message;
    }

    // Helper: set valid state on an input
    function setValid(input, errorId) {
        input.classList.remove('input-error');
        input.classList.add('input-valid');
        document.getElementById(errorId).textContent = '';
    }

    // --- Validate Full Name (control structure: if/else) ---
    function validateName() {
        const value = nameIn.value.trim();
        if (value.length === 0) {
            setError(nameIn, 'fullname-error', 'Name is required.');
            return false;
        } else if (value.length < 2) {
            setError(nameIn, 'fullname-error', 'Name must be at least 2 characters.');
            return false;
        } else {
            setValid(nameIn, 'fullname-error');
            return true;
        }
    }

    // --- Validate Email (regex + if/else) ---
    function validateEmail() {
        const value = emailIn.value.trim();
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (value.length === 0) {
            setError(emailIn, 'email-error', 'Email is required.');
            return false;
        } else if (!emailRegex.test(value)) {
            setError(emailIn, 'email-error', 'Please enter a valid email address.');
            return false;
        } else {
            setValid(emailIn, 'email-error');
            return true;
        }
    }

    // --- Validate Password (strength meter + if/else) ---
    function validatePassword() {
        const value = passIn.value;
        const strengthBar = document.getElementById('strength-bar');
        let strength = 0;

        // Control structure: series of if checks to build a score
        if (value.length >= 8) strength++;
        if (/[A-Z]/.test(value)) strength++;
        if (/[0-9]/.test(value)) strength++;
        if (/[^A-Za-z0-9]/.test(value)) strength++;

        // Switch statement to set the strength bar colour + width
        switch (strength) {
            case 0:
                strengthBar.style.width = '0%';
                strengthBar.style.background = 'transparent';
                break;
            case 1:
                strengthBar.style.width = '25%';
                strengthBar.style.background = 'var(--error)';
                break;
            case 2:
                strengthBar.style.width = '50%';
                strengthBar.style.background = 'var(--warning)';
                break;
            case 3:
                strengthBar.style.width = '75%';
                strengthBar.style.background = '#a8d65c';
                break;
            case 4:
                strengthBar.style.width = '100%';
                strengthBar.style.background = 'var(--success)';
                break;
            default:
                break;
        }

        if (value.length === 0) {
            setError(passIn, 'password-error', 'Password is required.');
            return false;
        } else if (value.length < 8) {
            setError(passIn, 'password-error', 'Password must be at least 8 characters.');
            return false;
        } else if (!/[A-Z]/.test(value)) {
            setError(passIn, 'password-error', 'Include at least one uppercase letter.');
            return false;
        } else if (!/[0-9]/.test(value)) {
            setError(passIn, 'password-error', 'Include at least one number.');
            return false;
        } else {
            setValid(passIn, 'password-error');
            return true;
        }
    }

    // --- Confirm Password (if/else) ---
    function validateConfirm() {
        const value = confirmIn.value;
        if (value.length === 0) {
            setError(confirmIn, 'confirm-password-error', 'Please confirm your password.');
            return false;
        } else if (value !== passIn.value) {
            setError(confirmIn, 'confirm-password-error', 'Passwords do not match.');
            return false;
        } else {
            setValid(confirmIn, 'confirm-password-error');
            return true;
        }
    }

    // Real-time validation on input events
    nameIn.addEventListener('input', validateName);
    emailIn.addEventListener('input', validateEmail);
    passIn.addEventListener('input', () => {
        validatePassword();
        if (confirmIn.value.length > 0) validateConfirm();
    });
    confirmIn.addEventListener('input', validateConfirm);

    // Form submit handler
    form.addEventListener('submit', (e) => {
        e.preventDefault();

        // Run all validators (short-circuit avoided with individual calls)
        const isNameOk = validateName();
        const isEmailOk = validateEmail();
        const isPassOk = validatePassword();
        const isConfirmOk = validateConfirm();

        if (isNameOk && isEmailOk && isPassOk && isConfirmOk) {
            successEl.classList.remove('hidden');
            submitBtn.textContent = '✓ Registered';
            submitBtn.disabled = true;
            submitBtn.style.opacity = '0.6';
        } else {
            successEl.classList.add('hidden');
        }
    });


    /* ====================================================
       2. DYNAMIC TO-DO LIST — DOM MANIPULATION & LOOPS
       ==================================================== */
    const todoInput = document.getElementById('todo-input');
    const addTodoBtn = document.getElementById('add-todo-btn');
    const todoList = document.getElementById('todo-list');
    const todoSummary = document.getElementById('todo-summary');

    let todos = []; // Array of { text, completed }

    // Render the entire list using a forEach loop
    function renderTodos() {
        todoList.innerHTML = ''; // Clear existing DOM nodes

        todos.forEach((todo, index) => {
            // DOM manipulation: createElement
            const li = document.createElement('li');
            if (todo.completed) li.classList.add('completed');

            const span = document.createElement('span');
            span.className = 'todo-text';
            span.textContent = todo.text;

            const checkBtn = document.createElement('button');
            checkBtn.className = 'todo-check';
            checkBtn.textContent = todo.completed ? '↩️' : '✔️';
            checkBtn.title = todo.completed ? 'Undo' : 'Complete';
            checkBtn.addEventListener('click', () => toggleTodo(index));

            const deleteBtn = document.createElement('button');
            deleteBtn.className = 'todo-delete';
            deleteBtn.textContent = '🗑️';
            deleteBtn.title = 'Delete';
            deleteBtn.addEventListener('click', () => deleteTodo(index));

            // DOM manipulation: appendChild
            li.appendChild(checkBtn);
            li.appendChild(span);
            li.appendChild(deleteBtn);
            todoList.appendChild(li);
        });

        updateTodoSummary();
    }

    function addTodo() {
        const text = todoInput.value.trim();
        if (text.length === 0) return;
        todos.push({ text, completed: false });
        todoInput.value = '';
        renderTodos();
        todoInput.focus();
    }

    function toggleTodo(index) {
        todos[index].completed = !todos[index].completed;
        renderTodos();
    }

    function deleteTodo(index) {
        todos.splice(index, 1);
        renderTodos();
    }

    // Summary using for loop
    function updateTodoSummary() {
        let completed = 0;
        for (let i = 0; i < todos.length; i++) {
            if (todos[i].completed) completed++;
        }
        const total = todos.length;
        if (total === 0) {
            todoSummary.textContent = 'No tasks yet. Add one above!';
        } else {
            todoSummary.textContent = `${completed} of ${total} task${total > 1 ? 's' : ''} completed`;
        }
    }

    addTodoBtn.addEventListener('click', addTodo);
    todoInput.addEventListener('keydown', (e) => {
        if (e.key === 'Enter') addTodo();
    });


});
