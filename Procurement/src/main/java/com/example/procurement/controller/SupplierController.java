package com.example.procurement.controller;

import com.example.procurement.Entity.Suppliers;
import com.example.procurement.Repository.SupplierRepo;
import com.example.procurement.Service.SupplierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController("/suppliers")
public class SupplierController {
    private SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/add")
    public ResponseEntity<Suppliers> addSupplier(@RequestBody Suppliers suppliers) {
        //supplierService.addSupplier(suppliers);
        return new ResponseEntity<>(supplierService.addSupplier(suppliers), HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Suppliers>> getAllSuppliers() {
        return new ResponseEntity<>(supplierService.getAllSuppliers(), HttpStatus.OK);
    }

    @GetMapping("/findby/{id}")
    public ResponseEntity<Optional<Suppliers>> findById(Integer id) {
        return new ResponseEntity<>(supplierService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<Suppliers>> updateSupplier(@PathVariable Integer id, @RequestBody Suppliers updatedSupplier) {
        supplierService.updateSupplier(id, updatedSupplier);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteSupplier(@PathVariable Integer id) {
        supplierService.deleteSupplier(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}