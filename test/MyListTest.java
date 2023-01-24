import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @Test
    void getSize(){
        MyList list =new MyList();
        assertEquals(0,list.size());
    }
    @Test
    void testConstructor(){
        MyList<String> list =new MyList<>(5);
        assertEquals(5, list.size());
    }
    @Test
    void getElementWithIndex(){
        MyList<String> list =new MyList<>(5);
        assertEquals(null,list.get(0));
        assertEquals(null,list.get(1));
    }
    @Test
    void addElement0(){
        MyList<String> list =new MyList<>();
        list.add(0,"a");
        assertEquals("a",list.get(0));
    }
    @Test
    void addElement1WhileHaveNothingThenAddBefore(){
        MyList<String> list=new MyList<>();
        list.add(1,"b");
        list.add(0,"a");
        assertEquals("a",list.get(0));
        assertEquals("b",list.get(1));
    }
    @Test
    void removeAnElement(){
        MyList<String> list=new MyList<>();
        list.add(1,"b");
        list.add(0,"a");
        list.add(2,"c");
        assertEquals(3,list.size());
        assertEquals("a",list.get(0));
        assertEquals("b",list.get(1));
        assertEquals("c",list.get(2));
        list.remove(1);
        assertEquals(2,list.size());
        assertEquals("a",list.get(0));
        assertEquals("c",list.get(1));
    }
    @Test
    void testContain(){
        MyList<String> list=new MyList<>();
        list.add(0,"a");
        assertEquals(true,list.contain("a"));
        assertEquals(false,list.contain("b"));
    }
    @Test
    void testIndexOf(){
        MyList<String> list=new MyList<>();
        list.add(0,"a");
        list.add(1,"b");
        assertEquals(0,list.indexOf("a"));
        assertEquals(1,list.indexOf("b"));
        assertEquals(-1,list.indexOf("c"));
    }
    @Test
    void testAddNoIndex(){
        MyList<String> list=new MyList<>();
        list.add("a");
        list.add("b");
        assertEquals(0,list.indexOf("a"));
        assertEquals(1,list.indexOf("b"));
    }
    @Test
    void testClear(){
        MyList<String> list=new MyList<>();
        list.add("a");
        list.add("b");
        list.clear();
        assertEquals(0,list.size());
    }
}