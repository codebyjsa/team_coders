const express = require("express");
const app = express();
const port = 500;
// app.get("/", (req, res) => {
//   res.send("hello world how are you");
// });
app.post("/home", (req, res) => {
  res.send("hello home");
});
// app.get("/", (req, res) => {
//     console.log("you are in put request");
//   res.send("contacts are here");
// });
app.get("/index",(req,res)=>{
    console.log("you are in index page");
  res.sendFile('practice/practise.html', {root: __dirname});
})

app.listen(port, () => {
  console.log(`server is running on port ${port}`);
});