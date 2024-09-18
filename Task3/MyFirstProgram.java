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

class MySecondClass{
	// Переменные x и y
	private int x;
	private int y;

	// Геттеры переменных
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	// Сеттеры переменных
	public void setX(int X) {
		this.x = X;
	}
	public void setY(int Y) {
		this.y = Y;
	}

	// Конструктор по умолчанию
	public MySecondClass() {
		this.x = 0;
		this.y = 0;
	}

	// Конструктор инициализации
	public MySecondClass(int X, int Y) {
		this.x = X;
		this.y = Y;
	}

	// Побитовый сдвиг влево для x на y
	public int bitwiseLeft(){
		System.out.println("\nX to the left to " + y);
		return this.getX() << this.getY();
	}

}
