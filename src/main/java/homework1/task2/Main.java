package homework1.task2;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(10);
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }
        myArrayList.set(1, 4);
        myArrayList.remove(0);
        System.out.println(myArrayList);
        System.out.println("Value of element : " + myArrayList.get(1));
        System.out.println("Size of array: " + myArrayList.size());
        System.out.println("Index of element: " + myArrayList.indexOf(5));
        System.out.println("Is empty : " + myArrayList.isEmpty());
        myArrayList.clear();
        System.out.println("Is empty : " + myArrayList.isEmpty());//after clearing
        System.out.println(myArrayList);//after clearing
    }
}
