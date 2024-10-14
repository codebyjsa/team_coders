// console.log("hello")
// let a=5
// let b=10
// alert((a+b)*10)
// console.log(a+b)
// let c = 2

// if (condition) {
//     alert(a+" is less than "+b+" then")
// }
// else
// {
//     alert(b+" is less than "+a+" else")
// }


//For checking odd-even
// let a=2
// if (a%2==0) {
//     alert(a+" is even number.")
// }
// else{
//     alert(a+" is odd number.")
// }

// For oprations
// let a = 2
// let b =3
// let c = 'a'
// switch (c) {
//     case '+':
//         alert(a+c+b+'='+(a+b))
//         break;

//     case '-':
//         alert(a+c+b+'='+(a-b))
//         break;

//     case '*':
//         alert(a+c+b+'='+(a*b))
//         break;

//     case '/':
//         alert(a+c+b+'='+(a/b))
//         break;

//     default:
//         alert("Sorry no operations performed!")
//         break;
// }

// Eligibility for vote
// let a = 17
// let c= a>=18?alert('You are eligible to vote!'):alert('You are not eligible to vote!')

// To check leap year
// let a=2023
// if (a%4==0) {
//     alert(a+' is a leap year!')
// }
// else{
//     alert(a+' is not a leap year!')
// }

// loops
// for(i=1; i<=10; i++){
//     console.log(i)
//     console.log('Hello')
// }

// to print odd and even

// First try

// let a=prompt("How many time do you want to enter number")
// let b=0

// if (a<0) {
//     alert("Wrong input!")
// }
// else if (a==0) {
//     alert("OK, have a nice day!")
// }
// else{
//     for(let i=1; i<=a; i++){
//         b+=prompt("Enter a number")
//         b*=10
//     }
//     alert("Check list of odd and even numbers in console!")
//     console.log("Even Numbers List")
//     for(let j=1; j<=a; j++){
//         let remainder=b%10
//         if (remainder%2==0) {
//             console.log(remainder)
//         }
//     }
//     console.log("Odd Numbers List")
//     for(let k=1; k<=a; k++){
//         let remainder1=b%10
//         if (remainder1%2!=0) {
//             console.log(remainder1)
//         }
//     }
// }

// Second Try

// var arr = [1, 2, 3, 4, 5, 6];

// console.log("Even list")
// for (var i = 0; i < arr.length; i++) {
//     if (arr[i] % 2 == 0) {
//         console.log(arr[i] + "");
//     }
// }
// console.log("Odd list")
// for (var i = 0; i < arr.length; i++) {
//     if (arr[i] % 2 != 0) {
//         console.log(arr[i] + "");
//     }
// }

// Third Try

// alert("We will take six numbers from you!")
// let a=prompt("Enter a number")
// let b=prompt("Enter another number")
// let c=prompt("Enter another number")
// let d=prompt("Enter another number")
// let e=prompt("Enter another number")
// let f=prompt("Enter last number ")

// let num=6

// alert("Now check console!")

// console.log("List of Even numbers")
// if (a%2==0) {
//     console.log(a)
//     }
// else if (b%2==0) {
//     console.log(b)
// }
// else if (c%2==0) {
//     console.log(c)
// }
// else if (d%2==0) {
//     console.log(d)
// }
// else if (e%2==0) {
//     console.log(e)
// }
// else if (f%2==0) {
//     console.log(f)
// }

// Fourth Try

// Remember to make list odd and even between :)

// num1 = prompt("Enter first positive limit")
// num2 = prompt("Enter second positive limit")

// if (num1<0 || num2<0 || num1>num2 || (num1==0 && num2==0)) {
//     alert("Wrong input: May be negative values or first limit greater than second limit is  inserted! Refresh the browser to work again!")
// }
// else{
    
//     let even_list=''
//     let odd_list=''
//     for(let i=num1; i<=num2; i++){
//             if(i%2==0){
//                 // console.log(i+" ")
//                 if(even_list!=''){
//                     even_list=even_list+', '
//                 }
//                 even_list=even_list+i      
//             }
//             else{
                
//                 if(odd_list!=''){
//                     odd_list=odd_list+', '
//                 }
//                 odd_list=odd_list+i
//             }
//         }
//         console.log("List of Even Numbers")
//         console.log(even_list)
//         console.log("List of Odd Numbers")
//         console.log(odd_list)
// }


// Prime Numbers
// let a=prompt("Enter a number")

// for(let i=2; i<a; i++){
//     if (a%i==0) {
//         alert("This is not a prime number!")
//         break
//     }
//     else{
//         alert("This is prime number")
//     }
// }

// Prime numbers between two numbers

// First Try
// let num1=parseInt(prompt("Enter first positive limit"))
// let num2=parseInt(prompt("Enter second positive limit"))

// if(num1<0 || num2<0 || num1>num2 || (num1==0 && num2==0)){
//         alert("Wrong input: May be negative values or first limit greater than second limit is  inserted! Refresh the browser to work again!")
        
// }
// else{
//     let prime_number=''
//     for(let j=num1; j<=num2; j++){
//         if (j==0 || j==1) {
//             alert("First number cannot be less to or equal to 1!")
//         }
//         else{
//             let prime_flag=true
//             for(let k=2; k<j; k++){
//                 if (j%k==0) {
//                     prime_flag=false
//                     break
//                 }   
//             }
//             if(prime_flag==true){
//                 if(prime_number!=''){
//                     prime_number=prime_number+', '
//                 }
//                 prime_number=prime_number+j
//             }
            
//         }
//     }
//     console.log("Prime numbers list")
//     console.log(prime_number)
// }

// Second Try
// let num1=prompt("Enter first positive limit")
// let num2=prompt("Enter second positive limit")

// if (num1<0 || num2<0 || num1>num2 || (num1==0 && num2==0)) {
//     alert("Wrong input: May be negative values or first limit greater than second limit is  inserted! Refresh the browser to work again!")
// }
// else{
//     let count=0 ;
//     let prime_number = "";
//     for(let i=num1; i<=num2; i++){
//         for(let j=1; j<=i; j++){
//             if (j%i==0) {
//                 count+=1;
//             }
//         }
//         if (count==2) {
//             if (prime_number!=0) {
//                 prime_number=prime_number+", "
//             }
//             prime_number=prime_number+i
//         }
//     }
//     console.log("List of Prime Numbers")
//     console.log(prime_number)
// }

// Sum of digits

// let num =parseInt(prompt("Enter a positive number"))
// let sum = 0

// while (num>0) {
//     let rev_num = num%10
//     sum += rev_num
//     num = parseInt(num/10)
// }

// console.log("The sum of the given digit is: "+sum)

// Armstrong Number

// let n=parseInt(prompt("Enter a positive number"))
// let num=n
// let arm = parseInt(0)

// while (n>0) {
//     let rev_num = n%10
//     arm += parseInt((rev_num)**3)
//     n = parseInt(n/10)
// }
// console.log(arm)
// if (arm==num) {
//     alert("This is armstrong number.")
// }
// else{
//     alert("This is not an armstrong number!")
// }

// let a=[1, 2]

// console.log(a[0], a[1])

// let a=[1,2,3,4,5]
// console.log(a.length)

// let a=[1,2,3,4,5,6]
// a.forEach(element => {
//     console.log(element)
// });

// let student = {
//     "First Name":"Jasdeep",
//     "Last Name":"Singh",
//     "Roll No":19,
// }
// console.log(student)

let a = [1, 2, 3, 4]
let b= 0
a.forEach(element => {
    b+=element
});
alert(b)