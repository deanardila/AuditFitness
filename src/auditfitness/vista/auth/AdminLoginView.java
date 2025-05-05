/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auditfitness.vista.auth;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author deana
 */
public class AdminLoginView extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public AdminLoginView() {
        JFrame ventana = new JFrame("Audit - Fitness");
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel (new GridLayout(3,2,5,5));
        panel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));

        panel.add(new JLabel("Usuario: "));
        txtUsername = new JTextField();
        panel.add(txtUsername);

        panel.add(new JLabel("Contraseña: "));
        txtPassword = new JPasswordField();
        panel.add(txtPassword);

        btnLogin = new JButton("Ingresar");
        panel.add(new JLabel());
        panel.add(btnLogin);

        add(panel);
    }
    public String getTxtUsername() {
        return txtUsername.getText().trim();
    }

    public String getTxtPassword() {
        return new String(txtPassword.getPassword());
    }

    public void setLoginListener (ActionListener listener){
        btnLogin.addActionListener(listener);
    }
    public void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    
}
