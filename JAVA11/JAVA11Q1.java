package JAVA11;

public class JAVA11Q1 {
	  //@FunctionalInterface
	  public interface SimpleInterest{
		  public void simple(int p,int r,int t);  // this is a method and if we had same name as class it is constructor   
	  }
		public static void main(String[] args) {
		 SimpleInterest si=(var p,var r,var t)->System.out.println(p*r*t/100);
		  si.simple(112,10,2);
		}
	  }
