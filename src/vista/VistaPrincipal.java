package vista;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Funcionalidad;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final String PanelOverlay = null;
	private JPanel contentPane;
    public MenuPrincipal MenuPrincipal;
    public InteriorCasa InteriorCasa;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
	                Funcionalidad funcion = new Funcionalidad(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
    	
    	setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, 700, 400);

        
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        
		
		InteriorCasa = new InteriorCasa();
		InteriorCasa.setBounds(0, 0,  screenWidth, screenHeight);
		contentPane.add(InteriorCasa);
		InteriorCasa.setLayout(null);
        
        
        MenuPrincipal = new MenuPrincipal();
        MenuPrincipal.setBounds(0, 0,  screenWidth, screenHeight);
		contentPane.add(MenuPrincipal);
		MenuPrincipal.setLayout(null);


	}

}
