package com.bridgelabz.greetingapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GreetingData {
    String firstName;
    String lastName;
    private int id;

    public GreetingData(GreetingData greetingData) {
        this.firstName = greetingData.firstName;
        this.lastName = greetingData.lastName;

    }
    public GreetingData(String firstName, String lastName) {

    }

    public GreetingData() {

    }
    public GreetingData(GreetingData greetingData, Integer id) {
        this.firstName = greetingData.firstName;
        this.lastName = greetingData.lastName;
        this.id=id;
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

    public void setId(Integer id) {
        this.id = id;
    }
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Data{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
