/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;



/**
 *
 * @author siddhant
 */
public class booking extends javax.swing.JFrame {

    /**
     * Creates new form booking
     */
    public booking() {
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

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gst = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\siddhant\\Pictures\\Untitle.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 76, -1, -1));

        jLabel2.setText("address");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel3.setText("contact no.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 104, -1, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 75, 221, -1));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 103, 221, -1));

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Classic", "Honeymoon", "Royal" }));
        getContentPane().add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 92, -1));

        jLabel5.setText("category");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        add.setColumns(20);
        add.setRows(5);
        jScrollPane1.setViewportView(add);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 191, 33));

        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 82, -1));

        jButton2.setText("close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        jLabel8.setText("city");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel9.setText("state");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel10.setText("Total bill");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));
        getContentPane().add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 140, -1));

        total.setEditable(false);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 140, -1));

        jLabel13.setText("G.S.T.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        getContentPane().add(gst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 140, 21));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "room no", "room type", "bed type", "tarrif"
            }
        ));
        jScrollPane2.setViewportView(table2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 11, 330, 48));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\siddhant\\Pictures\\skybluemiz.jpg")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -7, 380, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void printticket()
    {
         try{
              int i=0;
        
        System.out.println("Create Simple PDF file with Text");
        String fileName = "ticket.pdf"; // name of our file
        
        PDDocument doc = new PDDocument();
        PDPage page = new PDPage();

        doc.addPage(page);

        PDPageContentStream content = new PDPageContentStream(doc, page);
      
        content.beginText();
        content.setFont(PDType1Font.TIMES_BOLD, 26);
        content.moveTextPositionByAmount(120, 760);
        content.drawString("SERINITY RESORTS");
        content.endText();
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 20);
        content.moveTextPositionByAmount(80, 730);
        content.drawString("---------Bill info---------");
        content.endText();
        
      
        
           
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80, 710-(i*80));
        content.drawString("| Name : "+name.getText());
        content.endText();
        //System.out.println(710-(i*80));
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,690-(i*80));
        content.drawString("| Contact no : "+ contact.getText());
        content.endText();
        //System.out.println(690-(i*80));
        
       
          
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,670-(i*80));
        content.drawString("| Customer ID : "+id.getText());
        content.endText();
        //System.out.println(630-(i*80));
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,650-(i*80));
        content.drawString("| Room Number : "+table2.getValueAt(0, 0));
        content.endText();
       
              
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,630-(i*80));
        content.drawString("| Address : "+add.getText());
        content.endText();
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,610-(i*80));
        content.drawString("| City : "+city.getText());
        content.endText();
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,590-(i*80));
        content.drawString("| State : "+state.getText());
        content.endText();
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,570-(i*80));
        content.drawString("| Category : "+category.getSelectedItem());
        content.endText();
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,550-(i*80));
        content.drawString("| Fare : "+table2.getValueAt(0, 3));
        content.endText();
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,530-(i*80));
        content.drawString("| G.S.T. : "+gst.getText());
        content.endText();
        
  
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,510-(i*80));
        content.drawString("|---------------------------------");
        content.endText();
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,490-(i*80));
        content.drawString("| Total Fare : "+total.getText());
        content.endText();
        
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 16);
        content.moveTextPositionByAmount(80,470-(i*80));
        content.drawString("|---------------------------------");
        content.endText();
        
        
        content.close();
        doc.save(fileName);
        doc.close();
        dispose();
        
        System.out.println("your file created in : "+ System.getProperty("user.dir"));
        File pdf = new File("ticket.pdf");
        Desktop.getDesktop().open(pdf);
        

        }
        catch(IOException | COSVisitorException e){
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
        System.out.println(e.getMessage());
        
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        roombk r = new roombk();
        roombk r1= new roombk();
        //r1.bookfun();
         try {
              
            Class.forName("com.mysql.jdbc.Driver");
         
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","admin");
        
            Statement stmt=conn.createStatement();
            
            String sql="insert into entry values ("+"'"+ name.getText() +"'"+ ","+ contact.getText() +","+"'"+ category.getSelectedItem() + "'" + "," + "'" + add.getText() + "'" + "," + id.getText() + ", '" + city.getText()+ "' , '" + state.getText() + "' , " + total.getText() + ")"+";";
            
            stmt.executeUpdate(sql);
            
           /* int roomno = (int) table2.getValueAt(table2.getSelectedRow(), 0);
            
            String sql2="insert into booked values( "+ roomno + "," + "'booked'" + ", '"+ad1.getText() +"'"+", '"+dd1.getText()+"' )" +";";
            
            stmt.executeUpdate(sql2);*/
              
            r.D1.setVisible(true);
            conn.close();
            stmt.close();
            System.out.println("SUCCESFULL");
            // printticket();
         }
         catch(Exception e)
         {
             
              r.D3.setVisible(true);
              System.out.println("ERROR :" + e);
             
         }
          
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         printticket();
        dispose();
        new my().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        
       try{
           
        int t=(int)table2.getValueAt(0, 3);
        double g =t*0.18;
        gst.setText(""+g );
        total.setText(t+g+"");
       }
       catch(Exception e)
       {
           System.out.println("Error : "+ e);
       }
       
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField city;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel gst;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField state;
    public javax.swing.JTable table2;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
