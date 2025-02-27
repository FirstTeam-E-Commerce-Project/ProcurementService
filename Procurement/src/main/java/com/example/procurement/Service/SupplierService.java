package com.example.procurement.Service;

import com.example.procurement.Entity.Suppliers;
import com.example.procurement.Repository.SupplierRepo;

import java.util.List;
import java.util.Optional;

public class SupplierService {
    private SupplierRepo supplierRepo;

    public SupplierService(SupplierRepo supplierRepo) {
        this.supplierRepo = supplierRepo;
    }
    public Suppliers addSupplier(Suppliers suppliers){
        return supplierRepo.save(suppliers);
    }
    public List<Suppliers> getAllSuppliers(){
        return supplierRepo.findAll();
    }
    public Optional<Suppliers> findById(Integer id){
        return supplierRepo.findById(id);
    }
    public String deleteSupplier(Integer id){
        supplierRepo.deleteById(id);
        return "Supplier has been removed from database";
    }
}
