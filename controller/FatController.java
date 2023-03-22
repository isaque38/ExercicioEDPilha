package controller;
import br.com.leandrocolevati.pilhalong.Pilha;

public class FatController {

	public FatController() {
		super();
	}
	
	public long fatController(long valor) throws Exception {
		Pilha pilha = new Pilha();
		
		for (int i = 1; i <= 20; i++) {
			pilha.push(i);
		}
		
		while (pilha.top() > valor) {
			pilha.pop();
		}
		
		while (pilha.size() > 1) {
			long aux1 = pilha.pop();
			long aux2 = pilha.pop();
			long fatorial = aux1 * aux2;
			pilha.push(fatorial);
		}
		
		return pilha.top();
	}
}