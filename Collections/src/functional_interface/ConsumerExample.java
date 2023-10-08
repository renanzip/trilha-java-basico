package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Utilizando o Consumer com Lambda para ikmpressão de números pares
        // Consumer<Integer> imprimirNumerosPares = numero ->{
        //     if(numero % 2 == 0){
        //         System.out.println(numero);
        //     }
        // };

        //Imprimindo via consumer
        // numeros.stream().forEach(new Consumer<Integer>() {
        //     @Override
        //     public void accept(Integer n){
        //         if(n % 2 == 0){
        //             System.out.println(n);
        //         }
        //     }
        // });

        numeros.forEach(n -> {
            if(n % 2 == 0){
                System.out.println(n);
            }
        }
        
        );

    }
}