/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

// Aqui vocês pode visualisar a minha classe Maquinacalc, onde eu criei as variáveis necessária para a realização das operações.

public class Máquinacalc {
      float n1;
      float n2;
      float resultado;
      
    public void menu_fechar(){
// Este método tem a finalidade de encerrar a calculadora. Ele é iniciado na classe principal quando o usuário escolhe a opção zero(0).
     
      JOptionPane.showMessageDialog(null, "A Calculadora foi encerrada!");  
        
    }
            
    public void somar(){
//Observe que nos métodos eu precisei converter as variáveis n1 e n2 em inteiros.
//a conversão foi necessária, pois as variáveis foram declaradas como float.
//a conversão foi necessária, pois ao escolher uma opção o usuário digitará um número inteiro.

       n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: " ));
       n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: " ));
            
       resultado = n1 + n2;
       JOptionPane.showMessageDialog(null, "A soma é  " + resultado);

    }
    
    public void subtrair(){
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: " ));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: " ));
            
        resultado = n1 - n2;
        JOptionPane.showMessageDialog(null, "A subtração é " + resultado);

                 
    }
    
    public void multiplicar(){
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: " ));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: " ));
             
        resultado = n1 * n2;
        JOptionPane.showMessageDialog(null, "A Multiplicação é " + resultado);

    }
    
    public void dividir(){
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: " ));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: " ));
            
        resultado = n1/n2;
        JOptionPane.showMessageDialog(null, "A Divisão é " + resultado);

       }
    
    public void QuadradoN(){
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: " ));
                   
        resultado = n1*n1;
        JOptionPane.showMessageDialog(null, "O Quadrado de " + n1 + " é " + resultado);

    }

      //Gosto de utilizar o JOptionPane, pois possibilita maior interação com o usuário.
}
