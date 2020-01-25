package atm;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
public class MyListener implements ActionListener{

	private JTextField textField;
	public MyListener(JTextField textField)
	{
		this.textField = textField;
	}
	public void actionPerformed(ActionEvent event)
	{
		//textArea.append("Appended text\n");
		System.out.println("Button Clicked");
		textField.setText("Depositing Money");
		

	}


}
