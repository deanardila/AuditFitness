/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auditfitness.controlador.auth;

import auditfitness.modelo.service.AdministradorService;
import auditfitness.vista.auth.AdminLoginView;

import javax.swing.*;


/**
 *
 * @author deana
 */
public class AdminLoginController {
    private final AdminLoginView view;
    private final AdministradorService service;

    public AdminLoginController(AdminLoginView view, AdministradorService service) {
        this.view = view;
        this.service = service;
        configurarEventos();
    }

    private void configurarEventos() {
        view.setLoginListener(e -> autenticar());
    }

    private void autenticar() {
        String username = view.getTxtUsername();
        String password = view.getTxtPassword();

        try {
            if (service.autenticar(username, password) != null) {
                // Login exitoso: Abrir menú principal (ej: AdminMenuView)
                JOptionPane.showMessageDialog(view, "¡Bienvenido, " + username + "!", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
                // Aquí iría la navegación al menú:
                // new AdminMenuController(...);
                view.dispose(); // Cierra la ventana de login
            } else {
                view.mostrarError("Credenciales inválidas");
            }
        } catch (Exception ex) {
            view.mostrarError("Error: " + ex.getMessage());
        }
    }
}

