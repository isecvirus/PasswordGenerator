import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pg{
	public static void main(String[] args) {
		String upper_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower_letters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String punctuations = "~`!@#$%^&*()_-+=}]{[\"':;?/>.<,|\\";
		String all = upper_letters + lower_letters + numbers + punctuations;
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception error) {}
		
		final JFrame window = new JFrame("Password Generator");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setSize(400, 300);
		
		JPanel panel;
		panel = new JPanel();
		
		JLabel tool_name_lbl;		
		tool_name_lbl = new JLabel("Password Generator", SwingConstants.CENTER);
		tool_name_lbl.setPreferredSize(new Dimension(600, 200));
		tool_name_lbl.setForeground(Color.gray);
		window.add(tool_name_lbl, BorderLayout.PAGE_START);

		JTextField output;
		output = new JTextField("", SwingConstants.CENTER);
//		output.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		output.setBounds(25, 120, 550, 30); // x, y, width, height
		output.setLayout(null);
		output.setVisible(true);
		window.add(output, BorderLayout.CENTER);

		
		
		SpinnerModel pl_settings; // pl=password length
		pl_settings = new SpinnerNumberModel(8, 0, 2500, 1);
		// 8: initial value
		// 0: min value
		// 2500: max value
		// 1: step
		
		JSpinner password_length;
		password_length = new JSpinner(pl_settings);
		password_length.setBounds(488, 160, 85, 30);
		password_length.setVisible(true);
		password_length.setToolTipText("Length of generated password");
		window.add(password_length, BorderLayout.CENTER);

		
		JButton generate_btn;
		generate_btn = new JButton("Generate");
		generate_btn.setPreferredSize(new Dimension(90, 30));
		generate_btn.setLayout(null);
		generate_btn.setFocusable(false);
		generate_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		generate_btn.setBounds(50,100,95,30);
//		generate_btn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		generate_btn.setToolTipText("Generate password");
		window.add(generate_btn);
		generate_btn.setVisible(true);

		generate_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String password = "";
				int length = (int) password_length.getValue();

				for (int i=0;i<length;i++) {
					int random = (int) (Math.random() * all.length());
					password += all.charAt(random);
				}

				output.setText(password);
			}
		});
		
		
		panel.add(generate_btn);
		panel.setVisible(true);
		window.add(panel);
		
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}
