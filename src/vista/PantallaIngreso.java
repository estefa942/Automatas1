/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorAutomata;
import java.io.BufferedWriter;
//import controlador.ControladorEntradaDatos;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.AutomataF;

/**
 * @author Estefany Muriel Cano
 * @author Alejandro Castaño Rojas
 */
public class PantallaIngreso extends javax.swing.JFrame {

    JFileChooser abrirArchivo = new JFileChooser();
    File archivo;
    ControladorAutomata ca;

    AutomataF af = new AutomataF();
    Vector vEstados = new Vector();
    private String[] estadosAceptacion;
    DefaultTableModel dtm;
    
    boolean auto2 = false;

    /**
     * Creates new form PantallaIngreso
     */
    public PantallaIngreso() {
        initComponents();
        setTitle("Autómatas Finitos");
        setLocationRelativeTo(null);
        btnConversor.setVisible(false);
        btnVerificarHilera.setVisible(false);
        btnSimplificar.setVisible(false);
        btnOperar.setEnabled(false);
        txtNuevoEstado.setEnabled(false);
        btnRestaurar.setEnabled(false);
        btnAddEstado.setEnabled(false);
        btnGuardarArchivo.setEnabled(false);
        btnUnion.setEnabled(false);
        btnUnion.setVisible(false);

        btnEvaluar.setEnabled(false);
        textVeri.setEnabled(false);
        secuenciaIngresada.setEnabled(false);
        mostrarDecision.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAutomatas = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstados = new javax.swing.JTable();
        txtSimbolos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEstados = new javax.swing.JTextField();
        btnIngreso = new javax.swing.JButton();
        btnConversor = new javax.swing.JButton();
        btnOperar = new javax.swing.JButton();
        btnArchivo = new javax.swing.JButton();
        scroll2 = new javax.swing.JScrollPane();
        tablaNuevoAutomata = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnVerificarHilera = new javax.swing.JButton();
        btnSimplificar = new javax.swing.JButton();
        txtNuevoEstado = new javax.swing.JTextField();
        btnAddEstado = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        textVeri = new javax.swing.JLabel();
        secuenciaIngresada = new javax.swing.JTextField();
        btnEvaluar = new javax.swing.JButton();
        mostrarDecision = new javax.swing.JTextField();
        btnGuardarArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdbtnA1 = new javax.swing.JRadioButton();
        rdbtnA2 = new javax.swing.JRadioButton();
        btnUnion = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1244, 514));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese los símbolos de entrada:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        tablaEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEstados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 370, 310));

        txtSimbolos.setToolTipText("");
        getContentPane().add(txtSimbolos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese un nuevo estado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, -1));

        txtEstados.setToolTipText("");
        getContentPane().add(txtEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 240, -1));

        btnIngreso.setText("Ingresar");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, -1));

        btnConversor.setText("AFND a AF");
        btnConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversorActionPerformed(evt);
            }
        });
        getContentPane().add(btnConversor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 240, 30));

        btnOperar.setText("Operar");
        btnOperar.setActionCommand("Operar ");
        btnOperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 370, 50));

        btnArchivo.setText("Abrir archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 240, -1));

        tablaNuevoAutomata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scroll2.setViewportView(tablaNuevoAutomata);

        getContentPane().add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 370, 310));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 312, 240, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 20, 490));

        btnVerificarHilera.setText("Verificar hilera");
        btnVerificarHilera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarHileraActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificarHilera, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 240, -1));

        btnSimplificar.setText("Simplificar autómata");
        btnSimplificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimplificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimplificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, -1));
        getContentPane().add(txtNuevoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 240, -1));

        btnAddEstado.setText("Agregar estado");
        btnAddEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, -1));

        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 120, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese los estados:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 860, 10));

        textVeri.setForeground(new java.awt.Color(255, 255, 255));
        textVeri.setText("Ingrese la secuencia a verificar.");
        getContentPane().add(textVeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 330, -1));
        getContentPane().add(secuenciaIngresada, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 330, -1));

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 330, -1));

        mostrarDecision.setEditable(false);
        getContentPane().add(mostrarDecision, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 330, -1));

        btnGuardarArchivo.setText("Guardar en Archivo");
        btnGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 370, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/rsz_minhelp.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/rsz_minhelp.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 30, 30));

        grupoAutomatas.add(rdbtnA1);
        rdbtnA1.setForeground(new java.awt.Color(255, 255, 255));
        rdbtnA1.setSelected(true);
        rdbtnA1.setText("Autómata 1");
        getContentPane().add(rdbtnA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        grupoAutomatas.add(rdbtnA2);
        rdbtnA2.setForeground(new java.awt.Color(255, 255, 255));
        rdbtnA2.setText("Autómata 2");
        rdbtnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnA2ActionPerformed(evt);
            }
        });
        getContentPane().add(rdbtnA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        btnUnion.setText("Unir automatas");
        getContentPane().add(btnUnion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 240, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo1.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1240, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Este botón permite crear la tabla para el autómata de acuerdo a los
     * simbolos y estdos que el usurio ingrese, además activa y desactiva
     * algunas funciones.
     *
     * @param evt
     */
    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        // TODO add your handling code here:
        String[] simbolosEntrando = txtSimbolos.getText().split(",");
        String[] simbolosArr = new String[simbolosEntrando.length + 3];
        simbolosArr[0] = "Estados";
        for (int sym = 1; sym < simbolosArr.length - 2; sym++) {
            simbolosArr[sym] = simbolosEntrando[sym - 1];
        }
        simbolosArr[simbolosArr.length - 2] = "E.A.";
        simbolosArr[simbolosArr.length - 1] = "E.I.";
        String[] estados = txtEstados.getText().split(",");

        dtm = new DefaultTableModel(simbolosArr, 0);
        for (int i = 0; i < estados.length; i++) {
            String[] st = new String[1];
            st[0] = estados[i];
            dtm.addRow(st);
            vEstados.add(estados[i]);
        }
        af.setEstados(estados);
        af.setSimbolos(simbolosEntrando);
        tablaSeleccionada().setModel(dtm);
        btnOperar.setEnabled(true);
        btnAddEstado.setEnabled(true);
        btnRestaurar.setEnabled(true);
        txtNuevoEstado.setEnabled(true);
        btnGuardarArchivo.setEnabled(true);

        btnIngreso.setEnabled(false);
        txtEstados.setEnabled(false);
        txtSimbolos.setEnabled(false);

        JOptionPane.showMessageDialog(rootPane, "Señor usuario, si desea operar con el automata finito (AF) \ntiene que llenar la tabla con las respectivas transiciones\ny luego hacer clic en el boton 'Operar'");
    }//GEN-LAST:event_btnIngresoActionPerformed
    /**
     * Este botón permite convertir un autómata no determinístico en
     * determinístico.
     *
     * @param evt
     */
    private void btnConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversorActionPerformed
        // TODO add your handling code here:

     
        if (af.getEstadosIniciales().length == 1) {
            ca.convertirEnDeterministico();
        } else {
           ca.unionAutomata(true);
           // ca.unionAutomata(false);
        }

        llenarTabla(tablaSeleccionada());
        btnSimplificar.setVisible(true);
        btnVerificarHilera.setVisible(true);
    }//GEN-LAST:event_btnConversorActionPerformed
    /**
     * Este botón guardar el autómata que se ingresó y además verifica si el
     * autómata es determinístico o no determinístico
     *
     * @param evt
     */
    private void btnOperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperarActionPerformed
        try {
            ca = new ControladorAutomata(af, dtm);
            af.setTransiciones(ca.guardarAutomata());
            ca.estadosAceptacion();
            ca.estadosIniciales();
            if (ca.esDeterministico()) {
                JOptionPane.showMessageDialog(rootPane, "El autómata es deterministico");
                btnSimplificar.setVisible(true);
                btnVerificarHilera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "El autómata es no deterministico");
                btnConversor.setVisible(true);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingreso inválido");
        }


    }//GEN-LAST:event_btnOperarActionPerformed
    /**
     * Este botón permite abrir un archivo con el autómata de algún lugar de
     * nuestro ordenador
     *
     * @param evt
     */
    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        String[] estadotes;
        String[] ouch = null;
        if (abrirArchivo.showDialog(null, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
            archivo = abrirArchivo.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    try {
                        btnOperar.setEnabled(true);
                        btnAddEstado.setEnabled(true);
                        btnRestaurar.setEnabled(true);
                        txtNuevoEstado.setEnabled(true);
                        btnGuardarArchivo.setEnabled(true);

                        btnIngreso.setEnabled(false);
                        txtEstados.setEnabled(false);
                        txtSimbolos.setEnabled(false);

                        File fichero_entrada;
                        fichero_entrada = new File(archivo.getAbsolutePath());
                        Scanner scaneoPapu = new Scanner(fichero_entrada);
                        Vector<String> datosDeEntrada = new Vector<String>();
                        String[] slapChop;
                        String symbols = "";
                        int contador = 0;
                        while (scaneoPapu.hasNext()) {
                            String lineaExtraida = scaneoPapu.nextLine();
                            switch (contador) {
                                case 0:
                                    slapChop = lineaExtraida.split(":");
                                    lineaExtraida = slapChop[1];
                                    symbols = lineaExtraida;
                                    txtSimbolos.setText(lineaExtraida);
                                    break;
                                case 1:
                                    slapChop = lineaExtraida.split(":");
                                    lineaExtraida = slapChop[1];
                                    txtEstados.setText(lineaExtraida);
                                    ouch = symbols.split(",");
                                    slapChop = new String[ouch.length + 3];
                                    slapChop[0] = "Estados";
                                    for (int i = 0; i < ouch.length; i++) {
                                        slapChop[i + 1] = ouch[i];
                                    }
                                    slapChop[slapChop.length - 2] = "E.A.";
                                    slapChop[slapChop.length - 1] = "E.I.";
                                    dtm = new DefaultTableModel(slapChop, 0);
                                    break;
                                default:
                                    slapChop = lineaExtraida.split(":");
                                    lineaExtraida = slapChop[0] + "," + slapChop[1];
                                    slapChop = lineaExtraida.split(",");
                                    dtm.addRow(slapChop);
                                    tablaSeleccionada().setModel(dtm);
                                    break;
                            }
                            contador++;
                            datosDeEntrada.add(lineaExtraida);
                        }
                        estadotes = txtEstados.getText().split(",");
                        af.setEstados(estadotes);
                        af.setSimbolos(ouch);
                        ca = new ControladorAutomata(af, dtm);
                        JOptionPane.showMessageDialog(rootPane, "Señor usuario, si desea operar con el automata finito (AF) \ntiene que llenar la tabla con las respectivas transiciones\ny luego hacer clic en el boton 'Operar'");
                    } catch (Exception e) {
                        System.out.println("Se ha producido un error " + e + ". Revise argumentos y datos");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un archivo de texto.");
            }
        }
    }//GEN-LAST:event_btnArchivoActionPerformed
    /**
     * Este botón simplifica el autómata ingresado
     *
     * @param evt
     */
    private void btnSimplificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimplificarActionPerformed
        // TODO add your handling code here:
        btnVerificarHilera.setVisible(true);
        dtm = ca.Ximplificar();
        tablaSeleccionada().setModel(dtm);
    }//GEN-LAST:event_btnSimplificarActionPerformed
    /**
     * Este botón permite verificar si una secuencia es reconocida por el
     * autómata,y mostrar si es aceptada o rechazada
     *
     * @param evt
     */
    private void btnVerificarHileraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarHileraActionPerformed
        btnEvaluar.setEnabled(true);
        textVeri.setEnabled(true);
        secuenciaIngresada.setEnabled(true);
        mostrarDecision.setEnabled(true);
    }//GEN-LAST:event_btnVerificarHileraActionPerformed
    /**
     * Este botón permite agregar un nuevo estado en el autómata que se está
     * trabajando
     *
     * @param evt
     */
    private void btnAddEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEstadoActionPerformed
        // TODO add your handling code here:
        String[] otroMx = new String[1];
        otroMx[0] = txtNuevoEstado.getText().trim();
        txtNuevoEstado.setText("");
        dtm.addRow(otroMx);
        JOptionPane.showMessageDialog(rootPane, "Señor usuario, si desea operar con el automata finito (AF) \ntiene que llenar la tabla con las respectivas transiciones\ny luego hacer clic en el boton 'Operar'");
    }//GEN-LAST:event_btnAddEstadoActionPerformed
    /**
     * Este botón permite ingresar un nuevo autómata
     *
     * @param evt
     */
    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        // TODO add your handling code here:
        btnIngreso.setEnabled(true);
        txtEstados.setEnabled(true);
        txtSimbolos.setEnabled(true);
        btnArchivo.setEnabled(true);
        
        btnEvaluar.setEnabled(false);
        textVeri.setEnabled(false);
        secuenciaIngresada.setText("");
        secuenciaIngresada.setEnabled(false);
        mostrarDecision.setEnabled(false);
        btnConversor.setVisible(false);
        btnSimplificar.setVisible(false);
        btnVerificarHilera.setVisible(false);
        btnOperar.setEnabled(false);
        txtNuevoEstado.setEnabled(false);
        btnRestaurar.setEnabled(false);
        btnAddEstado.setEnabled(false);
        DefaultTableModel empty = new DefaultTableModel();
        tablaEstados.setModel(empty);
        tablaNuevoAutomata.setModel(empty);
    }//GEN-LAST:event_btnRestaurarActionPerformed
    /**
     * Este botón permite verificar la hilera ingresada y decidir si es aceptada
     * o rechaza por el autómata
     *
     * @param evt
     */
    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        // TODO add your handling code here:
        try {
            mostrarDecision.setText("");
            String hilera = secuenciaIngresada.getText();

            String[] symb = af.getSimbolos();
            ArrayList<String> arrSymb = new ArrayList<>();
            for (int i = 0; i < symb.length; i++) {
                arrSymb.add(symb[i]);
            }
            ArrayList<String> verf = new ArrayList<>();
            for (int i = 0; i < hilera.length(); i++) {
                verf.add(String.valueOf(hilera.charAt(i)));
            }
            if (!arrSymb.containsAll(verf)) {
                mostrarDecision.setText("¡Ha ingresado caracteres inválidos!");
            } else if (ca.verificarHilera(hilera)) {
                mostrarDecision.setText("La secuencia es aceptada");
            } else {
                mostrarDecision.setText("La secuencia es rechazada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Hilera inválida");
        }


    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArchivoActionPerformed
        // TODO add your handling code here:
        String ruta = "";
        String[] aiuda = null;
        JFileChooser jfc = new JFileChooser();
        try {
            if (jfc.showSaveDialog(null) == jfc.APPROVE_OPTION) {
                ruta = jfc.getSelectedFile().getAbsolutePath();
                aiuda = ruta.split("\\\\");
                File archivo = new File(ruta);
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                if (archivo.exists()) {
                    archivo.delete();
                }
                pw.print("simbolos:");
                for (int i = 0; i < af.getSimbolos().length; i++) {
                    if (i != af.getSimbolos().length - 1) {
                        pw.print(af.getSimbolos()[i] + ",");
                    } else {
                        pw.print(af.getSimbolos()[i]);
                        pw.println();
                    }
                }
                pw.print("estados:");
                for (int i = 0; i < af.getEstados().length; i++) {
                    if (i != af.getEstados().length - 1) {
                        pw.print(af.getEstados()[i] + ",");
                    } else {
                        pw.print(af.getEstados()[i]);
                        pw.println();
                    }
                }
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    for (int j = 0; j < dtm.getColumnCount(); j++) {
                        if (j == 0) {
                            pw.print(dtm.getValueAt(i, j).toString() + ":");
                        } else if (j == dtm.getColumnCount() - 1) {
                            pw.print(dtm.getValueAt(i, j).toString());
                            pw.println();
                        } else {
                            pw.print(dtm.getValueAt(i, j).toString() + ",");
                        }
                    }
                }
                pw.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarArchivoActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Para ingresar los símbolos, debe ingresarlos separados por comas (,)");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Para ingresar los estados, debe ingresarlos separados por comas (,)");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void rdbtnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnA2ActionPerformed
        // TODO add your handling code here:
        btnUnion.setEnabled(true);
        btnUnion.setVisible(true);
        auto2 = true;
    }//GEN-LAST:event_rdbtnA2ActionPerformed
    /**
     * Este método permite saber si un estado es de aceptación para llenar la
     * tabla cuando se convierte de no determinístico a determinístico
     *
     * @param estado String con el estado que se quiere verificar.
     * @return un booleano en true si el estado es de aceptación, o false de lo
     * contrario.
     */
    public boolean definirEstadoAceptacion(String estado) {
        boolean b = false;
        for (int i = 0; i < af.getEstadosAceptacion().length; i++) {
            if (af.getEstadosAceptacion()[i].equals(estado)) {
                b = true;
                break;
            }
        }
        return b;
    }

    /**
     * Este método permite mostrar el autómata en un tabla para que el usuario
     * pueda interactuar dinámicamente con ella.
     *
     * @param tabla
     */
    public void llenarTabla(JTable tabla) {

        String[] simbolosEntrando = af.getSimbolos();
        String[] estados = af.getEstados();
        ArrayList<ArrayList> automata = af.getTransiciones();
        String[] simbolosArr = new String[simbolosEntrando.length + 2];
        simbolosArr[0] = "Estados";
        for (int sym = 1; sym < simbolosArr.length - 1; sym++) {
            simbolosArr[sym] = simbolosEntrando[sym - 1];
        }
        simbolosArr[simbolosArr.length - 1] = "E.A.";
        dtm = new DefaultTableModel(simbolosArr, 0);

        for (int i = 0; i < estados.length; i++) {
            String[] fila = new String[simbolosArr.length];
            fila[0] = estados[i];
            ArrayList<String> transiciones = automata.get(i);
            for (int j = 0; j < transiciones.size(); j++) {
                fila[j + 1] = transiciones.get(j);
            }
            if (definirEstadoAceptacion(estados[i])) {
                fila[simbolosArr.length - 1] = "1";
            } else {
                fila[simbolosArr.length - 1] = "0";
            }
            dtm.addRow(fila);
        }
        tabla.setModel(dtm);
    }

    public JTable tablaSeleccionada() {
        if (rdbtnA1.isSelected()) {
            return tablaEstados;
        }
        return tablaNuevoAutomata;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaIngreso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaIngreso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaIngreso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaIngreso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAddEstado;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnConversor;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnGuardarArchivo;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnOperar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSimplificar;
    private javax.swing.JButton btnUnion;
    private javax.swing.JButton btnVerificarHilera;
    private javax.swing.ButtonGroup grupoAutomatas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField mostrarDecision;
    private javax.swing.JRadioButton rdbtnA1;
    private javax.swing.JRadioButton rdbtnA2;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTextField secuenciaIngresada;
    private javax.swing.JTable tablaEstados;
    private javax.swing.JTable tablaNuevoAutomata;
    private javax.swing.JLabel textVeri;
    private javax.swing.JTextField txtEstados;
    private javax.swing.JTextField txtNuevoEstado;
    private javax.swing.JTextField txtSimbolos;
    // End of variables declaration//GEN-END:variables
}
