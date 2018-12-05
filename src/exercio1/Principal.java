package exercio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();
        ArrayList<String> itemsDaLista = new  ArrayList<>();
         

        Pessoa pessoa = new Pessoa();

        String opcao = "sim";
        JOptionPane.showMessageDialog(null, "Bem vindo ao cadastro");
        do {

            pessoa.nome = JOptionPane.showInputDialog("Digite seu Nome: ");
            pessoa.idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
 
            opcao = JOptionPane.showInputDialog("deseja informar uma nova pessoa na lista: sim ou nao ");

            itemsDaLista.add(pessoa.nome);
            
         

        } while (opcao.equalsIgnoreCase("sim"));

        System.out.println("pessoas cadastradas");
        int n = itemsDaLista.size();
        for (int i = 0; i < n; i++) {
            System.out.println(itemsDaLista.get(i));

         
            JOptionPane.showMessageDialog(null,itemsDaLista.get(i));

        }

    }

}
