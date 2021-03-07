package fr.abdel.repository.memory;

import fr.abdel.entity.Facture;
import fr.abdel.repository.InterfaceFactureRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FactureRepositoryMemory implements InterfaceFactureRepository {

    private static List<Facture> factures = new ArrayList<>();

    public void create(Facture facture){
        factures.add(facture);
        System.out.println("Facture enregistrée avec le numéro: " + facture.getNumber() + " ,pour " + facture.getCutomerName());
    }
}
