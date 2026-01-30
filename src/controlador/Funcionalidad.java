package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import vista.VistaPrincipal;
import vista.FadePanel;

public class Funcionalidad implements ActionListener {

    VistaPrincipal vista;
    private float fadeAlpha = 0f;

    public Funcionalidad(VistaPrincipal frame) {
        vista = frame;

        vista.MenuPrincipal.BTNJugar.addActionListener(this);
        vista.MenuPrincipal.BTNSalir.addActionListener(this);

        vista.InteriorCasa.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.MenuPrincipal.BTNJugar) {
            iniciarFade();
        }

        if (e.getSource() == vista.MenuPrincipal.BTNSalir) {
            System.exit(0);
        }
    }

    private void iniciarFade() {

        FadePanel fade = new FadePanel();
        vista.setGlassPane(fade);
        fade.setVisible(true);
        fadeAlpha = 0f;

        Timer fadeOut = new Timer(30, null);

        fadeOut.addActionListener(ev -> {
            fadeAlpha += 0.05f;
            fade.setAlpha(fadeAlpha);

            if (fadeAlpha >= 1f) {
                fadeOut.stop();

                vista.MenuPrincipal.setVisible(false);
                vista.InteriorCasa.setVisible(true);

                iniciarFadeIn(fade);
            }
        });

        fadeOut.start();
    }

    private void iniciarFadeIn(FadePanel fade) {

        Timer fadeIn = new Timer(30, null);

        fadeIn.addActionListener(ev -> {
            fadeAlpha -= 0.05f;
            fade.setAlpha(fadeAlpha);

            if (fadeAlpha <= 0f) {
                fadeIn.stop();
                fade.setVisible(false);
            }
        });

        fadeIn.start();
    }
}
