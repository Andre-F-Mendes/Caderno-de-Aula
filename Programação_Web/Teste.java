import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;


public class Teste {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();

        tree.add("um");

        tree.add("dois");

        tree.add("tres");

        tree.add("quatro");

        tree.add("um");

        Iterator it = tree.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }
    }
}
