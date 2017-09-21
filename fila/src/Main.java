import java.util.Scanner;
/**
 *
 * @author Felipe
 */

class Menu{
    public void array(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o tamanho inicial da Fila (maior que zero):");
        int n = s.nextInt();
        System.out.println("Digite o tipo de operação\nZero para duplicação e os demais valores positivos para incremento:");
        int op = s.nextInt();
        FilaArray f = new FilaArray(n, op);
        boolean loop2 = true;
        int escolha2;
        while(loop2){
            System.out.println("Escolha a Opção:\n1 - Enfileirar\n2 - Início\n3 - Desenfileirar\n4 - Listar\n0 - Sair");
            escolha2 = s.nextInt();
            switch(escolha2){
                case 1:
                    System.out.println("Digite o valor a ser inserido:");
                    Object o = (Object)s.next();
                    f.enfileirar(o);
                    System.out.println("Valor inserido." + "\n");
                    break;
                case 2:
                    try{
                        System.out.println("Top: " + f.inicio() + "\n");
                    }catch(EFilaVazia e){
                        System.err.println(e.getMessage() + "\n");
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Valor retirado: " + f.desenfileirar() + "\n");
                    }catch(EFilaVazia e){
                        System.err.println(e.getMessage() + "\n");
                    }                    
                    break;
                case 4:
                    System.out.println(f + "\n");
                    break;
                case 0:
                    System.out.println("Voltando a menu principal." + "\n");
                    loop2 = false;
                    break;
                default:
                    System.out.println("Valor inválido, digite novamente." + "\n");
                    break;
            }   
        }
    }

    public void lista(){
        FilaListaEncadeada f = new FilaListaEncadeada();
        Scanner s = new Scanner(System.in);
        boolean loop2 = true;
        int escolha2;
        while(loop2){
            System.out.println("Escolha a Opção:\n1 - Enfileirar\n2 - Início\n3 - Desenfileirar\n4 - Listar\n0 - Sair");
            escolha2 = s.nextInt();
            switch(escolha2){
                case 1:
                    System.out.println("Digite o valor a ser inserido:");
                    Object o = (Object)s.next();
                    f.enfileirar(o);
                    System.out.println("Valor inserido." + "\n");
                    break;
                case 2:
                    try{
                        System.out.println("Top: " + f.inicio() + "\n");
                    }catch(EFilaVazia e){
                        System.err.println(e.getMessage() + "\n");
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Valor retirado: " + f.desenfileirar() + "\n");
                    }catch(EFilaVazia e){
                        System.err.println(e.getMessage() + "\n");
                    }                    
                    break;
                case 4:
                    System.out.println(f + "\n");
                    break;
                case 0:
                    System.out.println("Voltando a menu principal." + "\n");
                    loop2 = false;
                    break;
                default:
                    System.out.println("Valor inválido, digite novamente." + "\n");
                    break;
            }   
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean loop = true;
        Scanner s = new Scanner(System.in);
        int escolha;
        while(loop){
            System.out.println("Selecione o tipo de Fila\nArray = 1\nLista Encadeada = 2\nSair = 0");
            escolha = s.nextInt();
            switch(escolha){
                case 1:
                    menu.array();
                    break;
                case 2:
                    menu.lista();
                    break;
                case 0:
                    System.out.println("Sair." + "\n");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção Inválida. Tente novamente." + "\n");
                    break;
            }
        }
    }
}
