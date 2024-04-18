package pe.edu.upc.demoapisx61.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.demoapisx61.entities.Building;

import java.util.List;

public interface IBuildingService {
    public void insertar(Building b);
    public List<Building> list();
    List<String[]> quantityBuildingByCondominium();
    List<String[]> extensionBuildingByCondominium();
    List<Building> findBuildingByCondominium(String nombreCondominio);

}
