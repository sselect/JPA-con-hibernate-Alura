
// En este caso [Cuenta] es mi objeto y puede tener ENE Instancias y cada uno tiene
// sus propios atributos.

import javax.swing.*;

// Por ejemplo mi clase es cuenta y sus atributos es (saldo, agencia, numero, titular)
// todas las clases tienen sus atributos.
public class Cuenta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;


    public Cuenta (int agencia){

        if (agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else {

            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van crean creando: " + total + "Cuentas.");
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean retira (double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }


    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

}

