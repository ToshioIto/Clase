package pe.edu.upc.demoapisx61.servicesinterfaces;

import pe.edu.upc.demoapisx61.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Long idRol);

    public Role listarId(Long idRol);
}
