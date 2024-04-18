package pe.edu.upc.demoapisx61.dtos;

import jakarta.persistence.Column;

public class CondominiumDTO {
    private int idCondominium;
    private String nameCondominium;
    private String adressCondominium;
    private String emailCondominium;
    private float extensionCondominium;

    public int getIdCondominium() {
        return idCondominium;
    }

    public void setIdCondominium(int idCondominium) {
        this.idCondominium = idCondominium;
    }

    public String getNameCondominium() {
        return nameCondominium;
    }

    public void setNameCondominium(String nameCondominium) {
        this.nameCondominium = nameCondominium;
    }

    public String getAdressCondominium() {
        return adressCondominium;
    }

    public void setAdressCondominium(String adressCondominium) {
        this.adressCondominium = adressCondominium;
    }

    public String getEmailCondominium() {
        return emailCondominium;
    }

    public void setEmailCondominium(String emailCondominium) {
        this.emailCondominium = emailCondominium;
    }

    public float getExtensionCondominium() {
        return extensionCondominium;
    }

    public void setExtensionCondominium(float extensionCondominium) {
        this.extensionCondominium = extensionCondominium;
    }
}
