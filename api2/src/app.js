const Koa = require('Koa');
const bodyParser = require('koa-bodyparser');

const indexRoutes = require('./routes/index');

const app = new Koa();
const PORT = process.env.PORT || 8082


app.use(bodyParser());

app.use(indexRoutes.routes());

// server
const server = app.listen(PORT, () => {
  console.log(`Server listening on port: ${PORT}`);
});

module.exports = server;