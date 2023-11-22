import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProyectoInterfazGrafica {

    public static void main(String[] args) {
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 200);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.PAGE_AXIS));

        JLabel lblUsername = new JLabel("Usuario:");
        JTextField txtUsername = new JTextField(50);
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField(50);
        JButton btnLogin = new JButton("Iniciar sesión");

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = String.valueOf(txtPassword.getPassword());

                // Verificar el usuario y contraseña
                if (username.equals("admin") && password.equals("123")) {
                    // Abrir la ventana de alimentos si el login es correcto
                    abrirVentanaAlimentos();
                    loginFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Usuario o contraseña incorrectos");
                }
            }
        });

        loginPanel.add(lblUsername);
        loginPanel.add(txtUsername);
        loginPanel.add(lblPassword);
        loginPanel.add(txtPassword);
        loginPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        loginPanel.add(btnLogin);

        loginFrame.add(loginPanel);
        loginFrame.setVisible(true);
    }

    public static void abrirVentanaAlimentos() {
        JFrame alimentosFrame = new JFrame("Alimentos");
        alimentosFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        alimentosFrame.setSize(400, 300);

        JPanel alimentosPanel = new JPanel();
        alimentosPanel.setLayout(new BoxLayout(alimentosPanel, BoxLayout.PAGE_AXIS));

        JLabel lblTitulo = new JLabel("Lista de Alimentos");
        JButton btnAñadir = new JButton("Añadir");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");

        btnAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String categoria = JOptionPane.showInputDialog(alimentosFrame, "Introduce la categoría del alimento:");
                String nombre = JOptionPane.showInputDialog(alimentosFrame, "Introduce el nombre del alimento:");

                try {
                    verificarCategoria(categoria);
                    // Guardar el alimento en la categoría correspondiente
                    JOptionPane.showMessageDialog(alimentosFrame, "Alimento añadido correctamente");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(alimentosFrame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para editar un alimento
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar un alimento
            }
        });

        alimentosPanel.add(lblTitulo);
        alimentosPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        alimentosPanel.add(btnAñadir);
        alimentosPanel.add(btnEditar);
        alimentosPanel.add(btnEliminar);

        alimentosFrame.add(alimentosPanel);
        alimentosFrame.setVisible(true);
    }

    public static void verificarCategoria(String categoria) throws Exception {
        if ((categoria.equalsIgnoreCase("Grasas") || categoria.equalsIgnoreCase("Hidratos de Carbono")) &&
                (categoria.equalsIgnoreCase("Hidratos de Carbono") || categoria.equalsIgnoreCase("Grasas"))) {
            throw new Exception("No se puede añadir una fruta en la categoría de Grasas o de Hidratos de Carbono");
        }
    }
}