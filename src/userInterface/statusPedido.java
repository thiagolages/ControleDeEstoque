package userInterface;

import tpfinal.Requisicao;

public class statusPedido extends javax.swing.JFrame {
    
    static Requisicao req;
    
    public statusPedido(Requisicao req) {
        
        this.req = req;
        initComponents();
        this.setTitle("Requisicao - ID "+req.getIDrequisicao());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelProduto = new javax.swing.JLabel();
        labelProduto1 = new javax.swing.JLabel();
        nomeFornecedor = new javax.swing.JLabel();
        labelProduto7 = new javax.swing.JLabel();
        labelProduto8 = new javax.swing.JLabel();
        labelProduto9 = new javax.swing.JLabel();
        labelProduto10 = new javax.swing.JLabel();
        labelProduto11 = new javax.swing.JLabel();
        labelProduto12 = new javax.swing.JLabel();
        labelProduto13 = new javax.swing.JLabel();
        labelProduto16 = new javax.swing.JLabel();
        codProduto = new javax.swing.JLabel();
        modeloProduto = new javax.swing.JLabel();
        descricaoProduto = new javax.swing.JLabel();
        fabricante = new javax.swing.JLabel();
        qtdeFornecida = new javax.swing.JLabel();
        valorUnitario = new javax.swing.JLabel();
        valorFrete = new javax.swing.JLabel();
        dataEmbarque = new javax.swing.JLabel();
        previsaoEntrega = new javax.swing.JLabel();
        labelProduto24 = new javax.swing.JLabel();
        statusRequisicao = new javax.swing.JLabel();
        labelProduto26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Requisicao - ID");
        setBackground(new java.awt.Color(255, 255, 255));

        labelProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto.setText("Qtde fornecida:");
        labelProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto1.setText("Valor unitário");
        labelProduto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nomeFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeFornecedor.setText(req.getNomeFornecedor());
        nomeFornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto7.setText("Modelo:");
        labelProduto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto8.setText("Nome fornecedor:");
        labelProduto8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto9.setText("Cód. Produto:");
        labelProduto9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto10.setText("Desrição:");
        labelProduto10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto11.setText("Valor frete:");
        labelProduto11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto12.setText("Previsão Entrega:");
        labelProduto12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto13.setText("Data Embarque:");
        labelProduto13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto16.setText("Fabricante:");
        labelProduto16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        codProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codProduto.setText(Integer.toString(req.getProduto().getCodigo()));

        modeloProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modeloProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modeloProduto.setText(req.getProduto().getModelo());

        descricaoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descricaoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        descricaoProduto.setText(req.getProduto().getDescricao());

        fabricante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fabricante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fabricante.setText(req.getProduto().getFabricante());

        qtdeFornecida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtdeFornecida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if (req.getQtdeDisponivel() >= req.getQtdeNecessaria()){
            qtdeFornecida.setText(Integer.toString(req.getQtdeNecessaria()));
        }else{
            qtdeFornecida.setText(Integer.toString(req.getQtdeDisponivel()));
        }

        valorUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valorUnitario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        valorFrete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valorFrete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dataEmbarque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dataEmbarque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        previsaoEntrega.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        previsaoEntrega.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProduto24.setText("STATUS:");
        labelProduto24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        statusRequisicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statusRequisicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelProduto26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelProduto26.setText("DETALHES DA REQUISIÇÃO");
        labelProduto26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelProduto24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto8, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(labelProduto16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProduto12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdeFornecida, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previsaoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(labelProduto26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelProduto26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProduto8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProduto9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProduto10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProduto7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modeloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProduto16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProduto11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtdeFornecida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valorFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelProduto13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelProduto12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelProduto24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codProduto;
    private javax.swing.JLabel dataEmbarque;
    private javax.swing.JLabel descricaoProduto;
    private javax.swing.JLabel fabricante;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelProduto1;
    private javax.swing.JLabel labelProduto10;
    private javax.swing.JLabel labelProduto11;
    private javax.swing.JLabel labelProduto12;
    private javax.swing.JLabel labelProduto13;
    private javax.swing.JLabel labelProduto16;
    private javax.swing.JLabel labelProduto24;
    private javax.swing.JLabel labelProduto26;
    private javax.swing.JLabel labelProduto7;
    private javax.swing.JLabel labelProduto8;
    private javax.swing.JLabel labelProduto9;
    private javax.swing.JLabel modeloProduto;
    private javax.swing.JLabel nomeFornecedor;
    private javax.swing.JLabel previsaoEntrega;
    private javax.swing.JLabel qtdeFornecida;
    private javax.swing.JLabel statusRequisicao;
    private javax.swing.JLabel valorFrete;
    private javax.swing.JLabel valorUnitario;
    // End of variables declaration//GEN-END:variables
}
