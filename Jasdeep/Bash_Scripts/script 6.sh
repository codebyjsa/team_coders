#!bin/bash
hello,I am Jashanpreet Kaur.
I am btech IT student at guru nanak dev engineering college ,Ludhiana.
there are total 7 branches.
echo "1.Count the words"
echo "2.Count First five lines"
echo "3.Count total lines"
echo "4.Search for a word"
echo "5.Exit"
echo "  "

echo " Enter a number (1-5): "
        read num 
 case $num in 
1)echo " to count words:"
         wc -w textprocessing.txt ;;
2)echo " To count first five lines:"
         head -n 2 textprocessing.txt ;;
3)echo " To count total lines:"
        wc -l textprocessing.txt;;
4)echo " search for a word: "
     grep "college" textprocessing.txt;;
*)echo "exit" ;;
   esac