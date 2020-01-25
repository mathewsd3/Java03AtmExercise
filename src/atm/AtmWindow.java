package atm;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class AtmWindow extends JFrame{
	
	JLabel balance;
	JLabel amount;
	
	JTextField textField;

	public final JButton deposit;
	JButton withdrawal;
	JButton exit;
	
	JLabel nap;

	
	public AtmWindow(String title)
	{
		super(title);
		//Container contentPane = getContentPane();
		//BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(100,100,100,100));
		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(7,1,10,10));
		
		contentPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		//contentPane.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));

		setContentPane(contentPane);
		
		balance = new JLabel("Balance");
		amount = new JLabel("$0.00");
		
		textField = new JTextField(" ");

		deposit = new JButton("Deposit");
		withdrawal = new JButton("Withdrawal");
		exit = new JButton("Exit");

		nap = new JLabel("No transaction performed");

		contentPane.add(balance);
		contentPane.add(amount);
		contentPane.add(textField);
		contentPane.add(deposit);		
		contentPane.add(withdrawal);		
		contentPane.add(exit);		
		contentPane.add(nap);		
		
		MyListener listener1 = new MyListener(textField);
		deposit.addActionListener(listener1);
		withdrawal.addActionListener(listener1);
		exit.addActionListener(listener1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setSize(500,700);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	/*
    public JButton getEnterButton()
    {
       return deposit;
    }

    public JButton getExitButton()
    {
       return withdrawal;
    }

    public JComponent getGUI(){
        return exit;
    }
	 */
}
