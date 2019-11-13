package com.company;

import com.company.visao.frmveia;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame tela = new JFrame();
        tela.setContentPane(new frmveia().getPanelVeia());
        tela.setTitle("jogo da veia");
        tela.setVisible(true);
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.pack();

    }
}
