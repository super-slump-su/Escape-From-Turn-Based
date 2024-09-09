package game;

public class Ammo {
	private String name;
	private String size;
	private int projectiles;
	private int fleshDamage; // Hits unarmored body parts
	private int penetrationPower; // Damage modifier when bullet hits armored body parts

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
		if (bullet.getName().equals("PM SP7 GZH")) { // 9x18mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(77);
			bullet.setPenetrationPower(2);
		} else if (bullet.getName().equals("PM PPE GZH")) { // 9x18mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(61);
			bullet.setPenetrationPower(7);
		} else if (bullet.getName().equals("PM PBM GZH")) { // 9x18mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(40);
			bullet.setPenetrationPower(28);
		} else if (bullet.getName().equals("RIP")) { // 9x19mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(102);
			bullet.setPenetrationPower(2);
		} else if (bullet.getName().equals("Quakemaker")) { // 9x19mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(85);
			bullet.setPenetrationPower(8);
		} else if (bullet.getName().equals("PST GZH")) { // 9x19mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(54);
			bullet.setPenetrationPower(20);
		} else if (bullet.getName().equals("PBP GZH")) { // 9x19mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(52);
			bullet.setPenetrationPower(39);
		} else if (bullet.getName().equals("PE GZH")) { // 9x21mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(80);
			bullet.setPenetrationPower(15);
		} else if (bullet.getName().equals("BT GZH")) { // 9x21mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(49);
			bullet.setPenetrationPower(32);
		} else if (bullet.getName().equals("7N42")) { // 9x21mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(45);
			bullet.setPenetrationPower(38);
		} else if (bullet.getName().equals("SP-5 GS")) { // 9x39mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(71);
			bullet.setPenetrationPower(28);
		} else if (bullet.getName().equals("SP-6 GS")) { // 9x39mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(60);
			bullet.setPenetrationPower(48);
		} else if (bullet.getName().equals("BP GS")) { // 9x39mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(58);
			bullet.setPenetrationPower(54);
		}
		return bullet;
	}

	public Ammo fortyFive(String bulletName) { // .45
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("RIP")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(130);
			bullet.setPenetrationPower(3);
		} else if (bullet.getName().equals("ACP Match FMJ")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(72);
			bullet.setPenetrationPower(25);
		} else if (bullet.getName().equals("ACP AP")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(66);
			bullet.setPenetrationPower(38);
		}
		return bullet;
	}

	public Ammo fourSix(String bulletName) { // 4.6x30mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("Action SX")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(65);
			bullet.setPenetrationPower(18);
		} else if (bullet.getName().equals("FMJ SX")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(43);
			bullet.setPenetrationPower(40);
		} else if (bullet.getName().equals("AP SX")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(35);
			bullet.setPenetrationPower(53);
		}
		return bullet;
	}

	public Ammo fiveSeven(String bulletName) { // 5.7x28mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("SS198LF")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(70);
			bullet.setPenetrationPower(17);
		} else if (bullet.getName().equals("L191 Tracer")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(53);
			bullet.setPenetrationPower(33);
		} else if (bullet.getName().equals("SS190")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(49);
			bullet.setPenetrationPower(37);
		}
		return bullet;
	}

	public Ammo twelveG(String bulletName) { //12 Gauge
		Ammo bullet = new Ammo();
		this.setName(bulletName);
		if (this.getName().equals("Magnum Buckshot")) {
			bullet.setProjectiles(8);
			bullet.setFleshDamage(50);
			bullet.setPenetrationPower(2);
		} else if (bullet.getName().equals("Flechette")) {
			bullet.setProjectiles(8);
			bullet.setFleshDamage(25);
			bullet.setPenetrationPower(31);
		} else if (bullet.getName().equals("RIP")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(265);
			bullet.setPenetrationPower(2);
		} else if (bullet.getName().equals("AP-20 Slug")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(164);
			bullet.setPenetrationPower(37);
		}
		return bullet;
	}

	public Ammo twentyG(String bulletName) { // Twenty Gauge
		Ammo bullet = new Ammo();
		this.setName(bulletName);
		if (this.getName().equals("5.6 Buckshot")) {
			bullet.setProjectiles(8);
			bullet.setFleshDamage(26);
			bullet.setPenetrationPower(1);
		} else if (bullet.getName().equals("Poleva-6u Slug")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(135);
			bullet.setPenetrationPower(17);
		}
		return bullet;
	}

	public Ammo twentyThree(String bulletName) { //23x75mm
		Ammo bullet = new Ammo();
		this.setName(bulletName);
		if (this.getName().equals("Shrapnel-10 Buckshot")) {
			bullet.setProjectiles(8);
			bullet.setFleshDamage(87);
			bullet.setPenetrationPower(11);
		} else if (bullet.getName().equals("Barrikada Slug")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(192);
			bullet.setPenetrationPower(39);
		} else if (bullet.getName().equals("Zveda Flashbang Round")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(0);
			bullet.setPenetrationPower(0);
		}
		return bullet;
	}

	public Ammo threeSixSix(String bulletName) { // .366
		Ammo bullet = new Ammo();
		this.setName(bulletName);
		if (this.getName().equals("TKM Geksa")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(110);
			bullet.setPenetrationPower(14);
		} else if (bullet.getName().equals("TKM EKO")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(73);
			bullet.setPenetrationPower(30);
		} else if (bullet.getName().equals("TKM AP-M")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(90);
			bullet.setPenetrationPower(42);
		}
		return bullet;
	}

	public Ammo fiveFourFive(String bulletName) { // 5.45x39mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("PRS GS")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(70);
			bullet.setPenetrationPower(13);
		} else if (bullet.getName().equals("PS GS")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(53);
			bullet.setPenetrationPower(28);
		} else if (bullet.getName().equals("BT GS")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(48);
			bullet.setPenetrationPower(37);
		} else if (bullet.getName().equals("7N40")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(52);
			bullet.setPenetrationPower(42);
		} else if (bullet.getName().equals("BP GS")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(46);
			bullet.setPenetrationPower(45);
		} else if (bullet.getName().equals("PPBS GS Igolnik")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(37);
			bullet.setPenetrationPower(62);
		}
		return bullet;
	}

	public Ammo fiveFiveSix(String bulletName) { // 5.56x45mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("Warmageddon")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(88);
			bullet.setPenetrationPower(3);
		} else if (bullet.getName().equals("M856")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(64);
			bullet.setPenetrationPower(18);
		} else if (bullet.getName().equals("M855")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(57);
			bullet.setPenetrationPower(31);
		} else if (bullet.getName().equals("M856A1")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(52);
			bullet.setPenetrationPower(38);
		} else if (bullet.getName().equals("M855A1")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(49);
			bullet.setPenetrationPower(44);
		} else if (bullet.getName().equals("M995")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(42);
			bullet.setPenetrationPower(53);
		} else if (bullet.getName().equals("SSA AP")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(38);
			bullet.setPenetrationPower(57);
		}
		return bullet;
	}

	public Ammo sevenSixTwo(String bulletName) { // 7.62xXXmm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("TT LRNPC")) { // 7.62x25mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(66);
			bullet.setPenetrationPower(7);
		} else if (bullet.getName().equals("TT AKBS")) { // 7.62x25mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(58);
			bullet.setPenetrationPower(12);
		} else if (bullet.getName().equals("TT PST GZH")) { // 7.62x25mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(50);
			bullet.setPenetrationPower(25);
		} else if (bullet.getName().equals("HP")) { // 7.62x39mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(87);
			bullet.setPenetrationPower(15);
		} else if (bullet.getName().equals("T-51M1 GZH")) { // 7.62x39mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(64);
			bullet.setPenetrationPower(30);
		} else if (bullet.getName().equals("PS GZH")) { // 7.62x39mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(57);
			bullet.setPenetrationPower(35);
		} else if (bullet.getName().equals("BP GZH")) { // 7.62x39mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(58);
			bullet.setPenetrationPower(47);
		} else if (bullet.getName().equals("MA1 AP")) { // 7.62x39mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(47);
			bullet.setPenetrationPower(58);
		} else if (bullet.getName().equals("Ultra Nosler")) { // 7.62x51mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(107);
			bullet.setPenetrationPower(15);
		} else if (bullet.getName().equals("M80")) { // 7.62x51mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(80);
			bullet.setPenetrationPower(41);
		} else if (bullet.getName().equals("M61")) { // 7.62x51mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(70);
			bullet.setPenetrationPower(64);
		} else if (bullet.getName().equals("M993")) { // 7.62x51mm
			bullet.setProjectiles(1);
			bullet.setFleshDamage(67);
			bullet.setPenetrationPower(70);
		} else if (bullet.getName().equals("HP BT Tracer")) { // 7.62x54R
			bullet.setProjectiles(1);
			bullet.setFleshDamage(102);
			bullet.setPenetrationPower(23);
		} else if (bullet.getName().equals("T-46M GZH")) { // 7.62x54R
			bullet.setProjectiles(1);
			bullet.setFleshDamage(82);
			bullet.setPenetrationPower(41);
		} else if (bullet.getName().equals("SNB GZH")) { // 7.62x54R
			bullet.setProjectiles(1);
			bullet.setFleshDamage(75);
			bullet.setPenetrationPower(62);
		} else if (bullet.getName().equals("BS GS")) { // 7.62x54R
			bullet.setProjectiles(1);
			bullet.setFleshDamage(72);
			bullet.setPenetrationPower(70);
		}
		return bullet;
	}

	public Ammo threeHundred(String bulletName) { // .300
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("Blackout Whisper")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(90);
			bullet.setPenetrationPower(15);
		} else if (bullet.getName().equals("Blackout BCP FMJ")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(60);
			bullet.setPenetrationPower(30);
		} else if (bullet.getName().equals("Blackout CBJ")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(58);
			bullet.setPenetrationPower(43);
		} else if (bullet.getName().equals("Blackout AP")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(51);
			bullet.setPenetrationPower(48);
		}
		return bullet;
	}

	public Ammo sixEight(String bulletName) { // 6.8x51mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("SIG FMJ")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(80);
			bullet.setPenetrationPower(36);
		} else if (bullet.getName().equals("SIG Hybrid")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(72);
			bullet.setPenetrationPower(47);
		}
		return bullet;
	}

	public Ammo twelveSeven(String bulletName) { // 12.7x55mm
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("PS12A")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(165);
			bullet.setPenetrationPower(10);
		} else if (bullet.getName().equals("PS12")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(115);
			bullet.setPenetrationPower(28);
		} else if (bullet.getName().equals("PS12B")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(102);
			bullet.setPenetrationPower(46);
		}
		return bullet;
	}

	public Ammo threeThreeEight(String bulletName) { // .338 Lapua
		Ammo bullet = new Ammo();
		bullet.setName(bulletName);
		if (bullet.getName().equals("TAC-X")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(196);
			bullet.setPenetrationPower(18);
		} else if (bullet.getName().equals("UCW")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(142);
			bullet.setPenetrationPower(32);
		} else if (bullet.getName().equals("FMJ")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(122);
			bullet.setPenetrationPower(47);
		} else if (bullet.getName().equals("AP")) {
			bullet.setProjectiles(1);
			bullet.setFleshDamage(115);
			bullet.setPenetrationPower(79);
		}
		return bullet;
	}

	public Ammo fortyMM(String bulletName) { // 40xXXmm Grenade Launcher Cartridges
		Ammo grenadeLauncherCartridge = new Ammo();
		grenadeLauncherCartridge.setName(bulletName);
		if (grenadeLauncherCartridge.getName().equals("M381 HE")) { // 40x46mm
			grenadeLauncherCartridge.setProjectiles(10);
			grenadeLauncherCartridge.setFleshDamage(199);
			grenadeLauncherCartridge.setPenetrationPower(1);
		} else if (grenadeLauncherCartridge.getName().equals("M433 HEDP")) { // 40x46mm
			grenadeLauncherCartridge.setProjectiles(15);
			grenadeLauncherCartridge.setFleshDamage(199);
			grenadeLauncherCartridge.setPenetrationPower(1);
		} else if (grenadeLauncherCartridge.getName().equals("M576 MP-APERS")) { // 40x46mm
			grenadeLauncherCartridge.setProjectiles(15);
			grenadeLauncherCartridge.setFleshDamage(160);
			grenadeLauncherCartridge.setPenetrationPower(5);
		} else if (grenadeLauncherCartridge.getName().equals("VOG-25")) { //40x53mm
			grenadeLauncherCartridge.setProjectiles(15);
			grenadeLauncherCartridge.setFleshDamage(199);
			grenadeLauncherCartridge.setPenetrationPower(0);
		}
		return grenadeLauncherCartridge;
	}
}
