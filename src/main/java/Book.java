import java.util.Objects;

public class Book implements Printable{

    static String name;

    public Book(String name) {
        this.name = name;
    }



    @Override
    public void print() {
        System.out.println("Напечатали мы книжечку :"+ name);
    }

    public static void printBook(Printable[] printables){
        System.out.println(name);
    }



}
