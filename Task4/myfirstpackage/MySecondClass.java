package myfirstpackage;

public class MySecondClass{
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
