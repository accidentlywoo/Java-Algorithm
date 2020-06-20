package youngri;

import java.util.Arrays;

public class ComparablePractice {
    public static class Fruit implements Comparable<Fruit>{
        public String name;
        public int quantity;
        public Fruit(String name, int quantity){
            this.name = name;
            this.quantity = quantity;
        }
        public int compareTo(Fruit other){
            return name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }
    public static class Fruit2 implements Comparable<Fruit2>{
        public String name;
        public int quantity;
        public Fruit2(String name, int quantity){
            this.name = name;
            this.quantity = quantity;
        }
        public int compareTo(Fruit2 other){
            return quantity - other.quantity;
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
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        Fruit2[] fruits2 = new Fruit2[4];
        fruits2[0] = new Fruit2("Pineapple",70);
        fruits2[1] = new Fruit2("Apple",100);
        fruits2[2] = new Fruit2("Orange",80);
        fruits2[3] = new Fruit2("Banana",90);
        Arrays.sort(fruits2);
        System.out.println(Arrays.toString(fruits2));
    }

}
