package java11;


import java.util.ArrayList;

public class Java11Q3 {
// In this we are  converting a array list to a string  by toArray method
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
         list.add("A quick brown fox jumps over the lazy dog");
         System.out.println(list);  
         System.out.println("------------");  
//         String[]arr = list.toArray(new String[list.size()]);
         String[]arr = list.toArray(size->new String[size]);
         for(String j:arr){
          System.out.println(j);
	}
	}
}