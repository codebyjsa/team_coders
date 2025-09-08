1.// const express = require('express')
// const app = express()
// const port = 3000
// const fs = require("fs")
// // app.use(express.static('public'))

// app.use((req,res,next) => {
//     fs.writeFileSync("log.txt",`${Date.now() is a ${req.method}` )
//     console.log(`${Date.now()} is a ${req.method}`)
// next()
// })
// app.get('/', (req, res) => {
//   res.send('Hello World!')
// })
  
// app.listen(port, () => {
//   console.log(`Example app listening on port ${port}`)
// })


2.// const express = require('express')
// const app = express()
// const port = 3000
// const fs = require("fs")
// // app.use(express.static('public'))

// app.use((req, res, next) => {
//     const logMessage = `${new Date().toISOString()} - ${req.method} ${req.url}\n`
//     fs.appendFileSync("public/log.txt", logMessage)
//     console.log(logMessage.trim())
//     next()
// })

// app.get('/', (req, res) => {
//     res.send('Hello World!')
// })

// app.listen(port, () => {
//     console.log(`Example app listening on port ${port}`)
// })


const express = require('express')
const app = express()
const port = 3000
const fs = require("fs")
const path = require('path')

// Ensure public folder exists
if (!fs.existsSync(path.join(__dirname, 'public'))) {
    fs.mkdirSync(path.join(__dirname, 'public'));
}

app.use((req, res, next) => {
    const logMessage = `${new Date().toISOString()} - ${req.method} ${req.url}\n`
    const logPath = path.join(__dirname, 'public', 'log.txt');
    fs.appendFileSync(logPath, logMessage)
    console.log(logMessage.trim())
    next()
})

app.get('/', (req, res) => {
    res.send('Hello World!')
})

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})