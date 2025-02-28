package com.example.procurement.Service;

import com.example.procurement.Entity.ProcurementOrder;
import com.example.procurement.Entity.Suppliers;
import com.example.procurement.Repository.ProcurementOrderRepo;
import com.example.procurement.Repository.SupplierRepo;
import com.example.procurement.dto.LowStockDTO;
import com.example.procurement.dto.PlaceOrderDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;

@Service
public class ProcurementService {

    private final SupplierRepo supplierRepo;
    private final ProcurementOrderRepo procurementOrderRepo;
    private final ProducerService producerService;
    private final Random random = new Random();                         //creating and object of random class to select random supplier

    public ProcurementService(SupplierRepo supplierRepo, ProcurementOrderRepo procurementOrderRepo, ProducerService producerService) {
        this.supplierRepo = supplierRepo;
        this.procurementOrderRepo = procurementOrderRepo;
        this.producerService = producerService;
    }

    // the supplier will be randomly selected
        private Suppliers selectSupplier() {
        List<Suppliers> suppliersList = supplierRepo.findAll();
        return suppliersList.get(random.nextInt(suppliersList.size()));
    }

    @Transactional()
    public PlaceOrderDTO placeOrder(LowStockDTO lowStockDTO) {
        //creating and storing order
        Suppliers supplier = selectSupplier();
        int quantity = 100;    //setting quantity to 100
        double totalAmount = quantity * supplier.getPricePerUnit();
        ProcurementOrder procurementOrder = new ProcurementOrder();
        procurementOrder.setProductId(lowStockDTO.getProductId());
        procurementOrder.setQuantity(quantity);
        procurementOrder.setTotalAmount(totalAmount);
        procurementOrder.setOrderDate(new Date());
        procurementOrder.setSuppliers(supplier);
        procurementOrder.setDeliveryDate(new Date(System.currentTimeMillis() + 2L * 24 * 60 * 60 * 1000));  //considering order will be delivered after two days
        procurementOrderRepo.save(procurementOrder);
        PlaceOrderDTO dto = mapToDTO(procurementOrder);      //using mapping methods for data transfer
        producerService.sendEvent(dto);                     //sending kafka event
        return dto;
    }

    //mapping DTO to Entity
    public PlaceOrderDTO mapToDTO(ProcurementOrder procurementOrder) {
        PlaceOrderDTO placeOrderDTO = new PlaceOrderDTO();
        placeOrderDTO.setProductId(procurementOrder.getProductId());
        placeOrderDTO.setQuantityOrdered(procurementOrder.getQuantity());
        placeOrderDTO.setTotalAmount(procurementOrder.getTotalAmount());
        placeOrderDTO.setDeliveryDate(procurementOrder.getDeliveryDate());
        return placeOrderDTO;
    }
    public List<ProcurementOrder> getAllOrder(){
        return procurementOrderRepo.findAll();
    }
    //public P
}
