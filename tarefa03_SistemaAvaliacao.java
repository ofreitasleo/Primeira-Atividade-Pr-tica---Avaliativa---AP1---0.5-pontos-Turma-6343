import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {

    public static void main(String[] args) {
        String notaProva1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
        String notaProva2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
        String notaTrabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho: ");

        double notaProva1 = Double.parseDouble(notaProva1Str);
        double notaProva2 = Double.parseDouble(notaProva2Str);
        double notaTrabalho = Double.parseDouble(notaTrabalhoStr);

        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        String situacao = (media >= 6) ? "Aprovado" : "Reprovado";

        JOptionPane.showMessageDialog(null, 
            String.format("Média: %.2f\nSituação: %s", media, situacao),
            "Resultado da Avaliação",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
