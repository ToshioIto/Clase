package pe.edu.upc.demoapisx61.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoapisx61.entities.Building;

import java.util.List;

@Repository
public interface IBuildingRepository extends JpaRepository<Building, Integer> {
    @Query(value = "select c.name_condominium as Condominio ,count(*) as Edificios \n" +
            "            from Condominium c inner join Building b\n" +
            "            on c.id_condominium=b.condominium_id\n" +
            "            group by c.name_condominium", nativeQuery = true)
    List<String[]> quantityBuildingByCondominium();


    @Query(value = "select c.name_condominium as Condominio ,sum(b.extension_building) as Edificios \n" +
            "            from Condominium c inner join Building b\n" +
            "            on c.id_condominium=b.condominium_id\n" +
            "            group by c.name_condominium", nativeQuery = true)
    List<String[]> extensionBuildingByCondominium();
    @Query("from Building b where b.condominium.nameCondominium=:name")
    List<Building> findBuildingByCondominium(@Param("name")String nombreCondominio);

}
