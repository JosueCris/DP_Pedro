package Examen;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pedro Diaz
 */

import java.awt.*;
import java.awt.event.*;

public class CristianC extends Frame implements ItemListener, ActionListener{
    Label lcantidad, lprecio, ldescuento, ltotal;
    TextField tcantidad,tprecio, ttotal;
    List xdescuento, xarticulos;
    Button button;
    int precio;
    
    public CristianC(){
        super("Precios");
        setLayout(null);
        setVisible(true);
        setSize(500,300);
    }
    
    public void pantalla(){

        ldescuento = new Label("Descuento: ");
        ldescuento.setBounds(25,30,90,30);
        add(ldescuento);
        
        lprecio = new Label("Precio: ");
        lprecio.setBounds(250,90,60,50);
        add(lprecio);

        tprecio = new TextField();
        tprecio.setBounds(350,90,90,20);
        add(tprecio);

        ldescuento = new Label("Productos: ");
        ldescuento.setBounds(150,30,90,30);
        add(ldescuento);

        lcantidad = new Label("Cantidad: ");
        lcantidad.setBounds(250,40,60,50);
        add(lcantidad);

        tcantidad = new TextField();
        tcantidad.setBounds(350,40,90,20);
        add(tcantidad);

        ltotal = new Label("Total: ");
        ltotal.setBounds(250,210,60,50);
        add(ltotal);

        ttotal = new TextField();
        ttotal.setBounds(350,210,90,20);
        add(ttotal);

        xdescuento = new List();
        xdescuento.setBounds(30,60,30,100);
        xdescuento.add("00");
        xdescuento.add("10");
        xdescuento.add("20");
        xdescuento.add("30");
        xdescuento.select(0);
        add(xdescuento);

        xarticulos = new List();
        xarticulos.setBounds(125,60,70,100);
        xarticulos.add("Pantalon");
        xarticulos.add("Camisa");
        xarticulos.add("Cinturon");
        xarticulos.select(0);
        add(xarticulos);

        button = new Button("Cuenta");
        button.setBounds(300,140,75,35);
        add(button);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
        }
    } );  
        
    }
    
    public void itemStateChanged(ItemEvent e){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int precio, cantidad, total=0, descuento;
        if (e.getSource() == button) {
            precio = Integer.parseInt(tprecio.getText());
            cantidad = Integer.parseInt(tcantidad.getText());
            descuento = Integer.parseInt(xdescuento.getSelectedItem());
            if(descuento == 10) {
                total = (((precio*cantidad)*10)/100);
                ttotal.setText(String.valueOf(total));
                ttotal.setEditable(false);
            }else {
                if (descuento == 20) {
                    total = (((precio * cantidad) * 20) / 100);
                    ttotal.setText(String.valueOf(total));
                    ttotal.setEditable(false);
                } else {
                    if (descuento == 30) {
                        total = (((precio * cantidad) * 30) / 100);
                        ttotal.setText(String.valueOf(total));
                        ttotal.setEditable(false);
                    } else if (descuento == 00) {
                        total = (precio * cantidad);
                        ttotal.setText(String.valueOf(total));
                        ttotal.setEditable(false);
                    }
                }
            }

        }else
            return;
    }
    
    public static void main(String[] args) {
        CristianC xx = new CristianC();
        xx.pantalla();

    }
    
    
}
