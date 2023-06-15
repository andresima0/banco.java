/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author andre
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n---CONTA 01---");
        Conta c1 = new Conta();
        c1.cliente = "Andre";
        c1.saldo = 5000.00;
        
        c1.exibirSaldo();
        c1.saque(2000);
        c1.exibirSaldo();
        c1.deposita(1000);
        c1.exibirSaldo();
        
        System.out.println("\n---CONTA 02---");
        Conta c2 = new Conta();
        c2.cliente = "Maria";
        c2.saldo = 3000.00;
        c2.exibirSaldo();
        c1.transferir(c2, 2000);
        c2.exibirSaldo();
        
        System.out.println("\n---CONTA 01---");
        c1.exibirSaldo(); 
        
    } 
    
}//fim da classe
