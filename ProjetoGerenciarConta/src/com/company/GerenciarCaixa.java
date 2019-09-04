package com.company;

import com.company.visao.CaixaTela;

import javax.swing.*;

public class GerenciarCaixa {

    public static void main(String[] args) {
	// Codigo para abrir a janela
        JFrame frame = new JFrame();
        frame.setContentPane(new CaixaTela().getPanelCaixa());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
