package com.higortavares.demo.repository

import com.higortavares.demo.models.Audit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuditRepository: JpaRepository<Audit, Long> {
}