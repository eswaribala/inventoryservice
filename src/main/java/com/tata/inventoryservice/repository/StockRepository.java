package com.tata.inventoryservice.repository;

import com.tata.inventoryservice.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StockRepository extends JpaRepository<Stock,Long> {

    @Query("Select stock from Stock stock where stock.product.productId=:productId")
    public List<Stock> getAllStockByProductId(@Param("productId") long productId);


}
