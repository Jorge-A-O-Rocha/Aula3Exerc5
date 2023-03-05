package view;

import javax.swing.JOptionPane;

import controller.modulos;

public class principal {

	public static void main(String[] args) {
		modulos mod = new modulos();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número "));
		while(x >20 || x < 1 ) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número menor que 20 "));
		}
		int res = mod.fibo(x);
		System.out.println(res);

	}

}
