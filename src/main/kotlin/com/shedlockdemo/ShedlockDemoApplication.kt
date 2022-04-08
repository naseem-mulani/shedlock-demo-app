package com.shedlockdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SchedlockDemoApplication

fun main(args: Array<String>) {
    runApplication<SchedlockDemoApplication>(*args)
}
