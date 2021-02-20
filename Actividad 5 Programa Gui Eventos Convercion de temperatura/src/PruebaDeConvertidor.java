import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class ConvertidorDeTemperatura extends JFrame implements ActionListener{
	JComboBox<String> T1, T2;
	JTextArea ValorDeLaTemperatura;
	public  ConvertidorDeTemperatura(){
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setTitle("Comvertidor de Temperaturas");
	
		
		//Ingresa El Numero O Medida
		ValorDeLaTemperatura = new JTextArea("0");
		add(ValorDeLaTemperatura);
		
		//Seleccion de la medida base
		add(new JLabel("Selecciona La medida Base:"));
		String Temperaturas[] = {"Elige opcion:","Centogrados", "...", 
				"Fahrenheit","Kelvin","Rankine"};
        T1 = new JComboBox<String>(Temperaturas);
        T1.addActionListener(this);
        add(T1);
        
        
        //Seleccion de medida a la que se quiere Converir la base
        add(new JLabel("Selecciona La medida Base:"));
        T2 = new JComboBox<String>(Temperaturas);
        T2.addActionListener(this);
        add(T2);
        
        
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == T1) {
			
		}
		
	}

public static class PruebaDeConvertidor {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new ConvertidorDeTemperatura();
			}
		});
	}


}}
