package view;

import javax.swing.JOptionPane;

public class View {
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}

	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}

	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}

	public static boolean logico(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION) == 0) {
			return true;
		} else {
			return false;
		}
	}


}
