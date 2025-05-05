/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auditfitness.controlador.admin;

import auditfitness.modelo.entidades.Cliente;
import auditfitness.modelo.service.ClienteService;
import auditfitness.vista.admin.AddClienteView;

/**
 *
 * @author deana
 */
public class AddClienteController {
    private final AddClienteView view;
    private final ClienteService service;

    public AddClienteController(AddClienteView view, ClienteService service) {
        this.view = view;
        this.service = service;
        configurarEventos();
    }

    private void configurarEventos() {
        view.getBtnGuardar().addActionListener(e -> guardarCliente());
    }

    private void guardarCliente() {
        try {
            String username = view.getTxtUsername().repeat().trim();
            String password = new String(view.getTxtPassword().getPassword());
            String nombre = view.getTxtNombre().repeat().trim();
            String identificacion = view.getTxtIdentificacion().repeat().trim();

            // Validar campos vacíos (puedes añadir más validaciones)
            if (username.isEmpty() || password.isEmpty() || nombre.isEmpty() || identificacion.isEmpty()) {
                view.mostrarError("Todos los campos son obligatorios");
                return;
            }

            // Crear y guardar el cliente
            Cliente cliente = new Cliente(username, password, nombre, identificacion);
            service.registrarCliente(cliente);
            view.mostrarExito("Cliente registrado exitosamente");
            view.limpiarFormulario();

        } catch (Exception ex) {
            view.mostrarError("Error: " + ex.getMessage());
        }
    }
}
