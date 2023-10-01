package apps;
public class MSNMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Mensagem enviada pelo MSN");
    }

    @Override
    public void receberMensagem() {
       System.out.println("Mensagem recebida pelo MSN");
    }


    @Override
    public void salvarHistoricoMensagem() {
       System.out.println("Mensagem salva pelo MSN");

    }
    
}
