import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args) {
        String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor da transação do imóvel: R$ ");
        String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel: R$ ");
        String percentualITBIStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI: ");

        double valorTransacao = Double.parseDouble(valorTransacaoStr);
        double valorVenal = Double.parseDouble(valorVenalStr);
        double percentualITBI = Double.parseDouble(percentualITBIStr);

        double valorBase = Math.max(valorTransacao, valorVenal);

        double valorITBI = (valorBase * percentualITBI) / 100;

        JOptionPane.showMessageDialog(null, 
            String.format("Valor de base para o ITBI: R$ %.2f\nValor do ITBI a ser pago: R$ %.2f", valorBase, valorITBI),
            "Cálculo do ITBI",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
