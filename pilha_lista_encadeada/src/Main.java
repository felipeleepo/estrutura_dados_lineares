//import PilhaListaEncadeada;
//import EPilhaVazia;

/**
 *
 * @author Felipe
 */
public class Main {

    public static void main(String[] args) {
       PilhaListaEncadeada s = new PilhaListaEncadeada();

        try {
            s.push(5);
            //s.toString2();
            s.push(3);
            // s.toString2();
            System.out.println("Pop: " + s.pop());
            System.out.println("Pop: " + s.pop());
            /*System.out.println("size: " + s.size());
            s.push(2);
            s.push(8);
            System.out.println("Pop: " +s.pop());
            System.out.println("Pop: " +s.pop());
            s.push(9);
            s.push(1);
            System.out.println("Pop: " +s.pop());
            s.push(7);*/
           /* s.push(6);
            System.out.println("Pop: " +s.pop());
            System.out.println("Top: " +s.top());
            System.out.println("Pop: " +s.pop());
            s.push(4);
            System.out.println("Pop: " +s.pop());
            System.out.println("Pop: " +s.pop());*/
            // System.out.println("Top = " + s.top());
           
        } catch (EPilhaVazia e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println(s);
        }
    }
}
