import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuario extends JFrame {

    private JTextField txtNome;
    private JTextField txtIdade;
    private JCheckBox chkPromo;
    private JLabel lblResultado;

    public CadastroUsuario() {
        setTitle("Cadastro de Usuário");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setResizable(false);

        // Painel principal
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        // Painel de formulário
        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        // Nome
        painelFormulario.add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1;
        txtNome = new JTextField(20);
        painelFormulario.add(txtNome, gbc);

        // Idade
        gbc.gridx = 0;
        gbc.gridy++;
        painelFormulario.add(new JLabel("Idade:"), gbc);
        gbc.gridx = 1;
        txtIdade = new JTextField(20);
        painelFormulario.add(txtIdade, gbc);

        // Checkbox
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        chkPromo = new JCheckBox("Desejo receber mensagens promocionais");
        painelFormulario.add(chkPromo, gbc);

        // Botão Cadastrar
        gbc.gridy++;
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setPreferredSize(new Dimension(140, 35));
        painelFormulario.add(btnCadastrar, gbc);

        // Resultado
        lblResultado = new JLabel(" ");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setFont(new Font("Arial", Font.PLAIN, 13));

        // Adicionando aos painéis principais
        painelPrincipal.add(painelFormulario, BorderLayout.CENTER);
        painelPrincipal.add(lblResultado, BorderLayout.SOUTH);

        // Adiciona tudo à janela
        add(painelPrincipal);

        // Ação do botão
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });
    }

    private void cadastrar() {
        String nome = txtNome.getText().trim();
        String idade = txtIdade.getText().trim();

        if (nome.isEmpty() || idade.isEmpty()) {
            lblResultado.setText("Por favor, preencha todos os campos.");
            lblResultado.setForeground(Color.RED);
        } else {
            String promo = chkPromo.isSelected() ? "Ativadas" : "Desativadas";
            lblResultado.setText("<html><b>Cadastro realizado para " + nome + " (idade: " + idade + ").<br>Promoções: " + promo + ".</b></html>");
            lblResultado.setForeground(new Color(0, 128, 0));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CadastroUsuario().setVisible(true);
        });
    }
}
