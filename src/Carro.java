import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Carro extends JFrame implements ActionListener {

    // Campos de texto
    private JTextField campoNome;
    private JTextField campoEmail;
    private JTextField campoTelefone;
    private JTextField campoMatricula;
    private JTextField campoMarca;
    private JTextField campoModelo;
    private JTextField campoAno;

    // ComboBox para reparações
    private JComboBox<String> tipoReparacao; // JComboBox cria uma lista de opções pré-definidas

    // Área de histórico
    private JTextArea areaHistorico;

    // Botões
    private JButton botaoGuardar;
    private JButton botaoApagar;
    private JButton botaoSair;

    public Carro() {

        setTitle("Sistema de Gestão de Oficina Automóvel");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        // PAINEL SUPERIOR

        JPanel painelSup = new JPanel();
        painelSup.setBackground(Color.BLUE);

        JLabel titulo = new JLabel("Sistema de Gestão de Oficina Automóvel");
        titulo.setForeground(Color.WHITE);

        painelSup.add(titulo);

        // PAINEL ESQUERDO

        JPanel painelDados = new JPanel(new GridLayout(8, 2, 5, 5));
        painelDados.setBackground(new Color(220, 230, 250));

        painelDados.add(new JLabel("Nome do Cliente:"));
        campoNome = new JTextField();
        painelDados.add(campoNome);

        painelDados.add(new JLabel("Email:"));
        campoEmail = new JTextField();
        painelDados.add(campoEmail);

        painelDados.add(new JLabel("Telefone:"));
        campoTelefone = new JTextField();
        painelDados.add(campoTelefone);

        painelDados.add(new JLabel("Matrícula:"));
        campoMatricula = new JTextField();
        painelDados.add(campoMatricula);

        painelDados.add(new JLabel("Marca:"));
        campoMarca = new JTextField();
        painelDados.add(campoMarca);

        painelDados.add(new JLabel("Modelo:"));
        campoModelo = new JTextField();
        painelDados.add(campoModelo);

        painelDados.add(new JLabel("Ano:"));
        campoAno = new JTextField();
        painelDados.add(campoAno);

        painelDados.add(new JLabel("Tipo de Reparação:"));

        // Criação das opções disponíveis para reparação
        String[] reparacoes = {
                "Mudança de Óleo",
                "Travões",
                "Pintura",
                "Diagnóstico",
                "Motor"
        };

        tipoReparacao = new JComboBox<>(reparacoes); // Cria a lista de seleção
        painelDados.add(tipoReparacao);

        // PAINEL DIREITO

        JPanel painelHistorico = new JPanel(new BorderLayout());
        painelHistorico.setBackground(new Color(220, 230, 250));

        JLabel lblHistorico = new JLabel("Histórico de Registos");

        areaHistorico = new JTextArea();
        areaHistorico.setEditable(false);

        // Adiciona barras de deslocação quando o texto
        // ultrapassa o tamanho visível da JTextArea
        JScrollPane scroll = new JScrollPane(areaHistorico);

        painelHistorico.add(lblHistorico, BorderLayout.NORTH);
        painelHistorico.add(scroll, BorderLayout.CENTER);

        // Dimensões dos painéis
        painelDados.setPreferredSize(new Dimension(520, 0));
        painelHistorico.setPreferredSize(new Dimension(320, 0));

        // PAINEL INFERIOR

        JPanel painelInf = new JPanel();
        painelInf.setBackground(new Color(200, 220, 240));

        botaoGuardar = new JButton("Guardar Dados");
        botaoApagar = new JButton("Apagar Histórico");
        botaoSair = new JButton("Sair");

        botaoGuardar.addActionListener(this);
        botaoApagar.addActionListener(this);
        botaoSair.addActionListener(this);

        painelInf.add(botaoGuardar);
        painelInf.add(botaoApagar);
        painelInf.add(botaoSair);

        // ADICIONAR À JANELA

        c.add(painelSup, BorderLayout.NORTH);
        c.add(painelDados, BorderLayout.WEST);
        c.add(painelHistorico, BorderLayout.CENTER);
        c.add(painelInf, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // GUARDAR DADOS
        if (e.getSource() == botaoGuardar) {
            // Obtém o texto escrito pelo utilizador
            // trim() remove espaços em branco no início e no fim

            String nome = campoNome.getText().trim();
            String email = campoEmail.getText().trim();
            String telefone = campoTelefone.getText().trim();
            String matricula = campoMatricula.getText().trim();
            String marca = campoMarca.getText().trim();
            String modelo = campoModelo.getText().trim();
            String ano = campoAno.getText().trim();
            String reparacao = tipoReparacao.getSelectedItem().toString();
            if (nome.isEmpty() ||
                    email.isEmpty() ||  // o Empty verifica se o campo ficou vazio
                    telefone.isEmpty() ||
                    matricula.isEmpty() ||
                    marca.isEmpty() ||
                    modelo.isEmpty() ||
                    ano.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Todos os campos são obrigatórios!");
                return;
            }
            if (!email.contains("@")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Email inválido!");
                return;
            }
            // Verificar se o telefone tem letras
            for (int i = 0; i < telefone.length(); i++) {
                if (!Character.isDigit(telefone.charAt(i))) {
                    JOptionPane.showMessageDialog(
                            null,
                            "O telefone só pode conter números!");
                    return;
                }
            }
            areaHistorico.append(
                    "Cliente: " + nome + "\n" +
                            "Email: " + email + "\n" +
                            "Telefone: " + telefone + "\n\n" +

                            "Veículo:\n" +
                            "Matrícula: " + matricula + "\n" +
                            "Marca: " + marca + "\n" +
                            "Modelo: " + modelo + "\n" +
                            "Ano: " + ano + "\n\n" +

                            "Tipo de Reparação:\n" +
                            reparacao + "\n\n" +

                            "------------------------------------------\n\n"
            );
            JOptionPane.showMessageDialog(
                    null,
                    "Dados guardados com sucesso!");
        }
        // APAGAR HISTÓRICO
        if (e.getSource() == botaoApagar) {

            areaHistorico.setText("");
        }
        // SAIR
        if (e.getSource() == botaoSair) {

            System.exit(0);
        }
    }
    public static void main(String[] args) {

        new Carro();
    }
}
