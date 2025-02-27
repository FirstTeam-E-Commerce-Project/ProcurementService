//package com.example.procurement.controller;
//
//import com.example.procurement.Service.ProcurementService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/stock/restock")
//public class ProcurementController {
//    private final ProcurementService procurementService;
//
//    public ProcurementController(ProcurementService procurementService) {
//        this.procurementService = procurementService;
//    }
//
//    public ResponseEntity<String> placingOrder(String message) {
//        procurementService.sendMessage(message);
//        return ResponseEntity.ok("Order has been placed");
//    }
//}
