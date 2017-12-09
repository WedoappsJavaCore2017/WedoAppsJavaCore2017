package homework_25_11_17;

import javax.xml.crypto.Data;
import java.util.Date;

public class Author {
    String name;
    String surname;
    short age;
    Date birthDate;
    int booksCount;
    enum gender{};

    void Author (){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthDate = birthDate;
        this.booksCount = booksCount;
    }

}
