package fr.abdel.repository.database;

import fr.abdel.entity.Facture;
import fr.abdel.repository.InterfaceFactureRepository;
import org.springframework.stereotype.Repository;

@Repository
public class FactureRepositoryDatabase implements InterfaceFactureRepository {

    public void create(Facture facture){
        System.out.println("Database: Facture enregistrée avec le numéro: " + facture.getNumber() + " pour " + facture.getCutomerName());
    }
}
