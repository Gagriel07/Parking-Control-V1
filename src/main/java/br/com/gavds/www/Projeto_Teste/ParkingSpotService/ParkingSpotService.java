package br.com.gavds.www.Projeto_Teste.ParkingSpotService;

import br.com.gavds.www.Projeto_Teste.Model.ParkingSpotModel;
import br.com.gavds.www.Projeto_Teste.Repository.ParkingSpotRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    @Autowired
    ParkingSpotRepository parkingSpotRepository;

    public List<ParkingSpotModel> getAllCars() {
        return parkingSpotRepository.findAll();
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    @Transactional
    public void deleteParkingByID(UUID id) {
        parkingSpotRepository.deleteById(id);
    }

    public Optional<ParkingSpotModel> findParkingSpotById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return  parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

}
