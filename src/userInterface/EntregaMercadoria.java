/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import tpfinal.Requisicao;
import tpfinal.Produto;

/**
 *
 * @author Eric
 */
public class EntregaMercadoria extends javax.swing.JFrame {
    int quantidadeMinima = 100;
    Requisicao requisicao;
    /**
     * Creates new form formRequisicao
     */
    //public formRequisicao(int codigo, String nome, int quantidade) {
     public EntregaMercadoria() {
        initComponents();
     }
    
    
     public EntregaMercadoria(Requisicao requisicao) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.requisicao = requisicao;
        
        textProduto.setText(requisicao.getProduto().getDescricao());
        textCodigo.setText(""+requisicao.getProduto().getCodigo());
        textFabricante.setText(requisicao.getProduto().getFabricante());
        textModelo.setText(requisicao.getProduto().getModelo());
        if (requisicao.getQtdeNecessaria() >= requisicao.getQtdeDisponivel())
            textQuantidade.setText(String.valueOf(requisicao.getQtdeNecessaria()));
        else
            textQuantidade.setText(String.valueOf(requisicao.getQtdeDisponivel()));
        
    }
// create a class User and use it to populate the arraylist
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        labelProduto = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelFabricante = new javax.swing.JLabel();
        textProduto = new javax.swing.JTextField();
        textFabricante = new javax.swing.JTextField();
        textCodigo = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        botEnviaRequis = new javax.swing.JButton();
        botVoltar = new javax.swing.JButton();
        quantidade = new javax.swing.JLabel();
        textQuantidade = new javax.swing.JTextField();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque - Supermercados do Tião");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Entrega de Mercadoria");

        subtitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Informações sobre a mercadoria a ser entregue:");

        labelProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto.setText("Produto:");
        labelProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");
        labelCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelFabricante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFabricante.setText("Fabricante:");
        labelFabricante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textProduto.setAutoscrolls(false);
        textProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textProduto.setEnabled(false);
        textProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdutoActionPerformed(evt);
            }
        });

        textFabricante.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textFabricante.setEnabled(false);
        textFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFabricanteActionPerformed(evt);
            }
        });

        textCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textCodigo.setEnabled(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });

        labelModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelModelo.setText("Modelo:");
        labelModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textModelo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textModelo.setEnabled(false);
        textModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textModeloActionPerformed(evt);
            }
        });

        botEnviaRequis.setText("Confirmar entrega de mercadoria");
        botEnviaRequis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEnviaRequisActionPerformed(evt);
            }
        });

        botVoltar.setText("Voltar");
        botVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltarActionPerformed(evt);
            }
        });

        quantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantidade.setText("Quantidade");
        quantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textQuantidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textQuantidade.setEnabled(false);
        textQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botEnviaRequis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelFabricante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(labelCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(botVoltar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botEnviaRequis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdutoActionPerformed

    private void textFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFabricanteActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textModeloActionPerformed

    private void botVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVoltarActionPerformed
        JOptionPane.showMessageDialog(null, "A mercadoria nao foi entregue");
        requisicao.setStatus("Entrega Atrasada");
        
        mainMenu tela = new mainMenu();
        tela.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_botVoltarActionPerformed

    private void botEnviaRequisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEnviaRequisActionPerformed

        JOptionPane.showMessageDialog(null, "Mercadoria entregue com sucesso");
        requisicao.setStatus("Mercadoria em desembarque");
        // Vou mandar um tipo requisicao para a tela TipoPedido
 
        
        // Construtor da proxima tela 
        RecebimentoMercadoria tela = new RecebimentoMercadoria(requisicao);
        tela.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botEnviaRequisActionPerformed

    private void textQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQuantidadeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textQuantidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botEnviaRequis;
    private javax.swing.JButton botVoltar;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelFabricante;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel quantidade;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textFabricante;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textProduto;
    private javax.swing.JTextField textQuantidade;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
