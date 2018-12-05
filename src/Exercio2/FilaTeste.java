
package Exercio2;

import java.util.Scanner;

public class FilaTeste {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        Fila fila = new Fila();
        int x = 0;
    
        do {

            /*
        aqui sera pedido para que o usuario informe um numero maior que 0
        e só saira do loop caso o numero informado seja 0 
             */
            System.out.println("Forneça um numero maior que 0");
            x = t.nextInt();

            if (x > 0) {
                Elemento e = new Elemento();
                // intansciado a classe elemento
                e.valor = x;

                //objeto e passa a valer x
                if (fila.primeiroItem == null) {
                    fila.primeiroItem = e;

                } else {
                    e.proximoItem = fila.primeiroItem;
                    fila.primeiroItem = e;
                }

            }
            
            

        } while (x > 0);

        /*
        caso os elemtos inseridos seja 10, 20, 30, 40, 50, 0 ele ira mostrar todos
        em ordem decrecente 50,40,30,20,10  zero não sera mostrado 
         */
        System.out.println("Elementos inseridos");
        Elemento temp = fila.primeiroItem;
        while (temp != null) {
            System.out.println(temp.valor);
            temp = temp.proximoItem;
            

            // dentro desse while sera onde todos os numeros digitados serao imprimidos
               
        }
        

    }
    
    /*
    não consegui implementar a questão 2 b para excluir o primeiro elemento da fila 
    */

}
