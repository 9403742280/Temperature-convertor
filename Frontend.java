import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frontend  {
	//Objects
	
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	JTextField t1,t2,t3;
	JButton b,b1;
	JComboBox C1,C2;
	
	Frontend(){
		
		JFrame f=new JFrame();
		
		//HEADING OF APP
		
		l=new JLabel("TEMPERATURE CONVERTER",JLabel.CENTER);
		l.setBounds(290,40,400,50);
		l.setFont(new Font("Verdana",Font.BOLD,25));
		l.setBackground(Color.black);
		l.setOpaque(true);
		l.setForeground(Color.green);
		f.add(l);
		
		//TITLE OF FRAME
		
		f.setTitle("Temperature Converter App");
		
		//LABLES
		
		l1=new JLabel("From:");
		l1.setBounds(200,145,100,25);
		l1.setFont(new Font("Verdana",Font.BOLD,18));
		f.add(l1);
		
		l2=new JLabel("To:");
		l2.setBounds(520,145,100,25);
		l2.setFont(new Font("Verdana",Font.BOLD,18));
		f.add(l2);
		
		l3=new JLabel("Value:");
		l3.setBounds(350,210,100,25);
		l3.setFont(new Font("Verdana",Font.BOLD,18));
		f.add(l3);
		l4=new JLabel("Result:");
		l4.setBounds(350,280,100,25);
		l4.setFont(new Font("Verdana",Font.BOLD,18));
		l4.setForeground(Color.RED);
		f.add(l4);
		
		//TEXT FIELDS
		
//		t1=new JTextField();
//		t1.setBounds(280,145,200,25);
//		t1.setFont(new Font("Verdana",Font.BOLD,18));
//		f.add(t1);
//		
//		t2=new JTextField();
//		t2.setBounds(580,145,200,25);
//		t2.setFont(new Font("Verdana",Font.BOLD,18));
//		f.add(t2);
		
		t3=new JTextField();
		t3.setBounds(450,210,200,25);
		t3.setFont(new Font("Verdana",Font.BOLD,18));
		f.add(t3);
		
		
		// Result
		JTextArea t4=new JTextArea();
		t4.setBounds(450,280,200,25);
		t4.setFont(new Font("Verdana",Font.BOLD,18));
		t4.setBackground(Color.LIGHT_GRAY);
		t4.setEditable(false);
		
		
		//BUTTON
		
		b=new JButton("Convert");
		b.setBounds(430,350,100,20);
		b.setSize(80,30);
		f.add(b);
		
		b1=new JButton("Clear");
		b1.setBounds(530,350,100,20);
		b1.setSize(80,30);
		f.add(b1);
		
		//DropDown List
		
		C1=new JComboBox();
		C1.setBounds(280,145,200,25);
		C1.setFont(new Font("Verdana",Font.BOLD,18));
		C1.addItem("kelvin [K]");
		C1.addItem("Celsius [°C]");
		C1.addItem("Fahrenheit [°F]");
		C1.addItem("Rankine [°R]");
		C1.addItem("Reaumur [°r]");
//		C1.addItem("Triple point of water");
		C1.setToolTipText("Select");
		f.add(C1);
		
		C2=new JComboBox();
		C2.setBounds(580,145,200,25);
		C2.setFont(new Font("Verdana",Font.BOLD,18));
		C2.addItem("kelvin [K]");
		C2.addItem("Celsius [°C]");
		C2.addItem("Fahrenheit [°F]");
		C2.addItem("Rankine [°R]");
		C2.addItem("Reaumur [°r]");
//		C2.addItem("Triple point of water");
		C2.setToolTipText("Select");
		f.add(C2);
		
		//Bottom Heading
		
		l5=new JLabel("Popular temperature unit conversions",JLabel.CENTER);
		l5.setBounds(30,400,400,50);
		l5.setFont(new Font("Verdana",Font.BOLD,18));
		l5.setOpaque(true);
		l5.setForeground(Color.green);
		f.add(l5);
		
		l6=new JLabel("Complete list of temperature units for conversion",JLabel.CENTER);
		l6.setBounds(450,400,450,50);
		l6.setFont(new Font("Verdana",Font.BOLD,16));
		l6.setOpaque(true);
		l6.setForeground(Color.green);
		f.add(l6);
		
		//Bottom Details
		l7=new JLabel("Celsius to Fahrenheit");
		l7.setBounds(37,470,200,15);
		l7.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l7);
		
		l8=new JLabel("Celsius to Kelvin");
		l8.setBounds(37,500,200,15);
		l8.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l8);
		
		l9=new JLabel("Fahrenheit to Kelvin");
		l9.setBounds(37,530,200,15);
		l9.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l9);
		
		l10=new JLabel("Fahrenheit to Celsius");
		l10.setBounds(230,470,200,15);
		l10.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l10);
		
		l11=new JLabel("Kelvin to Celsius");
		l11.setBounds(230,500,200,15);
		l11.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l11);
		
		l12=new JLabel("Kelvin to Fahrenheit");
		l12.setBounds(230,530,200,15);
		l12.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l12);
		
		l13=new JLabel("kelvin [K]");
		l13.setBounds(455,470,200,15);
		l13.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l13);
		
		l14=new JLabel("1 Celsius [°C] = 274.15 kelvin [K]");
		l14.setBounds(455,500,300,15);
		l14.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l14);
		
		l15=new JLabel("1 Fahrenheit [°F] = 255.9277777778 kelvin [K]");
		l15.setBounds(455,530,450,15);
		l15.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l15);
		
		l16=new JLabel("1 Rankine [°R] = 0.5555555556 kelvin [K]");
		l16.setBounds(455,560,400,15);
		l16.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l16);
		
		l17=new JLabel("1 Reaumur [°r] = 274.4 kelvin [K]");
		l17.setBounds(455,590,300,15);
		l17.setFont(new Font("Verdana",Font.BOLD,15));
		f.add(l17);
		
