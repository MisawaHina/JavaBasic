package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] cars = new Car[3];

		Car car = new Car();
		car.gasoline = 50;
		car.color = "white";

		Car car1 = new Car();
		car1.gasoline = 70;
		car1.color = "black";

		Car car2 = new Car();
		car2.gasoline = 30;
		car2.color = "green";

		cars[0] = car;
		cars[1] = car1;
		cars[2] = car2;

		final int distance = 300;

		//int sum = 0;
		//int count = 0;

		for(int i = 0; i < cars.length; i++ ) {

			int sum = 0;
			int count = 0;

			while(true) {

				int n = cars[i].run();
				count++;

				if(n < 0) {
					System.out.println("目的地に到達できませんでした");
					break;
				}

				sum += n;

				if(distance < sum) {

					System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + cars[i].color + cars[i].gasoline + "リットルです");
					break;

				}

			}

		}

	}
}
