public class Main {
    public static void main(String[] args) {
        Printable book = new Book("HAN's philosophy special edition (Humans All Niggas) ");
        Printable book1 = new Book("dota 2 survival guide");
        Magazine magazine = new Magazine("tymbayumba modniy gyrnal");
        Magazine magazine1 = new Magazine("SecondStile");

        Printable[]masa = {book,magazine,magazine1,book1};

        for (int i = 0;i<masa.length;i++){
            masa[i].print();
            if (masa[i] instanceof Magazine)
                Magazine.printMagazines(masa);
            if (masa[i] instanceof Book){
                Book.printBook(masa);
            }
        }

    }

}
