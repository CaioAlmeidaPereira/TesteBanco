package com.mycompany.banco;

public class BancoConstrutor {

    private String titular;
    private double saldo;
    private String agencia;
    private String numero;

    public BancoConstrutor(String titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor para depósito invalido");
        }
    }
    
    public boolean sacar (double valor) {
        if (valor>0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saque não realizado: Valor indisponivel");
            return false;
        }
        
    }
}
