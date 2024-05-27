package by.vstu.avtosalon.repository;


import by.vstu.avtosalon.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    List<Sale> findByCustomerCustomerId(Long customerId);
}
