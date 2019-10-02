package com.company;

public class Corrente extends Conta{
    private double limit;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean sacar(double valor) {
        return false;
        if(valor<=(getSaldo()+limite)){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }
}
