/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desvio;

/**
 *
 * @author janai
 */
  public class Desvio {
    public static void main(String args[]) {
        for (int i = 0; i < 12; i++) {
            if (i % 3 == 0) continue;
            if (i % 5 == 0) break;
            if (i % 7 == 0) continue;

            System.out.print(i + " ");
        }
    }
}
