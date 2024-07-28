package com.higortavares.demo.infraestructure

import com.higortavares.demo.models.Audit
import com.higortavares.demo.repository.AuditRepository
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

@Service
class AuditServer(private val auditRepository: AuditRepository) {

    @Async
    fun save(audit: Audit): Unit {
        println("saving $audit")
        Thread.sleep(3000)
        auditRepository.save(audit)
        println("audit information successfully saved")
    }
}