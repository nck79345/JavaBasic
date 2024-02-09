import java.util.ArrayList;

//Add Elements Between Two Numbers
public class AddEle {
	public static void main(String[] args) 
    { 
        ArrayList<Integer> list = new ArrayList(); 
        list.add(1); 
        list.add(2); 
        list.add(4); 
        System.out.println(list); 
        // insert missing element 3 
        list.add(3, 3); //index postion 
        System.out.println(list); 
    } 
}
