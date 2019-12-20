import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageEditorFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageEditorFrame frame = new ImageEditorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ImageEditorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton helloButton = new JButton("HelloWorld");
	
		GridBagConstraints gbc_helloButton = new GridBagConstraints();
		gbc_helloButton.insets = new Insets(0, 0, 5, 0);
		gbc_helloButton.gridx = 5;
		gbc_helloButton.gridy = 2;
		contentPane.add(helloButton, gbc_helloButton);
		
		JLabel field1 = new JLabel("This text should chage");
		GridBagConstraints gbc_field1 = new GridBagConstraints();
		gbc_field1.gridx = 5;
		gbc_field1.gridy = 3;
		contentPane.add(field1, gbc_field1);
		
		helloButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				field1.setText("Hello World has been established");
				
			}
		});
	}

}
