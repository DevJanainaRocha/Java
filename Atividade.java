/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

/**
 *
 * @author janai
 */
public class Atividade {

    public static void main(String[] args) {
        //Dadas as linhas a seguir, o que acontecerá se esse código for executado?
        
        int x = 8, y = 3;
        int w = y/x;
        String z = (w % 2 == 0)? "frase1":"frase2";
        System.out.println(z);
        
        //Resposta: Será impressa a frase 1
        // observe que a variável w recebera um resultado inteiro, pois foi declarada como int.
    }
    
    
}
