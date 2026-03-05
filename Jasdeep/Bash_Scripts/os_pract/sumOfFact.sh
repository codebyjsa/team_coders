echo "Enter value of N:"
read n

sum=0
fact=1

for (( i=1; i<=n; i++ ))
do
    fact=$(( fact * i ))
    sum=$(( sum + fact ))
done

echo "Sum of series (1! + 2! + ... + $n!) = $sum"