/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import javax.swing.JOptionPane;
import tpfinal.Requisicao;

/**
 *
 * @author hugo
 */
public class pedidoUnidade extends javax.swing.JFrame {

    String Unidade, Produto, Embarque, Entrega;
    int QuantidadeSolicitada, QuantidadeEnviada, Valor, Frete;
    Requisicao requisicao, requisicaoAux;
    public pedidoUnidade() {
        initComponents();
    }
    
    public pedidoUnidade(String unidade, Requisicao requisicao) {
        initComponents();
        jTextArea1.setText(unidade + "\n"+requisicao.getProduto().getDescricao()+
                "\nQuantidade solicitada: "+requisicao.getQtdeNecessaria()
        
        );
        this.requisicao = requisicao;
        this.requisicaoAux = requisicao;
        this.Unidade = unidade; //Descricao eh o nome do produto?
        this.Produto =  requisicaoAux.getProduto().getDescricao() ;
        this.QuantidadeSolicitada = requisicaoAux.getQtdeNecessaria();
        
        JOptionPane.showMessageDialog(null, "Requisição de produto enviada:"+
	                    "\nDescricao: "+requisicao.getProduto().getDescricao()+
	                    
	                    "\nFabricante: "+requisicao.getProduto().getFabricante()+
	                    "\nModelo: "+requisicao.getProduto().getModelo()+
	                    "\nQuantidade: "+requisicao.getQtdeNecessaria());
        
        
        
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
        texto = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        valorUnit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        embarque = new javax.swing.JTextField();
        entrega = new javax.swing.JTextField();
        frete = new javax.swing.JTextField();
        confirma = new javax.swing.JButton();
        encerra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dados do pedido");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Unidade X\nProduto: Y\nQuantidade Solicitada: Z");
        texto.setViewportView(jTextArea1);

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Embarque: ");

        jLabel4.setText("Entrega:");

        jLabel5.setText("Valor:   R$");

        jLabel6.setText("Frete:   R$");

        quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeActionPerformed(evt);
            }
        });

        valorUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorUnitActionPerformed(evt);
            }
        });

        jLabel7.setText("(unitário)");

        embarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                embarqueActionPerformed(evt);
            }
        });

        entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entregaActionPerformed(evt);
            }
        });

        frete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freteActionPerformed(evt);
            }
        });

        confirma.setText("Confirmar");
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        encerra.setText("Encerrar Pedidos");
        encerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(frete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(14, 14, 14)
                                        .addComponent(valorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(embarque, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(encerra))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirma)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(valorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(frete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(embarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirma)
                    .addComponent(encerra))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void embarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_embarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_embarqueActionPerformed

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        //Vou unicializar as unidades de forma sequencial
        
        QuantidadeEnviada = Integer.parseInt (quantidade.getText());
        Valor = Integer.parseInt (valorUnit.getText());
        Frete = Integer.parseInt (frete.getText());
        
        Embarque = embarque.getText();
        Entrega = entrega.getText();
        
        // Este status eh setado aqui mesmo?
        requisicaoAux.setStatus("Transferência Solicitada");
        //Mandando os valores 
        requisicaoAux.setQtdeDisponivel(QuantidadeEnviada);
        requisicaoAux.setValorUnitario(Valor);
        requisicaoAux.setValorFrete(Frete);
        //requisicaoAux.setDataEmbarque(Embarque);
        //requisicaoAux.setDataEntrega(Entrega);
        
        if(Unidade.equals("Unidade A")){
            
            // Chamo o construtor da nova unidade com a variavel requisicao
            Requisicao.addRequisicao(requisicaoAux);
            new pedidoUnidade("Unidade B", requisicao).setVisible(true);//Tenho que inicializar com outro construtor
            this.setVisible(false);
            
        }
        if(Unidade.equals("Unidade B")){ //Tenho que inicializar com outro construtor
            
            Requisicao.addRequisicao(requisicaoAux);
            new pedidoUnidade("Unidade C", requisicao).setVisible(true);//Tenho que inicializar com outro construtor
            this.setVisible(false);
            this.setVisible(false);
        }
        
        if(Unidade.equals("Unidade C")){ //Tenho que inicializar com outro construtor
            
            Requisicao.addRequisicao(requisicaoAux);
            Requisicao.comparaRequisicoes();
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_confirmaActionPerformed

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_quantidadeActionPerformed

    private void valorUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorUnitActionPerformed

    private void freteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_freteActionPerformed

    private void entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entregaActionPerformed

    private void encerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerraActionPerformed

        Requisicao.addRequisicao(requisicaoAux);
        Requisicao.comparaRequisicoes();
        this.setVisible(false);
    }//GEN-LAST:event_encerraActionPerformed

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
            java.util.logging.Logger.getLogger(pedidoUnidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedidoUnidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedidoUnidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedidoUnidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pedidoUnidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirma;
    private javax.swing.JTextField embarque;
    private javax.swing.JButton encerra;
    private javax.swing.JTextField entrega;
    private javax.swing.JTextField frete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField quantidade;
    private javax.swing.JScrollPane texto;
    private javax.swing.JTextField valorUnit;
    // End of variables declaration//GEN-END:variables
}
