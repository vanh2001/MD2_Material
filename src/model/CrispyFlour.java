package model;

import model.Material;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                super.toString() +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public double getAmount() {
        double getAmount = quantity * getCost();
        return getAmount;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate getExpiryDate = getManufacturingDate().plusYears(1);
        return getExpiryDate;
    }
}
