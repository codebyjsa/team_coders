const prompt = require("prompt-sync")()
const name = prompt("what is your name?")
console.log(name)
const shouldweplay = prompt("do you want to play?  ")
// const condition = shouldweplay === "yes"
// console.log(condition)  
if( shouldweplay === "yes"){
    console.log("okey :)")
}
else if(shouldweplay === "no"){
    console.log("okey:(")
}
else{
    console.log("sorry :( ,type only yes/no ")
}