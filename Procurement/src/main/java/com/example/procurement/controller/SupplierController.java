package com.example.procurement.controller;

import com.example.procurement.Entity.Suppliers;
import com.example.procurement.Repository.SupplierRepo;
import com.example.procurement.Service.SupplierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class SupplierController {
    private SupplierRepo supplierRepo;
    private SupplierService supplierService;

    public SupplierController(SupplierRepo supplierRepo, SupplierService supplierService) {
        this.supplierRepo = supplierRepo;
        this.supplierService = supplierService;
    }
    @PostMapping
    public ResponseEntity<Suppliers> addSupplier(@RequestBody Suppliers suppliers){
        //supplierService.addSupplier(suppliers);
        return new ResponseEntity<>(supplierService.addSupplier(suppliers), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Suppliers>> getAllSuppliers(){
        return new ResponseEntity<>(supplierService.getAllSuppliers(), HttpStatus.OK);
    }

    public ResponseEntity<Optional<Suppliers>> findById(Integer id){
        return new ResponseEntity<>(supplierService.findById(id), HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> deleteSupplier(Integer id){
        supplierService.deleteSupplier(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
//    public SupplierController(SupplierRepo supplierRepo, SupplierService supplierService) {
//        this.supplierRepo = supplierRepo;
//        this.supplierService = supplierService;
//    }
//
//    public Suppliers addSupplier(Suppliers suppliers){
//        return supplierRepo.save(suppliers);
//    }
//    public Suppliers removeSupplierById()
}
