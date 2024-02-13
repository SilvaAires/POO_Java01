package MSN;

import MSN.App.Face;
import MSN.App.Heranca;
import MSN.App.MSNMessenger;
import MSN.App.Telegram;

public class ComputadorPedrinho {
public static void main(String[] args) {
		
		Heranca smi = null;
		
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new Face();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
