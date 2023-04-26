import { createRouter, createWebHashHistory } from "vue-router";
import Announcements  from "../views/Announcements.vue";
import Announcement from "../views/Announcement.vue";
import NotFound from "../views/NotFound.vue";
const router = createRouter({
    history : createWebHashHistory(),
    routes : [
        {
            path:"/",
            name:"Home",
            component: Announcements
        },
        {
            path:"/api/announcements",
            name:"Announcements",
            component: Announcements
        },
        {
            path:"/api/announcements/:idAnnouncement",
            name:"Announcement",
            component: Announcement
        }, 
        {
            path:'/:catchNotMatchPath(.*)',
            name:'NotFound',
            component:NotFound
        }
    ]
});

export default router;