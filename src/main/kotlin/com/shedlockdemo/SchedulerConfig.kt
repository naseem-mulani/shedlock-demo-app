package com.shedlockdemo

import com.mongodb.client.MongoClient
import net.javacrumbs.shedlock.provider.mongo.MongoLockProvider
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling

@Configuration
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "9s")
class SchedulerConfig {

    @Bean
    fun lockProvider(mongo: MongoClient) =
        MongoLockProvider(mongo.getDatabase("local-database").getCollection("shedlock-collection"))
}