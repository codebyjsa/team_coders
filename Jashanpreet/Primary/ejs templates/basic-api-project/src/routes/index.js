const express = require('express');
const router = express.Router();
const ApiController = require('../controllers/index');
const apiController = new ApiController();

function setRoutes(app) {
    router.get('/', (req, res) => {
        res.send('Welcome to the Basic API Project!');
    });
    router.get('/hello', (req, res) => apiController.getHello(req, res));
    router.get('/goodbye', (req, res) => apiController.getGoodbye(req, res));
    app.use('/api', router);
}

module.exports = { setRoutes };