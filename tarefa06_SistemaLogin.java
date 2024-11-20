import javax.swing.JOptionPane;

public class SistemaDeLogin {

    public static void main(String[] args) {
        String loginCorreto = "java8";
        String senhaCorreta = "java8";

        String login;
        String senha;
        int tentativas = 0;  // Contador de tentativas

        while (tentativas < 3) {
            login = JOptionPane.showInputDialog("Digite seu login:");
            senha = JOptionPane.showInputDialog("Digite sua senha:");

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido! Bem-vindo ao sistema.");
                return; 
            } else {
                tentativas++;  // Incrementa o número de tentativas
                if (tentativas < 3) {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Você tem " + (3 - tentativas) + " tentativas restantes.");
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Número máximo de tentativas alcançado. Acesso bloqueado.");
    }
}
