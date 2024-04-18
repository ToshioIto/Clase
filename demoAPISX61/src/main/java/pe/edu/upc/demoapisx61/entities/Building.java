package pe.edu.upc.demoapisx61.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name ="Building" )
public class Building {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int idBuilding;
 @Column(name = "denominationBuilding", nullable = false,length = 55)
 private String denominationBuilding;
 @Column(name = "nFloorBuilding", nullable = false)
 private int nFloorBuilding;
 @Column(name = "nDepartmentBuilding", nullable = false)
 private int nDepartmentBuilding;
 @Column(name = "extensionBuilding", nullable = false)
 private double extensionBuilding;
 @Column(name = "deadlineBuilding", nullable = false)
 private LocalDate deadlineBuilding;
 @ManyToOne
 @JoinColumn(name = "condominiumId")
private Condominium condominium;

 public Building() {
 }

 public Building(int idBuilding, String denominationBuilding, int nFloorBuilding, int nDepartmentBuilding, double extensionBuilding, LocalDate deadlineBuilding, Condominium condominium) {
  this.idBuilding = idBuilding;
  this.denominationBuilding = denominationBuilding;
  this.nFloorBuilding = nFloorBuilding;
  this.nDepartmentBuilding = nDepartmentBuilding;
  this.extensionBuilding = extensionBuilding;
  this.deadlineBuilding = deadlineBuilding;
  this.condominium = condominium;
 }

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
