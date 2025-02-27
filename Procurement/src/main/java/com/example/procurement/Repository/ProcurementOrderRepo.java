package com.example.procurement.Repository;

import com.example.procurement.Entity.ProcurementOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcurementOrderRepo extends JpaRepository<ProcurementOrder, Integer> {
}
