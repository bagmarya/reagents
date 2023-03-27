package com.chemical.reagents.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomenclature")
public class Nomenclature {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "nomenclature_id")
  private Integer id;

  private String name;
  private String description;
  private String requirements;

  @Column(name = "normative_doc")
  private String normativeDoc;
  private Integer price;
  private String unit;
  @Column(name = "creator_id")
  private Integer creatorId;


  public Nomenclature() {
  }

  public Nomenclature(String name, String normativeDoc, String requirements, String unit, Integer price, String description, Integer creatorId) {
    this.name = name;
    this.description = description;
    this.requirements = requirements;
    this.normativeDoc = normativeDoc;
    this.price = price;
    this.unit = unit;
    this.creatorId = creatorId;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getRequirements() {
    return requirements;
  }

  public String getNormativeDoc() {
    return normativeDoc;
  }

  public Integer getPrice() {
    return price;
  }

  public String getUnit() {
    return unit;
  }

  public Integer getCreatorId() {
    return creatorId;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public void setNormativeDoc(String normative_doc) {
    this.normativeDoc = normative_doc;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }
}
