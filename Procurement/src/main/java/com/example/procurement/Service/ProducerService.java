package com.example.procurement.Service;

import com.example.procurement.dto.PlaceOrderDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    private final KafkaTemplate<String, PlaceOrderDTO> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, PlaceOrderDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(PlaceOrderDTO placeOrderDTO) {
        kafkaTemplate.send("re-stocking", placeOrderDTO);
    }
}
