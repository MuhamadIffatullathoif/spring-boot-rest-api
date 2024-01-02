package com.iffat.springboot.restapi.repositories;

import com.iffat.springboot.restapi.domain.Beer;
import com.iffat.springboot.restapi.domain.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {

    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyleEnum(BeerStyleEnum beerStyleEnum, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyleEnum(String beerName, BeerStyleEnum beerStyleEnum, Pageable pageable);

    Beer findByUpc(String upc);
}
