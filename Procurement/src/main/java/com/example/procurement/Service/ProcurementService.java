package com.example.procurement.Service;

import com.example.procurement.Entity.ProcurementOrder;
import com.example.procurement.Repository.ProcurementOrderRepo;
import com.example.procurement.Repository.SupplierRepo;
import com.example.procurement.dto.LowStockDTO;
import com.example.procurement.dto.PlaceOrderDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Locale;

@Service

public class ProcurementService {

    private SupplierRepo supplierRepo;
    private ProcurementOrderRepo procurementOrderRepo;

    public ProcurementService(SupplierRepo supplierRepo, ProcurementOrderRepo procurementOrderRepo) {
        this.supplierRepo = supplierRepo;
        this.procurementOrderRepo = procurementOrderRepo;
    }

    public PlaceOrderDTO mapToDTO(ProcurementOrder procurementOrder){
        return new PlaceOrderDTO(procurementOrder.getProductId(),
                procurementOrder.getSupplierId(),
                procurementOrder.getOrderDate(),
                procurementOrder.getDeliveryDate(),
                procurementOrder.getQuantity());
    }


    public PlaceOrderDTO placeOrder(LowStockDTO lowStockDTO){
        ProcurementOrder procurementOrder = new ProcurementOrder();
        procurementOrder.setProductId(lowStockDTO.getProductId());
        procurementOrder.setQuantity(100);
        procurementOrder.setTotalAmount(100.0);
        procurementOrder.setOrderDate(new Date());
        procurementOrder.setDeliveryDate(new Date(System.currentTimeMillis()+2L * 24 * 60 * 60 * 1000));
        procurementOrderRepo.save(procurementOrder);


        return null;
    }



//    ProcurementOrder procurementOrder = new ProcurementOrder();
//    procurementOrder.setProductId(productId);



}
