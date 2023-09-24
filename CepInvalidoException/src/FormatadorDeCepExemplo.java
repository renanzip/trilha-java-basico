public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        
        try{

           String cepFormatado = formatarCep("04939140");
           System.out.println(cepFormatado);
           
        } catch(CepInvalidoException e){
            e.printStackTrace();
            System.out.println("O CEP informado é inválido");
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{

        if(cep.length() != 8)
            throw new CepInvalidoException();

            //exemplo de formatação de cep
            return "04.939-140";
        
    }
    
}
