package pe.edu.upc.demoapisx61.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.demoapisx61.entities.Condominium;

import java.time.LocalDate;

public class BuildingDTO {
    private int idBuilding;
    private String denominationBuilding;
    private int nFloorBuilding;
    private int nDepartmentBuilding;
    private double extensionBuilding;
    private LocalDate deadlineBuilding;

    private Condominium condominium;

    public int getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
    }

    public String getDenominationBuilding() {
        return denominationBuilding;
    }

    public void setDenominationBuilding(String denominationBuilding) {
        this.denominationBuilding = denominationBuilding;
    }

    public int getnFloorBuilding() {
        return nFloorBuilding;
    }

    public void setnFloorBuilding(int nFloorBuilding) {
        this.nFloorBuilding = nFloorBuilding;
    }

    public int getnDepartmentBuilding() {
        return nDepartmentBuilding;
    }

    public void setnDepartmentBuilding(int nDepartmentBuilding) {
        this.nDepartmentBuilding = nDepartmentBuilding;
    }

    public double getExtensionBuilding() {
        return extensionBuilding;
    }

    public void setExtensionBuilding(double extensionBuilding) {
        this.extensionBuilding = extensionBuilding;
    }

    public LocalDate getDeadlineBuilding() {
        return deadlineBuilding;
    }

    public void setDeadlineBuilding(LocalDate deadlineBuilding) {
        this.deadlineBuilding = deadlineBuilding;
    }

    public Condominium getCondominium() {
        return condominium;
    }

    public void setCondominium(Condominium condominium) {
        this.condominium = condominium;
    }
}
