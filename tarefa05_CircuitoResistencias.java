import javax.swing.JOptionPane;

public class CircuitoDeResistencias {

    public static void main(String[] args) {
        String resistencia1Str = JOptionPane.showInputDialog("Digite o valor da primeira resistência (R1): ");
        String resistencia2Str = JOptionPane.showInputDialog("Digite o valor da segunda resistência (R2): ");
        String resistencia3Str = JOptionPane.showInputDialog("Digite o valor da terceira resistência (R3): ");
        String resistencia4Str = JOptionPane.showInputDialog("Digite o valor da quarta resistência (R4): ");

        double R1 = Double.parseDouble(resistencia1Str);
        double R2 = Double.parseDouble(resistencia2Str);
        double R3 = Double.parseDouble(resistencia3Str);
        double R4 = Double.parseDouble(resistencia4Str);

        double resistenciaEquivalente = R1 + R2 + R3 + R4;

        double maiorResistencia = Math.max(Math.max(R1, R2), Math.max(R3, R4));
        double menorResistencia = Math.min(Math.min(R1, R2), Math.min(R3, R4));

        JOptionPane.showMessageDialog(null, 
            String.format("Resistência Equivalente: %.2f Ω\nMaior Resistência: %.2f Ω\nMenor Resistência: %.2f Ω", 
                          resistenciaEquivalente, maiorResistencia, menorResistencia),
            "Resultados do Circuito de Resistências",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
