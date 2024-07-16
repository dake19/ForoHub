package com.foro.ForoHub.service;

import com.foro.ForoHub.model.Topic;
import com.foro.ForoHub.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(Topic topic) {
        topic.getCreatedAt(LocalDateTime.now());
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Optional<Topic> getTopicById(Long id) {
        return topicRepository.findById(id);
    }

    public Topic updateTopic(Long id, Topic topicDetails) {
        Topic topic = topicRepository.findById(id).orElseThrow();
        topic.setTitle(topicDetails.getTitle());
        topic.setContent(topicDetails.getContent());
        topic.setAuthor(topicDetails.getAuthor());
        topic.setUpdatedAt(LocalDateTime.now());
        return topicRepository.save(topic);
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
