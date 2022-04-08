package com.shedlockdemo

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.Instant

@Component
class ScheduledTask {
    @SchedulerLock(name = "demoLock", lockAtLeastFor = "9s")
    @Scheduled(cron = "*/10 * * * * *")
    fun run() {
        println("Schedule task invoked ${Instant.now()}")
    }
}
