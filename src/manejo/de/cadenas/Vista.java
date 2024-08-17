
package manejo.de.cadenas;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Lima
 */

public class Vista extends javax.swing.JFrame {

    
  /*Variable global para trabajar con el texto ingresado*/  
    String texto;
    int cadena;
    private Component frame;


   
    public Vista() {
        initComponents();
    }

    public void copiar (String copiar){
    StringSelection as = new StringSelection(copiar);
    Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
    cb.setContents(as, null);
    
    }
    
    public String pegar (){
    
    String resultadopegar = "";
    Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
    Transferable contenido = cb.getContents(null);
        if (contenido.isDataFlavorSupported(DataFlavor.stringFlavor)) {
        try {
            resultadopegar = (String) contenido.getTransferData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException | IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return resultadopegar;
    
    
    
    
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        R_primeraletra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        R_ultimaletra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        R_letracentral = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        R_primerapalabra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        R_palabracentral = new javax.swing.JTextField();
        R_longitud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        R_palabras = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        R_ultimapalabra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        btn_procesar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        R_Arepeticion = new javax.swing.JTextField();
        R_Erepeticion = new javax.swing.JTextField();
        R_Irepeticion = new javax.swing.JTextField();
        R_Orepeticion = new javax.swing.JTextField();
        R_Urepeticion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        R_par = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        R_impar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_murcielago = new javax.swing.JTextArea();
        btn_Limpiar = new javax.swing.JButton();
        labelCortado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_abrir = new javax.swing.JMenu();
        btn_Abrir = new javax.swing.JMenuItem();
        btn_guardar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btn_Copiar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        jLabel4.setText("Primera letra del texto:");

        R_primeraletra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_primeraletra.setFocusable(false);
        R_primeraletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_primeraletraActionPerformed(evt);
            }
        });

        jLabel5.setText("Ultima letra del texto:");

