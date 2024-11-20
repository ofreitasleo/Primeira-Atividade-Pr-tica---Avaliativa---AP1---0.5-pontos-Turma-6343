import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade: ");
        String sexoStr = JOptionPane.showInputDialog("Digite seu sexo (M para masculino, F para feminino): ");
        String anosContribuicaoStr = JOptionPane.showInputDialog("Digite seus anos de contribuição: ");

        int idade = Integer.parseInt(idadeStr);
        char sexo = sexoStr.charAt(0); // Pega o primeiro caractere (M ou F)
        int anosContribuicao = Integer.parseInt(anosContribuicaoStr);

        int idadeAposentadoria = (sexo == 'M' || sexo == 'm') ? 65 : 62;  // Idade de aposentadoria por idade
        int tempoContribuicaoAposentadoria = (sexo == 'M' || sexo == 'm') ? 35 : 30;  // Tempo de contribuição por sexo

        boolean podeAposentarPorIdade = idade >= idadeAposentadoria;
        boolean podeAposentarPorContribuicao = anosContribuicao >= tempoContribuicaoAposentadoria;

        if (podeAposentarPorIdade && podeAposentarPorContribuicao) {
            JOptionPane.showMessageDialog(null, "Você já pode se aposentar por idade ou por tempo de contribuição.");
        } else {
            StringBuilder mensagem = new StringBuilder("Você ainda não pode se aposentar.\n");

            if (!podeAposentarPorIdade) {
                mensagem.append("Faltam " + (idadeAposentadoria - idade) + " anos para aposentadoria por idade.\n");
            }

            if (!podeAposentarPorContribuicao) {
                mensagem.append("Faltam " + (tempoContribuicaoAposentadoria - anosContribuicao) + " anos para aposentadoria por tempo de contribuição.");
            }

            JOptionPane.showMessageDialog(null, mensagem.toString(), "Resultado da Aposentadoria", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
