/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.ArrayList;
import persistencia.EntradaSalida;
import sistemaparqueadero.ServicioParqueadero;
import tipovehiculo.producto.interfaz.TipoVehiculo;

/**
 *
 * @author Edwin
 */
public class ConfigurarSistema extends javax.swing.JDialog {

    /**
     * Creates new form ConfigurarSistema
     */
    public ConfigurarSistema(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        EntradaSalida manejoArchivos = new EntradaSalida();
        ArrayList<Object> datos = new ArrayList<>();
        manejoArchivos.procesar("LEER", "TIPOVEHICULO", datos);
        if (datos != null) {
            if (!datos.isEmpty()) {
                String[] lista = new String[datos.size()];
                for (int i = 0; i < datos.size(); i++) {
                    lista[i] = ((TipoVehiculo) datos.get(i)).getNombre() + " ; " + ((TipoVehiculo) datos.get(i)).getTarifa();
                }
                jlTiposVehiculos.setListData(lista);
            }
        }
        ArrayList<Object> datosServicio = new ArrayList<>();
        manejoArchivos.procesar("LEER", "SERVICIO", datosServicio);
        if (datosServicio != null) {
            if (!datosServicio.isEmpty()) {
                ServicioParqueadero servicio = ServicioParqueadero.getInstancia(((ServicioParqueadero) datosServicio.get(0)).getTitulo());
                servicio.setSector(((ServicioParqueadero) datosServicio.get(0)).getSector());
                jtfNombre.setText(servicio.getTitulo());
                jtfSector.setText(servicio.getSector());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpServicioParqueo = new javax.swing.JPanel();
        jlInfoServicioParqueo = new javax.swing.JLabel();
        jlNombreServicio = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlSectorServicio = new javax.swing.JLabel();
        jtfSector = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jpTipoVehiculo = new javax.swing.JPanel();
        jlInfoTiposVehiculos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlTiposVehiculos = new javax.swing.JList<>();
        jlEnunciado = new javax.swing.JLabel();
        jlNombreTipoVehiculo = new javax.swing.JLabel();
        jtfNombreTipoVehiculo = new javax.swing.JTextField();
        jlTarivaTipoVehiculo = new javax.swing.JLabel();
        jtfTarifaTipoVehiculo = new javax.swing.JTextField();
        jbRegistrarTipoVehiculo = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imgInicio.jpg"))); // NOI18N

        jlInfoServicioParqueo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlInfoServicioParqueo.setText("Información del servicio de parqueo");

        jlNombreServicio.setText("Nombre");

        jlSectorServicio.setText("Sector");

        jbGuardar.setText("Guardar Cambios");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpServicioParqueoLayout = new javax.swing.GroupLayout(jpServicioParqueo);
        jpServicioParqueo.setLayout(jpServicioParqueoLayout);
        jpServicioParqueoLayout.setHorizontalGroup(
            jpServicioParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpServicioParqueoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpServicioParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlInfoServicioParqueo)
                    .addGroup(jpServicioParqueoLayout.createSequentialGroup()
                        .addGroup(jpServicioParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreServicio)
                            .addComponent(jlSectorServicio))
                        .addGap(28, 28, 28)
                        .addGroup(jpServicioParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpServicioParqueoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jbGuardar))
                            .addGroup(jpServicioParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfSector, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(jtfNombre)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpServicioParqueoLayout.setVerticalGroup(
            jpServicioParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpServicioParqueoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlInfoServicioParqueo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpServicioParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreServicio)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpServicioParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSectorServicio)
                    .addComponent(jtfSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addContainerGap())
        );

        jlInfoTiposVehiculos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlInfoTiposVehiculos.setText("Información de los tipos de vehículos");

        jScrollPane1.setViewportView(jlTiposVehiculos);

        jlEnunciado.setText("Tipos de vehículos disponibles");

        jlNombreTipoVehiculo.setText("Nombre");

        jlTarivaTipoVehiculo.setText("Tarifa (por minuto)");

        jbRegistrarTipoVehiculo.setText("Registrar tipo de vehículo");
        jbRegistrarTipoVehiculo.setEnabled(false);

        javax.swing.GroupLayout jpTipoVehiculoLayout = new javax.swing.GroupLayout(jpTipoVehiculo);
        jpTipoVehiculo.setLayout(jpTipoVehiculoLayout);
        jpTipoVehiculoLayout.setHorizontalGroup(
            jpTipoVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTipoVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTipoVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTipoVehiculoLayout.createSequentialGroup()
                        .addGroup(jpTipoVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlInfoTiposVehiculos)
                            .addComponent(jlEnunciado)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpTipoVehiculoLayout.createSequentialGroup()
                        .addComponent(jlNombreTipoVehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpTipoVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpTipoVehiculoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jbRegistrarTipoVehiculo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpTipoVehiculoLayout.createSequentialGroup()
                                .addComponent(jtfNombreTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlTarivaTipoVehiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfTarifaTipoVehiculo)))))
                .addContainerGap())
        );
        jpTipoVehiculoLayout.setVerticalGroup(
            jpTipoVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTipoVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlInfoTiposVehiculos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEnunciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpTipoVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreTipoVehiculo)
                    .addComponent(jtfNombreTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTarivaTipoVehiculo)
                    .addComponent(jtfTarifaTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRegistrarTipoVehiculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbAtras.setText("Atras");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpServicioParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAtras)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpServicioParqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        ServicioParqueadero servicio = ServicioParqueadero.getInstancia(jtfNombre.getText());
        servicio.setSector(jtfSector.getText());
        EntradaSalida manejoArchivos = new EntradaSalida();
        ArrayList<Object> datos = new ArrayList<>();
        //manejoArchivos.procesar("LEER", "SERVICIO", datos);
        datos.add(servicio);
        manejoArchivos.procesar("GUARDAR", "SERVICIO", datos);
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbRegistrarTipoVehiculo;
    private javax.swing.JLabel jlEnunciado;
    private javax.swing.JLabel jlInfoServicioParqueo;
    private javax.swing.JLabel jlInfoTiposVehiculos;
    private javax.swing.JLabel jlNombreServicio;
    private javax.swing.JLabel jlNombreTipoVehiculo;
    private javax.swing.JLabel jlSectorServicio;
    private javax.swing.JLabel jlTarivaTipoVehiculo;
    private javax.swing.JList<String> jlTiposVehiculos;
    private javax.swing.JPanel jpServicioParqueo;
    private javax.swing.JPanel jpTipoVehiculo;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombreTipoVehiculo;
    private javax.swing.JTextField jtfSector;
    private javax.swing.JTextField jtfTarifaTipoVehiculo;
    // End of variables declaration//GEN-END:variables
}
