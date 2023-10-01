import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class PCRenan {
    public static void main(String[] args) {
        
        // FacebookMessenger facebookMessenger = new FacebookMessenger();
        // facebookMessenger.enviarMensagem();

        // MSNMessenger msn = new MSNMessenger();       
        // msn.enviarMensagem();

        // Telegram telegram = new Telegram();
        // telegram.enviarMensagem();

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "telegram";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("telegram")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
        smi.salvarHistoricoMensagem();
       
    }
    
}
