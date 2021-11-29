package app;

<<<<<<< HEAD
import java.awt.BorderLayout;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
import java.awt.EventQueue;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.ThongKeDao;
import entity.BangDia;

public class FrmThongKeDiaYeuThich extends JFrame {
<<<<<<< HEAD

=======
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	private JPanel contentPane;
	private DefaultTableModel tableModel;
	private JTable table;
	ThongKeDao thongKeDao = new ThongKeDao(FrmMain.factory);

<<<<<<< HEAD
	/**
	 * Launch the application.
	 */
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmThongKeDiaYeuThich frame = new FrmThongKeDiaYeuThich();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

<<<<<<< HEAD
	/**
	 * Create the frame.
	 */
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	public FrmThongKeDiaYeuThich() throws RemoteException{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 30, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		JLabel lblTitle = new JLabel("DANH SÁCH BĂNG ĐĨA ĐƯỢC YÊU THÍCH ");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblTitle.setBounds(250, 30, 500, 30);
		contentPane.add(lblTitle);
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(100, 100, 800, 600);
		contentPane.add(scrollPane);
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		String tenCot[] = {"Mã băng đĩa","Tên băng đĩa","Thể loại","Tình trạng","Số lượng","Số ngày mượn","Đơn giá","Hãng sản xuất","Ghi chú"};
		tableModel = new DefaultTableModel(tenCot, 0);
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		DocDuLieuVaoTableDiaYeuThich();
	}

	private void DocDuLieuVaoTableDiaYeuThich() {
		List<BangDia> l = new ArrayList<>();
<<<<<<< HEAD
		
		l = thongKeDao.getBangDiaYeuThich();
		
=======

		l = thongKeDao.getBangDiaYeuThich();

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		for(BangDia bd : l) {
			tableModel.addRow(new Object[] {
					bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(), bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(), bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
			});
		}
	}

}
