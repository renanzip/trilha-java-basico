package apps;
public class Telegram extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Mensagem enviada pelo Telegram");
    }

    @Override
    public void receberMensagem() {
       System.out.println("Mensagem recebida pelo Telegram");
    }

    @Override
    public void salvarHistoricoMensagem() {
       System.out.println("Mensagem salva pelo Telegram");

    }
}
