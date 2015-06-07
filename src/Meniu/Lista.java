package Meniu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Lista extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;

int curRow = 0;
   
    public Lista() {
        initComponents();
        DoConnect();
    }

    public void DoConnect()
    {
        try{
String host= "jdbc:derby://localhost:1527/Meniu";
String Uname="Bobo";
String Upass="asdfghjkl";
Connection con = DriverManager.getConnection(host, Uname, Upass);

stmt = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE );
String sql="select * from BOBO.LISTA";
rs = stmt.executeQuery(sql);

rs.next();

String Nume=rs.getString("NUME");
String Prenume= rs.getString("PRENUME");
String Numar= rs.getString("NUMAR");

TextNume.setText(Nume);
TextPrenume.setText(Prenume);
TextNumar.setText(Numar);
        


        }
        catch(SQLException er)
        {
            System.out.println("Eroare : "+er);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextNume = new javax.swing.JTextField();
        TextPrenume = new javax.swing.JTextField();
        TextNumar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Up = new javax.swing.JButton();
        Down = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Memorare = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextNume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNumeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nume  :");

        jLabel2.setText("Prenume : ");

        jLabel3.setText("Numar :");

        Up.setText("Sus");
        Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpActionPerformed(evt);
            }
        });

        Down.setText("Jos");
        Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownActionPerformed(evt);
            }
        });

        Update.setText("Editare");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Stergere");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Add.setText("Adaugare Contact");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Memorare.setText("Memorare");
        Memorare.setEnabled(false);
        Memorare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemorareActionPerformed(evt);
            }
        });

        Cancel.setText("Revocare");
        Cancel.setEnabled(false);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Memorare, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(TextNumar)
                            .addComponent(TextPrenume)
                            .addComponent(TextNume)
                            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Up)
                            .addComponent(Down))
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Down, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Up, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNumar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete)
                .addGap(35, 35, 35)
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Memorare)
                    .addComponent(Cancel))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNumeActionPerformed
        
    }//GEN-LAST:event_TextNumeActionPerformed

    private void DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownActionPerformed
       try{
        if(rs.next())
        {
       String Nume=rs.getString("NUME");
       String Prenume= rs.getString("PRENUME");
       String Numar= rs.getString("NUMAR");

       TextNume.setText(Nume);
       TextPrenume.setText(Prenume);
       TextNumar.setText(Numar);
        }
        else{
     try{
     rs.first();
     String Nume=rs.getString("NUME");
       String Prenume= rs.getString("PRENUME");
       String Numar= rs.getString("NUMAR");

       TextNume.setText(Nume);
       TextPrenume.setText(Prenume);
       TextNumar.setText(Numar);
     }
     catch(SQLException error)
     {
     JOptionPane.showMessageDialog(Lista.this,error.getMessage());
     }
        
       }
       }
       catch(SQLException err){
           JOptionPane.showMessageDialog(Lista.this,err.getMessage());
       }
    }//GEN-LAST:event_DownActionPerformed

    private void UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpActionPerformed
       try{
       if(rs.previous())
       {
       String Num=rs.getString("NUME");
       String Pre=rs.getString("PRENUME");
       String Nr=rs.getString("NUMAR");
       
       TextNume.setText(Num);
       TextPrenume.setText(Pre);
       TextNumar.setText(Nr);
       }
       else{
   try{
     rs.last();
     String Nume=rs.getString("NUME");
       String Prenume= rs.getString("PRENUME");
       String Numar= rs.getString("NUMAR");

       TextNume.setText(Nume);
       TextPrenume.setText(Prenume);
       TextNumar.setText(Numar);
     }
     catch(SQLException error)
     {
     JOptionPane.showMessageDialog(Lista.this,error.getMessage());
     }
       }
       }
       catch(SQLException ex)
       {
       JOptionPane.showMessageDialog(Lista.this,ex.getMessage());
       }
    }//GEN-LAST:event_UpActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String Nume=TextNume.getText();
        String Prenume=TextPrenume.getText();
        String Numar=TextNumar.getText();
        try{
        rs.updateString("NUME", Nume);
        rs.updateString("PRENUME", Prenume);
         rs.updateString("NUMAR", Numar);
        rs.updateRow();
        JOptionPane.showMessageDialog(Lista.this,"Contact editat");
        }
        catch(SQLException e)
        {
        System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        try
        {
        curRow= rs.getRow();
        TextNume.setText("");
        TextPrenume.setText("");
        TextNumar.setText("");
        
        Up.setEnabled(false);
        Down.setEnabled(false);
        Update.setEnabled(false);
        Delete.setEnabled(false);
        Add.setEnabled(false);
        
        Memorare.setEnabled(true);
        Cancel.setEnabled(true);
        }
        catch(SQLException Err)
        {
        System.out.println(Err.getMessage());
        }
        
    }//GEN-LAST:event_AddActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      try{
      rs.absolute(curRow);
      TextNume.setText(rs.getString("NUME"));
      TextPrenume.setText(rs.getString("PRENUME"));
      TextNumar.setText(rs.getString("NUMAR"));
      
       Up.setEnabled(true);
        Down.setEnabled(true);
        Update.setEnabled(true);
        Delete.setEnabled(true);
        Add.setEnabled(true);
        
        Memorare.setEnabled(false);
        Cancel.setEnabled(false);
      }
      catch(SQLException e){
      System.out.println(e.getMessage());
      }
    }//GEN-LAST:event_CancelActionPerformed

    private void MemorareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemorareActionPerformed
     String Nume=TextNume.getText();
     String Prenume=TextPrenume.getText();
     String Numar=TextNumar.getText();
     try{
     rs.moveToInsertRow();
     rs.updateString("NUME",Nume);
     rs.updateString("PRENUME", Prenume);
     rs.updateString("NUMAR", Numar);
     rs.insertRow();
     rs.close();
     JOptionPane.showMessageDialog(Lista.this,"Contactul a fost adaugat");
     String sql = "SELECT * FROM LISTA";
     rs = stmt.executeQuery(sql);
     rs.next();
     String Nume1=rs.getString("NUME");
     String Prenume1=rs.getString("PRENUME");
     String Numar1=rs.getString("NUMAR");
     TextNume.setText(Nume1);
     TextPrenume.setText(Prenume1);
     TextNumar.setText(Numar1);
     Up.setEnabled(true);
     Down.setEnabled(true);
     Update.setEnabled(true);
     Delete.setEnabled(true);
     Add.setEnabled(true);
        
        Memorare.setEnabled(false);
        Cancel.setEnabled(false);
     
   
     
     }
     catch(SQLException err)
     {
     System.out.println(err.getMessage());
     }
    }//GEN-LAST:event_MemorareActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       try{
       rs.deleteRow();
       JOptionPane.showMessageDialog(Lista.this,"Contactul a fost sters");
       
       rs.close();
       
       String SQL= "SELECT * FROM LISTA";
       rs=stmt.executeQuery(SQL);
       
       rs.next();
       String Nume2=rs.getString("NUME");
       String Prenume2=rs.getString("PRENUME");
       String Numar2=rs.getString("NUMAR");
     
     TextNume.setText(Nume2);
     TextPrenume.setText(Prenume2);
     TextNumar.setText(Numar2);
       
       }
       catch(SQLException e)
       {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_DeleteActionPerformed


    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Down;
    private javax.swing.JButton Memorare;
    private javax.swing.JTextField TextNumar;
    private javax.swing.JTextField TextNume;
    private javax.swing.JTextField TextPrenume;
    private javax.swing.JButton Up;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
