const prompt = require("prompt-sync")()
const num1 = parseFloat(prompt("enter 1st number: "))
console.log(num1)

const num = require("prompt-sync")()
const num2 = parseFloat(num("enter 2nd number: "))
console.log(num2)




let sum = num1 + num2
// console.log("sum of two numbers is : ",sum)
if(num1<6){
    console.log("sum of two numbers is : ",num1-num2)
}
else{
    console.log("sum of two number is: ",sum)
}





let a = parseFloat(prompt("enter 1st number: "))
let b = parseFloat(prompt("enter 2st number: "))
let product = a*b
let some = a+b
if(a<6){
    console.log("product of two numbers is: ",some)
}
else{
    console.log("product of two numbers is : ",product)
}