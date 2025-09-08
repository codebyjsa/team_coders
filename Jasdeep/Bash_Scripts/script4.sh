#!/bin/bash
count=1
while [ $count -le 3 ]
do
	echo "count is $count"
	count=$((count+1))
done
