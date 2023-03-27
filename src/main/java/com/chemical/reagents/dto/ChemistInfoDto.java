package com.chemical.reagents.dto;

public class ChemistInfoDto {

  private String login;
  private String name;
  private String role;

  public ChemistInfoDto() {
  }

  public ChemistInfoDto(String login, String name, String role) {
    this.login = login;
    this.name = name;
    this.role = role;
  }

  public String getLogin() {
    return login;
  }

  public String getName() {
    return name;
  }

  public String getRole() {
    return role;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
