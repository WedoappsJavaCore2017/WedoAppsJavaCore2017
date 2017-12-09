public class BooksStackDemo {
    public static void main(String[] args) {
        BooksStack book = new BooksStack();
        Author hovTum = new Author("Hovhannes", "Tumanyan",148, "07.02.1869", 3000, "male" );
        book.push(new Book("heqiatner", hovTum , 255,"male","Yerevan","07.1934", "Armenian", 3000.20));
        book.push(new Book("banastexcutyuner", hovTum , 125,"male","Yerevan","07.1956", "Armenian", 2500.50));
        book.push(new Book("qaryakner", hovTum , 30,"male","Yerevan","03.1925", "Armenian", 500.00));
        book.push(new Book("poemner", hovTum , 235,"male","Yerevan","10.1937", "Armenian", 3350.50));
        book.push(new Book("baladner", hovTum , 122,"male","Yerevan","04.1930", "Armenian", 2000.00));
        book.push(new Book("arakner", hovTum , 205,"male","Yerevan","03.1940", "Armenian", 3000.20));
        book.push(new Book("legnedner", hovTum , 55,"male","Yerevan","07.1938", "Armenian", 3800.20));
        book.push(new Book("avandutyunner", hovTum , 77,"male","Yerevan","05.1945", "Armenian", 5030.00));
        book.push(new Book("aknarkner", hovTum , 175,"male","Yerevan","12.1939", "Armenian", 3780.20));
        book.push(new Book("patmvacqner", hovTum , 785,"male","Yerevan","11.1948", "Armenian", 2550.00));
        book.pop();
        book.pop();
        book.pop();
    }
}
