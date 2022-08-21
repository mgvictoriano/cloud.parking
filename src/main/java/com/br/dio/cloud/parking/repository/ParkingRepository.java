package com.br.dio.cloud.parking.repository;

import com.br.dio.cloud.parking.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ParkingRepository extends JpaRepository<Parking, String> {

}
