package com.mycompany.app.controllers.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.app.models.Topic;
import com.mycompany.app.services.TopicService;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getTopics();
    }
    
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value="/topics", method=RequestMethod.POST)
    public String requestMethodName(@RequestBody Topic topic) {
        topicService.addTopic(topic);
        return "Successfully Created Topic";
    }

    @RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
    public String requestMethodName(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic,id);
        return "Successfully Updated Topic: " + id;
    }

    @RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
    public String requestMethodName(@PathVariable String id) {
        topicService.deleteTopic(id);
        return "Successfully Deleted Topic: " + id;
    }
    

}
