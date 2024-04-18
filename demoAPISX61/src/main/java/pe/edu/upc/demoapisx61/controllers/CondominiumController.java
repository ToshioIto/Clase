package pe.edu.upc.demoapisx61.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoapisx61.dtos.CondominiumDTO;
import pe.edu.upc.demoapisx61.entities.Condominium;
import pe.edu.upc.demoapisx61.servicesinterfaces.ICondominiumService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/condominios")
public class CondominiumController {
    @Autowired
    private ICondominiumService cS;

    @PostMapping
    public void registrar(@RequestBody CondominiumDTO dtoC) {
        ModelMapper c = new ModelMapper();
        Condominium condominium = c.map(dtoC, Condominium.class);
        cS.insert(condominium);
    }
    @PutMapping
    public void modificar(@RequestBody CondominiumDTO dtoC) {
        ModelMapper c = new ModelMapper();
        Condominium condominium = c.map(dtoC, Condominium.class);
        cS.insert(condominium);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<CondominiumDTO> list() {
        return cS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, CondominiumDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }


    @GetMapping("/{id}")
    public CondominiumDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        CondominiumDTO dto = m.map(cS.listarId(id), CondominiumDTO.class);
        return dto;
    }


    @PostMapping("/buscar")
    public List<CondominiumDTO> buscar(@RequestParam String name) {
        return cS.findByNameCondominium(name).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CondominiumDTO.class);
        }).collect(Collectors.toList());
    }
}
