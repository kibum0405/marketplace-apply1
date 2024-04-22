
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import InventoryInventoryManager from "./components/listers/InventoryInventoryCards"
import InventoryInventoryDetail from "./components/listers/InventoryInventoryDetail"

import BasicCompanyManager from "./components/listers/BasicCompanyCards"
import BasicCompanyDetail from "./components/listers/BasicCompanyDetail"

import BoundDispaManager from "./components/listers/BoundDispaCards"
import BoundDispaDetail from "./components/listers/BoundDispaDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/inventories/inventories',
                name: 'InventoryInventoryManager',
                component: InventoryInventoryManager
            },
            {
                path: '/inventories/inventories/:id',
                name: 'InventoryInventoryDetail',
                component: InventoryInventoryDetail
            },

            {
                path: '/basics/companies',
                name: 'BasicCompanyManager',
                component: BasicCompanyManager
            },
            {
                path: '/basics/companies/:id',
                name: 'BasicCompanyDetail',
                component: BasicCompanyDetail
            },

            {
                path: '/bounds/dispas',
                name: 'BoundDispaManager',
                component: BoundDispaManager
            },
            {
                path: '/bounds/dispas/:id',
                name: 'BoundDispaDetail',
                component: BoundDispaDetail
            },




    ]
})
