package com.bridgelabz;

public class CabInvoiceGenerator {
    static final  double COST_PER_KM=10;
    static final  double COST_PER_MINUTE=1;
    static final  double MINIMUM_COST=5;
    public double calculateTotalFair(double distance, double time) {
        double cost =distance*COST_PER_KM+time*COST_PER_MINUTE;
        return cost;
    }
}