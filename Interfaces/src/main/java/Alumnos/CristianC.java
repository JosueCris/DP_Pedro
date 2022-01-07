package Alumnos;
/*
 * @author Pedro Diaz
 */

import java.awt.*;
import java.awt.event.*;
        
public class CristianC extends Frame implements ItemListener, ActionListener {
    Label ln1,ln2,ln3,lresul;
    TextField tn1,tn2,tn3,tresul;
    Button btnsuma, btnmayor, btnmenor, btnsalir;
    Choice menu;
    int n1,n2,n3, mayor, menor, suma, resul;
    
    public CristianC(){
        super("Examen");
        setLayout(null);
        setVisible(true);
        setSize(300,250);
    }
    
    public void alta(){
       
        ln1 = new Label("Numero 1: ");
        ln1.setBounds(30,35,70,30);

        add(ln1);

        ln2 = new Label("Numero 2: ");
        ln2.setBounds(30,75,70,30);
        add(ln2);

        ln3 = new Label("Numero 3: ");
        ln3.setBounds(30,115,70,30);
        add(ln3);      
        
        lresul = new Label("Resultado: ");
        lresul.setBounds(30,155,70,30);
        add(lresul);      


        tn1 = new TextField();
        tn1.setBounds(100,40,40,20);
        tn1.setBackground(Color.GREEN);
        add(tn1);
        
        tn2 = new TextField();
        tn2.setBounds(100,80,40,20);
        tn2.setBackground(Color.GREEN);
        add(tn2);
        
        tn3 = new TextField();
        tn3.setBounds(100,120,40,20);
        tn3.setBackground(Color.GREEN);
        add(tn3);

        tresul = new TextField();
        tresul.setBounds(100,160,40,20);
        tresul.setBackground(Color.ORANGE);
        add(tresul);

        btnsuma = new Button("Suma");
        btnsuma.addActionListener(this);
        btnsuma.setBounds(200,35,70,30);
        add(btnsuma);

        btnmayor = new Button("Mayor");
        btnmayor.addActionListener(this);
        btnmayor.setBounds(200,75,70,30);
        add(btnmayor);

        btnmenor = new Button("Menor");
        btnmenor.addActionListener(this);
        btnmenor.setBounds(200,115,70,30);
        add(btnmenor);

        btnsalir = new Button("Salir");
        btnsalir.addActionListener(this);
        btnsalir.setBounds(200,155,70,30);
        add(btnsalir);

        // Declarar el choice
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
              // Codigo a ejecutar al cerrar la ventana
               System.exit(0);
        }
    } );   
    }
    
    
    
    public static void main(String[] args) {
        CristianC xx = new CristianC();
        xx.alta();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1, num2, num3, result = 0;
        if (e.getSource() == btnsalir)
            System.exit(0);
        else {
            if (e.getSource() == btnsuma) {
                num1 = Integer.parseInt(tn1.getText());
                num2 = Integer.parseInt(tn2.getText());
                num3 = Integer.parseInt(tn3.getText());
                result = num1 + num2 + num3;
                tresul.setEditable(false);
                tresul.setText(String.valueOf(result));
            }
            else {
                if (e.getSource() == btnmayor) {
                    num1 = Integer.parseInt(tn1.getText());
                    num2 = Integer.parseInt(tn2.getText());
                    num3 = Integer.parseInt(tn3.getText());
                    if(num1>num2 && num1>num3)
                        tresul.setText(String.valueOf(num1));
                    else {
                        if(num2>num1 && num2>num3)
                            tresul.setText(String.valueOf(num2));
                        else {
                            if(num3>num1 && num3>num2)
                                tresul.setText(String.valueOf(num3));
                        }
                    }
                    tresul.setEditable(false);
                }
                else {
                    if (e.getSource() == btnmenor) {
                        num1 = Integer.parseInt(tn1.getText());
                        num2 = Integer.parseInt(tn2.getText());
                        num3 = Integer.parseInt(tn3.getText());
                        if (num1 < num2 && num1 < num3)
                            tresul.setText(String.valueOf(num1));
                        else {
                            if (num2 < num1 && num2 < num3)
                                tresul.setText(String.valueOf(num2));
                            else {
                                if (num3 < num1 && num3 < num2)
                                    tresul.setText(String.valueOf(num3));
                            }
                        }
                        tresul.setEditable(false);
                    }
                }
            }
        }

    }
}
