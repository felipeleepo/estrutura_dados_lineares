/**
 *
 * @author Felipe
 */
public class Main {

    public static void main(String[] args) {
        FilaArray f = new FilaArray(1, 2);

        try {
            f.enfileirar("1");
            f.enfileirar("2");
            System.out.println(f.desenfileirar());
            f.enfileirar("3");
            System.out.println(f);
            /*System.out.println(f.desenfileirar());
            System.out.println(f.desenfileirar());
            System.out.println(f.desenfileirar());*/
           
        } catch (EFilaVazia e) {
            System.out.println(e.getMessage());
        }
    }
}
