package day13;

class Point1 {
	int x, y;
	public Point1(int x, int y) {
		this.x = x; this.y = y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y)return true;
		else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point1 a = new Point1(2,3);
		Point1 b = new Point1(2,3);
		Point1 c = new Point1(3,4);
		
		if(a == b) // false  <-- 인스턴스의 참조값 비교
			System.out.println("a == b");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
	}
}
