package com.example.procurement.Service;

import com.example.procurement.dto.PlaceOrderDTO;
import org.springframework.kafka.core.KafkaTemplate;

public class ProducerService {
    private final KafkaTemplate<String, PlaceOrderDTO> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, PlaceOrderDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(PlaceOrderDTO placeOrderDTO) {
        kafkaTemplate.send("restocking", placeOrderDTO);
    }
}
