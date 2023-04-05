package main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Calculando IMC", "", 1);
        String a = JOptionPane.showInputDialog(null, "Digite o Peso aqui");
        double peso = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog(null, "Digite a altura");
        double altura = Double.parseDouble(b);
        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f Abaixo do Peso", IMC));
        } else if (IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f Peso Normal", IMC));
        } else if (IMC <= 29.9) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f SobrePeso", IMC));
        } else if (IMC <= 34.9) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f Obesidade Leve", IMC));
        } else if (IMC <= 39.9) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f Obesidade Moderada", IMC));

        } else {
            JOptionPane.showMessageDialog(null, IMC + "Obesidade Mórbida");
        }
    }

}
