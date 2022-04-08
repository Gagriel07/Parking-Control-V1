package br.com.gavds.www.Projeto_Teste.Controller;

import br.com.gavds.www.Projeto_Teste.Model.ParkingSpotModel;
import br.com.gavds.www.Projeto_Teste.ParkingSpotService.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Controller
public class ParkingSpotController {

    @Autowired
    ParkingSpotService parkingSpotService;

    @GetMapping("/")
    public String indexAllCars(Model model) {
        model.addAttribute("parking", parkingSpotService.getAllCars());
        return "index";
    }

    @GetMapping("/NewParkingSpot")
    public String createParkingSpot(Model model) {
        var parkingSpotModel = new ParkingSpotModel();
        model.addAttribute("parking", parkingSpotModel);
        return "newParkingSpot/newParkingSpot";
    }

    @PostMapping
    public String saveParkingSpot(@ModelAttribute("parking") ParkingSpotModel parkingSpotModel) {
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        parkingSpotService.save(parkingSpotModel);
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String deleteParkingSpot(@PathVariable(value = "id") UUID id) {
        parkingSpotService.deleteParkingByID(id);
        return "redirect:/";
    }

}
