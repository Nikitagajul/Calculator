package Event_Handling;
	import java.awt.*;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
	import java.awt.event.*;

	public class Arithmetic_Event extends JFrame implements ActionListener
	{
		Container cp;
		JLabel lbla,lblb;
		JTextField txta,txtb;
		JButton btn1,btn2,btn3,btn4;
		 public Arithmetic_Event(String t)
		 {
			 super(t);
			 cp=getContentPane();
			 cp.setLayout(new GridLayout(4,2,5,5));
			 
			 lbla=new JLabel("First Number a",JLabel.CENTER);
			 txta=new JTextField();
			 cp.add( lbla);
			 cp.add( txta);
			 
			 
			 lblb=new JLabel("Second Number b",JLabel.CENTER);
			 txtb=new JTextField();
			 cp.add( lblb);
			 cp.add( txtb);
			
			 
			 btn1=new JButton("Add +");
			 btn1.addActionListener( this);
			 btn2=new JButton("Sub -");
			 btn2.addActionListener( this);
			 btn3=new JButton("Mul *");
			 btn3.addActionListener( this);
			 btn4=new JButton("Div /");
			 btn4.addActionListener( this);
			 
			 cp.add(btn1);
			 cp.add(btn2);
			 cp.add(btn3);
			 cp.add(btn4);
			 
			 setSize(400,400);
			 setVisible(true);
			 
		 }

		public static void main(String[] args)
		{
			new Arithmetic_Event("Arithmetic Operation");
	 
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==btn1)
			{
				int cal = 0;
			int n1=Integer.parseInt( txta.getText());
			int n2=Integer.parseInt( txtb.getText());
			cal=n1+n2;
			JOptionPane.showMessageDialog(this, "Addition is "+ cal);  
		
			}
			else if(e.getSource()==btn2)
			{
			int n1=Integer.parseInt( txta.getText());
			int n2=Integer.parseInt( txtb.getText());
			int cal=n1-n2;
			JOptionPane.showMessageDialog(this, "Substraction is "+ cal); 
			}
			else if(e.getSource()==btn3)
			{
			int n1=Integer.parseInt( txta.getText());
			int n2=Integer.parseInt( txtb.getText());
			int cal=n1*n2;
			JOptionPane.showMessageDialog(this, "Multiplication  is "+ cal); 
			}
			else if(e.getSource()==btn4)
			{
			int n1=Integer.parseInt( txta.getText());
			int n2=Integer.parseInt( txtb.getText());
			int cal=n1/n2;
			JOptionPane.showMessageDialog(this, "Division is "+ cal); 
			}	
		}
}
