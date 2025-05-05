/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auditfitness.vista.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author deana
 */
public class AddClienteView extends JDialog {
    // Componentes de la interfaz
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JTextField txtNombre;
    private JTextField txtIdentificacion;
    private JButton btnGuardar;
    private JButton btnCancelar;

    public AddClienteView(JFrame parent) {
        super(parent, "Agregar Cliente", true); // Modal (bloquea la ventana padre)
        setSize(400, 300);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Etiquetas y campos
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        txtUsername = new JTextField(15);
        panel.add(txtUsername, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Contraseña:"), gbc);

        gbc.gridx = 1;
        txtPassword = new JPasswordField(15);
        panel.add(txtPassword, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Nombre:"), gbc);

        gbc.gridx = 1;
        txtNombre = new JTextField(15);
        panel.add(txtNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Identificación:"), gbc);

        gbc.gridx = 1;
        txtIdentificacion = new JTextField(15);
        panel.add(txtIdentificacion, gbc);

        // Botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        panelBotones.add(btnCancelar);
        panelBotones.add(btnGuardar);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(panelBotones, gbc);

        add(panel);
    }

    // --- Getters para los valores del formulario ---
    public String getTxtUsername() {
        return txtUsername.getText().trim();
    }

    public String getTxtPassword() {
        return new String(txtPassword.getPassword()).trim();
    }

    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public String getIdentificacion() {
        return txtIdentificacion.getText().trim();
    }

    // --- Métodos para asignar listeners a los botones ---
    public void setGuardarListener(ActionListener listener) {
        btnGuardar.addActionListener(listener);
    }

    public void setCancelarListener(ActionListener listener) {
        btnCancelar.addActionListener(listener);
    }

    // --- Métodos para feedback ---
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarExito(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    public void limpiarFormulario() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtNombre.setText("");
        txtIdentificacion.setText("");
    }

    public void cerrar() {
        dispose(); // Cierra el diálogo
    }

    public AbstractButton getBtnGuardar() {
        return
    }
}
