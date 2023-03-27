package com.chemical.reagents.dto;

public class NomenclatureInfoDto {

  private Integer id;
  private String name;
  private String description;
  private String requirements;
  private String normativeDoc;
  private Integer price;
  private String unit;

  public NomenclatureInfoDto() {
  }

  public NomenclatureInfoDto(Integer id,
                             String name,
                             String normativeDoc,
                             String requirements,
                             String unit,
                             Integer price,
                             String description) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.requirements = requirements;
    this.normativeDoc = normativeDoc;
    this.price = price;
    this.unit = unit;
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

  public void setNormativeDoc(String normativeDoc) {
    this.normativeDoc = normativeDoc;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }
}
