package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

		for (int a = 0; a < 5; a++) {

			for (int b = 0; b < 5; b++) {

				if (a == 1 && b < 1) {

					System.out.print("■");

				} else if (a == 2 && b < 2) {

					System.out.print("■");

				} else if (a == 3 && b < 3) {

					System.out.print("■");

				} else if (a == 4 && b < 4) {

					System.out.print("■");

				} else if (a == 5 && b < 5) {

					System.out.print("■");

				} else {

					System.out.print("□");
				}

			}

			System.out.println();

		}

	}
}
