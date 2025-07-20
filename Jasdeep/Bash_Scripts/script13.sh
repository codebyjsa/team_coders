#!/bin/bash

echo "Welcome to the Linux Caluclator"

#Read two numbers from the user
echo "Enter first number: "
read num1
echo "Enter second number: "
read num2

#Show menu of operations
echo "Select an operation:"
echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiplication"
echo "4. Division"
read choice

#Perform the operation based on user choice
case $choice in
    1)
        result=$(echo "$num1 + $num2" | bc)
        echo "Result: $result"
        ;;
    2)
        result=$(echo "$num1 - $num2" | bc)
        echo "Result: $result"
        ;;
    3)
        result=$(echo "$num1 * $num2" | bc)
        echo "Result: $result"
        ;;
    4)
        if [ "$num2" -eq 0 ]; then
            echo "Error: Division by zero is not allowed."
        else
            result=$(echo "scale=2; $num1 / $num2" | bc)
            echo "Result: $result"
        fi
        ;;
    *)
        echo "Invalid choice. Please select a valid operation."
        ;;
esac