        R_ultimaletra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_ultimaletra.setFocusable(false);
        R_ultimaletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_ultimaletraActionPerformed(evt);
            }
        });

        jLabel6.setText("Letra central del texto:");

        R_letracentral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_letracentral.setFocusable(false);
        R_letracentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_letracentralActionPerformed(evt);
            }
        });

        jLabel7.setText("Primera palabra del texto:");

        R_primerapalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_primerapalabra.setFocusable(false);
        R_primerapalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_primerapalabraActionPerformed(evt);
            }
        });

        jLabel8.setText("Palabra central del texto:");

        R_palabracentral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_palabracentral.setFocusable(false);
        R_palabracentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_palabracentralActionPerformed(evt);
            }
        });

        R_longitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_longitud.setFocusable(false);
        R_longitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_longitudActionPerformed(evt);
            }
        });

        jLabel2.setText("Longitud de texto:");

        jLabel3.setText("Cantidad de palabras:");

        R_palabras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_palabras.setFocusable(false);
        R_palabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_palabrasActionPerformed(evt);
            }
        });

        jLabel9.setText("Ultima palabra del texto:");

        R_ultimapalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_ultimapalabra.setFocusable(false);
        R_ultimapalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_ultimapalabraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R_longitud, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(R_primeraletra)
                    .addComponent(R_ultimaletra)
                    .addComponent(R_palabras)
                    .addComponent(R_primerapalabra)
                    .addComponent(R_letracentral)
                    .addComponent(R_palabracentral)
                    .addComponent(R_ultimapalabra))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(R_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(R_primeraletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(R_ultimaletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(R_letracentral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R_primerapalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(R_palabracentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(R_ultimapalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel1.setText("Manejo de cadenas");

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Traductor a clave Murcielago");

        jLabel10.setText("Repeticiones de \"A\", \"a\" o \"á\":");

        jLabel11.setText("Repeticiones de \"E\", \"e\" o \"é\":");

        jLabel12.setText("Repeticiones de \"I\", \"i\" o \"í\":");

        jLabel13.setText("Repeticiones de \"O\", \"o\" o \"ó\":");

        jLabel14.setText("Repeticiones de \"U\", \"u\" o \"ú\":");

        R_Arepeticion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_Arepeticion.setFocusable(false);
        R_Arepeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_ArepeticionActionPerformed(evt);
            }
        });

        R_Erepeticion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_Erepeticion.setFocusable(false);
        R_Erepeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_ErepeticionActionPerformed(evt);
            }
        });

        R_Irepeticion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_Irepeticion.setFocusable(false);
        R_Irepeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_IrepeticionActionPerformed(evt);
            }
        });

        R_Orepeticion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_Orepeticion.setFocusable(false);
        R_Orepeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_OrepeticionActionPerformed(evt);
            }
        });

        R_Urepeticion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_Urepeticion.setFocusable(false);
        R_Urepeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_UrepeticionActionPerformed(evt);
            }
        });

        jLabel15.setText("Palabras con cantidad de ");

        jLabel16.setText("caracteres par:");

        R_par.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_par.setFocusable(false);
        R_par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_parActionPerformed(evt);
            }
        });

        jLabel17.setText("Palabras con cantidad de ");

        jLabel18.setText("caracteres impar:");

        R_impar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_impar.setFocusable(false);
        R_impar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_imparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(R_Urepeticion))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGap(21, 21, 21)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R_Arepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(R_Erepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(R_Irepeticion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(R_Orepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel18))
                                .addGap(43, 43, 43)
                                .addComponent(R_par)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R_impar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(R_Arepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(R_Erepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_Irepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_Orepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(R_Urepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(R_par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addComponent(R_impar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_murcielago.setColumns(20);
        txt_murcielago.setRows(5);
        jScrollPane2.setViewportView(txt_murcielago);

        btn_Limpiar.setText("Limpiar ");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        labelCortado.setText("...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelCortado)
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btn_Limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCortado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_abrir.setText("Archivo");

        btn_Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_Abrir.setText("Abrir");
        btn_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirActionPerformed(evt);
            }
        });
        btn_abrir.add(btn_Abrir);

        btn_guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        btn_abrir.add(btn_guardar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem1.setText("Guardar como...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btn_abrir.add(jMenuItem1);

        jMenuBar1.add(btn_abrir);

        jMenu2.setText("Editar");

        btn_Copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_Copiar.setText("Copiar");
        btn_Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CopiarActionPerformed(evt);
            }
        });
        jMenu2.add(btn_Copiar);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Cortar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Pegar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Buscar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Reemplazar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed

        //---------------------------------------------------------------------------      
        //Codigo que cuenta la longitud del texto, incluyendo los espacios
        texto = this.txt_area.getText();

        cadena = texto.length();

        // Mostrar el resultado en el campo correspondiente
        this.R_longitud.setText(" " + cadena);

        // ---------------------------------------------------------------------------   
        //Codigo que cuenta el total de palabras
        // Contar las palabras del texto
        int cantidadPalabras = texto.isEmpty() ? 0 : texto.split("\\s+").length;

        // Mostrar el resultado en el campo correspondiente
        this.R_palabras.setText(" " + cantidadPalabras);
//-----------------------------------------------------------------------------
        //Codigo que obtiene la primera letra del texto   

        // Obtener la primera letra del texto
        String primeraLetra = texto.isEmpty() ? "vacío" : String.valueOf(texto.charAt(0));

        // Mostrar el resultado en el campo correspondiente
        this.R_primeraletra.setText(" " + primeraLetra);
//------------------------------------------------------------------------------
        //Codigo que obtiene la ultima letra del texto

        // Obtener la última letra del texto
        String ultimaLetra = texto.isEmpty() ? "vacío" : String.valueOf(texto.charAt(texto.length() - 1));

        // Mostrar el resultado en el campo correspondiente
        this.R_ultimaletra.setText(" " + ultimaLetra);

//---------------------------------------------------------------------------------
        // Codigo que obtiene  la letra central del texto
        String L_central = txt_area.getText().trim();

        // Obtener la letra central del texto
        String letraCentral;
        int longitudTexto = L_central.length();

        if (longitudTexto == 0) {
            letraCentral = "vacío";
        } else if (longitudTexto % 2 == 0) {
            // Si la longitud es par, se obtienen dos letras centrales
            letraCentral = L_central.substring(longitudTexto / 2 - 1, longitudTexto / 2 + 1);
        } else {
            int indiceCentral = longitudTexto / 2;
            letraCentral = String.valueOf(L_central.charAt(indiceCentral));
        }

        this.R_letracentral.setText(" " + letraCentral);

//---------------------------------------------------------------------------------
// Codigo que obtiene la primera palabra del texto
        String P_palabra = txt_area.getText().trim();
        String primeraPalabra = P_palabra.isEmpty() ? "vacío" : P_palabra.split("\\s+")[0];

        // Mostrar el resultado en el campo correspondiente
        this.R_primerapalabra.setText(" " + primeraPalabra);

//---------------------------------------------------------------------------------
//Codigo que obtiene la palabra central del texto
String textocentral= txt_area.getText().trim();              

String[] palabras = textocentral.split("\\s+");

                int numPalabras = palabras.length;
                
                if (numPalabras > 0) {
                    if (numPalabras % 2 == 1) {
                        // Si el número de palabras es impar, hay una palabra central
                        R_palabracentral.setText(palabras[numPalabras / 2]);
                    } else {
                        // Si el número de palabras es par, hay dos palabras centrales
                        R_palabracentral.setText(palabras[numPalabras / 2 - 1] + " " + palabras[numPalabras / 2]);
                    }
                } else {
                    // Si no hay palabras, se muestra un mensaje vacío
                    R_palabracentral.setText("");
                }
        //Mostrar el resultado del campo correspondiente
     //   this.R_palabracentral.setText(" " + palabraCentral);

        //---------------------------------------------------------------------------------               
        //Codigo que obtiene la ultima palabra del texto
        String ultimaPalabra = texto.isEmpty() ? "vacío" : texto.split("\\s+")[texto.split("\\s+").length - 1];

        this.R_ultimapalabra.setText("" + ultimaPalabra);

//------------------------------------------------------------------------------------
        //Contador de Vocales
        int Acontador = 0;

        // Contar cuántas veces se repiten 'A', 'a', y 'á'
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'A' || letra == 'a' || letra == 'á' || letra == 'Á') {
                Acontador++;
            }
        }

        this.R_Arepeticion.setText(" " + Acontador);

        int Econtador = 0;

        // Contar cuántas veces se repiten 'A', 'a', y 'á'
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'E' || letra == 'e' || letra == 'é' || letra == 'Á') {
                Econtador++;
            }
        }

        this.R_Erepeticion.setText(" " + Econtador);

        int Icontador = 0;

        // Contar cuántas veces se repiten 'A', 'a', y 'á'
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'I' || letra == 'i' || letra == 'í' || letra == 'Í') {
                Acontador++;
            }
        }

        this.R_Irepeticion.setText(" " + Acontador);

        int Ocontador = 0;

        // Contar cuántas veces se repiten 'A', 'a', y 'á'
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'O' || letra == 'o' || letra == 'ó' || letra == 'Ó') {
                Ocontador++;
            }
        }

        this.R_Orepeticion.setText(" " + Ocontador);

        int Ucontador = 0;

        // Contar cuántas veces se repiten 'A', 'a', y 'á'
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'U' || letra == 'u' || letra == 'ú' || letra == 'Ú') {
                Ucontador++;
            }
        }

        this.R_Urepeticion.setText(" " + Ucontador);

        //Codigo para contar los caracteres pares y los caracteres impares   
