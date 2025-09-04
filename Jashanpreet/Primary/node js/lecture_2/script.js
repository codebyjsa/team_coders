const express = require("express");
const app = express();
const port = 500;
app.get("/", (req, res) => {
  res.send("hello world");
});
app.post("/home", (req, res) => {
  res.send("hello home");
});
// app.get("/contact", (req, res) => {
//   res.send("contacts are here");
// });

app.listen(port, () => {
  console.log(`server is running on port ${port}`);
});