//		l18=new JLabel("1 Triple point of water = 273.16 kelvin [K]");
//		l18.setBounds(455,620,450,15);
//		l18.setFont(new Font("Verdana",Font.BOLD,15));
//		f.add(l18);
		
		//-------------------------------------------------Action Listener------------------------------------------------------------------
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String box1 = (String)C1.getSelectedItem();
				String box2 = (String)C2.getSelectedItem();
				
				
				//------------------------------Kelvin to all unit-----------------------------------------------
				
				
				//Kelvin to Kelvin
                if(box1.equals("kelvin [K]") && box2.equals("kelvin [K]")) {
                	double k = Double.parseDouble(t3.getText());

                    t4.setText(String.valueOf(k+" kelvin [K]"));
                }
				
				//Kelvin to Celsius
                else if(box1.equals("kelvin [K]") && box2.equals("Celsius [°C]")) {
                	double k = Double.parseDouble(t3.getText());
                	double c = (double) (k-273.15);
                	
                	t4.setText(String.valueOf(k+" Celsius [°C]"));
                }
				
				//Kelvin to Fahrenheit
                else if(box1.equals("kelvin [K]") && box2.equals("Fahrenheit [°F]")) {
                	double k = Double.parseDouble(t3.getText());
                	double f = (double) (k-273.15*1.8+32);
                	
                	t4.setText(String.valueOf(k+" Fahrenheit [°F]"));
                }
				
				//Kelvin to Rankine
                else if(box1.equals("kelvin [K]") && box2.equals("Rankine [°R]")) {
                	double k = Double.parseDouble(t3.getText());
                	double ra = (double) (k*1.8);
                	
                	t4.setText(String.valueOf(k+" Rankine [°R]"));
                }
				
				//Kelvin to Reaumur
                else if(box1.equals("kelvin [K]") && box2.equals("Reaumur [°r]")) {
                	double k = Double.parseDouble(t3.getText());
                	double re = (double) (k-273.15*0.8);
                	
                	t4.setText(String.valueOf(k+" Reaumur [°r]"));
                }
				
//				//Kelvin to Triple point of water
//                else if(box1.equals("kelvin [K]") && box2.equals("Triple point of water")) {
//                	double k = Double.parseDouble(t3.getText());
//                	double t = (double) (k+32);
//                	
//                	t4.setText(String.valueOf(t+" Triple point of water"));
//                }
				
				
				//-------------------------------------------Celsius to all unit-----------------------------------------
				
				
				//Celsius to Celsius
                else if(box1.equals("Celsius [°C]") && box2.equals("Celsius [°C]")) {
                	double c = Double.parseDouble(t3.getText());

                    t4.setText(String.valueOf(c+" Celsius [°C]"));
                }
				
				//Celsius to Kelvin
                else if(box1.equals("Celsius [°C]") && box2.equals("kelvin [K]")) {
                	double c = Double.parseDouble(t3.getText());
                	double k = (double) (c+273.15);
                	
                	t4.setText(String.valueOf(k+" kelvin [K]"));
                }
				
				//Celsius to Fahrenheit
                else if(box1.equals("Celsius [°C]") && box2.equals("Fahrenheit [°F]")) {
                	double c = Double.parseDouble(t3.getText());
					double f = (double) (c * 1.8 + 32);
					
					t4.setText(String.valueOf(f+" Fahrenheit [°F]"));
                }
				
				//Celsius to Rankine
                else if(box1.equals("Celsius [°C]") && box2.equals("Rankine [°R]")) {
                	double c = Double.parseDouble(t3.getText());
					double ra = (double) (c*1.8+491.67);
					
					t4.setText(String.valueOf(ra+" Rankine [°R]"));
                }
				
				//Celsius to Reaumur
                else if(box1.equals("Celsius [°C]") && box2.equals("Reaumur [°r]")) {
                	double c = Double.parseDouble(t3.getText());
					double re = (double) ((c*4)/5);
					
					t4.setText(String.valueOf(re+" Rankine [°R]"));
                }
				
