/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliza;

/**
 *
 * @author Becker
 */
public class face extends javax.swing.JFrame {


    /**
     * Creates new form face
     */
    public face() {
       
        initComponents();
        TalkText.setText(TalkText.getText() + "Eliza: " + Eliza.greet + "\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        UserText = new javax.swing.JTextField();
        EnviarBotton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TalkText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELIZA");

        UserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTextActionPerformed(evt);
            }
        });

        EnviarBotton.setText("Enviar");
        EnviarBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarBottonActionPerformed(evt);
            }
        });

        TalkText.setEditable(false);
        TalkText.setColumns(20);
        TalkText.setRows(5);
        jScrollPane1.setViewportView(TalkText);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EnviarBotton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserText)
                    .addComponent(EnviarBotton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarBottonActionPerformed
        if(Eliza.RespFinal != Eliza.farewell)
        {
            Eliza.leitura = UserText.getText();
            Eliza.leiturapre = "";
            UserText.setText(null);   
            EscolheResp.RespEscolhida();
            TalkText.setText(TalkText.getText() + "Você: " + Eliza.leiturapre + "\n");
            Eliza.leiturapre = "";
            TalkText.setText(TalkText.getText() + "Eliza: " + Eliza.RespFinal + "\n");
        }
        else
            UserText.setText(null);
    }//GEN-LAST:event_EnviarBottonActionPerformed

    private void UserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTextActionPerformed
        if(Eliza.RespFinal != Eliza.farewell)
        {
            Eliza.leitura = UserText.getText();
            Eliza.leiturapre = "";
            UserText.setText(null);   
            EscolheResp.RespEscolhida();
            TalkText.setText(TalkText.getText() + "Você: " + Eliza.leiturapre + "\n");
            Eliza.leiturapre = "";
            TalkText.setText(TalkText.getText() + "Eliza: " + Eliza.RespFinal + "\n");
        }
        else
            UserText.setText(null);
    }//GEN-LAST:event_UserTextActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarBotton;
    private javax.swing.JTextArea TalkText;
    private javax.swing.JTextField UserText;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
