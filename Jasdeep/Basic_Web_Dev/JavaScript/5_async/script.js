// async function sayHello() {
//   return "Hello again!";
// }

// const result = sayHello();
// console.log(result);

// async function giveNumber() {
//   return 7;
// }

// giveNumber().then(num => console.log(num));

// async function getData() {
//   console.log("Start fetching");
//   let res = await fetch("https://jsonplaceholder.typicode.com/posts/1");
//   let json = await res.json();
//   console.log("Done fetching");
// }

// getData();
// console.log("Next line after getData");

function waitAndReturn() {
  return new Promise(resolve => setTimeout(() => resolve("✅ Done!"), 1000));
}

function demo() {
  const result = waitAndReturn();
  console.log("Result:", result);
}

demo();
