package br.com.polimorfismo.view;

import javax.swing.JOptionPane;

public class View {
	
	public  static short numero(String msg) {
		return Short.parseShort(texto(msg));
	}

	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}

	public static boolean logico(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION) == 0) {
			return true;
		}
		return false;
	}
	
}
