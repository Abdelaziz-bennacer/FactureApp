package fr.abdel.controller.keyboard;

import fr.abdel.controller.InterfaceFactureController;
import fr.abdel.entity.Facture;
import fr.abdel.service.InterfaceFactureService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

//@Controller
public class FactureControllerkeyBoard implements InterfaceFactureController {

    private InterfaceFactureService factureService;

    public InterfaceFactureService getFactureService() {
        return factureService;
    }

    public void setFactureService(InterfaceFactureService factureService) {
        this.factureService = factureService;
    }

    public void createFacture(){

        System.out.println("Quel est le nom du client?");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Facture facture = new Facture();
        facture.setCutomerName(customerName);

        factureService.createFacture(facture);
    }
}
