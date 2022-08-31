/**
 * @author Noah Clark - npclark
 * CIS175 - Fall 2022
 * August 31, 2022
 */
package model;

public class Platypus {
    private String gender;
    private double length; // length from tip to tail given in inches
    private String name;

    public Platypus(){
        this.gender = "Male";
        this.length = 20.4;
        this.name = "Perry";
    }
    public Platypus(String gender, double length, String name){
        this.gender = gender;
        this.length = length;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Gyururu!";
    }
}
