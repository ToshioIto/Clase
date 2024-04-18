package pe.edu.upc.demoapisx61.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoapisx61.entities.Condominium;
import pe.edu.upc.demoapisx61.repositories.ICondominiumRepository;
import pe.edu.upc.demoapisx61.servicesinterfaces.ICondominiumService;

import java.util.List;

@Service
public class CondominiumServiceImplement implements ICondominiumService {
    @Autowired
    private ICondominiumRepository cR;

    @Override
    public void insert(Condominium condminium) {
        cR.save(condminium);
    }

    @Override
    public List<Condominium> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCondominium) {
        cR.deleteById(idCondominium);
    }

    @Override
    public Condominium listarId(int idCondominium) {

        return cR.findById(idCondominium).orElse(new Condominium());
    }

    @Override
    public List<Condominium> findByNameCondominium(String name) {
        return cR.findByNameCondominium(name);
    }












}
