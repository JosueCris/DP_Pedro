package Alumnos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CristianA extends Frame implements ActionListener{
	Label lbl;

	public CristianA(){
		super("Examen A");
		setLayout(null);
		setVisible(false);

		try{
			Button button = new Button("Hola arriba");
			button.setBounds(48,36,80,20);
			button.addActionListener(this);
			add(button);

			Button button1 = new Button("Hola abajo");
			button1.addActionListener(this);
			button1.setBounds(48,66,80,20);
			add(button1);

			lbl = new Label("Ejemplo Botones");
			//lbl.addActionListener(this);
			lbl.setBounds(48,96,80,20);
			add(lbl);

			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					System.exit(0);
				}
			});
		} catch (Exception e){}

		setSize(200,200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		Button bt = (Button)e.getSource();
		String str = bt.getLabel();
		lbl.setText(str);
	}

	public static void main(String argv[]){
		CristianA t = new CristianA();
	}
}




