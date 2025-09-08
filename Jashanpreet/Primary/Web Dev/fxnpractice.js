// we are given array of marks of students. Filter out the marks of students that scored 90+. 

let arr = [33,99,87,68,98,97,100,91]
let countScore = arr.filter((val)=> {
    return val > 90;
})
console.log(countScore)



//take a number n as input from user . create an array from 1 to n . Use the reduce method to calculate sum of all numbers in the array. Use reduce method to calculate product of all numbers in array.
const n = prompt("Take a number :")


let arr1 = []
for(let i=0 ;i<=n ; i++){
arr1[i-1]=i;}

console.log(arr1);
let sum = arr1.reduce((previous,current) => {
    return previous + current
})
console.log(sum)

let product = arr1.reduce((previous,current) => {
    return previous*current;
})
console.log(product)