package singleton;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import dinamicArray.DynamicArray;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();
        Singleton singleton6 = Singleton.getInstance();
        Singleton singleton7 = Singleton.getInstance();
        Singleton singleton8 = Singleton.getInstance();

        DynamicArray array = new DynamicArray(5);
        array.add(0,10);
        System.out.println(array.get(0));
    }
}
