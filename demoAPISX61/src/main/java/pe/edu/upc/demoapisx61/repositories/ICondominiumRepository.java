package pe.edu.upc.demoapisx61.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoapisx61.entities.Condominium;

import java.util.List;

@Repository
public interface ICondominiumRepository extends JpaRepository<Condominium, Integer> {
    public List<Condominium> findByNameCondominium(String name);

}
