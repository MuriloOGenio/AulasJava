
package main;
import javax.swing.JOptionPane;
public class Main {

     public static void main(String[] args) {
      JOptionPane.showMessageDialog(null,"Hello World!", "" , 1 );
      
      String x = JOptionPane.showInputDialog(null , "Digite um Valor");
      //int valor = Integer.parseInt(x);
      double valor2 = Double.parseDouble(x);
                //Esse valor é inteiro?
      
      JOptionPane.showMessageDialog(null, "Valor Digitado foi " + x );
    }
    
}