//				//Celsius to Triple point of water
//                else if(box1.equals("Celsius [°C]") && box2.equals("Triple point of water")) {
//                	double c = Double.parseDouble(t3.getText());
//					double t = (double) (c+32); 
//					
//					t4.setText(String.valueOf(t+" Triple point of water"));
//                }
				
				
				//------------------------------------------Faheranheit to all unit--------------------------------------
				
				
				//Fahrenheit to Fahrenheit
                else if(box1.equals("Fahrenheit [°F]") && box2.equals("Fahrenheit [°F]")) {
                	double f = Double.parseDouble(t3.getText());

                    t4.setText(String.valueOf(f+" Fahrenheit [°F])"));
                }
				
				//Fahrenheit to Kelvin
                else if(box1.equals("Fahrenheit [°F]") && box2.equals("kelvin [K]")) {
                	double f = Double.parseDouble(t3.getText());
					double k = (double) ((f-32)*0.55+273.15);
					
					t4.setText(String.valueOf(k+" Rankine [°R]"));
                }
				
				//Fahrenheit to Celsius
                else if(box1.equals("Fahrenheit [°F]") && box2.equals("Celsius [°C]")) {
                	double f = Double.parseDouble(t3.getText());
					double c = (double) ((f-32)*0.55);
					
					t4.setText(String.valueOf(c+" Celsius [°C]"));
                }
				
				//Fahrenheit to Rankine
                else if(box1.equals("Fahrenheit [°F]") && box2.equals("Rankine [°R]")) {
                	double f = Double.parseDouble(t3.getText());
					double ra = (double) (f+459.67);
					
					t4.setText(String.valueOf(ra+" Rankine [°R]"));
                }
				
				//Fahrenheit to Reaumur
                else if(box1.equals("Fahrenheit [°F]") && box2.equals("Reaumur [°r]")) {
                	double f = Double.parseDouble(t3.getText());
					double re = (double) ((f-32)/2.25000002);
					
					t4.setText(String.valueOf(re+" Reaumur [°r]"));
                }
				
//				//Fahrenheit to Triple point of water
//                else if(box1.equals("Fahrenheit [°F]") && box2.equals("Triple point of water")) {
//                	double f = Double.parseDouble(t3.getText());
//					double t = (double) (f+32);
//					
//					t4.setText(String.valueOf(t+" Triple point of water"));
//                }
//				
				
				//---------------------------------------------Rankine to all unit------------------------------------
				
				
				//Rankine to Rankine
                else if(box1.equals("Rankine [°R]") && box2.equals("Rankine [°R]")) {
                	double ra = Double.parseDouble(t3.getText());

                    t4.setText(String.valueOf(ra+" Rankine [°R])"));
                }
				
				//Rankine to Kelvin
                else if(box1.equals("Rankine [°R]") && box2.equals("kelvin [K]")) {
                	double ra = Double.parseDouble(t3.getText());
					double k = (double) (ra*0.55);
					
					t4.setText(String.valueOf(k+" Reaumur [°r]"));
                }
				
				//Rankine to Celsius
                else if(box1.equals("Rankine [°R]") && box2.equals("Celsius [°C]")) {
                	double ra = Double.parseDouble(t3.getText());
					double c = (double) ((ra-491.67)*0.55);
					
					t4.setText(String.valueOf(c+" Celsius [°C]"));
                }
				
				//Rankine to Fahrenheit
                else if(box1.equals("Rankine [°R]") && box2.equals("Fahrenheit [°F]")) {
                	double ra = Double.parseDouble(t3.getText());
					double f = (double) (ra-459.67);
					
					t4.setText(String.valueOf(f+" Fahrenheit [°F]"));
                }
				
				//Rankine to Reaumur
                else if(box1.equals("Rankine [°R]") && box2.equals("Reaumur [°r]")) {
                	double ra = Double.parseDouble(t3.getText());
					double re = (double) ((ra-491.67)/2.25000002);
					
					t4.setText(String.valueOf(re+" Reaumur [°r]"));
                }
				
