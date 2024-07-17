package com.foro.ForoHub.repository;

import com.foro.ForoHub.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
