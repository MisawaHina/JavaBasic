/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください

		Hero hero = new Hero();
		hero.setName("勇者");

		Slime slime = new Slime();
		slime.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		int go1 = hero.attack();
		int go2 = slime.attack();

		while(true) {


			boolean sura = slime.damage(go1);

			if(sura) {
				System.out.println(hero.getName() + "は" + slime.getName() + "との戦闘に勝利した");
				break;
			}

			boolean yuu = hero.damage(go2);

			if(yuu) {
				System.out.println( slime.getName()+ "は" + hero.getName() + "との戦闘に勝利した");
				break;
			}
		}

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
