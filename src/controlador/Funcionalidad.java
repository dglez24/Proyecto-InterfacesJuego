package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaPrincipal;

public class Funcionalidad implements ActionListener {
	
	VistaPrincipal vista = new VistaPrincipal();

	public Funcionalidad(VistaPrincipal frame) {
		vista = frame;
		
		vista.MenuPrincipal.BTNJugar.addActionListener(this);
		vista.MenuPrincipal.BTNSalir.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == vista.MenuPrincipal.BTNJugar) {
			
			
		}
		
		if(e.getSource() == vista.MenuPrincipal.BTNSalir) {
			System.exit(0);
		}
		
	}


}
