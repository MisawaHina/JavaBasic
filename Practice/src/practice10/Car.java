package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	int run() {

		int num = new java.util.Random().nextInt(15);
		System.out.println(num);

		num = this.gasoline - 1;
		
		return num;

	}

}
