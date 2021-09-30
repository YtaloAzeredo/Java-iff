package Adivinhe;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adivinhe extends JFrame
{


    int valAleatorio = gerarValor(), valAntigo = 100000000;

    public int gerarValor() {
        return (int)(Math.random() * 100);
    }

    public int perto(JTextField caixa1) {
        int valInput =  Integer.parseInt(caixa1.getText());
        int diff = Math.abs(valInput - valAleatorio);

        if (valInput == valAleatorio) {
            return 2;
        }
        else if (diff <= valAntigo && valInput <= 100 && valInput >= 1) {
            valAntigo = diff;
            return 1;
        }
        else {
            valAntigo = diff;
            return 0;
        }
    }

    public Adivinhe()
    {	this.setTitle("Adivinhe");
        this.setSize(380,120);
        this.setVisible(true);
        this.setResizable(false);

        Container c = this.getContentPane();

        JPanel painel = new JPanel();
        c.add(painel);

        JLabel valor1 = new JLabel("Eu tenho um número entre 1 e 100,\r\n"
                + " você pode adivinhá-lo? Entre com seu chute!");
        valor1.setToolTipText("valor 1");
        painel.add(valor1);

        JTextField caixa1 = new JTextField(25);
        painel.add(caixa1);

        JButton botao1 = new JButton("Verificar");
        JButton botao2 = new JButton("Criar novo jogo");

        painel.add(botao1);
        painel.add(botao2);

        botao1.addActionListener(new ActionListener()
        {	public void actionPerformed(ActionEvent e)
        {

            int resultado = perto(caixa1);
            if (resultado == 2) {
                caixa1.setEditable(false);
                JOptionPane.showMessageDialog (null, "Parabéns! Você acertou!");
            }
            else if (resultado == 1) {
                painel.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, "Mais perto");
            }
            else {
                painel.setBackground(Color.BLUE);
                JOptionPane.showMessageDialog(null, "Mais longe");
            }

        }});

        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valAleatorio = gerarValor();
                valAntigo = 100000000;
                caixa1.setEditable(true);
                caixa1.setText("");
                painel.setBackground(Color.GRAY);
        }});

        this.setVisible(true);
        this.repaint();
        painel.setBackground(Color.GRAY);
        setLocationRelativeTo(null);
    }
}