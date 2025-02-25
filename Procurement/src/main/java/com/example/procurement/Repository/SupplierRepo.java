package com.example.procurement.Repository;

import com.example.procurement.Entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends JpaRepository<Suppliers, Integer> {
}
