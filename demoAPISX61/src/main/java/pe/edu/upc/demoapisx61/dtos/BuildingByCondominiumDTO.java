package pe.edu.upc.demoapisx61.dtos;

public class BuildingByCondominiumDTO {
    private String nameCondominium;
    private int quantityBuilding;

    public String getNameCondominium() {
        return nameCondominium;
    }

    public void setNameCondominium(String nameCondominium) {
        this.nameCondominium = nameCondominium;
    }

    public int getQuantityBuilding() {
        return quantityBuilding;
    }

    public void setQuantityBuilding(int quantityBuilding) {
        this.quantityBuilding = quantityBuilding;
    }
}
