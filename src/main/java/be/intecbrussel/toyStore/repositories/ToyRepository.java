package be.intecbrussel.toyStore.repositories;

import be.intecbrussel.toyStore.entities.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyRepository extends JpaRepository<Toy, Integer> {

}
