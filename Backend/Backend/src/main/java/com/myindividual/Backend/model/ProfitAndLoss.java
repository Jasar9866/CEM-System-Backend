package com.myindividual.Backend.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "profit_and_loss")
public class ProfitAndLoss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateFrom;
    private String dateTo;
    private double totalSales;
    private double salesInwards;

    @ElementCollection
    private List<CostOfSale> costOfSales;

    @ElementCollection
    private List<OtherIncome> otherIncome;

    public ProfitAndLoss() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getSalesInwards() {
        return salesInwards;
    }

    public void setSalesInwards(double salesInwards) {
        this.salesInwards = salesInwards;
    }

    public List<CostOfSale> getCostOfSales() {
        return costOfSales;
    }

    public void setCostOfSales(List<CostOfSale> costOfSales) {
        this.costOfSales = costOfSales;
    }

    public List<OtherIncome> getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(List<OtherIncome> otherIncome) {
        this.otherIncome = otherIncome;
    }
// Constructors, getters, and setters

    // You'll need nested classes for the costOfSales and otherIncome lists
    // Here's an example of the nested classes:

    @Embeddable
    public static class CostOfSale {
        private String type;
        private double amount;

        public CostOfSale() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        // Constructors, getters, and setters
    }

    @Embeddable
    public static class OtherIncome {
        private String type;
        private double amount;

        public OtherIncome() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        // Constructors, getters, and setters
    }
}

