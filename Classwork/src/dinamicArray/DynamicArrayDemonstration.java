package dinamicArray;

public class DynamicArrayDemonstration {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(12);
        dynamicArray.add(12);
        dynamicArray.add(12);
        dynamicArray.add(12343);
        dynamicArray.add(12);
        dynamicArray.add(432);
        dynamicArray.add(432);
        dynamicArray.add(432);
        dynamicArray.add(12);

        int removedValue = dynamicArray.remove(10);
        removedValue = dynamicArray.remove(2);
        removedValue = dynamicArray.remove(2);
        removedValue = dynamicArray.remove(4);
        System.out.print(dynamicArray.getElementCount(12));

    }


}
