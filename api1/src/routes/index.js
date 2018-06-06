const Router = require('koa-router');
const router = new Router();

router.get('/api1', async (ctx) => {
  ctx.body = "API1";
})

module.exports = router;