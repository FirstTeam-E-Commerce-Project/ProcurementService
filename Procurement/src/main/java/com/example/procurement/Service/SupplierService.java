package com.example.procurement.Service;

import com.example.procurement.Entity.Suppliers;
import com.example.procurement.Repository.SupplierRepo;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
@Service
public class SupplierService {
    private final SupplierRepo supplierRepo;

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
    public Optional<Suppliers> updateSupplier(Integer id, Suppliers updatedSuppliers){
        //Suppliers suppliers;
        if (supplierRepo.findById(id).isPresent()){
            Suppliers saveSupplier = new Suppliers();
            saveSupplier.setId(updatedSuppliers.getId());
            saveSupplier.setSupplierName(updatedSuppliers.getSupplierName());
            saveSupplier.setEmail(updatedSuppliers.getEmail());
            saveSupplier.setPhoneNumber(updatedSuppliers.getPhoneNumber());
            saveSupplier.setPricePerUnit(updatedSuppliers.getPricePerUnit());
            supplierRepo.save(saveSupplier);
            return Optional.of(saveSupplier);
        } else {
            throw new RuntimeException("Supplier not found");
        }
    }
    public String deleteSupplier(Integer id){
        supplierRepo.deleteById(id);
        return "Supplier has been removed from database";
    }

}
