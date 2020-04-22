package com.wanlai.kafkatest;

import com.wanlai.kafkatest.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    KafkaProducer kafkaProducer;

    @RequestMapping("/test")
    public String sss() {
        kafkaProducer.send("this is message");
        return "ok";
    }


}
