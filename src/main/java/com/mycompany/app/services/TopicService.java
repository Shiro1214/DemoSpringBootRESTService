package com.mycompany.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.app.models.Topic;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","Spring Framework", "Spring FrameWork Description"), 
            new Topic("Java","Core Java", "Core Java Description"), 
            new Topic("JavaScript","JavaScript", "JavaScript Description")));
    
    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i = 0; i<topics.size(); i++){
            if (topics.get(i).getId().equals(id)){
                topics.get(i).setName(topic.getName());
                topics.get(i).setDescription(topic.getDescription());
                break;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
