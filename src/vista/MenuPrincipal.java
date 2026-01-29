package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MenuPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel LblFotofondo;
	public JButton BTNJugar;
	
	
	public MenuPrincipal() {
		setLayout(null);
		

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        double scaleX = screen.width / 1400.0;
        double scaleY = screen.height / 787.0;
		
		
		BTNJugar = new JButton("Jugar");
		BTNJugar.setHorizontalAlignment(SwingConstants.LEFT);
		BTNJugar.setForeground(Color.WHITE);
		BTNJugar.setBackground(Color.WHITE);
		BTNJugar.setBounds(471, 149, 79, 27);
		BTNJugar.setBounds(
		        (int)(471 * scaleX),
		        (int)(149 * scaleY),
		        (int)(79 * scaleX),
		        (int)(27 * scaleY)
		);
		BTNJugar.setOpaque(false);
		add(BTNJugar);
		
		/*
		BTNContinuar = new JButton("Continuar");
		BTNContinuar.setHorizontalAlignment(SwingConstants.LEFT);
		BTNContinuar.setFont(new Font("Times New Roman", Font.PLAIN, (int)(75 * scaleY)));
		BTNContinuar.setBounds(
		        (int)(60 * scaleX),
		        (int)(580 * scaleY),
		        (int)(400 * scaleX),
		        (int)(100 * scaleY)
		);
		BTNContinuar.setOpaque(false);
		BTNContinuar.setBorderPainted(false);
		contentPane.add(BTNContinuar);*/
		
		
        
        ImageIcon icon = new ImageIcon("Imagenes/FondoJuego.png");
        Image img = icon.getImage().getScaledInstance(
                screenWidth,
                screenHeight,
                Image.SCALE_DEFAULT
        );
        
        
        
        LblFotofondo = new JLabel(new ImageIcon(img));
        LblFotofondo.setHorizontalAlignment(SwingConstants.CENTER);
        LblFotofondo.setBounds(0, 0, screenWidth, screenHeight);
		add(LblFotofondo);

		
        
        
        

	}
}