// Separar el texto en palabras
        String[] palabras1 = texto.split("\\s+");
        int contadorPares = 0;

        // Contar las palabras con número de caracteres par
        for (String palabra : palabras1) {
            if (palabra.length() % 2 == 0) {
                contadorPares++;
            }
        }

        this.R_par.setText(" " + contadorPares);

        // Contar los caracteres en posiciones impares
        String[] palabras2 = texto.split("\\s+");
        int contadorImpares = 0;

        // Contar las palabras con número de caracteres impar
        for (String palabra : palabras2) {
            if (palabra.length() % 2 != 0) {
                contadorImpares++;
            }
        }

        this.R_impar.setText(" " + contadorImpares);
//------------------------------------------------------------------------------------

        //   this.txt_murcielago.setText("" + texto);
        String original = "murcielago";
        String sustituto = "0123456789";

        String textom = txt_area.getText().toLowerCase();
        StringBuilder textoConvertido = new StringBuilder();

        // Convertir el texto a Clave Murciélago
        for (int i = 0; i < textom.length(); i++) {
            char letra = textom.charAt(i);
            int indice = original.indexOf(letra);
            if (indice != -1) {
                textoConvertido.append(sustituto.charAt(indice));
            } else {
                textoConvertido.append(letra);
            }
        }

        // Mostrar el resultado en el JTextArea
        txt_murcielago.setText(textoConvertido.toString());


    }//GEN-LAST:event_btn_procesarActionPerformed

    private void R_longitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_longitudActionPerformed
            
    }//GEN-LAST:event_R_longitudActionPerformed

    private void R_palabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_palabrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_palabrasActionPerformed

    private void R_primeraletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_primeraletraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_primeraletraActionPerformed

    private void R_ultimaletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_ultimaletraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_ultimaletraActionPerformed

    private void R_letracentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_letracentralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_letracentralActionPerformed

    private void R_primerapalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_primerapalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_primerapalabraActionPerformed

    private void R_palabracentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_palabracentralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_palabracentralActionPerformed

    private void R_ultimapalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_ultimapalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_ultimapalabraActionPerformed

    private void R_ArepeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_ArepeticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_ArepeticionActionPerformed

    private void R_ErepeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_ErepeticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_ErepeticionActionPerformed

    private void R_IrepeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_IrepeticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_IrepeticionActionPerformed

    private void R_OrepeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_OrepeticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_OrepeticionActionPerformed

    private void R_UrepeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_UrepeticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_UrepeticionActionPerformed

    private void R_parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_parActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_parActionPerformed

    private void R_imparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_imparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_imparActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
 
        this.txt_area.setText("");
        
        
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirActionPerformed
 JFileChooser fileChooser = new JFileChooser();
                int seleccion = fileChooser.showOpenDialog(null);

                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    File archivo = fileChooser.getSelectedFile();

                    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                        txt_area.setText("");  // Limpiar el JTextArea antes de cargar nuevo contenido
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            txt_area.append(linea + "\n");
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + ex.getMessage());
                    }
                }
        
        
        
    }//GEN-LAST:event_btn_AbrirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        try {
            try (FileWriter permite_escrito = new FileWriter("C:\\Users\\ghost\\Documents\\NetBeansProjects\\Manejo de Cadenas\\archivo.txt")) {
                String textoguardar = txt_area.getText().replace("\n", "\r\n");
                PrintWriter imprime = new PrintWriter(permite_escrito);
                imprime.print(textoguardar);
                permite_escrito.close();
     //         this.msj_guardado.setText("Texto guardado con exito");
                JOptionPane.showMessageDialog(rootPane,"Texto guardado con exito");
            }
        } catch (Exception ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 
         String textoguardarcomo = txt_area.getText().trim();

                // Verificar si el JTextArea está vacío
                if (textoguardarcomo.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane,"Texto vacío, por favor llenar el campo.");
                } else {
                    JFileChooser fileChooser = new JFileChooser();
                    int seleccion = fileChooser.showSaveDialog(null);

                    if (seleccion == JFileChooser.APPROVE_OPTION) {
                        File archivo = fileChooser.getSelectedFile();

                        // Agregar extensión .txt si no está presente
                        if (!archivo.getName().endsWith(".txt")) {
                            archivo = new File(archivo.getAbsolutePath() + ".txt");
                        }

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                            bw.write(textoguardarcomo);
                            JOptionPane.showMessageDialog(rootPane, "Archivo guardado exitosamente.");
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(rootPane, "Error al guardar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
            String textocortar= txt_area.getText().trim();
                
                // Mostrar el texto cortado en el JLabel
                labelCortado.setText("Texto cortado");
                
                // Borrar el texto del JTextArea
                txt_area.setText("");
        
                StringSelection stringSelection= new StringSelection(textocortar);
                Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        txt_area.setText(pegar());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btn_CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CopiarActionPerformed
        copiar(txt_area.getText());
    }//GEN-LAST:event_btn_CopiarActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

           try {
                        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
                    String textoPortapapeles = (String) clipboard.getData(DataFlavor.stringFlavor);

                    // Reemplazar el texto en el JTextArea con el contenido del portapapeles
                    txt_area.setText(textoPortapapeles);
                } catch (HeadlessException | UnsupportedFlavorException | IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al obtener el texto del portapapeles.", "Error", JOptionPane.ERROR_MESSAGE);
                }
        
        
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

                        // Mostrar un cuadro de diálogo para que el usuario ingrese la palabra a buscar
                String buscar = JOptionPane.showInputDialog(frame, "Ingrese el texto a buscar:", "Buscar Texto", JOptionPane.PLAIN_MESSAGE);

                // Verificar que el usuario haya ingresado algo
                if (buscar != null && !buscar.isEmpty()) {
                    // Obtener el texto del área de texto
                    String textobusqueda = txt_area.getText();

                    // Buscar el texto dentro del JTextArea
                    int index = textobusqueda.indexOf(buscar);
                    if (index != -1) {
                        // Si se encuentra, seleccionar el texto
                        txt_area.setCaretPosition(index);
                        txt_area.select(index, index + buscar.length());
                        txt_area.requestFocus();
                    } else {
                        // Si no se encuentra, mostrar mensaje
                        JOptionPane.showMessageDialog(frame, "Texto no encontrado.", "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
        
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField R_Arepeticion;
    private javax.swing.JTextField R_Erepeticion;
    private javax.swing.JTextField R_Irepeticion;
    private javax.swing.JTextField R_Orepeticion;
    private javax.swing.JTextField R_Urepeticion;
    private javax.swing.JTextField R_impar;
    private javax.swing.JTextField R_letracentral;
    private javax.swing.JTextField R_longitud;
    private javax.swing.JTextField R_palabracentral;
    private javax.swing.JTextField R_palabras;
    private javax.swing.JTextField R_par;
    private javax.swing.JTextField R_primeraletra;
    private javax.swing.JTextField R_primerapalabra;
    private javax.swing.JTextField R_ultimaletra;
    private javax.swing.JTextField R_ultimapalabra;
    private javax.swing.JMenuItem btn_Abrir;
    private javax.swing.JMenuItem btn_Copiar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JMenu btn_abrir;
    private javax.swing.JMenuItem btn_guardar;
    private javax.swing.JButton btn_procesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCortado;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextArea txt_murcielago;
    // End of variables declaration//GEN-END:variables

    private void cadena(int length) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String length(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
