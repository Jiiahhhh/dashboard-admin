package com.ilal

class UrlMappings {
    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/billing"(view:"/pages/billing")
        "/dashboard"(view:"/pages/dashboard")
        "/icons"(view:"/pages/icons")
        "/landing"(view:"/pages/landing")
        "/map"(view:"/pages/map")
        "/notification"(view:"/pages/notifications")
        "/profile"(view:"/pages/profile")
        "/rtl"(view:"/pages/rtl")
        "/signin"(view:"/pages/sign-in")
        "/singup"(view:"/pages/sign-up")
        "/tables"(view:"/pages/tables")
        "/template"(view:"/pages/template")
        "/typography"(view:"/pages/typography")
        "/virtualreality"(view:"/pages/virtual-reality")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
