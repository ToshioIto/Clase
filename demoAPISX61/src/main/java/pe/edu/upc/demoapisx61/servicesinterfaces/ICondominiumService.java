package pe.edu.upc.demoapisx61.servicesinterfaces;

import pe.edu.upc.demoapisx61.entities.Condominium;

import java.util.List;

public interface ICondominiumService {
    public void insert(Condominium condminium);

    public List<Condominium> list();

    public void delete(int idCondominium);

    public Condominium listarId(int idCondominium);

    public List<Condominium> findByNameCondominium(String name);
}
