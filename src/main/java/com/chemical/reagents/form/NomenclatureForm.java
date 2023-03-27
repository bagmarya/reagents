package com.chemical.reagents.form;

public class NomenclatureForm {

  private String name;
  private String normativeDoc;
  private String requirements;
  private String unit;
  private Integer price;
  private String description;

  public String getName() {
    return name;
  }

  public String getNormativeDoc() {
    return normativeDoc;
  }

  public String getRequirements() {
    return requirements;
  }

  public String getUnit() {
    return unit;
  }

  public Integer getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNormativeDoc(String normativeDoc) {
    this.normativeDoc = normativeDoc;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