//				//Rankine to Triple point of water
//                else if(box1.equals("Rankine [°R]") && box2.equals("Triple point of water")) {
//                	double ra = Double.parseDouble(t3.getText());
//					double t = (double) (ra+32);
//					
//					t4.setText(String.valueOf(t+" Triple point of water"));
//                }
				
				
				//-------------------------------------------Reaumur to all unit----------------------------------------
				
				
				//Reaumur to Reaumur
                else if(box1.equals("Reaumur [°r]") && box2.equals("Reaumur [°r]")) {
                	double re = Double.parseDouble(t3.getText());

                    t4.setText(String.valueOf(re+" Reaumur [°r]"));
                }
				
				//Reaumur to Kelvin
                else if(box1.equals("Reaumur [°r]") && box2.equals("kelvin [K]")) {
                	double re = Double.parseDouble(t3.getText());
					double k = (double) (re*1.25+273.15);
					
					t4.setText(String.valueOf(k+" kelvin [K]"));
                }
				
				//Reaumur to Celsius
                else if(box1.equals("Reaumur [°r]") && box2.equals("Celsius [°C]")) {
                	double re = Double.parseDouble(t3.getText());
					double c = (double) (re*1.25);
					
					t4.setText(String.valueOf(c+" Celsius [°C]"));
                }
				
				//Reaumur to Fahrenheit
                else if(box1.equals("Reaumur [°r]") && box2.equals("Fahrenheit [°F]")) {
                	double re = Double.parseDouble(t3.getText());
					double f = (double) (re*2.25+32);
					
					t4.setText(String.valueOf(f+" Fahrenheit [°F]"));
                }
				
				//Reaumur to Rankine
                else if(box1.equals("Reaumur [°r]") && box2.equals("Rankine [°R]")) {
                	double re = Double.parseDouble(t3.getText());
					double ra = (double) ((re*2.25)+491.67);
					
					t4.setText(String.valueOf(ra+" Rankine [°R]"));
                }
				
//				//Reaumur to Triple point of water
//                else if(box1.equals("Reaumur [°r]") && box2.equals("Triple point of water")) {
//                	double re = Double.parseDouble(t3.getText());
//					double t = (double) (re+32);
//					
//					t4.setText(String.valueOf(t+" Triple point of water"));
//                }
				
				
				//------------------------------------------Triple point of water to all unit------------------------------------
				
//				
//				//Triple point of water to Triple point of water
//                else if(box1.equals("Triple point of water") && box2.equals("Triple point of water")) {
//                	double t = Double.parseDouble(t3.getText());
//
//                    t4.setText(String.valueOf(t+" Triple point of water"));
//                }
////				
//				//Triple point of water to Kelvin
//                else if(box1.equals("Triple point of water") && box2.equals("kelvin [K]")) {
//                	double t = Double.parseDouble(t3.getText());
//					double k = (double) (t+32);
//					
//					t4.setText(String.valueOf(k+" kelvin [K]"));
//                }
////				
//				//Triple point of water to Celsius
//                else if(box1.equals("Triple point of water") && box2.equals("Celsius [°C]")) {
//                	double t = Double.parseDouble(t3.getText());
//                	double c = (double) (t+35);
//                	
//                	t4.setText(String.valueOf(t+" Celsius [°C]"));
//                }
////				
//				//Triple point of water to Fahrenheit
//                else if(box1.equals("Triple point of water") && box2.equals("Fahrenheit [°F]")) {
//                	double t = Double.parseDouble(t3.getText());
//                	double f = (double) (t+30);
//                	
//                	t4.setText(String.valueOf(t +" Fahrenheit [°F]"));
//                }
////				
//				//Triple point of water to Rankine
//                else if(box1.equals("Triple point of water") && box2.equals("Rankine [°R]")) {
//                	double t = Double.parseDouble(t3.getText());
//                	double ra = (double) (t+32);
//                	
//                	t4.setText(String.valueOf(t+" Rankine [°R]"));
//                }
//				
//				//Triple point of water to Reaumur
//                else if(box1.equals("Triple point of water") && box2.equals("Reaumur [°r]")) {
//                	double t = Double.parseDouble(t3.getText());
//                	double re = (double) (t+32);
//                }
			}
		});
		
		//Action Listener for Clear Button
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				t3.setText(String.valueOf(""));
				t4.setText(String.valueOf(""));
			}
		});
		
		
		f.add(t4);
		f.setSize(1000,700);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		Frontend F=new Frontend();
	}
}


