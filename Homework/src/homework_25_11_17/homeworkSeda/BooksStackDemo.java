package homework_25_11_17.homeworkSeda;

public class BooksStackDemo {
    public static void main(String[] args) {
        Author vahan = new Author("Վահան", "Տերյան", 132, "27,01,1884", 8);
        Books book1 = new Books("Մթնշաղի անուրջներ", 168, "Բանաստեղծություններ", "Թիֆլիս", "1908", "Հայերեն", 2500, vahan);
        Books book2 = new Books("Գիշեր և հուշեր", 86, "Բանաստեղծություններ", "Թիֆլիս", "1911", "Հայերեն", 2500.5, vahan);
        Books book3 = new Books("Ոսկի հեքիար", 100, "Բանաստեղծություններ", "Թիֆլիս", "1911", "Հայերեն", 2450, vahan);
        Books book4 = new Books("Վերադարձ", 125, "Բանաստեղծություններ", "Թիֆլիս", "1914", "Հայերեն", 2500, vahan);
        Books book5 = new Books("Ոսկե շղթա", 96, "Բանաստեղծություններ", "Թիֆլիս", "1914", "Հայերեն", 2500, vahan);
        Books book6 = new Books("Երկիր Նաիրի", 87, "Բանաստեղծություններ", "Թիֆլիս", "1908", "Հայերեն", 2500, vahan);
        Books book7 = new Books("Կատվի դրախտ", 84, "Բանաստեղծություններ", "Թիֆլիս", "1908", "Հայերեն", 2500, vahan);

        BooksStack booksStack = new BooksStack(15);
        booksStack.Push(book1);
        booksStack.Push(book2);
        booksStack.Push(book3);
        booksStack.Push(book4);
        booksStack.Push(book5);
        booksStack.Push(book6);
        booksStack.Push(book7);
        System.out.println(booksStack.Pop());
        System.out.println(booksStack.Pop());
        System.out.println(booksStack.Pop());

    }
}
