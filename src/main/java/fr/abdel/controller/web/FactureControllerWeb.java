package fr.abdel.controller.web;

import fr.abdel.controller.InterfaceFactureController;
import fr.abdel.entity.Facture;
import fr.abdel.service.InterfaceFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

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
}
