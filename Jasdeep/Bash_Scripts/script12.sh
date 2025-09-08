#!/bin/bash

echo "A simple bash script to print muliplication table of any entered number"

#Ask user for a number
echo "Enter a number to print its multiplication table: "
read number

#Check if the input is a number
if ! [[ "$number" =~ ^[0-9]+$ ]]; then
    echo "Error: Please enter a valid number."
    exit 1
fi

#Print multiplication table
echo "Multiplication table of $number:"
for i in {1..10}; do
    result=$((number * i))
    echo "$number x $i = $result"
done