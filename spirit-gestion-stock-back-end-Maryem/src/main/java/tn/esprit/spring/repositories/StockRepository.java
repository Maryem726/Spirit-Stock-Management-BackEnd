package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {

}
