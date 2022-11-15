package ui;

import modelo.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JanelaPrincipal extends JFrame implements ActionListener {
    String s0 = "";
    String s1 = "";
    String s2 = "";

    JTextField visor = new JTextField("");
    Calculadora c = new Calculadora();

    public JanelaPrincipal(){
        super("Calculadora");
        setBounds(150,150,100,100);
        iniciarLayout();
        pack();
        setVisible(true);

    }
    private void iniciarLayout(){
        visor.setEditable(false);
        visor.setBackground(Color.ORANGE);
        visor.setHorizontalAlignment(JTextField.RIGHT);


        //visor.setHorizontalTextPosition(SwingConstants.RIGHT);
        add(visor, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new GridLayout(6,3));

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton btIgual = new JButton("=");
        btIgual.setBackground(Color.yellow);
        JButton btMais = new JButton("+");
        btMais.setBackground(Color.GREEN);
        JButton btMenos = new JButton("-");
        btMenos.setBackground(Color.GREEN);
        JButton btDividir = new JButton("/");
        btDividir.setBackground(Color.GREEN);
        JButton btMultiplicar = new JButton("*");
        btMultiplicar.setBackground(Color.GREEN);
        JButton btPonto = new JButton(".");
        btPonto.setBackground(Color.GREEN);
        JButton btLimpar = new JButton("CE");
        btLimpar.setBackground(Color.yellow);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.add(b0);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(btIgual);
        panel.add(btMais);
        panel.add(btMenos);
        panel.add(btDividir);
        panel.add(btMultiplicar);
        panel.add(btPonto);
        panel.add(btLimpar);
        add(panel, BorderLayout.CENTER);

        btDividir.addActionListener((this));
        btIgual.addActionListener(this);
        btMais.addActionListener(this);
        btMenos.addActionListener(this);
        btMultiplicar.addActionListener(this);
        btLimpar.addActionListener(this);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        btPonto.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.equalsIgnoreCase("0")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "0";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("1")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "1";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("2")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "2";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("3")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "3";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("4")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "4";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("5")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "5";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("6")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "6";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("7")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "7";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("8")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "8";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("9")){
            String valorAtual = visor.getText();
            valorAtual = valorAtual + "9";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("=")){
            c.setOperador1(Double.parseDouble(s0));
            if(s1.equals("")){
                s1 = visor.getText();
                c.setOperador2(Double.parseDouble(s1));
            }
            c.setOperador2(Double.parseDouble(s1));
            double resultado = c.calcular();
            String tela = Double.toString(resultado);
            visor.setText(tela);
            s0 = visor.getText();
            s1 = "";
        }
        if(s.equalsIgnoreCase("+")){
            c.setOperacao(Calculadora.OPERACAO.ADICAO);
            if(s0.equals("")){
                s0 = visor.getText();
                visor.setText("");
            }else{
                s0 = visor.getText();
                s1.equals(s);
                visor.setText("");
                /*s0 = visor.getText();
                visor.setText("");*/

            }
        }
        if(s.equalsIgnoreCase("-")) {
            c.setOperacao(Calculadora.OPERACAO.SUBTRACAO);

            if (s0.equals("")) {
                s0 = visor.getText();
                visor.setText("");
            }else {
                s0 = visor.getText();
                s1.equals(s);
                visor.setText("");
                /*s0 = s;
                visor.setText("");*/
            }
        }
        if(s.equalsIgnoreCase("/")) {
            c.setOperacao(Calculadora.OPERACAO.DIVISAO);

            if (s0.equals("")) {
                s0 = visor.getText();
                visor.setText("");
            }else {
                s0 = visor.getText();
                s1.equals(s);
                visor.setText("");
            }
        }
        if(s.equalsIgnoreCase("*")) {
            c.setOperacao(Calculadora.OPERACAO.MULTIPLICACAO);

            if (s0.equals("")) {
                s0 = visor.getText();
                visor.setText("");
            }else {
                s0 = visor.getText();
                s1.equals(s);
                visor.setText("");
            }
        }
        if(s.equalsIgnoreCase(".")) {
            String valorAtual = visor.getText();
            valorAtual = valorAtual + ".";
            visor.setText(valorAtual);
        }
        if(s.equalsIgnoreCase("CE")) {
            visor.setText("");
            s0 = "";
            s1 = "";
            c.setOperador1(0);
            c.setOperador2(0);

        }
    }

}
