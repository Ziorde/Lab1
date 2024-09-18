import myfirstpackage.*;

class MyFirstClass {
 	public static void main(String[] s) {
		 MySecondClass o = new MySecondClass();
		 System.out.println(o.bitwiseLeft());
		 for (int i = 1; i <= 8; i++) {
			 for (int j = 1; j <= 8; j++) {
				 o.setX(i);
				 o.setY(j);
				 System.out.print(o.bitwiseLeft());
				 System.out.print(" ");
			 }
			 System.out.println();
		}
	}
}