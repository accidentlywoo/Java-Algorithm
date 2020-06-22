package youngri.sort;

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
        public static Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
            @Override // Anonymous Class
            public int compare(Fruit fruit1, Fruit fruit2) {
                return fruit1.name.compareTo(fruit2.name);
            }
        };
        public static Comparator<Fruit> quantityComparator = new Comparator<Fruit>() {
            public int compare(Fruit fruit1, Fruit fruit2) {
                return fruit1.quantity - fruit2.quantity;
            }
        };
        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }
}
