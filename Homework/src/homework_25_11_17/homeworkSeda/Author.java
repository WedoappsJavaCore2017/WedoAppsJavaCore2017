package homework_25_11_17.homeworkSeda;

public class Author {
    String name;
    String surname;
    int age;
    String birthDate;
    int booksCount;

    public Author(String name, String surname, int age, String birthDate, int booksCount) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthDate = birthDate;
        this.booksCount = booksCount;
    }
    public String author(){
        return name;
    }
}
