package com.company;


import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner iscan = new Scanner(System.in);
        CPercurso np = new CPercurso();
        CCusto ncu = new CCusto();
        int opc;
            do{
                System.out.println("1.. Cadastrar");
                System.out.println("2.. Listar");
                System.out.println("3.. calcular");
                System.out.println("4.. Sair");
                opc = Integer.parseInt(iscan.nextLine());
                switch(opc){
                    case 1:
                        np.cadastrarPercurso();
                        break;
                    case 2:
                        np.listarPercurso();
                        break;
                    case 3:
                        ncu.calcularViagem(np);
                        break;
                    case 4:
                        System.out.println("FIM");
                        break;
                    default:
                        System.out.println("Opção não existente");
                }
            }while(opc!=4);
        }

    }
