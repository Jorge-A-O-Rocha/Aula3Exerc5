package controller;

public class modulos {
	public modulos() {
		super();
	}
	
    public int fibo(int x) {
    	// Condição de parada é quando chega em 1 ou 2, nas duas chamadas das recursiva,  se for maior que 2 segue chamando a função
    	if (x == 1) {
            return 1;
        } else if (x == 2) {
            return 1;
        } else {
        	// a função chama o valor de x e poe ma formula Fib(x-1) + Fib(x-2)
            return fibo(x - 1) + fibo(x - 2);
        }
    }

}
