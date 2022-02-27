package model;

import model.Material;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Meat{" +
                super.toString() +
                "weight=" + weight +
                '}';
    }

    @Override
    public double getAmount() {
        double getAmount = getCost() * weight;
        return getAmount;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate getExpiryDate = getManufacturingDate().plusDays(7);
        return getExpiryDate;
    }
}
