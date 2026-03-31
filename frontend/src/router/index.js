import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/주문',
      component: () => import('../components/ui/주문Grid.vue'),
    },
    {
      path: '/주문처리',
      component: () => import('../components/ui/주문처리Grid.vue'),
    },
    {
      path: '/결제',
      component: () => import('../components/ui/결제Grid.vue'),
    },
  ],
})

export default router;
