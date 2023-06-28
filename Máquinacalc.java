/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;


public class Máquinacalc {
      float n1;
      float n2;
      float resultado;
      
    public void menu_fechar(){
      
      JOptionPane.showMessageDialog(null, "A Calculadora foi encerrada!");  
        
    }
            
    public void somar(){
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
    
}
