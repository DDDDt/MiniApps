package com.dtner.miniapps.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 * @description: 小程序 Blog 接口
 * @author: dt
 * @create: 2022-12-06 17:00
 */
@RestController
@RequestMapping("blog")
class BlogController {

    /**
     * 测试接口服务
     *
     * @return
     */
    @GetMapping("testBlog")
    fun testBlog(): String = """
        {
            "name": "book"
        }
    """.trimIndent()

}