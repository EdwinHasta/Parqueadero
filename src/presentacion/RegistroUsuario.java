/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import accesosistema.componente.implementacion.Usuario;
import accesosistema.decorador.implementacion.ParametrosConsulta;
import capturadatos.EntradaDatos;
import capturadatos.EntradaPantalla;
import java.util.ArrayList;
import persistencia.EntradaSalida;
import persistencia.validaciones.ValidarDatos;

/**
 *
 * @author Edwin
 */
public class RegistroUsuario extends javax.swing.JDialog {

    /**
     * Creates new form Registro
     */
    public RegistroUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlLogo = new javax.swing.JLabel();
        jpRegistro = new javax.swing.JPanel();
        jtfNombre = new javax.swing.JTextField();
        jtfRole = new javax.swing.JTextField();
        jbRegistrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jpfPass = new javax.swing.JPasswordField();
        jlNombre = new javax.swing.JLabel();
        jlRole = new javax.swing.JLabel();
        jlPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imgInicio.jpg"))); // NOI18N

        jtfNombre.setNextFocusableComponent(jtfRole);

        jtfRole.setNextFocusableComponent(jpfPass);

        jbRegistrar.setText("Registrar");
        jbRegistrar.setNextFocusableComponent(jbCancelar);
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setNextFocusableComponent(jtfNombre);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jpfPass.setNextFocusableComponent(jbRegistrar);

        jlNombre.setText("Nombre: ");

        jlRole.setText("Role");

        jlPass.setText("Contraseña");

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombre)
                    .addComponent(jlRole)
                    .addComponent(jlPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfRole, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlRole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar)
                    .addComponent(jbCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        Usuario usuario = new Usuario(jtfNombre.getText(), jtfRole.getText(), jpfPass.getSelectedText());
        ParametrosConsulta parametro = new ParametrosConsulta(usuario);
        EntradaSalida manejoArchivos = new EntradaSalida();
        ArrayList<Object> datos = new ArrayList<>();
        manejoArchivos.procesar("LEER", "ACCESOR", datos);
        ValidarDatos validador = new ValidarDatos();
        if (!validador.verificarExistenciaRegistro("ACCESOR", datos, parametro)) {
            datos.add(parametro);
        }else{
            EntradaDatos ed = new EntradaPantalla();
            ed.mostrar("El usuario ya fue ingresado.");
        }
        manejoArchivos.procesar("GUARDAR", "ACCESOR", datos);
        this.dispose();
    }//GEN-LAST:event_jbRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPass;
    private javax.swing.JLabel jlRole;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JPasswordField jpfPass;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRole;
    // End of variables declaration//GEN-END:variables
}
