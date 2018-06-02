const Router = require('koa-router');
const router = new Router();

router.get('/api1', async (ctx) => {
  ctx.body = {
    status: 'success',
    message: 'hello, API1!'
  };
})

module.exports = router;