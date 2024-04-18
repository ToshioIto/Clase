package pe.edu.upc.demoapisx61.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoapisx61.dtos.BuildingByCondominiumDTO;
import pe.edu.upc.demoapisx61.dtos.BuildingDTO;
import pe.edu.upc.demoapisx61.dtos.ExtensionBuildingByCondominiumDTO;
import pe.edu.upc.demoapisx61.entities.Building;
import pe.edu.upc.demoapisx61.servicesinterfaces.IBuildingService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/edificios")
public class BuildingController {
    @Autowired
    private IBuildingService BS;

    @PostMapping
    public void insertar(@RequestBody BuildingDTO bd) {
        ModelMapper m = new ModelMapper();
        Building b = m.map(bd, Building.class);
        BS.insertar(b);

    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BuildingDTO> listar() {
        return BS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, BuildingDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/consulta01")
    public List<BuildingByCondominiumDTO> consulta01() {
        List<String[]> filaLista = BS.quantityBuildingByCondominium();
        List<BuildingByCondominiumDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            BuildingByCondominiumDTO dto = new BuildingByCondominiumDTO();
            dto.setNameCondominium(columna[0]);
            dto.setQuantityBuilding(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }

        return dtoLista;
    }

    @GetMapping("/consulta02")
    public List<ExtensionBuildingByCondominiumDTO> consulta02() {
        List<String[]> filaLista = BS.extensionBuildingByCondominium();
        List<ExtensionBuildingByCondominiumDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ExtensionBuildingByCondominiumDTO dto = new ExtensionBuildingByCondominiumDTO();
            dto.setNameCondominium(columna[0]);
            dto.setExtensionBuildingByCondominum(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }

        return dtoLista;

    }

    @GetMapping("/buscarporcondominio")
    public List<BuildingDTO> buscarByCondominio(@RequestParam String nombre) {
        return BS.findBuildingByCondominium(nombre).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, BuildingDTO.class);
        }).collect(Collectors.toList());
    }
}
