package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CostumerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "user_seq_gen")
    @SequenceGenerator(name="user_seq_gen", sequenceName = "user_id_seq" , allocationSize = 1)
    @Column(name = "number")
    private Integer number;
    @Column(name = "name", columnDefinition = "varchar (20)", nullable = false)
    private String name;
    @Column(name = "last_name", columnDefinition = "varchar (60)", nullable = false)
    private String lastName;
    @Column(name = "gender", columnDefinition = "varchar (60)", nullable = false)
    private String gender;

    public CostumerEntity(){

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number ) {
        this.number = number;
    }

    public String getName() {  return name; }

    public void setName(String name ) {
        this.name= name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}