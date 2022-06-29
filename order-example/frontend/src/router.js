
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"

import FoodList from "./components/FoodList"
import CookingManager from "./components/listers/CookingCards"
import CancellationManager from "./components/listers/CancellationCards"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },

            {
                path: '/foodLists',
                name: 'FoodList',
                component: FoodList
            },
            {
                path: '/cookings',
                name: 'CookingManager',
                component: CookingManager
            },
            {
                path: '/cancellations',
                name: 'CancellationManager',
                component: CancellationManager
            },




    ]
})
