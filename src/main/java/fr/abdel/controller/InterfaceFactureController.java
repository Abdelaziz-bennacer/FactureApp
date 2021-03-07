package fr.abdel.controller;

import fr.abdel.service.InterfaceFactureService;

public interface InterfaceFactureController {

    void createFacture();
    void setFactureService(InterfaceFactureService factureService);
}
