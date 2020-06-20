# Java-Algorithm

## Arrays
Arrays 클래스가 primitive 타입 데이터를 위한 정렬 메소드를 제공
```
int[] data = new int[capacity];
// data[0]에서 data[capacity-1]까지 데이터가 꽉 차있는 경우 다음과 같이 정렬한다.
Arrays.sort(data)l
// 배열이 꽉 차있지 않고 data[0]에서 data[size-1]까지 size개의 데이터만 있다면 다음과 같이 한다
Arrays.sort(data, 0, size);
```
int 이외의 다른 primitive 타입 데이터(double, char 등)에 대해서도 제공

