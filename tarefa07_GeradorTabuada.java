import javax.swing.JOptionPane;

public class GeradorDeTabuada {

    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Digite um número para gerar sua tabuada:");

        int numero = Integer.parseInt(numeroStr);

        StringBuilder tabuada = new StringBuilder("Tabuada de " + numero + ":\n");

        for (int i = 1; i <= 10; i++) {
            tabuada.append(numero + " x " + i + " = " + (numero * i) + "\n");
        }
        JOptionPane.showMessageDialog(null, tabuada.toString(), "Resultado da Tabuada", JOptionPane.INFORMATION_MESSAGE);
    }
}
