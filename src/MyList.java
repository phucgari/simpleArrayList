public class MyList<E> {
    private E[] element;
    public int size() {
        return element.length;
    }
    MyList(){
        this.element=(E[]) new Object[0];
    }
    MyList(int capacity){
        this.element=(E[]) new Object[capacity];
    }

    public E get(int index) {
        return element[index];
    }
    public void add(int index,E e){
        if(element.length>index&&element[index]==null){
            element[index]=e;
        }else{
        int newCapacity;
        if(element.length-1<index){
            newCapacity=index+1;
        }else{
        newCapacity=element.length+1;
        }
        E[] temp=(E[])new Object[newCapacity];
        for (int i = 0; i < temp.length; i++) {
            if(i<index){
                if(i> element.length-1)continue;
                temp[i]=element[i];
            } else if (i==index) {
                temp[i]=e;
            }else {
                temp[i]=element[i-1];
            }
        }
        element=temp;
        }
    }
    public void remove(int index){
        E[] temp=(E[]) new Object[element.length-1];
        for (int i = 0; i < element.length; i++) {
            if(i<index){
                temp[i]=element[i];
            } else if (i>index) {
                temp[i-1]=element[i];
            }
        }
        element=temp;
    }
    public boolean contain(E e){
        for (int i = 0; i < element.length; i++) {
            if(element[i]==e){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        for (int i = 0; i < element.length; i++) {
            if(element[i]==e){
                return i;
            }
        }
        return -1;
    }
    public void add(E e){
        add(element.length,e);
    }
    public void clear(){
        element=(E[]) new Object[0];
    }
}