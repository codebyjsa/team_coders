echo "Enter marks of Subject 1: "
read sub1

echo "Enter marks of Subject 2: "
read sub2

echo "Enter marks of Subject3: "
read sub3

echo "Enter marks of Subject 4: "
read sub4

if [ $sub1 -ge 0 ] && [ $sub1 -le 100 ] && [ $sub2 -ge 0 ] && [ $sub2 -le 100 ] && [ $sub3 -ge 0 ] && [ $sub3 -le 100 ] && [ $sub4 -ge 0 ] && [ $sub4 -le 100 ]; then

    total=$((sub1 + sub2 + sub3 + sub4))
    percentage=$(( total/4 ))

    echo "Total Marks = $total"
    echo "Percentage = $percentage%"

    if [ $percentage -ge 90 ]; then
        echo "Grade: A+"
    elif [ $percentage -ge 75 ];  then
        echo "Grade: A"
    elif [ $percentage -ge 60 ]; then
        echo "Grade: B"
    else
        echo "Result: Fail"
    fi

else
    echo "Invalid Percentage! Marks should be between 0 and 100."
fi