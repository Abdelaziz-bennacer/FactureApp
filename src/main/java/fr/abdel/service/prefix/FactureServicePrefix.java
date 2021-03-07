package fr.abdel.service.prefix;

import fr.abdel.entity.Facture;
import fr.abdel.repository.InterfaceFactureRepository;
import fr.abdel.service.InterfaceFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FactureServicePrefix implements InterfaceFactureService {

    @Value("${facture.lastNumber}")
    private Long lastNumber;

    @Value("${facture.prefix}")
    private String prefix;


    @Autowired
    private InterfaceFactureRepository factureRepository;

    public void createFacture (Facture facture){
        facture.setNumber((prefix+(++lastNumber)));
        factureRepository.create(facture);
    }

    public InterfaceFactureRepository getFactureRepository() {
        return factureRepository;
    }

    public void setFactureRepository(InterfaceFactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    public Long getLastNumber() {
        return lastNumber;
    }

    public FactureServicePrefix setLastNumber(Long lastNumber) {
        this.lastNumber = lastNumber;
        return this;
    }

    public String getPrefix() {
        return prefix;
    }

    public FactureServicePrefix setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

}

