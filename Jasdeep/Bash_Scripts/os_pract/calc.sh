echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiplication"
echo "4. Division"
echo "5. Exit"
echo "Enter your choice:"
read choice

if [ $choice -eq 5 ]; then
    echo "Exiting Calculator"
    exit
fi

echo "Enter first number:"
read num1
echo "Enter second number:"
read num2

if [ $choice -eq 1 ]; then
    result=$((num1 + num2))
    echo "Result = $result"

elif [ $choice -eq 2 ]; then
    result=$((num1 - num2))
    echo "Result = $result"

elif [ $choice -eq 3 ]; then
    result=$((num1 * num2))
    echo "Result = $result"

elif [ $choice -eq 4 ]; then
    if [ $num2 -ne 0 ]; then
        result=$((num1 / num2))
        echo "Result = $result"
    else
        echo "Error: Division by zero not allowed!"
    fi

else
    echo "Invalid Choice!"
fi