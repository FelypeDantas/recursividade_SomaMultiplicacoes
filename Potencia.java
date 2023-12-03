package Recursividades;

import javax.swing.JOptionPane;

public class Potencia {
	public static void main(String[] args) {
		int p, i = 1;
		
		p = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
		System.out.println("o valor: " + Somas(p, i));
	}

	//Somas(5) = 1 + 5 * 5
	//Somas(4) = 26 + 4 * 4
	//Somas(3) = 42 + 3 * 3
	//Somas(2) = 51 + 2 * 2
	//Somas(1) = 55;
	private static int Somas(int p, int i) {
		if(p == 1) {
			return i;
		}
		return i + Somas(p-1, p*p);
	}
}
