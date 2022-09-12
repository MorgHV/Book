public class Magazine implements Printable{
   static String name;

    public Magazine(String name){
        this.name = name;
    }



    @Override
    public void print() {
        System.out.println("Печатаем значит журнальчик: " + name);
    }


    static void   printMagazines(Printable[] printable){

        System.out.println("Только журнальчики: " + name);
    }



}
