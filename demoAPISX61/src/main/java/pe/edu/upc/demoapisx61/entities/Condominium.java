package pe.edu.upc.demoapisx61.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Condominium")
public class Condominium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCondominium;
    @Column(name = "nameCondominium", nullable = false,length =45)
    private String nameCondominium;
    @Column(name = "adressCondominium", nullable = false,length =40)
    private String adressCondominium;
    @Column(name = "emailCondominium", nullable = false,length =40)
    private String emailCondominium;
    @Column(name = "extensionCondominium", nullable = false)
    private float extensionCondominium;

    public Condominium() {
    }

    public Condominium(int idCondominium, String nameCondominium, String adressCondominium, String emailCondominium, float extensionCondominium) {
        this.idCondominium = idCondominium;
        this.nameCondominium = nameCondominium;
        this.adressCondominium = adressCondominium;
        this.emailCondominium = emailCondominium;
        this.extensionCondominium = extensionCondominium;
    }

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
