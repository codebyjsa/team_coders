const http = require("http");
http.createServer((req,resp) =>{
    resp.write("hello i am forming a server for browser");

}).listen(4800);