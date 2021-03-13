package fr.abdel.service.number;

import fr.abdel.entity.Facture;
import fr.abdel.repository.InterfaceFactureRepository;
import fr.abdel.service.InterfaceFactureService;
import org.springframework.stereotype.Service;

//@Service
public class FactureServiceNumber implements InterfaceFactureService {

    private static Long lastNumber = 0L;

    private InterfaceFactureRepository factureRepository;

    public InterfaceFactureRepository getFactureRepository() {
        return factureRepository;
    }

    public void setFactureRepository(InterfaceFactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    public void createFacture (Facture facture){
        facture.setNumber(String.valueOf(++lastNumber));
        factureRepository.create(facture);
    }

}
