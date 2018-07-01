package userInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import tpfinal.Requisicao;

public class pedidoUnidade extends javax.swing.JFrame {

    String unidade, produto, nomeFornecedor;
    Date dataEmbarque, dataEntrega;
    int quantidadeSolicitada, quantidadeDisponivel, valor, frete;
    Requisicao requisicao;
    public pedidoUnidade() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public pedidoUnidade(String unidade, Requisicao requisicao) {
        initComponents();
        this.setLocationRelativeTo(null);
        jTextArea1.setText(unidade + "\n"+requisicao.getProduto().getDescricao()+
                "\nQuantidade solicitada: "+requisicao.getQtdeNecessaria()
        
        );
        this.requisicao = requisicao;
        this.unidade = unidade; //Descricao eh o nome do produto?
        this.produto =  requisicao.getProduto().getDescricao() ;
        this.quantidadeSolicitada = requisicao.getQtdeNecessaria();
        this.nomeFornecedor = requisicao.getNomeFornecedor();
    }


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
        freteTF = new javax.swing.JTextField();
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

        freteTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freteTFActionPerformed(evt);
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
                                        .addComponent(freteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(freteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
        quantidadeDisponivel = Integer.parseInt (quantidade.getText());
        valor = Integer.parseInt (valorUnit.getText());
        frete = Integer.parseInt (freteTF.getText());
        
        //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        try{
            dataEmbarque = new SimpleDateFormat("dd/MM/yyyy").parse(embarque.getText());
        }catch (ParseException ex){
            //System.out.println("Data de embarque errada !");
        }
        try{
            dataEntrega  = new SimpleDateFormat("dd/MM/yyyy").parse(entrega.getText());
        }catch (ParseException ex){
            //System.out.println("Data de entrega errada !");
        }

        
        // Este status eh setado aqui mesmo?
        requisicao.setStatus("Transferência Solicitada");
        //Mandando os valores 
        requisicao.setQtdeDisponivel(quantidadeDisponivel);
        requisicao.setValorUnitario(valor);
        requisicao.setValorFrete(frete);
        requisicao.setDataEmbarque(dataEmbarque);
        requisicao.setDataEntrega(dataEntrega);
        requisicao.setNomeFornecedor(nomeFornecedor);
        
        System.out.println(unidade);
        
        if(unidade.equals("Unidade A")){
            
            // Chamo o construtor da nova unidade com a variavel requisicao
            if (dataEmbarque != null && dataEntrega != null){
                requisicao.setNomeFornecedor("Unidade A");
                Requisicao.addRequisicao(requisicao);
                new pedidoUnidade("Unidade B", requisicao).setVisible(true);//Tenho que inicializar com outro construtor
                this.setVisible(false);
            }
            else {
                //colocar isso em um aviso na janela posteriormente
                JOptionPane.showMessageDialog(null, "As datas devem estar no formato DD/MM/AA.", "Aviso ", HEIGHT);
            }
            
        }
        else if(unidade.equals("Unidade B")){ //Tenho que inicializar com outro construtor
            
              // Chamo o construtor da nova unidade com a variavel requisicao
            if (dataEmbarque != null && dataEntrega != null){
                requisicao.setNomeFornecedor("Unidade B");
                Requisicao.addRequisicao(requisicao);
                new pedidoUnidade("Unidade C", requisicao).setVisible(true);//Tenho que inicializar com outro construtor
                this.setVisible(false);
            }
            else {
                //colocar isso em um aviso na janela posteriormente
                JOptionPane.showMessageDialog(null, "As datas devem estar no formato DD/MM/AA.", "Aviso ", HEIGHT);
            }
        }
        
        else if(unidade.equals("Unidade C")){ //Tenho que inicializar com outro construtor
           if (dataEmbarque != null && dataEntrega != null){ 
            requisicao.setNomeFornecedor("Unidade C");
            Requisicao.addRequisicao(requisicao);
            Requisicao.comparaRequisicoes();
            this.setVisible(false);
           }else {
                //colocar isso em um aviso na janela posteriormente
                JOptionPane.showMessageDialog(null, "As datas devem estar no formato DD/MM/AA.", "Aviso ", HEIGHT);
            }
        }
    }//GEN-LAST:event_confirmaActionPerformed

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_quantidadeActionPerformed

    private void valorUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorUnitActionPerformed

    private void freteTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freteTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_freteTFActionPerformed

    private void entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entregaActionPerformed

    private void encerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerraActionPerformed
        
        this.setVisible(false);
        Requisicao.comparaRequisicoes();
        
    }//GEN-LAST:event_encerraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirma;
    private javax.swing.JTextField embarque;
    private javax.swing.JButton encerra;
    private javax.swing.JTextField entrega;
    private javax.swing.JTextField freteTF;
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
