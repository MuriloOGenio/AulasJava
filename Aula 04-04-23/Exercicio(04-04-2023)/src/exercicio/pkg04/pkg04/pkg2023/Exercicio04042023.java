
package exercicio.pkg04.pkg04.pkg2023;

import javax.swing.JOptionPane;


public class Exercicio04042023 {

   
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Calculando A Média do Aluno", "" ,1 );
       String a = JOptionPane.showInputDialog(null, "Digite a nota do Primeiro bimestre");
       double nota1 = Double.parseDouble(a);
       String b = JOptionPane.showInputDialog(null, "Digite a nota do Segundo bimestre");
       double nota2 = Double.parseDouble(b);
       String c = JOptionPane.showInputDialog(null, "Digite a nota do Terceiro bimestre");
       double nota3 = Double.parseDouble(c);
       double media = (nota1 + nota2 + nota3)/3;
       JOptionPane.showMessageDialog(null,"A média é: " + String.format("%.2f", media));
       
        
    }
    
}
