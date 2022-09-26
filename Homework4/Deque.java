package Homework4;

import java.util.Arrays;

public class Deque<arr> {
    Object[] array = new Object[] {};
    int len;
    
    public Deque(int len) {
        array = new Object[len];
    }
    
    public Object[] add(int element){   
        array[len++] = element;
        return array;
    }

    public boolean offerFirst(int element){
        try{
            if (array[len-1] == array[0] || array[len-1] != array[0] || array[len] == array[0]){
                for (int i = len; i > 0; i--){
                        array[i] = array[i-1];
                    }
                    array[0] = element;
                    return true;
                }
                else{
                    return false;
                }
        } 
        catch (Exception e){
            return false;
        }
    }

    public boolean offerLast(int element){
        if (array[array.length-1] == null){
            array[array.length-1] = element;
        return true;
    }
        else{
            return false;
        }
    }
    
    public Integer peekFirst(){
        if (array[0] != null){
            return (Integer)array[0];}
        else {
            return null;
        }
    }

    public Integer peekLast(){
        if (array[array.length-1] != null){
            return (Integer)array[array.length-1];}
        else {
            return null;
        }
    }

    public Integer pollFirst(){
        if (array[0] != null){
            Object[] temp = new Object[array.length];
            System.arraycopy(array, 0, temp, 0, array.length);
            array[0] = null;        
        return (Integer)temp[0];}
        else {
            return null;
        }
    }

    public Integer pollLast(){
        if (array[array.length-1] != null){
            Object[] temp = new Object[array.length];
            System.arraycopy(array, 0, temp, 0, array.length);
            array[array.length-1] = null;        
        return (Integer)temp[array.length-1];}
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        Deque<Integer> st = new Deque<>(5);
        st.add(1);
        st.offerFirst(5);
        System.out.println(Arrays.toString(st.array));
        st.offerLast(10); 
        System.out.println(Arrays.toString(st.array));
        System.out.println(st.peekFirst());
        System.out.println(st.peekLast());
        System.out.println(st.pollFirst());
        System.out.println(Arrays.toString(st.array));
        System.out.println(st.pollLast());
        System.out.println(Arrays.toString(st.array));
    }
}
