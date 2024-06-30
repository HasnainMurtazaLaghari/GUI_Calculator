import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class GuICalculator implements ActionListener{
		Font f1=new Font("And",Font.BOLD,18);
		Font f2=new Font("and",Font.PLAIN,15);
		Frame f=new Frame();
		Label Calculater=new Label("Calculater");
		Label Value1st=new Label("Enter 1st Value:");
	    TextField Value1stbox=new TextField();
        Label Value2nd=new Label("Enter 2nd Value:");
	    TextField Value2ndbox=new TextField();
	    Button Plus=new Button("+");
		Button Minus=new Button("-");
		Button Multiplaction=new Button("x");
		Button Division=new Button("/");
		Button Reminder=new Button("%");
		Label Result=new Label("Result:");
		TextField Resultbox=new TextField();	
		Button Clear=new Button("Clear");
		Button About=new Button("About");
		Button Exit=new Button("Exit");
		
	 
	
	

   GuICalculator(){
  	    f.setBounds(300,30,400,400);
		f.setLayout(null);
		Calculater.setBounds(140,30,100,30);
		Calculater.setFont(f1);
        Value1st.setBounds(50,80,120,30);
        Value1stbox.setBounds(180,80,120,30);
        Value2nd.setBounds(50,120,120,30);
        Value2ndbox.setBounds(180,120,120,30);
		Resultbox.setBounds(180,270,120,30);
    	Result.setBounds(50,270,120,30);
    	Reminder.setBounds(310,180,60,60);
		Division.setBounds(240,180,60,60);
	    Multiplaction.setBounds(170,180,60,60);
		Minus.setBounds(100,180,60,60);
		Plus.setBounds(30,180,60,60);
		Plus.setFont(f1);
		Minus.setFont(f1);
		Multiplaction.setFont(f1); 	
		Division.setFont(f1);
		Reminder.setFont(f1);
    	Result.setFont(f2);
		Value2nd.setFont(f2); 
        Value1st.setFont(f2);
    
        Clear.setBounds(20,350,80,40);    
        About.setBounds(170,350,80,40);    
        Exit.setBounds(300,350,80,40); 

     f.add(Clear);
	f.add(About);
	f.add(Exit);
	f.add(Result);
	f.add(Resultbox);
	f.add(Plus);
	f.add(Minus);
	f.add(Multiplaction);
	f.add(Division);
	f.add(Reminder);
	f.add(Value2nd);
	f.add(Value2ndbox);
	f.add(Value1st);
	f.add(Value1stbox);
	f.add(Calculater);
	f.setBackground(Color.red);

	About.addActionListener(this);
	 Clear.addActionListener(this);
	 Exit.addActionListener(this);
	Plus.addActionListener(this);
	Minus.addActionListener(this);
	Multiplaction.addActionListener(this);
	Division.addActionListener(this);
	Reminder.addActionListener(this);
	f.show();
  } 

  public void actionPerformed(ActionEvent e){
		if(e.getSource()==Plus){
		
		String name=Value1stbox.getText();
		String name2=Value2ndbox.getText();
         int a=Integer.parseInt(name);
         int b=Integer.parseInt(name2);
         int sum=a+b;
         Resultbox.setText(""+sum);
	}

  if(e.getSource()==Minus){
		
		String name=Value1stbox.getText();
		String name2=Value2ndbox.getText();
         int a=Integer.parseInt(name);
         int b=Integer.parseInt(name2);
         int sum=a-b;
         Resultbox.setText(""+sum);
	}

if(e.getSource()==Multiplaction){
		
		String name=Value1stbox.getText();
		String name2=Value2ndbox.getText();
         int a=Integer.parseInt(name);
         int b=Integer.parseInt(name2);
         int sum=a*b;
         Resultbox.setText(""+sum);
	}


	if(e.getSource()==Division){
		
		String name=Value1stbox.getText();
		String name2=Value2ndbox.getText();
         int a=Integer.parseInt(name);
         int b=Integer.parseInt(name2);
         int sum=a/b;
         Resultbox.setText(""+sum);
	}

	if(e.getSource()==Reminder){
		
		String name=Value1stbox.getText();
		String name2=Value2ndbox.getText();
         int a=Integer.parseInt(name);
         int b=Integer.parseInt(name2);
         int sum=a%b;
         Resultbox.setText(""+sum);
	}




 if(e.getSource()==Clear){
   Value1stbox.setText(" ");
   Value2ndbox.setText(" ");
   Resultbox.setText(" ");
 }

if(e.getSource()==About){
  JOptionPane.showMessageDialog(null,"Name Hasnain\nFather Name :Ghulam Murtaza\n Cast Laghari");
 }
 if(e.getSource()==Exit){
   System.exit(0);
 }


}

			  
			
			
	
	
	
	
	public static void main(String[] args) {
	  GuICalculator ob=new GuICalculator();	
	}
}