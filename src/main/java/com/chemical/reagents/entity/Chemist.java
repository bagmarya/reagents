package com.chemical.reagents.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "chemist")
public class Chemist {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "chemist_id")
  private Integer id;

  private String login;
  private String password;
  private String name;
  private String surname;
  private String role;

  public Chemist() {  }

  public int getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getRole() {
    return role;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
