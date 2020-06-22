# Java-Algorithm

## Arrays
Arrays 클래스가 primitive 타입 데이터를 위한 정렬 메소드를 제공

***Arrays.sort***
```
int[] data = new int[capacity];
// data[0]에서 data[capacity-1]까지 데이터가 꽉 차있는 경우 다음과 같이 정렬한다.
Arrays.sort(data)l
// 배열이 꽉 차있지 않고 data[0]에서 data[size-1]까지 size개의 데이터만 있다면 다음과 같이 한다
Arrays.sort(data, 0, size);
```
int 이외의 다른 primitive 타입 데이터(double, char 등)에 대해서도 제공
String[] 도 사용 가능, 사용자 정의 객체 사용가능
```
public class Fruit{
  public String name;
  public int quantity;
  public Fruit(String name, int quantity){
    this.name = name;
    this.quantity = quantity;
  }
}
// somewhere in your program
Fruit[] fruits = new Fruit[4];
fruits[0] = new Fruit("Pineapple",70);
fruits[1] = new Fruit("Apple",100);
fruits[2] = new Fruit("Orange",80);
fruits[3] = new Fruit("Banana",90);

Arrays.sort(fruits); // ? 뭘 비교해서 정렬해야될지 모호하다.
```
***Exception in thread "main" java.lang.ClassCastException : Fruit cannot be cast to java.lang.Comparable***
```
public class Fruit implements Comparable<Fruit>{
  public String name;
  public int quantity;
  public Fruit(String name, int quantity){
    this.name = name;
    this.quantity = quantity;
  }
  public int compareTo(Fruit other){
    return name.compareTo(other.name);
  }
}
// somewhere in your program
Fruit[] fruits = new Fruit[4];
fruits[0] = new Fruit("Pineapple",70);
fruits[1] = new Fruit("Apple",100);
fruits[2] = new Fruit("Orange",80);
fruits[3] = new Fruit("Banana",90);

Arrays.sort(fruits); //name 필드 배교 sorting!
```
```
public class Fruit implements Comparable<Fruit>{
  public String name;
  public int quantity;
  public Fruit(String name, int quantity){
    this.name = name;
    this.quantity = quantity;
  }
  public int compareTo(Fruit other){ // 재고 수량별 sort 
    //음수 -> other의 재고가 많다. 0 같다. 양수 -> 내 재고가 더 많다.
    return quantity-other.quantity;
  }
}
// somewhere in your program
Fruit[] fruits = new Fruit[4];
fruits[0] = new Fruit("Pineapple",70);
fruits[1] = new Fruit("Apple",100);
fruits[2] = new Fruit("Orange",80);
fruits[3] = new Fruit("Banana",90);

Arrays.sort(fruits); //name 필드 배교 sorting!
```
***Comparable인터페이스는 1가지의 기준으로만 정렬을 해준다.***

2가지 이상의 기준으로 정렬하려면? -> ***Comparator인터페이스를 사용해야한다.***
```
omparator<Fruit> nameComparator = new Comparator<Fruit>() {
    @Override // Anonymous Class
    public int compare(Fruit fruit1, Fruit fruit2) {
        return fruit1.name.compareTo(fruit2.name);
    }
};
Comparator<Fruit> quantityComparator = new Comparator<Fruit>() {
    public int compare(Fruit fruit1, Fruit fruit2) {
        return fruit1.quantity - fruit2.quantity;
    }
};
```

## ArrayList
콜렉션인 하위 클래스들을 위한 정렬 메소드를 제공

***Collections.sort***
```
List<String> fruits = new ArrayList<String>();
fruits.add("pineaplee");
fruits.add("apple");
fruits.add("orange");
fruits.add("banana");
Collections.sort(fruits);

for(String name : fruits)
  sout(name);
```

