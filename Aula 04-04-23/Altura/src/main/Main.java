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
            JOptionPane.showMessageDialog(null, String.format(" %.2f \nAbaixo do Peso", IMC));
        } else if (IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f \nPeso Normal", IMC));
        } else if (IMC <= 29.9) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f \nSobrePeso\n", IMC));
        } else if (IMC <= 34.9) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f \nObesidade Leve\n", IMC));
        } else if (IMC <= 39.9) {
            JOptionPane.showMessageDialog(null, String.format(" %.2f \nObesidade Moderada\n", IMC));

        } else {
            JOptionPane.showMessageDialog(null, IMC + "\nObesidade Mórbida");
        }
    }

}
