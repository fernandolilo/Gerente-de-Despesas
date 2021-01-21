/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import entidades.Usuarios;

/**
 *
 * @author Hilton
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private final Usuarios usuarioLogado;

    /**
     * Creates new form TelaPrincipal
     * @param usuarioLogado
     */
    public TelaPrincipal(Usuarios usuarioLogado) {
        initComponents();
        this.usuarioLogado = usuarioLogado;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Controle dos Frames">
    private void exibirInternalFrame(javax.swing.JDesktopPane desk, javax.swing.JInternalFrame frame) {

        javax.swing.JInternalFrame[] iframe = desk.getAllFrames();
        if (iframe.length <= 0) {
            desk.add(frame);
            centralizarIF(frame);
            frame.setVisible(true);
        } else {
            for (int i = 0; i < iframe.length; i++) {
                i = iframe.length + 1;
            }
            desk.add(frame);
            centralizarIF(frame);
            frame.setVisible(true);
        }

    }

    private void centralizarIF(javax.swing.JInternalFrame iframe) {
        java.awt.Dimension d = iframe.getDesktopPane().getSize();
        iframe.setLocation((d.width - iframe.getSize().width) / 2, (d.height - iframe.getSize().height) / 2);
    }

    //</editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIcadastroGenerico = new javax.swing.JMenuItem();
        jMIsair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desk.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMIcadastroGenerico.setText("Cadastro");
        jMIcadastroGenerico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIcadastroGenericoActionPerformed(evt);
            }
        });
        jMenu1.add(jMIcadastroGenerico);

        jMIsair.setText("Sair");
        jMIsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIsairActionPerformed(evt);
            }
        });
        jMenu1.add(jMIsair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );

        setSize(new java.awt.Dimension(650, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIcadastroGenericoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIcadastroGenericoActionPerformed
        exibirInternalFrame(desk, new CadastroGenerico(usuarioLogado));
    }//GEN-LAST:event_jMIcadastroGenericoActionPerformed

    private void jMIsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMIsairActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk;
    private javax.swing.JMenuItem jMIcadastroGenerico;
    private javax.swing.JMenuItem jMIsair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
