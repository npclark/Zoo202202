/**
 * @author Noah Clark - npclark
 * CIS175 - Spring 2022
 * Jan 20, 2022
 */
package model;

public class Owl {
    private String species;
    private double wingspan; // wingspan given in meters
    private String name;

    public Owl(){
        this.species = "Great horned owl";
        this.wingspan = 1.4;
        this.name = "Theo";
    }
    public Owl(String species, double wingspan, String name){
        this.species = species;
        this.wingspan = wingspan;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWingspan() {
        return wingspan;
    }
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Hoot!";
    }
}
