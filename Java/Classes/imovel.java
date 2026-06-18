/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aluno CA
 */
public class imovel {
   private int idImovel; 
   private String endereco;
   private double valor;
   public imovel(int idImovel,String endereco, double valor){
       this.idImovel=idImovel;
       this.endereco=endereco;
       this.valor=valor;
   }
   public void getInfo(){
       System.out.println("ID:" + idImovel);
       System.out.println("Endereço:" + endereco);
       System.out.println("Valor:" + valor);
       
   }
}
