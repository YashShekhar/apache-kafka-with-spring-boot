package dev.yashshekhar.kafka.consumer;

import dev.yashshekhar.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "topic", groupId = "myGroup")
    public void consumeMessage(String msg) {
      log.info("Consuming message from topic: {}", msg);
    }

    @KafkaListener(topics = "topic", groupId = "myGroup")
    public void consumeMessage(Student msg) {
        log.info("Consuming json message from topic: {}", msg.toString());
    }
}
