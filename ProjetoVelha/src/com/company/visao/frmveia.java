package com.company.visao;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmveia {
    private JPanel panelVeia;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btn5;
    private JButton btn8;
    private JButton btn2;
    private JButton btn3;
    private JButton btn6;
    private JButton btn9;
    private JButton btnsair;
    private JButton btnnovo;



     public int vez;

    public frmveia() {
        iniciar();
        btnnovo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //limpar todos os 9 butao
              iniciar();
            }
        });
        btnsair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                "Fim de jogo", "Pronto",
                JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        MouseAdapter listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        };
        btn5.addMouseListener(listener);
        btn8.addMouseListener(listener);
        btn6.addMouseListener(listener);
        btn9.addMouseListener(listener);
        btn4.addMouseListener(listener);
        btn3.addMouseListener(listener);
        btn7.addMouseListener(listener);
    }

    private void iniciar() {
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        vez = 0;
    }

    private void jogar(MouseEvent e) {
        JButton meuBotao = (JButton) e.getComponent();
        if (meuBotao.getText()!=null){
            JOptionPane.showMessageDialog(null,
            "local ja jogado",
            "ERRO",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        vez++;
        if (vez % 2 == 1){
            meuBotao.setText("X");
        }else{
            meuBotao.setText("O");
        }
        if(vez < 5){
            return;
        }else {
            verQuemGanhou();
        }
    }
     
    private void verQuemGanhou(){
        if (btn1.getText()=="X" && btn2.getText()=="X" && btn3.getText()=="X"){
                venceuX();
                iniciar();
            }
            if (btn4.getText()=="X" && btn5.getText()=="X" && btn6.getText()=="X"){
                venceuX();
                iniciar();
            }
            if (btn7.getText()=="X" && btn8.getText()=="X" && btn9.getText()=="X"){
                venceuX();
                iniciar();
            }
            if (btn1.getText()=="X" && btn4.getText()=="X" && btn7.getText()=="X"){
                venceuX();
                iniciar();
            }
            if (btn2.getText()=="X" && btn5.getText()=="X" && btn8.getText()=="X"){
                venceuX();
                iniciar();
            }
            if (btn3.getText()=="X" && btn6.getText()=="X" && btn9.getText()=="X"){
                venceuX();
                iniciar();
            }
            if (btn3.getText()=="X" && btn5.getText()=="X" && btn7.getText()=="X") {
                venceuX();
                iniciar();
            }
            if (btn1.getText()=="X" && btn5.getText()=="X" && btn9.getText()=="X"){
                    venceuX();
                    iniciar();
            }



        if (btn1.getText()=="O" && btn2.getText()=="O" && btn3.getText()=="O"){
            venceuO();
            iniciar();
        }
        if (btn4.getText()=="O" && btn5.getText()=="O" && btn6.getText()=="O"){
            venceuO();
            iniciar();
        }
        if (btn7.getText()=="O" && btn8.getText()=="O" && btn9.getText()=="O"){
            venceuO();
            iniciar();
        }
        if (btn1.getText()=="O" && btn4.getText()=="O" && btn7.getText()=="O"){
            venceuO();
            iniciar();
        }
        if (btn2.getText()=="O" && btn5.getText()=="O" && btn8.getText()=="O"){
            venceuO();
            iniciar();
        }
        if (btn3.getText()=="O" && btn6.getText()=="O" && btn9.getText()=="O"){
            venceuO();
            iniciar();
        }
        if (btn3.getText()=="O" && btn5.getText()=="O" && btn7.getText()=="O"){
            venceuO();
            iniciar();
        }
        if (btn1.getText()=="O" && btn5.getText()=="O" && btn9.getText()=="O"){
            venceuO();
            iniciar();
        }
    }
    private void venceuX() {
    JOptionPane.showMessageDialog(null,
            "Jogardor X venceu",
            "fim",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public JPanel getPanelVeia(){
        return panelVeia;
    }

    private void venceuO() {

    }
    }
