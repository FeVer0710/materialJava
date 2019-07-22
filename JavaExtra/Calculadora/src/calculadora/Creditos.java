package calculadora;

import java.awt.Desktop;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

public class Creditos extends JDialog {

    private static Creditos creditos;

    public static void main(String args[]) {
        new Creditos(null);
    }

    public static void Generar(Frame parent) {
        if (creditos != null) {
            creditos.dispose();
            creditos = null;
        }
        creditos = new Creditos(parent);
    }

    private Creditos(Frame parent) {
        super(parent);
        setTitle("Creditos");
        initComponents();
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        jButton1.setFocusable(false);
        jButton2.setFocusable(false);
        new Thread() {
            @Override
            public void run() {
                try {
                    jLabel1.setText("Leyendo imagen");
                    jLabel2.setText("Leyendo imagen");
                    try {
                        ImageIcon icon = new ImageIcon(new URL("https://image.ibb.co/ie20io/load.gif"));
                        jLabel1.setIcon(icon);
                        jLabel2.setIcon(icon);
                    } catch (Exception e) {
                    }
                    {
                        String URLLogoJeffAporta = "https://docs.google.com/drawings/d/e/2PACX-1vQ4bebmHUan3es_6"
                                + "PxZWKJooQmno9L2aQeu-6ldc9_SnV8TOEBcqcjFIRsEmiXM9WQlVDkzglIg2Yaz/pub?w=672&h=683";
                        BufferedImage logoJeffAporta = ImageIO.read(new URL(URLLogoJeffAporta));
                        BufferedImage iconJeff = new BufferedImage(300, 300, 2);
                        Ajuste_Ajustar(logoJeffAporta, iconJeff);
                        jLabel1.setIcon(new ImageIcon(iconJeff));
                        jLabel1.setText("");
                    }
                    {
                        String URLLogoSerie = "https://docs.google.com/drawings/d/e/2PACX-1vTeqBGBxlxTHxa1GLkDVrTgmnhfuj"
                                + "KyxSgQ-pa0ZZELZx9Q9mjcGqp71gS6diuzfl_Idoay7beyr5iL/pub?w=300&h=375";
                        BufferedImage logoSerieTutorial = ImageIO.read(new URL(URLLogoSerie));
                        BufferedImage iconSerie = new BufferedImage(300, 300, 2);
                        Ajuste_Ajustar(logoSerieTutorial, iconSerie);
                        jLabel2.setIcon(new ImageIcon(iconSerie));
                        jLabel2.setText("");
                    }
                } catch (Exception ex) {
                    jLabel1.setText("Error");
                    jLabel2.setText("Error");
                }
            }
        }.start();
        setVisible(true);
    }

    public static boolean Abrir_URL_EnNavegador(String Dirección) {
        try {
            Desktop dk = Desktop.getDesktop();
            dk.browse(new URI(Dirección));
            return true;
        } catch (Exception e) {
            System.out.println("Error al abrir URL: " + Dirección + "\n" + e.getMessage());
        }
        return false;
    }

    public static void Ajuste_Ajustar(BufferedImage ImagenRelleno, BufferedImage ImagenÁrea) {
        Ajuste_Ajustar(ImagenRelleno, ImagenÁrea, Dupla.MEDIO, Dupla.MEDIO, false);
    }

    public static void Ajuste_Ajustar(BufferedImage ImagenRelleno, BufferedImage ImagenÁrea, byte AlinH, byte AlinV, boolean ConservarPixeles) {
        Dupla ProporcionEscalación = new Dupla(ImagenÁrea).Dividir(ImagenRelleno);
        double Proporción;
        if (ImagenÁrea.getWidth() < ImagenÁrea.getHeight()) {
            Proporción = ProporcionEscalación.X;
            if (ImagenRelleno.getHeight() * Proporción > ImagenÁrea.getHeight()) {
                Proporción = ProporcionEscalación.Y;
            }
        } else {
            Proporción = ProporcionEscalación.Y;
            if (ImagenRelleno.getWidth() * Proporción > ImagenÁrea.getWidth()) {
                Proporción = ProporcionEscalación.X;
            }
        }
        Graphics2D g = ImagenÁrea.createGraphics();
        if (!ConservarPixeles) {
            g.setRenderingHint(
                    RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR
            );
        }
        Dupla pos = Dupla.Alinear(
                ImagenÁrea, new Dupla(ImagenRelleno).Escalar(Proporción), AlinH, AlinV
        );
        g.drawImage(
                ImagenRelleno,
                new AffineTransform(
                        Proporción, 0,
                        0, Proporción,
                        pos.X, pos.Y
                ), null
        );
    }

    final static class Dupla {

        double X;
        double Y;

        public final static byte ARRIBA = 0, MEDIO = 1, ABAJO = 2, IZQUIERDA = 3, DERECHA = 4;

        public Dupla(double X, double Y) {
            this.X = X;
            this.Y = Y;
        }

        public Dupla(Object o) {
            if (o instanceof BufferedImage) {
                BufferedImage bi = ((BufferedImage) o);
                ReemplazarXY(bi.getWidth(), bi.getHeight());
                return;
            }
            if (o instanceof Dupla) {
                Dupla d = ((Dupla) o);
                ReemplazarXY(d.X, d.Y);
                return;
            }
            if (o instanceof Number) {
                Number n = ((Number) o);
                ReemplazarXY(n.doubleValue(), n.doubleValue());
                return;
            }
        }

        public Dupla ReemplazarXY(double nuevoX, double nuevoY) {
            X = nuevoX;
            Y = nuevoY;
            return this;
        }

        public Dupla Dividir(Object obj) {
            Dupla dupla = new Dupla(obj);
            X /= dupla.X;
            Y /= dupla.Y;
            return this;
        }

        public Dupla Escalar(Object obj) {
            Dupla dupla = new Dupla(obj);
            X *= dupla.X;
            Y *= dupla.Y;
            return this;
        }

        public Dupla Sustraer(Object obj) {
            Dupla dupla = new Dupla(obj);
            X -= dupla.X;
            Y -= dupla.Y;
            return this;
        }

        public static Dupla Alinear(Object DimEnvolvente, Object DimMenor, byte AlineaciónH, byte AlineaciónV) {
            Dupla DuplaEnvolvente = new Dupla(DimEnvolvente).Sustraer(new Dupla(DimMenor));
            return new Dupla(
                    AlineaciónH == DERECHA ? DuplaEnvolvente.X : AlineaciónH == MEDIO ? DuplaEnvolvente.X / 2 : 0,
                    AlineaciónV == ABAJO ? DuplaEnvolvente.Y : AlineaciónV == MEDIO ? DuplaEnvolvente.Y / 2 : 0
            );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Abrir página");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Abrir tutorial para realizar este software");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Abrir_URL_EnNavegador("http://www.youtube.com/c/JeffAporta");
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Abrir_URL_EnNavegador("https://www.youtube.com/playlist?list=PLiIlurK9UKZRguw6XLK_HR9TJUefQV_QY");
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
