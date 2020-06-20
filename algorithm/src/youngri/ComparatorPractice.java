package youngri;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorPractice {
    public static class Fruit {
        public String name;
        public int quantity;
        public Fruit(String name, int quantity){
            this.name = name;
            this.quantity = quantity;
        }
        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Fruit("Pineapple",70);
        fruits[1] = new Fruit("Apple",100);
        fruits[2] = new Fruit("Orange",80);
        fruits[3] = new Fruit("Banana",90);

        Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
            @Override // Anonymous Class
            public int compare(Fruit fruit1, Fruit fruit2) {
                return fruit1.name.compareTo(fruit2.name);
            }
        };
        /*
        제네릭 프로그래밍
         */
        Arrays.sort(fruits, nameComparator);
        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits, new Comparator<Fruit>() {
            public int compare(Fruit fruit1, Fruit fruit2) {
                return fruit1.quantity - fruit2.quantity;
            }
        });
        System.out.println(Arrays.toString(fruits));
    }
}
