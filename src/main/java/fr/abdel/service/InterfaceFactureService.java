package fr.abdel.service;

import fr.abdel.entity.Facture;
import fr.abdel.repository.InterfaceFactureRepository;

public interface InterfaceFactureService {

    void createFacture(Facture facture);
    void setFactureRepository(InterfaceFactureRepository factureRepository);
}
