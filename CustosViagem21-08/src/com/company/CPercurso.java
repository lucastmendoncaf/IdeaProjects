package com.company;


import java.util.Scanner;

public class CPercurso {
    
    private double kmPercorrido;
    private double valorComnustivel;
    private double valorPedagio;
    public double valorTotal;
    public double kmTotal;


    public double getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getValorComnustivel() {
        return valorComnustivel;
    }

    public void setValorComnustivel(double valorComnustivel) {
        this.valorComnustivel = valorComnustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }

    public void cadastrarPercurso() {
        Scanner iscan = new Scanner(System.in);
        System.out.println("quantos km percorrido?");
        kmPercorrido = iscan.nextDouble();
        System.out.println("valor pedagio");
        valorPedagio = iscan.nextDouble();
        System.out.println("Valor combustivel");
        valorComnustivel = iscan.nextDouble();


    }

    public void listarPercurso() {
        System.out.println("kmPercorrido = " + kmPercorrido);
        System.out.println("valorComnustivel = " + valorComnustivel);
        System.out.println("valorPedagio = " + valorPedagio);
    }

}
