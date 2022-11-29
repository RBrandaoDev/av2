

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Questao01 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        Stack <String> pilha = new Stack();


        scanner = new Scanner(new File("D:\\Projetos\\ExemplosEstruturaDados\\EstruturaDDS\\av2\\nomes.txt"));
        while (scanner.hasNextLine()) {
            pilha.push(scanner.nextLine());
        }
        System.out.println(" importação com exito. Tamanho da Pilha " + pilha.size());    
       
       System.out.println("### Rotina a executar ###");
      
       Queue<String> q = new LinkedList<>();
       
         for (int i = 0; i < 80; i++){
             q.add(pilha.pop());             
         }  
         
         System.out.println(" Nomes"); 
         q.forEach(System.out::println);
    }
 }
