/*
 * Clase para el Manejo del Panel en la Gui
 */
package gnz.frontend;

import gnz.backend.Matriz.ManejadorMatriz;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import javax.swing.JPanel;

/**
 *
 * @author jesfrin
 */
public class ManejadorDePanel {

    //Colores disponibles
    public static Color COLOR_LISO = Color.GREEN;
    public static Color COLOR_RUGOSO = Color.DARK_GRAY;
    public static Color COLOR_SIN_SUPERFICIE = new Color(encontrarHexadecimal("EEEEEE"));
    public static Color COLOR_PARED = Color.BLACK;

    //Velocidades segun los colores
    public static int VELOCIDAD_LISO = 10;
    public static int VELOCIDAD_SIN_SUPERFICIE = 8;
    public static int VELOCIDAD_RUGOSO = 3;
    public static int VELOCIDAD_PARED = 0;

    private ManejadorMatriz manMatriz;
    private FrameOM frame;
    private int numeroDeCuadros;
    private Graphics2D g;

    public ManejadorDePanel(FrameOM frame, int numeroDeCuadros) {
        this.frame = frame;
        this.numeroDeCuadros = numeroDeCuadros;
        this.manMatriz = new ManejadorMatriz(numeroDeCuadros);

    }

    public void pintarCuadricula(Graphics g) {
        g.setColor(Color.GRAY);
        int longitudDeCuadro = ManejadorMatriz.LONGITUD_PANEL / numeroDeCuadros;
        for (int x = 0; x <= ManejadorMatriz.LONGITUD_PANEL; x += longitudDeCuadro) {
            g.drawLine(x, 0, x, ManejadorMatriz.ALTITUD_PANEL);
        }
        for (int y = 0; y <= ManejadorMatriz.ALTITUD_PANEL; y += longitudDeCuadro) {
            g.drawLine(0, y, ManejadorMatriz.LONGITUD_PANEL, y);
        }
    }

    public void dibujarCuadriculaDeMatriz(ManejadorMatriz manMatriz, JPanel panel) {
        this.manMatriz = manMatriz;
        this.manMatriz.pintarCuadrosDeMatriz(g);
        this.numeroDeCuadros = this.manMatriz.getNumeroDeCuadros();
        pintarCuadricula(g);

    }

    public void accionParaClick(MouseEvent evt, Color color) {
        g = (Graphics2D) ((JPanel) evt.getSource()).getGraphics();
        this.manMatriz.pintarPared(evt.getX(), evt.getY(), g, color);
        System.out.println(evt.getX() + " " + evt.getY());
        pintarCuadricula(g);
        double n = (ManejadorMatriz.LONGITUD_REALCM + 0.0) / (ManejadorMatriz.LONGITUD_PANEL + 0.0);
        DecimalFormat df = new DecimalFormat("#");
        String texto = "Coordenada x:" + df.format((n * evt.getX())) + " Coordenada y:" + df.format(n * evt.getY());
        this.frame.cambiarTextoDeCoordenadas(texto);
    }

    public void accionParaMouseDragged(MouseEvent e, Color color) {
        g = (Graphics2D) ((JPanel) e.getSource()).getGraphics();
        this.manMatriz.pintarPared(e.getX(), e.getY(), g, color);
        System.out.println(e.getX() + " " + e.getY());
        double n = (ManejadorMatriz.LONGITUD_REALCM + 0.0) / (ManejadorMatriz.LONGITUD_PANEL + 0.0);
        DecimalFormat df = new DecimalFormat("#");
        String texto = "Coordenada x:" + df.format((n * e.getX())) + " Coordenada y:" + df.format(n * e.getY());
        this.frame.cambiarTextoDeCoordenadas(texto);
        pintarCuadricula(g);

    }
    
    private static int encontrarHexadecimal(String color){
        return Integer.parseInt(color, 16);
    }

    public int getNumeroDeCuadros() {
        return numeroDeCuadros;
    }

    public void setNumeroDeCuadros(int numeroDeCuadros) {
        this.numeroDeCuadros = numeroDeCuadros;
    }

    public ManejadorMatriz getManMatriz() {
        return manMatriz;
    }

    public void setManMatriz(ManejadorMatriz manMatriz) {
        this.manMatriz = manMatriz;
    }

    /*agregamos metodos get y set de Graphic2D*/
    public Graphics2D getG() {
        return g;
    }

    public void setG(Graphics2D g) {
        this.g = g;
    }

}
