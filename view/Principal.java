package view;
import br.com.leandrocolevati.pilhalong.Pilha;
import controller.FatController;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) throws Exception {
		FatController fatCon = new FatController();
		
		long valor = Long.parseLong(JOptionPane.showInputDialog("Insira um número: "));
		
		if (valor <= 10) {
			JOptionPane.showMessageDialog(null, fatCon.fatController(valor));	
		}
		else {
			JOptionPane.showMessageDialog(null, "Num invalid");
		}
		
	
	}
}