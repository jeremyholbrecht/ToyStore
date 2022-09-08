package be.intecbrussel.toyStore.services.interfaces;

import be.intecbrussel.toyStore.entities.Toy;
import java.util.List;

public interface ToyService {

    Toy getOneById(int id);
    List<Toy> getAllToys();
    void createToy(Toy toy);
}
