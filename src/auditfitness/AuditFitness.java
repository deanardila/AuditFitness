/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auditfitness;

import auditfitness.controlador.auth.AdminLoginController;
import auditfitness.modelo.entidades.Administrador;
import auditfitness.modelo.entidades.Cliente;
import auditfitness.modelo.repository.AdministradorRepository;
import auditfitness.modelo.repository.AdministradorRepositoryImpl;
import auditfitness.modelo.repository.ClienteRepository;
import auditfitness.modelo.repository.ClienteRepositoryImpl;
import auditfitness.modelo.service.AdministradorService;
import auditfitness.modelo.service.ClienteService;
import auditfitness.vista.auth.AdminLoginView;

import javax.swing.*;

/**
 *
 * @author deana
 */
public class AuditFitness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdministradorRepository repo = new AdministradorRepositoryImpl();
        AdministradorService service = new AdministradorService(repo);

        AdminLoginView view = new AdminLoginView();
        new AdminLoginController(view, service); // El controlador se encarga del listener

        SwingUtilities.invokeLater(() -> view.setVisible(true));
    }
    
}
