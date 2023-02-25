
import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;

public class Principal extends javax.swing.JFrame {

  /**
   * Creates new form Principal
   */
  public Principal() {
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

    jPP_menuPopUp = new javax.swing.JPopupMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();
    jD_ListaParaElOrDel = new javax.swing.JDialog();
    jLPanel = new javax.swing.JScrollPane();
    jL_Personajes = new javax.swing.JList<>();
    jLabel12 = new javax.swing.JLabel();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jt_nombrePersonaje = new javax.swing.JTextField();
    jT_poderPersonaje = new javax.swing.JTextField();
    jT_debilidadPersonaje = new javax.swing.JTextField();
    jT_universoPersonaje = new javax.swing.JTextField();
    jT_fuerzaPersonaje = new javax.swing.JTextField();
    jT_agilidadFPersonaje = new javax.swing.JTextField();
    jT_agilidadMPersonaje = new javax.swing.JTextField();
    jT_puntosVidaPersonaje = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jLabel_emptyPersonajes = new javax.swing.JLabel();
    jTreePanel_personajes = new javax.swing.JScrollPane();
    jTree_personajes = new javax.swing.JTree();
    jLabel_fullPersonajes = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel_emptyPersonajes1 = new javax.swing.JLabel();

    jMenuItem1.setText("Modificar");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem1ActionPerformed(evt);
      }
    });
    jPP_menuPopUp.add(jMenuItem1);

    jMenuItem2.setText("Eliminar");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem2ActionPerformed(evt);
      }
    });
    jPP_menuPopUp.add(jMenuItem2);

    jL_Personajes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jL_Personajes.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jL_PersonajesMouseClicked(evt);
      }
    });
    jLPanel.setViewportView(jL_Personajes);

    jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
    jLabel12.setText("Seleccione el elemento para modificarlo");

    javax.swing.GroupLayout jD_ListaParaElOrDelLayout = new javax.swing.GroupLayout(jD_ListaParaElOrDel.getContentPane());
    jD_ListaParaElOrDel.getContentPane().setLayout(jD_ListaParaElOrDelLayout);
    jD_ListaParaElOrDelLayout.setHorizontalGroup(
      jD_ListaParaElOrDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jD_ListaParaElOrDelLayout.createSequentialGroup()
        .addGap(44, 44, 44)
        .addGroup(jD_ListaParaElOrDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLPanel))
        .addContainerGap(98, Short.MAX_VALUE))
    );
    jD_ListaParaElOrDelLayout.setVerticalGroup(
      jD_ListaParaElOrDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jD_ListaParaElOrDelLayout.createSequentialGroup()
        .addGap(13, 13, 13)
        .addComponent(jLabel12)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(128, Short.MAX_VALUE))
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        jTabbedPane1MouseEntered(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
    jLabel1.setText("Bienvenido al Prototipo del juego de Marvel VS Capcom");

    jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jLabel2.setText("Elaborado por Midway Games, Capcom, Marvel y DV");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addContainerGap(87, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(jLabel2)
        .addContainerGap(348, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Bienvenido", jPanel4);

    jLabel3.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
    jLabel3.setText("Agrega un nuevo personaje!! ");

    jLabel4.setText("Nombre:");

    jLabel5.setText("Poder");

    jLabel6.setText("Debilidad:");

    jLabel7.setText("Universo de Pertenencia");

    jLabel8.setText("Fuerza:");

    jLabel9.setText("Agilidad Física:");

    jLabel10.setText("Agilidad Mental:");

    jLabel11.setText("Puntos de Vida:");

    jButton1.setBackground(new java.awt.Color(0, 204, 0));
    jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
    jButton1.setForeground(new java.awt.Color(102, 255, 102));
    jButton1.setText("Agregar!");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(147, 147, 147)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel11)
          .addComponent(jLabel10)
          .addComponent(jLabel9)
          .addComponent(jLabel8)
          .addComponent(jLabel7)
          .addComponent(jLabel6)
          .addComponent(jLabel5)
          .addComponent(jLabel4))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jt_nombrePersonaje)
          .addComponent(jT_poderPersonaje)
          .addComponent(jT_debilidadPersonaje)
          .addComponent(jT_universoPersonaje)
          .addComponent(jT_fuerzaPersonaje)
          .addComponent(jT_agilidadFPersonaje)
          .addComponent(jT_agilidadMPersonaje, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
          .addComponent(jT_puntosVidaPersonaje))
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(128, 128, 128)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
        .addGap(63, 63, 63))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(jLabel3)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(jt_nombrePersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(jT_poderPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(jT_debilidadPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jT_universoPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(jT_fuerzaPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9)
          .addComponent(jT_agilidadFPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel10)
          .addComponent(jT_agilidadMPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel11)
          .addComponent(jT_puntosVidaPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(26, 26, 26)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(40, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Agregar Personajes", jPanel1);

    jLabel_emptyPersonajes.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
    jLabel_emptyPersonajes.setText("No has agregado ningún personaje todavía...");

    javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personajes");
    jTree_personajes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    jTree_personajes.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTree_personajesMouseClicked(evt);
      }
    });
    jTreePanel_personajes.setViewportView(jTree_personajes);

    jLabel_fullPersonajes.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
    jLabel_fullPersonajes.setText("Esta es la lista de los personajes que tienes agregados!");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(67, 67, 67)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel_fullPersonajes)
          .addComponent(jLabel_emptyPersonajes)
          .addComponent(jTreePanel_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(30, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(jLabel_emptyPersonajes)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel_fullPersonajes)
        .addGap(20, 20, 20)
        .addComponent(jTreePanel_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(147, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Listado de Personajes", jPanel2);

    jLabel_emptyPersonajes1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
    jLabel_emptyPersonajes1.setText("En Construcción...");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(199, 199, 199)
        .addComponent(jLabel_emptyPersonajes1)
        .addContainerGap(228, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(64, 64, 64)
        .addComponent(jLabel_emptyPersonajes1)
        .addContainerGap(341, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Simulación de Batalla", jPanel3);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Metodo de Agregar un personaje con el button
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    String nombre = jt_nombrePersonaje.getText();
    double poder = Double.parseDouble(jT_poderPersonaje.getText());
    String debilidad = jT_debilidadPersonaje.getText();
    String universo = jT_universoPersonaje.getText();
    double fuerza = Double.parseDouble(jT_fuerzaPersonaje.getText());
    double agilidadFis = Double.parseDouble(jT_agilidadFPersonaje.getText());
    double agilidadMen = Double.parseDouble(jT_agilidadMPersonaje.getText());
    double puntosVida = Double.parseDouble(jT_puntosVidaPersonaje.getText());

    // Crear personaje
    Personaje nuevoPersonaje = new Personaje(nombre, poder, debilidad, universo, fuerza, agilidadFis, agilidadMen, puntosVida);

    // Confirmacion de haber agregado personajes
    JOptionPane.showMessageDialog(this, "¡Personaje agregado con Exito!");

    // Agregar personale a la lista
    personajes.add(nuevoPersonaje);

    jt_nombrePersonaje.setText("");
    jT_universoPersonaje.setText("");
    jT_puntosVidaPersonaje.setText("");
    jT_poderPersonaje.setText("");
    jT_debilidadPersonaje.setText("");
    jT_fuerzaPersonaje.setText("");
    jT_agilidadMPersonaje.setText("");
    jT_agilidadFPersonaje.setText("");

    // Luego de agregar se procede a agregar al arbol
    DefaultTreeModel m = (DefaultTreeModel) jTree_personajes.getModel();
    DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
    DefaultMutableTreeNode nodo_personaje = new DefaultMutableTreeNode(nuevoPersonaje.getUniverso());

    DefaultMutableTreeNode universoPersonaje = new DefaultMutableTreeNode(nuevoPersonaje);

    nodo_personaje.add(universoPersonaje);
    raiz.add(nodo_personaje);
    m.reload();

    // Elementos en la lista de borrar o eliminar
    addElementsToList();

  }//GEN-LAST:event_jButton1ActionPerformed

  // MEtodo para agregar elementos a una lista
  public void addElementsToList() {
    DefaultListModel modeloLista = new DefaultListModel();

    for (Personaje personaje : personajes) {
      modeloLista.addElement(personaje);
    }

    jL_Personajes.setModel(modeloLista);
  }

  private void jTabbedPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseEntered
    // TODO add your handling code here:
    if (!personajes.isEmpty()) {
      jLabel_emptyPersonajes.setVisible(false);
      jLabel_fullPersonajes.setVisible(true);
      jTreePanel_personajes.setVisible(true);
    } else {
      jLabel_fullPersonajes.setVisible(false);
      jTreePanel_personajes.setVisible(false);
    }
  }//GEN-LAST:event_jTabbedPane1MouseEntered

  // Evento para mostrar el popup Menu
  private void jTree_personajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree_personajesMouseClicked
    // TODO add your handling code here:
    if (evt.isMetaDown()) {
      jPP_menuPopUp.show(jTreePanel_personajes, evt.getX(), evt.getY());
    }
  }//GEN-LAST:event_jTree_personajesMouseClicked

  // Evento para action del mouse de ELIMINAR
  private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    // TODO add your handling code here:
    // Show menu to display the options
    jD_ListaParaElOrDel.setModal(true);
    jD_ListaParaElOrDel.pack();
    jD_ListaParaElOrDel.setLocationRelativeTo(this);
    jD_ListaParaElOrDel.setVisible(true);

    if (jL_Personajes.getSelectedIndex() >= 0) {
      int response = JOptionPane.showConfirmDialog(
              this,
              "Seguro de Eliminar?",
              "Confirm",
              JOptionPane.YES_NO_OPTION,
              JOptionPane.QUESTION_MESSAGE);
      
      if (response == JOptionPane.OK_OPTION) {
        DefaultTreeModel m
                = (DefaultTreeModel) jTree_personajes.getModel();
        m.removeNodeFromParent(nodo_seleccionado);
        m.reload();
        
        DefaultListModel modeloLista = (DefaultListModel) jL_Personajes.getModel();
        modeloLista.removeElementAt(jL_Personajes.getSelectedIndex());
      }
    }
  }//GEN-LAST:event_jMenuItem2ActionPerformed

  // Evento para action del mouse de MODIFICAR
  private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    // TODO add your handling code here:
    jD_ListaParaElOrDel.setModal(true);
    jD_ListaParaElOrDel.pack();
    jD_ListaParaElOrDel.setLocationRelativeTo(this);
    jD_ListaParaElOrDel.setVisible(true);
  }//GEN-LAST:event_jMenuItem1ActionPerformed

  private void jL_PersonajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_PersonajesMouseClicked
    // TODO add your handling code here:
    if (jL_Personajes.getSelectedIndex() >= 0) {
      if (evt.isMetaDown()) {
        jPP_menuPopUp.show(jLPanel, evt.getX(), evt.getY());
      }
    }

  }//GEN-LAST:event_jL_PersonajesMouseClicked

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
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Principal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JDialog jD_ListaParaElOrDel;
  private javax.swing.JScrollPane jLPanel;
  private javax.swing.JList<String> jL_Personajes;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JLabel jLabel_emptyPersonajes;
  private javax.swing.JLabel jLabel_emptyPersonajes1;
  private javax.swing.JLabel jLabel_fullPersonajes;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JPopupMenu jPP_menuPopUp;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JTextField jT_agilidadFPersonaje;
  private javax.swing.JTextField jT_agilidadMPersonaje;
  private javax.swing.JTextField jT_debilidadPersonaje;
  private javax.swing.JTextField jT_fuerzaPersonaje;
  private javax.swing.JTextField jT_poderPersonaje;
  private javax.swing.JTextField jT_puntosVidaPersonaje;
  private javax.swing.JTextField jT_universoPersonaje;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JScrollPane jTreePanel_personajes;
  private javax.swing.JTree jTree_personajes;
  private javax.swing.JTextField jt_nombrePersonaje;
  // End of variables declaration//GEN-END:variables

  // Mis Variables
  private ArrayList<Personaje> personajes = new ArrayList();
  DefaultMutableTreeNode nodo_seleccionado;

}
