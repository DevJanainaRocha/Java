/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author janai
 */

// Aqui vocês estão visualizando a minha classe principal. 
// Nela eu criei o objeto da classe Maquinacalc e chamei os métodos atraves do comando Switch - case.   
// O while, no final do codigo, determina que a calculadora se mantem aberta enquanto o usuário não encerra-la escolhendo a opçã zero(0)

import javax.swing.JOptionPane;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Máquinacalc calc = new Máquinacalc();
                
             int opc;
             do{
             opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções:\n0.Fechar\n1.Somar\n2.Subtrair\n3.Multiplicar\n4.Dividir\n5.Quadrado de um número"));
            
                switch (opc){
                
                    case 0: 
                    calc.menu_fechar();
                    break;
               
                    case 1: 
                    calc.somar();
                    break;
               
                    case 2: 
                    calc.subtrair();
                    break;
 
                    case 3: 
                    calc.multiplicar();
                    break;

                    case 4: 
                    calc.dividir();
                    break;
                
                    case 5:    
                    calc.QuadradoN();
                    break;
               
                    default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
             }while (opc!=0);
              
    }
             
}
        
       
           
