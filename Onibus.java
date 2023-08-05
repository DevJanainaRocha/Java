/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onibus;

/**
 *
 * @author janai
 */
import javax.swing.JOptionPane;
public class Onibus {

    public static void main(String[] args) {
      Rotas R = new Rotas();
      
      JOptionPane.showMessageDialog(null,"Planejamento da rota de Domingo");
      R.Rotas_quantidade();
      R.Rotas_combustivel();
      R.Valor_diasel();
      R.Custototal_dodia();
      
    }
}
    
    
 


