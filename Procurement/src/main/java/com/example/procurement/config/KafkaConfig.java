package com.example.procurement.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public NewTopic newTopic() {
        return TopicBuilder.name("Restocking")
                .partitions(3)
                .build();
    }
}
