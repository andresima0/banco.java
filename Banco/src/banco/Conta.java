/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author andre
 */
public class Conta 
{
    protected String cliente;
    protected double saldo;
    
    public void exibirSaldo()
    {
        System.out.println(cliente + ", seu saldo e R$" + saldo); 
    }
    
    public void saque(double valor)
    {
        saldo -= valor;
    }
    
    public void deposita(double valor)
    {
        saldo += valor;
    }
        
    public void transferir(Conta destino, double valor)
    {
        this.saque(valor);
        destino.deposita(valor);
    }      
    
}//fim da classe
