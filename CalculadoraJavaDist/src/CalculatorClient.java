import java.awt.Color;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Calculator c = (Calculator) Naming
                    .lookup("//localhost:1020/CalculatorService");
            System.out.println(c.sub(4, 3));
            System.out.println(c.add(4, 5));
            System.out.println(c.mul(3, 6));
            System.out.println(c.div(9, 3));
            
            
            String opcao[] = {"+", "-",
            		"*" , "/"};
            
            		int valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor A: "));
            		int operacao = JOptionPane.showOptionDialog(null, "Escolha uma das operacoes", "Tipo de operacao",           	
            		0,
            		

            		JOptionPane.INFORMATION_MESSAGE, null, opcao,
            		opcao);
            		int valorB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor B: "));
            		 JFrame f= new JFrame("Panel Example");    
            	        JPanel panel=new JPanel();  
            	        panel.setBounds(40,80,200,200);    
            	        panel.setBackground(Color.gray);  
            	        JButton b1=new JButton("+");
            	        JButton b2=new JButton("-");
            	        JButton b3=new JButton("*");
            	        JButton b4=new JButton("/");
            	        b1.("A + B = " + c.add(valorA, valorB));
            		 
            		        JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}