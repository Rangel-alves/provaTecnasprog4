package br.edu.univas.si4.telaprova;

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class TelaProva extends JFrame {
		
		private static final long serialVersionUID = 1L;
		private JPanel Panel = null;
		private JPanel Panel1 = null;
		private JPanel Panel2= null;
		
		public TelaProva(){
			this.setTitle("Prova");
			this.setSize(500, 450);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			addComponents();
			
		}
		
		public void addComponents(){
				
			Panel = new JPanel();
			Panel.setLayout(new BorderLayout());
			this.setContentPane(Panel);
			
			Panel1 = new JPanel();
			Panel1.setBackground(Color.GRAY);
			Panel1.setPreferredSize(new Dimension(150,200));
			Panel.add(Panel1,BorderLayout.WEST);
			
			JButton button1 = new JButton();
			button1.setText("Botão 1");
			button1.setPreferredSize(new Dimension(80,40));
			Panel1.add(button1);
			
			JButton button2 = new JButton();
			button2.setText("Botão 2");
			button2.setPreferredSize(new Dimension(80,40));
			Panel1.add(button2);
			
			JButton button3 = new JButton();
			button3.setText("Botão 3");
			button3.setPreferredSize(new Dimension(80,40));
			Panel1.add(button3);
			
			JButton button4 = new JButton();
			button4.setText("Botão 4");
			button4.setPreferredSize(new Dimension(80,40));
			Panel1.add(button4);
			
			JButton button5 = new JButton();
			button5.setText("Botão 5");
			button5.setPreferredSize(new Dimension(80,40));
			Panel1.add(button5);
			
			JButton button6 = new JButton();
			button6.setText("Botão 6");
			button6.setPreferredSize(new Dimension(80,40));
			Panel1.add(button6);
					
			JButton button7 = new JButton();
			button7.setText("Botão 7");
			button7.setPreferredSize(new Dimension(80,40));
			Panel1.add(button7);
			
			JButton button8 = new JButton();
			button8.setText("Botão 8");
			button8.setPreferredSize(new Dimension(80,40));
			Panel1.add(button8);
			
			JButton button9 = new JButton();
			button9.setText("Botão 9");
			button9.setPreferredSize(new Dimension(80,40));
			Panel1.add(button9);
			
			JButton button10 = new JButton();
			button10.setText("Botão 10");
			button10.setPreferredSize(new Dimension(80,40));
			Panel1.add(button10);
			
			Panel2= new JPanel();
			
					
			Panel2 = new JPanel();
			Panel2.setBackground(Color.WHITE);
			Panel2.setPreferredSize(new Dimension(150,200));
			Panel.add(Panel2,BorderLayout.CENTER);
			
			JLabel labNome = new JLabel();
			labNome.setText("Nome:  ");
			labNome.setPreferredSize(new Dimension(100, 200) );
			Panel2.add(labNome);
			
			JTextField textNome = new JTextField();
			textNome.setPreferredSize(new Dimension(200,20));
			Panel2.add(textNome);
			
			JLabel labEmail = new JLabel();
			labEmail.setText("Email:  ");
			labEmail.setPreferredSize(new Dimension(100, 200) );
			Panel2.add(labEmail);
			
			JTextField textEmail = new JTextField();
			textEmail.setPreferredSize(new Dimension(200,20));
			Panel2.add(textEmail);
			
			JButton salvar =  new JButton();
			salvar.setText("salvar");
			salvar.setPreferredSize(new Dimension(100, 200));
			Panel2.add(salvar);
			
			
		}

	}

