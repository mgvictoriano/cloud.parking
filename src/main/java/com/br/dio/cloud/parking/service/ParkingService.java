package com.br.dio.cloud.parking.service;


import com.br.dio.cloud.parking.model.Parking;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap();

    static {

        String id = getUUID();
        String id1 = getUUID();
        Parking parking = new Parking(id, "DMS-1111", "SC", "CELTA", "PRETO");
        Parking parking1 = new Parking(id1, "HRT-222", "MS", "FIESTA", "VERMELHO");
        parkingMap.put(id, parking);
        parkingMap.put(id1, parking1);

    }

    public List<Parking> findAll(){
        return parkingMap.values().stream().collect(Collectors.toList());

    }
    private static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public Parking findById(String id) {
        return parkingMap.get(id);
    }

    public Parking create(Parking parkingCreate) {
        String uuid = getUUID();
        parkingCreate.setId(uuid);
        parkingCreate.setEntryDate(LocalDateTime.now());
        parkingMap.put(uuid, parkingCreate);
        return parkingCreate;


    }
}
