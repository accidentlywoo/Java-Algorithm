package stackAndQueue;

public class InStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    public InStack(int capacity){
        ptr = 0;
        max = capacity;
        try{
            stk = new int[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public int push(int x) throws EmptyIntStackException{
        if(ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop(){
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr--];
    }

    public int peek(){
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public int indexOf(int x){
        for(int i = ptr -1; i >= 0; i--){
            if(stk[i] == x)
                return i;
        }
        return -1;
    }

    public void clear(){
        ptr = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr <= 0;
    }

    public boolean isFull(){
        return ptr >= max;
    }

    public void dump(){
        if(ptr <= 0)
            System.out.println("스택이 비었습니다.");
        else{
            for(int i =0; i < ptr; i++){
                System.out.println(stk[i] + " ");
            }
        }
    }
}
