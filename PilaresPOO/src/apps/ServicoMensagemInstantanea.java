package apps;
public abstract class ServicoMensagemInstantanea {

    // Início de Sem abstração--------------------------

    /* 
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem");
        salvarHistoticoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida");
    }

    // Métodos visiveis somente na classe    
    private void validarConexao() {
        System.out.println("Conectado à Internet.");
    }

    private void salvarHistoticoMensagem() {
        System.out.println("Backup realizado");
    }

    */
    // Fim de sem abstração-------------------------------


    // Com abstração

    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMensagem();

    // somente os filhos conhecem estes métodos
    protected void validarConexaoInternet(){
        System.out.println("Conectado à internet");
    }

}
