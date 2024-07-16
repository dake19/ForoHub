package com.foro.ForoHub.Repository;

import com.foro.ForoHub.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long>{
}
