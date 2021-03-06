/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

/**
 *
 * @author Eric
 */
public class buscaProduto extends javax.swing.JFrame {

    /**
     * Creates new form buscaProduto
     */
    public buscaProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        botBuscaProduto = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        botVolta = new javax.swing.JButton();
        botGeraLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque - Supermercados do Tião");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Buscar produto");

        subtitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Digite o código do produto ou nome para verficar a sua disponibilidade em estoque:");

        textCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCodigo.setText("Código:");
        labelCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botBuscaProduto.setText("Buscar Produto");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNome.setText("Nome:");
        labelNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botVolta.setText("Voltar");
        botVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltaActionPerformed(evt);
            }
        });

        botGeraLista.setText("Gerar lista do Estoque");
        botGeraLista.setMaximumSize(new java.awt.Dimension(465, 23));
        botGeraLista.setMinimumSize(new java.awt.Dimension(465, 23));
        botGeraLista.setPreferredSize(new java.awt.Dimension(465, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botVolta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botGeraLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botBuscaProduto)))))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCodigo)
                            .addComponent(labelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botGeraLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(botVolta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVoltaActionPerformed
        mainMenu volta = new mainMenu();
        volta.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botVoltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBuscaProduto;
    private javax.swing.JButton botGeraLista;
    private javax.swing.JButton botVolta;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textNome;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
