/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onibus;

import javax.swing.JOptionPane;

/**
 *
 * @author janai
 */
public class Rotas {
    
     Double km=2.5;
     Double combustível= 4.98;
    
      
     public void Rotas_quantidade(){
        
      JOptionPane.showMessageDialog(null, " Hoje serão duas Rotas: \n Rota A: 100km \n Rota B: 250km \n");
        
    }
    
    public void Rotas_combustivel(){
       Double comb = 350/this.km;
       JOptionPane.showMessageDialog(null, "A quantidade necessária de combustível será: " + comb + "  litros  "  );
                     
    }
    
    public void Valor_diasel(){
         JOptionPane.showMessageDialog(null," O valor do Diesel é:  " + this.combustível);
        
        
    }
    
    public void Custototal_dodia(){
        Double custo = 350*this.combustível;
        JOptionPane.showMessageDialog(null," O custo diário será:  " + custo);
        
    }
    
    
}   