package com.example.procurement.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public NewTopic lowStockTopic(){
        return TopicBuilder.name("low-stock")
                .partitions(3)
                .build();
    }
    public NewTopic newTopic() {
        return TopicBuilder.name("re-stocking")
                .partitions(3)
                .build();
    }
}
