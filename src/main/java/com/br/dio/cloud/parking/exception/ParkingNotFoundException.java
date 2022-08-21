package com.br.dio.cloud.parking.exception;



public class ParkingNotFoundException extends RuntimeException {


    public ParkingNotFoundException(String id) {
        super("Parking not found with Id: " + id);

    }
}
