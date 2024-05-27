package by.vstu.avtosalon.service;

import by.vstu.avtosalon.model.Sale;
import by.vstu.avtosalon.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public Sale saveSale(Sale sale) {
        return saleRepository.save(sale);
    }

    public Sale getSaleById(Long id) {
        return saleRepository.findById(id).orElse(null);
    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }

    public List<Sale> getSalesByCustomerId(Long customerId) {
        return saleRepository.findByCustomerCustomerId(customerId);
    }
}