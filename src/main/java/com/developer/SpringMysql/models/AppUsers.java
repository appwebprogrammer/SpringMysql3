package com.developer.SpringMysql.models;

import javax.persistence.*;


//name of table of database
@Entity
@Table(name = "appusers")
public class AppUsers {
    //this for table appusers
    //declare variables
    //this class is used to reciev and send data from our table
    //this for id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    //this for firstnme for db
    @Column(name = "firstname")
    public String firstName;
    @Column(name = "lastname")
    public String lastName;
    //this is an empty constructor
    public AppUsers() {
    }

    public AppUsers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
