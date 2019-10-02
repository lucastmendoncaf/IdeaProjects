package com.company;

public abstract class Conta {
    private int idConta;
    private Cliente cliente;
    private double saldo;

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
        cliente = new Cliente();
    }
        //metodo para efetuar deposito para qualquer conta
        public void depositar (double valor){
            saldo += valor;
        }
        //metodo abstrato sacar, ele nao possui codigo
    public  abstract boolean sacar(double valor);

    public abstract void setLimite(int i);
}
