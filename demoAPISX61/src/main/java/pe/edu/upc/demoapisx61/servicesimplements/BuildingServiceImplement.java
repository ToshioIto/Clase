package pe.edu.upc.demoapisx61.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoapisx61.entities.Building;
import pe.edu.upc.demoapisx61.repositories.IBuildingRepository;
import pe.edu.upc.demoapisx61.servicesinterfaces.IBuildingService;

import java.util.List;

@Service
public class BuildingServiceImplement implements IBuildingService {
    @Autowired
    private IBuildingRepository BR;
    @Override
    public void insertar(Building b) {
        BR.save(b);
    }

    @Override
    public List<Building> list() {
        return BR.findAll();
    }

    @Override
    public List<String[]> quantityBuildingByCondominium() {
        return BR.quantityBuildingByCondominium();
    }

    @Override
    public List<String[]> extensionBuildingByCondominium() {
        return BR.extensionBuildingByCondominium();
    }

    @Override
    public List<Building> findBuildingByCondominium(String nombreCondominio) {
        return BR.findBuildingByCondominium(nombreCondominio);
    }


}
