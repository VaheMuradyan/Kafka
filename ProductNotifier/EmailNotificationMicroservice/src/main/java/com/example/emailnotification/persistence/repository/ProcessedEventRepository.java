package com.example.emailnotification.persistence.repository;

import com.example.emailnotification.persistence.entity.ProcessedEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessedEventRepository extends JpaRepository<ProcessedEventEntity,Long> {

    ProcessedEventEntity findByMessageId(String messageId);
}
