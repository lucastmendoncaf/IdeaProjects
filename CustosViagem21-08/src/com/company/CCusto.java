package com.company;

public class CCusto {
    private double totalPercurso;

    public void calcularViagem(CPercurso puxa){
        totalPercurso = ((puxa.getKmPercorrido()/10)*puxa.getValorComnustivel()) + puxa.getValorPedagio();
        System.out.println("totalPercurso = " + totalPercurso);

    }
}
