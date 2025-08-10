function countVowels(str) {
    let count = 0;
   for(const char of str){
    if(char === "a" ||
        char === "e" || 
        char === "i" ||
        char === "o" ||
        char === "u"){
        count++;
    }
    }
    return(count);
}

let cnt = countVowels("hello");
console.log("number of vowels in this : ",cnt);

let arr = [1,4,5,7,3,8,5]
n = arr.toString()
arr.forEach((num) => {
    console.log(num**2)
});