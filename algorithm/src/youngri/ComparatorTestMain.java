package youngri;

import java.util.Arrays;

public class ComparatorTestMain {
    public static void main(String[] args) {
        ComparatorPractice.Fruit[] fruits = new ComparatorPractice.Fruit[4];
        fruits[0] = new ComparatorPractice.Fruit("Pineapple",70);
        fruits[1] = new ComparatorPractice.Fruit("Apple",100);
        fruits[2] = new ComparatorPractice.Fruit("Orange",80);
        fruits[3] = new ComparatorPractice.Fruit("Banana",90);


        Arrays.sort(fruits, ComparatorPractice.Fruit.nameComparator);
        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits, ComparatorPractice.Fruit.quantityComparator);
        System.out.println(Arrays.toString(fruits));
    }
}
