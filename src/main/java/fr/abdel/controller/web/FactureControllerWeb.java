package fr.abdel.controller.web;

import fr.abdel.controller.InterfaceFactureController;
import fr.abdel.entity.Facture;
import fr.abdel.service.InterfaceFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FactureControllerWeb implements InterfaceFactureController {

    @Autowired
    private InterfaceFactureService factureService;

    public InterfaceFactureService getFactureService() {
        return factureService;
    }

    public void setFactureService(InterfaceFactureService factureService) {
        this.factureService = factureService;
    }

    public void createFacture(){
        String customerName = " Mr Tesla";
        Facture facture = new Facture();
        facture.setCutomerName(customerName);

        factureService.createFacture(facture);
    }

    @RequestMapping("/home")
    public String displayHome(){
        System.out.println("La méthode displayHome a été invoquée");
        return "index";
    }
}
