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
	public JButton BTNSalir;
	
	
	public MenuPrincipal() {
		setLayout(null);
		

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        double scaleX = screen.width / 700.0;
        double scaleY = screen.height / 400.0;
		
		
		BTNJugar = new JButton("Jugar");
		BTNJugar.setFont(new Font("Times New Roman", Font.PLAIN, (int)(23 * scaleY)));
		BTNJugar.setForeground(new Color(0, 0, 0));
		BTNJugar.setBackground(Color.WHITE);
		BTNJugar.setBounds(
		        (int)(435 * scaleX),
		        (int)(135 * scaleY),
		        (int)(65 * scaleX),
		        (int)(27 * scaleY)
		);
		BTNJugar.setOpaque(false);
		BTNJugar.setBorderPainted(false);
		add(BTNJugar);
		
		
		
		
		BTNSalir = new JButton("Salir");
		BTNSalir.setFont(new Font("Times New Roman", Font.PLAIN, (int)(23 * scaleY)));
		BTNSalir.setForeground(new Color(0, 0, 0));
		BTNSalir.setBackground(Color.WHITE);
		BTNSalir.setBounds(
		        (int)(435 * scaleX),
		        (int)(175 * scaleY),
		        (int)(65 * scaleX),
		        (int)(27 * scaleY)
		);
		BTNSalir.setOpaque(false);
		BTNSalir.setBorderPainted(false);
		add(BTNSalir);		
		
        
        ImageIcon icon = new ImageIcon("Imagenes/FondoMenu.png");
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
