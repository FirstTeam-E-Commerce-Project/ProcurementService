package com.example.procurement.kafka;

import com.example.procurement.Service.ProcurementService;
import com.example.procurement.dto.LowStockDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
    ProcurementService procurementService;

    public KafkaConsumer(ProcurementService procurementService) {
        this.procurementService = procurementService;
    }

    //Here the topic name "LowStock" should be same in InventoryService
    @KafkaListener(topics = "low-stock", groupId = "procurement-group")
    public void listen(LowStockDTO lowStockDTO){
        try {
            logger.info("Listening to the message: {}", lowStockDTO.getProductId());
            procurementService.placeOrder(lowStockDTO);
        } catch (Exception e){
            logger.error("Failed to process: {}", e.getMessage());
        }
    }
}
