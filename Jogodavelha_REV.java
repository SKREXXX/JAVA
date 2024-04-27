
package jogodavelha;
 //* @author Natan
     import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jogo extends JFrame{
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JLabel l1;
    private Dimension dim;
    private Font f;

        public Jogo(){
            dim = new Dimension (90,90);
            setTitle("Jogo da Velha");
            setBounds(300,160,400,450);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            getContentPane().setBackground(new Color (197,197,197));
            setLayout(null);

            f = new Font("Tahoma",Font.ITALIC,17);
            setFont(f);

            JMenuBar mbar = new JMenuBar();
            JMenu opcoes = new JMenu("Opções");
            JMenu sair = new JMenu("Sair");

            JMenuItem sMim = new JMenuItem("Sobre mim");
            JMenuItem sprogram = new JMenuItem("Sobre o Programa");

            opcoes.add(sMim);
            opcoes.add(sprogram);

            mbar.add(opcoes);
            mbar.add(sair);

            setJMenuBar(mbar);

            l1 = new JLabel();
            l1.setText("Gabriel Ozzy Santos");
            l1.setBounds(130,10,200,30);
            l1.setFont(f);
            this.add(l1);

                b1 = new JButton();
                b1.setSize(dim);
                b1.setLocation(30,50);
                this.add(b1);

                b2 = new JButton();
                b2.setSize(dim);
                b2.setLocation(150,50);
                this.add(b2);

                b3 = new JButton();
                b3.setSize(dim);
                b3.setLocation(270,50);
                this.add(b3);

                b4 = new JButton();
                b4.setSize(dim);
                b4.setLocation(30,170);
                this.add(b4);

                b5 = new JButton();
                b5.setSize(dim);
                b5.setLocation(150,170);
                this.add(b5);

                b6 = new JButton();
                b6.setSize(dim);
                b6.setLocation(270,170);
                this.add(b6);

                b7 = new JButton();
                b7.setSize(dim);
                b7.setLocation(30,290);
                this.add(b7);

                b8 = new JButton();
                b8.setSize(dim);
                b8.setLocation(150,290);
                this.add(b8);

                b9 = new JButton();
                b9.setSize(dim);
                b9.setLocation(270,290);
                this.add(b9);
        }
        public static void main (String [] args){
            new Jogo().setVisible(true);
        }
}