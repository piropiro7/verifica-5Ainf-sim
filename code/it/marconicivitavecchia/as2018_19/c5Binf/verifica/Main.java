
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(600,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder("<html>");
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<h1><b>Formula 1 Passion</b></h1>");
		sb.append("<div style='' >");
		sb.append("<div style='display:table-row>'");
		sb.append("<div style='display:table-row-cell'>");
		sb.append("Pilota");
		sb.append("</div>");
		sb.append("<div style='display:table-row-cell'>");
		sb.append("Punteggio");
		sb.append("</div>");
		sb.append("<div style='display:table-row-cell'>");
		sb.append("HAMILTON L.");
		sb.append("</div>");
		sb.append("<div style='display:table-row-cell'>");
		sb.append("358");
		sb.append("</div>");
		sb.append("<div style='display:table-row-cell'>");
		sb.append("VETTEL S.");
		sb.append("</div>");
		sb.append("<div style='display:table-row-cell'>");
		sb.append("294");
		sb.append("</div>");
		sb.append("<div style='display:table-row-cell'>");
		sb.append("RAIKKONEN K.");
		sb.append("</div>");
		sb.append("<div style='display:table-row-cell'>");
		sb.append("236");
		sb.append("</div>");
		
        sb.append("</div>");
		sb.append("</html>");
		// TODO Convertire lo StringBuilder in String
		String str = sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(str));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

