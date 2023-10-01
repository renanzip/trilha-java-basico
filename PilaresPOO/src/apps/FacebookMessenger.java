package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Mensagem enviada pelo Facebook");
    }

    @Override
    public void receberMensagem() {
       System.out.println("Mensagem recebida pelo Facebook");

    }

     @Override
    public void salvarHistoricoMensagem() {
       System.out.println("Mensagem salva pelo Facebook");

    }

 
}
