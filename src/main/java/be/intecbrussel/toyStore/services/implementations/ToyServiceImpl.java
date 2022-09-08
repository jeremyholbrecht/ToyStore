package be.intecbrussel.toyStore.services.implementations;

import be.intecbrussel.toyStore.entities.Toy;
import be.intecbrussel.toyStore.repositories.ToyRepository;
import be.intecbrussel.toyStore.services.interfaces.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToyServiceImpl implements ToyService {

    private ToyRepository toyRepository;

    @Autowired
    public ToyServiceImpl(ToyRepository toyRepository){
        this.toyRepository = toyRepository;
    }

    @Override
    public Toy getOneById(int id) {
        Optional optional = toyRepository.findById(id);

        if (optional.isPresent()){
            return (Toy)optional.get();
        }
        return null;
    }

    @Override
    public List<Toy> getAllToys() {
        return toyRepository.findAll();
    }

    @Override
    public void createToy(Toy toy) {
        toyRepository.save(toy);
    }
}
