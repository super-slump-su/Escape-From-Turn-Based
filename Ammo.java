package game;

public class Ammo {
	private String name;
	private String size;
	private int projectiles; // Projectiles per shot fired, changes for grenades and some shotgun shells
	private int fleshDamage; // Hits unarmored body parts
	private int penetrationPower; // Damage modifier when bullet hits armored body parts, changes for different armor classes
	/*
	 * Various accessor and modifier methods for above instance variables.
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getProjectiles() {
		return projectiles;
	}

	public void setProjectiles(int projectiles) {
		this.projectiles = projectiles;
	}

	public int getFleshDamage() {
		return fleshDamage;
	}

	public void setFleshDamage(int fleshDamage) {
		this.fleshDamage = fleshDamage;
	}

	public int getPenetrationPower() {
		return penetrationPower;
	}

	public void setPenetrationPower(int penetrationPower) {
		this.penetrationPower = penetrationPower;
	}

	public Ammo nineM(String bulletName) { // 9xXXmm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "PM SP7 GZH": // 9x18mm
			bullet.setFleshDamage(77);
			bullet.setPenetrationPower(2);
			break;
		case "PM PPE GZH": // 9x18mm
			bullet.setFleshDamage(61);
			bullet.setPenetrationPower(7);
			break;
		case "PM PBM GZH": // 9x18mm
			bullet.setFleshDamage(40);
			bullet.setPenetrationPower(28);
			break;
		case "RIP": // 9x19mm
			bullet.setFleshDamage(102);
			bullet.setPenetrationPower(2);
			break;
		case "Quakemaker": // 9x19mm
			bullet.setFleshDamage(85);
			bullet.setPenetrationPower(8);
			break;
		case "PST GZH": // 9x19mm
			bullet.setFleshDamage(54);
			bullet.setPenetrationPower(20);
			break;
		case "PBP GZH": // 9x19mm
			bullet.setFleshDamage(52);
			bullet.setPenetrationPower(39);
			break;
		case "PE GZH": // 9x21mm
			bullet.setFleshDamage(80);
			bullet.setPenetrationPower(15);
			break;
		case "BT GZH": // 9x21mm
			bullet.setFleshDamage(49);
			bullet.setPenetrationPower(23);
			break;
		case "7N42": // 9x21mm
			bullet.setFleshDamage(45);
			bullet.setPenetrationPower(38);
			break;
		case "SP-5 GS": // 9x39mm
			bullet.setFleshDamage(71);
			bullet.setPenetrationPower(28);
			break;
		case "SP-6 GS": // 9x39mm
			bullet.setFleshDamage(60);
			bullet.setPenetrationPower(48);
			break;
		case "BP GS": // 9x39mm
			bullet.setFleshDamage(58);
			bullet.setPenetrationPower(54);
			break;
		}
		return bullet;
	}

	public Ammo fortyFive(String bulletName) { // .45
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "RIP":
			bullet.setFleshDamage(130);
			bullet.setPenetrationPower(3);
			break;
		case "ACP Match FMJ":
			bullet.setFleshDamage(72);
			bullet.setPenetrationPower(25);
			break;
		case "ACP AP":
			bullet.setFleshDamage(66);
			bullet.setPenetrationPower(38);
			break;
		}
		return bullet;
	}

	public Ammo fourSix(String bulletName) { // 4.6x30mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "Action SX":
			bullet.setFleshDamage(65);
			bullet.setPenetrationPower(18);
			break;
		case "FMJ SX":
			bullet.setFleshDamage(43);
			bullet.setPenetrationPower(40);
			break;
		case "AP SX":
			bullet.setFleshDamage(35);
			bullet.setPenetrationPower(53);
			break;
		}
		return bullet;
	}

	public Ammo fiveSeven(String bulletName) { // 5.7x28mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "SS198LF":
			bullet.setFleshDamage(70);
			bullet.setPenetrationPower(17);
			break;
		case "L191 Tracer":
			bullet.setFleshDamage(53);
			bullet.setPenetrationPower(33);
			break;
		case "SS190":
			bullet.setFleshDamage(49);
			bullet.setPenetrationPower(37);
			break;
		}
		return bullet;
	}

	public Ammo twelveG(String bulletName) { // 12 Gauge
		Ammo bullet = new Ammo();
		this.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "Magnum Buckshot":
			bullet.setProjectiles(8);
			bullet.setFleshDamage(50);
			bullet.setPenetrationPower(2);
			break;
		case "Flechette":
			bullet.setProjectiles(8);
			bullet.setFleshDamage(25);
			bullet.setPenetrationPower(31);
			break;
		case "RIP":
			bullet.setFleshDamage(265);
			bullet.setPenetrationPower(2);
			break;
		case "AP-20 Slug":
			bullet.setFleshDamage(164);
			bullet.setPenetrationPower(37);
			break;
		}
		return bullet;
	}

	public Ammo twentyG(String bulletName) { // 20 Gauge
		Ammo bullet = new Ammo();
		this.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "RIP":
			bullet.setFleshDamage(265);
			bullet.setPenetrationPower(2);
			break;
		case "AP-20 Slug":
			bullet.setFleshDamage(164);
			bullet.setPenetrationPower(37);
			break;
		case "5.6 Buckshot":
			bullet.setProjectiles(8);
			bullet.setFleshDamage(26);
			bullet.setPenetrationPower(1);
			break;
		case "Poleva-6u Slug":
			bullet.setProjectiles(1);
			bullet.setFleshDamage(135);
			bullet.setPenetrationPower(17);
			break;
		}
		return bullet;
	}

	public Ammo fourG(String bulletName) { // 23x75mm
		Ammo bullet = new Ammo();
		this.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "Shrapnel-10 Buckshot":
			bullet.setProjectiles(8);
			bullet.setFleshDamage(87);
			bullet.setPenetrationPower(11);
			break;
		case "Barrikada Slug":
			bullet.setFleshDamage(192);
			bullet.setPenetrationPower(39);
			break;
		case "Zveda Flashbang Round":
			bullet.setFleshDamage(0);
			bullet.setPenetrationPower(0);
			break;
		}
		return bullet;
	}

	public Ammo threeSixSix(String bulletName) { // .366
		Ammo bullet = new Ammo();
		this.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "TKM Geksa" :
			bullet.setFleshDamage(110);
			bullet.setPenetrationPower(14);
			break;
		case "TKM EKO" :
			bullet.setFleshDamage(73);
			bullet.setPenetrationPower(30);
			break;
		case "TKM AP-M" :
			bullet.setFleshDamage(90);
			bullet.setPenetrationPower(42);
			break;
		}
		return bullet;
	}

	public Ammo fiveFourFive(String bulletName) { // 5.45x39mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "PRS GS" :
			bullet.setFleshDamage(70);
			bullet.setPenetrationPower(13);
			break;
		case "PS GS" :
			bullet.setFleshDamage(53);
			bullet.setPenetrationPower(28);
			break;
		case "BT GS" :
			bullet.setFleshDamage(48);
			bullet.setPenetrationPower(37);
			break;
		case "7N40" :
			bullet.setFleshDamage(52);
			bullet.setPenetrationPower(42);
			break;
		case "BP GS" :
			bullet.setFleshDamage(46);
			bullet.setPenetrationPower(45);
			break;
		case "PPBS GS Igolnik" :
			bullet.setFleshDamage(37);
			bullet.setPenetrationPower(62);
			break;
		}
		return bullet;
	}

	public Ammo fiveFiveSix(String bulletName) { // 5.56x45mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "Warmageddon" :
			bullet.setFleshDamage(88);
			bullet.setPenetrationPower(3);
			break;
		case "M856" :
			bullet.setFleshDamage(64);
			bullet.setPenetrationPower(18);
			break;
		case "M855" :
			bullet.setFleshDamage(57);
			bullet.setPenetrationPower(31);
			break;
		case "M856A1" :
			bullet.setFleshDamage(52);
			bullet.setPenetrationPower(38);
			break;
		case "M995" :
			bullet.setFleshDamage(42);
			bullet.setPenetrationPower(53);
			break;
		case "SSA AP" :
			bullet.setFleshDamage(38);
			bullet.setPenetrationPower(57);
			break;
		}
		return bullet;
	}

	public Ammo sevenSixTwo(String bulletName) { // 7.62xXXmm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "TT LRNPC" : // 7.62x25mm
			bullet.setFleshDamage(66);
			bullet.setPenetrationPower(7);
			break;
		case "TT AKBS" : // 7.62x25mm
			bullet.setFleshDamage(64);
			bullet.setPenetrationPower(12);
			break;
		case "TT PST GZH" : // 7.62x25mm
			bullet.setFleshDamage(50);
			bullet.setPenetrationPower(25);
			break;
		case "HP" : // 7.62x39mm
			bullet.setFleshDamage(87);
			bullet.setPenetrationPower(15);
			break;
		case "T-51M1 GZH" : // 7.62x39mm
			bullet.setFleshDamage(64);
			bullet.setPenetrationPower(30);
			break;
		case "PS GZH" : // 7.62x39mm
			bullet.setFleshDamage(57);
			bullet.setPenetrationPower(35);
			break;
		case "BP GZH" : // 7.62x39mm
			bullet.setFleshDamage(58);
			bullet.setPenetrationPower(47);
			break;
		case "MA1 AP" : // 7.62x39mm
			bullet.setFleshDamage(47);
			bullet.setPenetrationPower(58);
			break;
		case "Ultra Nosler" : // 7.62x51mm
			bullet.setFleshDamage(107);
			bullet.setPenetrationPower(15);
			break;
		case "M80" : // 7.62x51mm
			bullet.setFleshDamage(80);
			bullet.setPenetrationPower(41);
			break;
		case "M61" : // 7.62x51mm
			bullet.setFleshDamage(70);
			bullet.setPenetrationPower(64);
			break;
		case "M993" : // 7.62x51mm
			bullet.setFleshDamage(67);
			bullet.setPenetrationPower(70);
			break;
		case "HP BT Tracer" : // 7.62x54mm
			bullet.setFleshDamage(102);
			bullet.setPenetrationPower(23);
			break;
		case "T-46M GZH" : // 7.62x54mm
			bullet.setFleshDamage(82);
			bullet.setPenetrationPower(41);
			break;
		case "SNB GZH" : // 7.62x54mm
			bullet.setFleshDamage(75);
			bullet.setPenetrationPower(62);
			break;
		case "BS GS" : // 7.62x54mm
			bullet.setFleshDamage(72);
			bullet.setPenetrationPower(70);
			break;
		}
		return bullet;
	}

	public Ammo threeHundred(String bulletName) { // .300
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "Blackout Whisper" :
			bullet.setFleshDamage(90);
			bullet.setPenetrationPower(15);
			break;
		case "Blackout BCP FMJ" :
			bullet.setFleshDamage(60);
			bullet.setPenetrationPower(30);
			break;
		case "Blackout CBJ" :
			bullet.setFleshDamage(58);
			bullet.setPenetrationPower(43);
			break;
		case "Blackout AP" :
			bullet.setFleshDamage(51);
			bullet.setPenetrationPower(48);
			break;
		}
		return bullet;
	}

	public Ammo sixEight(String bulletName) { // 6.8x51mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "SIG FMJ" :
			bullet.setFleshDamage(80);
			bullet.setPenetrationPower(36);
			break;
		case "SIG Hybrid" :
			bullet.setFleshDamage(72);
			bullet.setPenetrationPower(47);
			break;
		}
		return bullet;
	}

	public Ammo twelveSeven(String bulletName) { // 12.7x55mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "PS12A" :
			bullet.setFleshDamage(165);
			bullet.setPenetrationPower(10);
			break;
		case "PS12" :
			bullet.setFleshDamage(115);
			bullet.setPenetrationPower(28);
			break;
		case "PS12B" :
			bullet.setFleshDamage(102);
			bullet.setPenetrationPower(46);
			break;
		}
		return bullet;
	}

	public Ammo threeThreeEight(String bulletName) { // .338 Lapua
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		bullet.setProjectiles(1);
		switch (bullet.getName()) {
		case "TAC-X" :
			bullet.setFleshDamage(196);
			bullet.setPenetrationPower(18);
			break;
		case "UCW" :
			bullet.setFleshDamage(142);
			bullet.setPenetrationPower(32);
			break;
		case "FMJ" :
			bullet.setFleshDamage(122);
			bullet.setPenetrationPower(47);
			break;
		case "AP" :
			bullet.setFleshDamage(115);
			bullet.setPenetrationPower(79);
			break;
		}
		return bullet;
	}

	public Ammo fortyMM(String bulletName) { // 40xXXmm Grenade Launcher Cartridges
		Ammo grenadeLauncherCartridge = new Ammo();
		grenadeLauncherCartridge.setName(bulletName);
		switch (grenadeLauncherCartridge.getName()) {
		case "M381 HE" :
			grenadeLauncherCartridge.setProjectiles(10);
			grenadeLauncherCartridge.setFleshDamage(199);
			grenadeLauncherCartridge.setPenetrationPower(1);
			break;
		case "M433 HEDP" :
			grenadeLauncherCartridge.setProjectiles(15);
			grenadeLauncherCartridge.setFleshDamage(199);
			grenadeLauncherCartridge.setPenetrationPower(1);
			break;
		case "M576 MP-APERS" :
			grenadeLauncherCartridge.setProjectiles(15);
			grenadeLauncherCartridge.setFleshDamage(160);
			grenadeLauncherCartridge.setPenetrationPower(5);
			break;
		case "VOG-25" :
			grenadeLauncherCartridge.setProjectiles(15);
			grenadeLauncherCartridge.setFleshDamage(199);
			grenadeLauncherCartridge.setPenetrationPower(0);
			break;
		}
		return grenadeLauncherCartridge;
	}
}
