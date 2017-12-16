/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updatestatus;

/**
 *
 * @author Owner-PC
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UpdateStatus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        JTable table = new JTable(); 
        Object[] columns = {"Name","Staff ID","PhoneNo","Status"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        
        JTextField txtName = new JTextField();
        JTextField txtStaffID= new JTextField();        
        JTextField txtPhoneNo = new JTextField();
        
        JTextField txtStatus = new JTextField();
        JLabel address = new JLabel("Address: ");
        JLabel phone = new JLabel("Phone No: ");
        JLabel status = new JLabel("Status: ");
  
        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update"); 
        
        frame.add(txtName);
        frame.add(txtStaffID);
        frame.add(txtPhoneNo);
        frame.add(txtStatus);
        frame.add(btnUpdate);
        frame.add(address);
        frame.add(phone);
        frame.add(status);
        
        address.setBounds(20, 200, 100, 25);
      txtPhoneNo.setBounds(20, 220, 100, 25);
      
      phone.setBounds(20, 240, 100, 25);
       txtPhoneNo.setBounds(20, 260, 100, 25);
       
       status.setBounds(20, 280, 100, 25);
       txtStatus.setBounds(20, 300, 100, 25);

        btnUpdate.setBounds(20, 350, 100, 25);
       
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 1000, 200);
        
        frame.setLayout(null);    
        frame.add(pane);
        
        frame.setSize(1010,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
