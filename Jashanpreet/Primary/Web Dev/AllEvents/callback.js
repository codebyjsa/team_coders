const url = "https://dog.ceo/api/breeds/image/random"
// let promise = fetch(url);
// console.log(promise);
// // promise is pending.
const parafacts = document.querySelector('#facts')
 const getfacts = async () => { 
    console.log("getting data....")
    let response = await fetch(url)
     console.log(response);
     let data = await response.json();
     console.log(data[0].text);
 };