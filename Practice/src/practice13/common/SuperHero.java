package practice13.common;

public class SuperHero extends Hero {

	private Item equipment;

	 //attackメソッドをオーバーライドし、
	 //powerに加えて、additionalDamage分を加算した値としてください

	public int attack() {

		return super.attack() + equipment.getAdditionalDamage();
	}


	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	public Item getEquipment() {
		return this.equipment;
	}
}
