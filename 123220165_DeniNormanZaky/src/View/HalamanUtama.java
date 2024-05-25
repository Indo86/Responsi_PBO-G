
package View;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JScrollPane;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import Controller.*;

public class HalamanUtama extends JFrame implements ActionListener {
    
    private JTextField txtNama;
    private JTextField txtJenis;
    private JTextField txtPemilik;
    private JTextField txtNomorTelepon;
    private JTextField txtId;
    private JTextField txtDurasiPenitipan;
    private JTextField txtTotalHarga;

    int totalHarga;
    int durasiMenginap;
    int id; 
    // deklarasi component tabel
    private JTable tabelDataHewan;
    private JScrollPane scrollTabel;
    DataController dataController = new DataController();
    String[] columnNames = {"ID","Nama","Jenis_Hewan", "Pemilik", "Nomor_Telepon", "Durasi_Penitipan", "Total_Harga" };
    DefaultTableModel tabelModel = new DefaultTableModel(columnNames,0);
    
    
    
    
    public HalamanUtama(){
    super("PetShop");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000, 600);
    setLocationRelativeTo(null);
    
    // mmembuat properti gui
    JLabel lblNama = new JLabel("Nama: ");
    JLabel lblJenis_Hewan = new JLabel("Jenis_Hewan: ");
    JLabel lblPemilik = new JLabel("Pemilik_Hewan: ");
    JLabel lblNomor_Telepon = new JLabel( "Nomor_Telepon");
    JLabel lblDurasi_Penitipan = new JLabel("Durasi_penitipan");
    
    txtNama = new JTextField(15);
    txtJenis = new JTextField(15);
    txtPemilik = new JTextField(15);
    txtNomorTelepon = new JTextField(15);
    txtDurasiPenitipan = new JTextField(15);
    
    
    JButton btnAdd = new JButton("Insert");
    JButton btnDelete = new JButton("Delete");
    JButton btnUpdate = new JButton("Update");
    JButton btnClear = new JButton("Clear");
    
    btnAdd.addActionListener(this);
    btnDelete.addActionListener(this);
    btnUpdate.addActionListener(this);
    btnClear.addActionListener(this);
    
    
    JScrollPane scrollPane = new JScrollPane();
    JPanel formPanel = new JPanel(new GridLayout(7,2,5,5));
    
    // form panel
    formPanel.add(lblNama);
    formPanel.add(txtNama);
    formPanel.add(lblJenis_Hewan);   
    formPanel.add(lblPemilik);
    formPanel.add(txtPemilik); 
    formPanel.add(lblNomor_Telepon);
    formPanel.add(txtNomorTelepon);    
    formPanel.add(lblDurasi_Penitipan);
    formPanel.add(txtDurasiPenitipan);
    
    // button panel
    JPanel btnPanel = new JPanel(new GridLayout(4,2,4,5));
    btnPanel.add(btnAdd);
    btnPanel.add(btnDelete);
    btnPanel.add(btnUpdate);
    btnPanel.add(btnClear);
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public JTextField getTxtNama() {
        return txtNama;
    }

    public void setTxtNama(JTextField txtNama) {
        this.txtNama = txtNama;
    }

    public JTextField getTxtJenis() {
        return txtJenis;
    }

    public void setTxtJenis(JTextField txtJenis) {
        this.txtJenis = txtJenis;
    }

    public JTextField getTxtPemilik() {
        return txtPemilik;
    }

    public void setTxtPemilik(JTextField txtPemilik) {
        this.txtPemilik = txtPemilik;
    }

    public JTextField getTxtNomorTelepon() {
        return txtNomorTelepon;
    }

    public void setTxtNomorTelepon(JTextField txtNomorTelepon) {
        this.txtNomorTelepon = txtNomorTelepon;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtDurasiPenitipan() {
        return txtDurasiPenitipan;
    }

    public void setTxtDurasiPenitipan(JTextField txtDurasiPenitipan) {
        this.txtDurasiPenitipan = txtDurasiPenitipan;
    }

 

    public JTextField getTxtTotalHarga() {
        return txtTotalHarga;
    }

    public void setTxtTotalHarga(JTextField txtTotalHarga) {
        this.txtTotalHarga = txtTotalHarga;
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
