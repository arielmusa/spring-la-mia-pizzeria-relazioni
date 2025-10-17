package org.lessons.java.spring_la_mia_pizzeria_relazioni.repository;

import org.lessons.java.spring_la_mia_pizzeria_relazioni.model.SpecialOffers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialOffersRepository extends JpaRepository<SpecialOffers, Integer>{
    
}
