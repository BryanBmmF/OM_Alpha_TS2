/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnz.frontend;

import gnz.backend.manejadores.ManejadorDeAcciones;
import gnz.backend.manejadores.ManejadorDeSesiones;
import gnz.backend.manejadores.Sesion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author jesfrin
 */
public class LogJDialog extends javax.swing.JDialog {

    private ObservableList<Sesion> sesiones;
    private List<Sesion> listaSesiones;
    private Sesion sesionSeleccionada;

    /**
     * Creates new form LogJDialog
     */
    public LogJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        listaSesiones = new ArrayList<>();
        sesiones = ObservableCollections.observableList(listaSesiones);
        sesionSeleccionada = new Sesion();
        initComponents();
        setLocationRelativeTo(null);
        verSesiones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        verActividadesjButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        accionesjEditorPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${sesiones}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fecha}"));
        columnBinding.setColumnName("Fecha");
        columnBinding.setColumnClass(java.sql.Timestamp.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hora}"));
        columnBinding.setColumnName("Hora");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${sesionSeleccionada}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setText("Sesiones");

        jLabel2.setText("Acciones de sesion");

        verActividadesjButton.setText("Ver actividades");
        verActividadesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActividadesjButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(accionesjEditorPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(verActividadesjButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(verActividadesjButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verActividadesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActividadesjButtonActionPerformed
        if (sesionSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar alguna actividad");
        } else {
            try {
                List<String> acciones = ManejadorDeAcciones.consultarAcciones(sesionSeleccionada.getIdSesion());
                if (acciones.isEmpty()) {
                    this.accionesjEditorPane.setText("No se realizaron acciones en la sesion...\n\n\n");
                } else {
                    this.accionesjEditorPane.setText("Mostrando Actividades...\n\n\n");
                    for (String accion : acciones) {
                        this.accionesjEditorPane.setText(this.accionesjEditorPane.getText() + accion);
                        this.accionesjEditorPane.setText(this.accionesjEditorPane.getText() + "\n\n"
                                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" + "\n\n\n");
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_verActividadesjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane accionesjEditorPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton verActividadesjButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public void actualizarListadoSesiones(List<Sesion> listadoSesiones) {
        this.sesiones.clear();
        this.sesiones.addAll((List<Sesion>) (List<?>) listadoSesiones);
    }

    public ObservableList<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(ObservableList<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    public Sesion getSesionSeleccionada() {
        return sesionSeleccionada;
    }

    public void setSesionSeleccionada(Sesion sesionSeleccionada) {
        if (sesionSeleccionada != null) {
            this.sesionSeleccionada = sesionSeleccionada;
        } else {
            this.sesionSeleccionada = null;
        }
    }

    private void verSesiones() {
        try {
            actualizarListadoSesiones(ManejadorDeSesiones.buscarSesiones());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}