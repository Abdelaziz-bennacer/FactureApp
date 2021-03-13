package fr.abdel.controller.scanner;

import fr.abdel.controller.InterfaceFactureController;
import fr.abdel.entity.Facture;
import fr.abdel.service.InterfaceFactureService;
import org.springframework.stereotype.Controller;

//@Controller
public class FactureControllerScanner implements InterfaceFactureController {


    private InterfaceFactureService factureService;

    public InterfaceFactureService getFactureService() {
        return factureService;
    }

    public void setFactureService(InterfaceFactureService factureService) {
        this.factureService = factureService;
    }

    @Override
    public void createFacture() {
        System.out.println("Usage d'un scanner de codes barres");
        Facture facture = new Facture();
        facture.setCutomerName("Virgin Galactic");
        factureService.createFacture(facture);

    }
}
