package com.dtner.miniapps

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MiniAppServiceApplication

fun main(args: Array<String>) {
	runApplication<MiniAppServiceApplication>(*args)
}
