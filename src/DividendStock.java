/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class DividendStock extends Stock {
    private double dividends;

    public DividendStock(double dividends, int totalShares, double profit, String symbol, double totalCost, double currentPrice) {
        super(totalShares, profit, symbol, totalCost, currentPrice);
        this.dividends = dividends;
    }

    public double getDividends() {
        return dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    public double getProfit(){
        return ((this.totalShares)*(this.currentPrice))-(this.totalCost);
    }  
    
    public double getMarketValue(){
        return (this.totalShares * this.currentPrice) + this.dividends;
    }
}
