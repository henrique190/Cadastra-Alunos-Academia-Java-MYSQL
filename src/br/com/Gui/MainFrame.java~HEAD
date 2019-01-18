
package br.com.Gui;

import br.com.ConexaoBanco.getConnection;
import br.com.principal.Dados;
import br.com.principal.ModeloTabela;
import com.toedter.calendar.JCalendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class MainFrame extends javax.swing.JFrame {

   String nome, telefone, rua, numero, cep, bairro, tipoPlano, DiaInicio, MesInicio, AnoInicio, valor;
   String DiaFim, MesFim, AnoFim;
   boolean marcado = false;
   String lastId;
   JCalendar calendario = new JCalendar();
   java.util.Date dataUtil = new java.util.Date();
   
    public MainFrame() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        RadioCadastrar = new javax.swing.JRadioButton();
        lblTipoPlano = new javax.swing.JLabel();
        txtTipoPlano = new javax.swing.JTextField();
        lblInicioPlano = new javax.swing.JLabel();
        lblFimPlano = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblValor = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        dataInicio = new com.toedter.calendar.JDateChooser();
        dataFim = new com.toedter.calendar.JDateChooser();
        cbMostrar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Alunos\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setText("nome");

        lblTel.setText("telefone");

        lblRua.setText("rua");

        lblNumero.setText("numero");

        jLabel6.setText("cep");

        jLabel7.setText("bairro");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        RadioCadastrar.setText("Cadastrar plano:");
        RadioCadastrar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RadioCadastrarStateChanged(evt);
            }
        });
        RadioCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCadastrarActionPerformed(evt);
            }
        });

        lblTipoPlano.setText("Plano");

        txtTipoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoPlanoActionPerformed(evt);
            }
        });

        lblInicioPlano.setText("Inicio do plano");

        lblFimPlano.setText("Fim do plano");

        btnCadastrar.setText("Cadastrar Novo Aluno");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Rua", "Numero", "Cep", "Bairro", "TipoPlano", "Valor", "InicioPlan", "FimPlan"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblValor.setText("Valor");

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        cbMostrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar Todos", "Mostrar Pendentes", " " }));
        cbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarActionPerformed(evt);
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
                        .addComponent(lblRua)
                        .addGap(28, 28, 28)
                        .addComponent(txtRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7))
                            .addComponent(lblNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtNumero))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTipoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(476, 476, 476))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblFimPlano)
                                                .addGap(18, 18, 18)
                                                .addComponent(dataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblInicioPlano)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblTipoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(376, 376, 376)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189)
                                .addComponent(cbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addGap(16, 16, 16)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblValor))
                        .addGap(0, 165, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbMostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(RadioCadastrar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoPlano)
                    .addComponent(txtTipoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInicioPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFimPlano)
                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnDeletar)
                    .addComponent(jButton1)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                    
        ativarFormRadioButton();
        detectarDados();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if(btnEditar.getText().equals("Salvar")){
            String sql = "UPDATE pessoa SET nome = ?, telefone = ? where id_nome = ?;";
            String sql2 = "update endereco set rua = ?, numero = ?, cep = ?, bairro = ?, pessoa_id_nome = ? where pessoa_id_nome = ?";
            String sql3 = "UPDATE pessoa SET nome = ?, telefone = ? where id_nome = ? ";
            try {
                int index = jTable1.getSelectedRow();
                Object id = ""+jTable1.getValueAt(index, 0);

                try (PreparedStatement stmt = getConnection.conectarMysql().prepareStatement(sql)) {
                    stmt.setString(1, txtNome.getText());
                    stmt.setString(2, txtTel.getText());
                    stmt.setInt(3, Integer.parseInt(id.toString()));
                    stmt.execute();
                }

                Object objRua = jTable1.getValueAt(index, 3);
                Object objNum = jTable1.getValueAt(index, 4);
                Object objCep = jTable1.getValueAt(index, 5);
                Object objBairro = jTable1.getValueAt(index, 6);

                if(objRua == null && objNum == null && objCep == null && objBairro == null){

                    String sqlEnd = "insert into endereco (rua,numero,cep,bairro,pessoa_id_nome) values (?, ?, ?, ?, ?);";
                    PreparedStatement stmtEnd = getConnection.conectarMysql().prepareStatement(sqlEnd);
                    stmtEnd.setString(1,txtRua.getText());
                    stmtEnd.setString(2,txtNumero.getText());
                    stmtEnd.setString(3,txtCep.getText());
                    stmtEnd.setString(4,txtBairro.getText());
                    stmtEnd.setInt(5,Integer.parseInt(id.toString()));
                    stmtEnd.execute();

                }else{
                    PreparedStatement stmt2 = getConnection.conectarMysql().prepareStatement(sql2);
                    stmt2.setString(1, txtRua.getText());
                    stmt2.setString(2, txtNumero.getText());
                    stmt2.setString(3, txtCep.getText());
                    stmt2.setString(4, txtBairro.getText());
                    stmt2.setInt(5, Integer.parseInt(id.toString()));
                    stmt2.setInt(6, Integer.parseInt(id.toString()));
                    stmt2.execute();
                    stmt2.close();
                }

                Object objPlano = jTable1.getValueAt(index, 7);
                Object objValor = jTable1.getValueAt(index, 8);
                Object objInicio = jTable1.getValueAt(index, 9);
                Object objFim = jTable1.getValueAt(index, 10);

                if(objPlano == null && objValor == null){
                    
                    SimpleDateFormat formatador = new SimpleDateFormat("yyyy/MM/dd");
                    String dataFormatada1 = formatador.format(dataInicio.getDate());
                    String dataFormatada2 = formatador.format(dataFim.getDate());
                    
                    String sqlPlano = "insert into plano (tipo,valor,inicio,fim,pessoa_id_nome) values (?, ?, ?, ?, ?);";
                    PreparedStatement stmtEnd = getConnection.conectarMysql().prepareStatement(sqlPlano);
                    stmtEnd.setString(1,txtTipoPlano.getText());
                    stmtEnd.setString(2,txtvalor.getText());
                    stmtEnd.setString(3,dataFormatada1);
                    stmtEnd.setString(4,dataFormatada2);
                    stmtEnd.setInt(5,Integer.parseInt(id.toString()));
                    stmtEnd.execute();

                }else{
                    SimpleDateFormat formatador = new SimpleDateFormat("yyyy/MM/dd");
                    String dataFormatada1 = formatador.format(dataInicio.getDate());
                    String dataFormatada2 = formatador.format(dataFim.getDate());
                    
                   if(RadioCadastrar.isSelected()){
                       String sqPlanEdit = "update plano set tipo = ?, valor = ?, inicio = ?, fim = ?, pessoa_id_nome = ? where pessoa_id_nome = ?";
                        try (PreparedStatement stmt2 = getConnection.conectarMysql().prepareStatement(sqPlanEdit)) {
                        stmt2.setString(1, txtTipoPlano.getText());
                        stmt2.setString(2, txtvalor.getText());
                        stmt2.setString(3,dataFormatada1);
                        stmt2.setString(4,dataFormatada2);
                        stmt2.setInt(5, Integer.parseInt(id.toString()));
                        stmt2.setInt(6, Integer.parseInt(id.toString()));
                        stmt2.execute();
                        }  
                   }
                    
                }

                btnEditar.setText("Editar");
                btnCadastrar.setEnabled(true);
                btnCadastrar.setVisible(true);
                btnDeletar.setVisible(true);
                detectarDados();

            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            btnEditar.setText("Salvar");
            btnCadastrar.setEnabled(false);
            btnCadastrar.setVisible(false);
            btnDeletar.setVisible(false);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btnCadastrar.setText("Cadastrar Novo Aluno");
        btnEditar.setText("Editar");
        btnDeletar.setText("Deletar");
        btnCadastrar.setVisible(true);
        btnEditar.setVisible(true);
        btnDeletar.setVisible(true);
        btnCadastrar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnEditar.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        if(btnDeletar.getText().equals("Confirmar")){

            int index = jTable1.getSelectedRow();
            String sql = "delete from pessoa where id_nome = "+jTable1.getValueAt(index, 0)+";";
            
            try {
                PreparedStatement stmt;
                stmt = getConnection.conectarMysql().prepareStatement(sql);
                stmt.executeUpdate(sql);
                stmt.close();
                detectarDados();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            btnCadastrar.setVisible(true);
            btnEditar.setVisible(true);
            btnDeletar.setText("Deletar");
        }else{
            btnCadastrar.setVisible(false);
            btnEditar.setVisible(false);
            btnDeletar.setText("Confirmar");

        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        
        
        if(btnCadastrar.getText().equals("Salvar")){ //vars
            if(txtNome.getText().length() > 0 && txtTel.getText().length() > 0 && txtRua.getText().length() > 0 && txtNumero.getText().length() > 0
                && txtCep.getText().length() > 0 && txtBairro.getText().length() > 0){

                nome = txtNome.getText();
                telefone = txtTel.getText();
                rua = txtRua.getText();
                numero = txtNumero.getText();
                cep = txtCep.getText();
                bairro = txtBairro.getText();
                tipoPlano = txtTipoPlano.getText();
                

                getConnection c = new getConnection();
                String sql = "insert into pessoa values (default,?,?);";

                try {
                    PreparedStatement stmt = c.conectarMysql().prepareStatement(sql);
                    stmt.setString(1,nome);
                    stmt.setString(2,telefone);
                    stmt.execute();

                    Statement stmt2;
                    stmt2 = c.conectarMysql().createStatement();
                    String sqlLast = "SELECT LAST_INSERT_ID() as id;";
                    ResultSet rs = stmt.executeQuery(sqlLast);
                    while (rs.next()) {
                        lastId = rs.getString("id");
                    }

                    String sqlEnd = "insert into endereco (rua,numero,cep,bairro,pessoa_id_nome) values (?, ?, ?, ?, ?);";
                    PreparedStatement stmtEnd = c.conectarMysql().prepareStatement(sqlEnd);
                    stmtEnd.setString(1,rua);
                    stmtEnd.setString(2,numero);
                    stmtEnd.setString(3,cep);
                    stmtEnd.setString(4,bairro);
                    stmtEnd.setInt(5,Integer.parseInt(lastId));
                    stmtEnd.execute();

                    String sqlPlano = "insert into plano (tipo,valor,inicio,fim,pessoa_id_nome) values (?, ?, ?, ?, ?);";
                    PreparedStatement stmtPlano = c.conectarMysql().prepareStatement(sqlPlano);
                    
                    if(RadioCadastrar.isSelected()){

                    SimpleDateFormat sd = new SimpleDateFormat();
                        
                        try {
                                SimpleDateFormat formatador = new SimpleDateFormat("yyyy/MM/dd");
                                String dataFormatada1 = formatador.format(dataInicio.getDate());
                                String dataFormatada2 = formatador.format(dataFim.getDate());
                                
                                stmtPlano.setString(1,txtTipoPlano.getText());
                                stmtPlano.setString(2,txtvalor.getText());
                                stmtPlano.setString(3,dataFormatada1);
                                stmtPlano.setString(4,dataFormatada2);
                                stmtPlano.setInt(5,Integer.parseInt(lastId));
                                stmtPlano.execute();
                        } catch (Exception e) {
                                
                        }

                        
                    }

                    stmt.close();
                    stmt2.close();
                    stmtEnd.close();;
                    stmtPlano.close();

                    detectarDados();
                    btnCadastrar.setText("Cadastrar Novo Aluno");
                    btnEditar.setVisible(true);
                    btnDeletar.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            }

        }else{
            btnEditar.setVisible(false);
            btnDeletar.setVisible(false);
            btnCadastrar.setText("Salvar");
            detectarDados();
            limparCampos();
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtTipoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoPlanoActionPerformed

    private void RadioCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCadastrarActionPerformed
        // TODO add your handling code here:
        ativarFormRadioButton();
    }//GEN-LAST:event_RadioCadastrarActionPerformed

    private void RadioCadastrarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RadioCadastrarStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioCadastrarStateChanged

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        
        
        
        int index = jTable1.getSelectedRow();
        
        
        Object objNome = ""+jTable1.getValueAt(index, 1);
        Object objTel = ""+jTable1.getValueAt(index, 2);
        Object objRua = ""+jTable1.getValueAt(index, 3);
        Object objNum = ""+jTable1.getValueAt(index, 4);
        Object objCep = ""+jTable1.getValueAt(index, 5);
        Object objBairro = ""+jTable1.getValueAt(index, 6);
        Object objPlano = ""+jTable1.getValueAt(index, 7);
        Object objValor = ""+jTable1.getValueAt(index, 8);
        Object objInicio = jTable1.getValueAt(index, 9);
        Object objFim = jTable1.getValueAt(index, 10);

        txtNome.setText(objNome.toString());
        txtTel.setText(objTel.toString());
        txtRua.setText(objRua.toString());
        txtNumero.setText(objNum.toString());
        txtCep.setText(objCep.toString());
        txtBairro.setText(objBairro.toString());
        txtTipoPlano.setText(objPlano.toString());
        txtvalor.setText(objValor.toString());

        int posX = evt.getX();
         
         
        if(evt.getClickCount() == 2 && evt.getX() == posX){
            
            
           getNomes();
           InfoPessoa p = new InfoPessoa(nome, telefone, rua,
                   numero, cep , bairro, tipoPlano,
                   valor, converterData(objInicio.toString()),
                   converterData(objFim.toString()));
            
            p.setVisible(true);
            
        }
        
        if(btnEditar.getText().equals("Salvar")){
            btnCadastrar.setEnabled(false);
            btnCadastrar.setVisible(false);
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void cbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarActionPerformed
        // TODO add your handling code here:
        
        detectarDados();
            
    }//GEN-LAST:event_cbMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    
    public void ativarFormRadioButton (){
        if(RadioCadastrar.isSelected()){
            txtTipoPlano.setEnabled(true);
            dataInicio.setEnabled(true);
            dataFim.setEnabled(true);
            txtvalor.setEnabled(true);
        }else{
            txtTipoPlano.setEnabled(false);
            dataInicio.setEnabled(false);
            dataFim.setEnabled(false);
            txtvalor.setEnabled(false);
        }
        }
    
    public void mostrarDados(){

        
        ModeloTabela modelT = new ModeloTabela();
        jTable1.setModel(modelT);
        
        try {
            Statement stmt;
            stmt = getConnection.conectarMysql().createStatement();
            String sql = "select id_nome, nome, telefone, rua, numero, cep, bairro, tipo, valor, inicio, fim from pessoa left outer join endereco on endereco.pessoa_id_nome = pessoa.id_nome left outer join plano on pessoa.id_nome = plano.pessoa_id_nome order by pessoa.id_nome;";
            ResultSet rs = stmt.executeQuery(sql);
            
                while (rs.next()) {
                    String id = rs.getString("id_nome");
                    String nome = rs.getString("nome");
                    String telefone = rs.getString("telefone");
                    String rua = rs.getString("rua");
                    String numero = rs.getString("numero");
                    String cep = rs.getString("cep");
                    String bairro = rs.getString("bairro");
                    String tipo = rs.getString("tipo");
                    String valor = rs.getString("valor");
                    String inicio = rs.getString("inicio");
                    String fim = rs.getString("fim");
                    
                    Dados dados = new Dados();
                    
                    dados.setId(id);
                    dados.setNome(nome);
                    dados.setTelefone(telefone);
                    dados.setRua(rua);
                    dados.setNumero(numero);
                    dados.setCep(cep);
                    dados.setBairro(bairro);
                    dados.setPlano(tipo);
                    dados.setValor(valor);
                    dados.setInicio(inicio);
                    dados.setFim(fim);
                    
                    
                    modelT.addRow(dados);
                }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void limparCampos(){
        txtNome.setText("");
        txtTel.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtCep.setText("");
        txtBairro.setText("");
        txtTipoPlano.setText("");
        txtvalor.setText("");
    };
    
    public void getNomes(){
        nome = txtNome.getText();
        telefone = txtTel.getText();
        rua = txtRua.getText();
        numero = txtNumero.getText();
        cep = txtCep.getText();
        bairro = txtBairro.getText();
        tipoPlano = txtTipoPlano.getText();
        valor = txtvalor.getText();
       
    };
    
    public void mostrarPendentes(){
        ModeloTabela modelT = new ModeloTabela();
        jTable1.setModel(modelT);
        Date dataAtual = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy/MM/dd");
        String dataFormatada1 = formatador.format(dataAtual);
        
        System.out.println(""+dataFormatada1);
        try {
            Statement stmt;
            stmt = getConnection.conectarMysql().createStatement();
            String sql = "select id_nome, nome, telefone, rua, numero, cep, "
                    + "bairro, tipo, valor, inicio, fim from plano inner join "
                    + "pessoa on pessoa.id_nome = pessoa_id_nome join endereco "
                    + "on pessoa.id_nome = endereco.pessoa_id_nome "
                    + "where fim < '"+dataFormatada1+"';";
            
            
            ResultSet rs = stmt.executeQuery(sql);
            
                while (rs.next()) {
                    String id = rs.getString("id_nome");
                    String nome = rs.getString("nome");
                    String telefone = rs.getString("telefone");
                    String rua = rs.getString("rua");
                    String numero = rs.getString("numero");
                    String cep = rs.getString("cep");
                    String bairro = rs.getString("bairro");
                    String tipo = rs.getString("tipo");
                    String valor = rs.getString("valor");
                    String inicio = rs.getString("inicio");
                    String fim = rs.getString("fim");
                    
                    Dados dados = new Dados();
                    
                    dados.setId(id);
                    dados.setNome(nome);
                    dados.setTelefone(telefone);
                    dados.setRua(rua);
                    dados.setNumero(numero);
                    dados.setCep(cep);
                    dados.setBairro(bairro);
                    dados.setPlano(tipo);
                    dados.setValor(valor);
                    dados.setInicio(inicio);
                    dados.setFim(fim);
                    
                    
                    modelT.addRow(dados);
                }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    };
    
    
    public void detectarDados(){
       String tipoDados = cbMostrar.getSelectedItem().toString();

       switch(tipoDados){
           case "Mostrar Todos" : mostrarDados();
           break;
           case "Mostrar Pendentes" : mostrarPendentes();
           break;
          default: mostrarDados();
       }
       
    };
    
    public String converterData(String data){
            String[] retorno = data.toString().split("-");
            
            String dia = retorno[2];
            String mes = retorno[1];
            String ano = retorno[0];
            data = dia+"/"+mes+"/"+ano;
            return data;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioCadastrar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<String> cbMostrar;
    private com.toedter.calendar.JDateChooser dataFim;
    private com.toedter.calendar.JDateChooser dataInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFimPlano;
    private javax.swing.JLabel lblInicioPlano;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTipoPlano;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTipoPlano;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables

}
