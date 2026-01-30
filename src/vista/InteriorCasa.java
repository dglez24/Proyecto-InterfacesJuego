package vista;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class InteriorCasa extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel FondoCasa;
	public JLabel LblPepe;
	public JLabel CartelVidasUs;
	public JLabel CartelVidasPepe;
	public JLabel CorazonUs1;
	public JLabel corazonUs2;
	public JLabel corazonUs3;
	public JLabel corazonPepe1;
	public JLabel corazonPepe2;
	public JLabel corazonPepe3;

	
	public InteriorCasa() {
		setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        double scaleX = screen.width / 700.0;
        double scaleY = screen.height / 400.0;
        
		LblPepe = new JLabel("");
		LblPepe.setIcon(new ImageIcon("Imagenes/pepe1.png"));
		LblPepe.setBounds(286, 67, 112, 139);
		add(LblPepe);
		
		CorazonUs1 = new JLabel("");
		CorazonUs1.setIcon(new ImageIcon("Imagenes/corazon.png"));
		CorazonUs1.setBounds(20, 15, 30, 30);
		add(CorazonUs1);
		
		corazonUs2 = new JLabel("");
		corazonUs2.setIcon(new ImageIcon("Imagenes/corazon.png"));
		corazonUs2.setBounds(55, 15, 30, 30);
		add(corazonUs2);
		
		corazonUs3 = new JLabel("");
		corazonUs3.setIcon(new ImageIcon("Imagenes/corazon.png"));
		corazonUs3.setBounds(90, 15, 30, 30);
		add(corazonUs3);
		
		corazonPepe1 = new JLabel("");
		corazonPepe1.setIcon(new ImageIcon("Imagenes/corazon.png"));
		corazonPepe1.setBounds(590, 15, 30, 30);
		add(corazonPepe1);
		
		corazonPepe2 = new JLabel("");
		corazonPepe2.setIcon(new ImageIcon("Imagenes/corazon.png"));
		corazonPepe2.setBounds(625, 15, 30, 30);
		add(corazonPepe2);
		
		corazonPepe3 = new JLabel("");
		corazonPepe3.setIcon(new ImageIcon("Imagenes/corazon.png"));
		corazonPepe3.setBounds(660, 15, 30, 30);
		add(corazonPepe3);
		

		
		CartelVidasUs = new JLabel("");
		CartelVidasUs.setIcon(new ImageIcon("Imagenes/cartelvidas.png"));
		CartelVidasUs.setBounds(10, 10, 115, 40);
		add(CartelVidasUs);
		
		CartelVidasPepe = new JLabel("");
		CartelVidasPepe.setIcon(new ImageIcon("Imagenes/cartelvidas.png"));
		CartelVidasPepe.setBounds(578, 10, 115, 40);
		add(CartelVidasPepe);
		
		FondoCasa = new JLabel("");
		FondoCasa.setIcon(new ImageIcon("Imagenes/FondoInterior.png"));
		FondoCasa.setBounds(0, 0, 700, 400);
		add(FondoCasa);
		


	}
}
