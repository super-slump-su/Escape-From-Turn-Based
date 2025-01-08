package game;

public class Gun {
	private String name;
	private String range; // Effective range (short, medium, long)
	private int capacity; // Default magazine capacity
	private String caliber; // Caliber bullet used
	private Ammo ammunition; // Specific bullet variant
	private String[][] nineM = { { "PM SP7 GZH", "PM PPE GZH", "PM PBM GZH" }, // 9x18mm rounds indexes 0-2 of row 0
			{ "RIP", "Quakemaker", "PST GZH", "PBP GZH" }, // 9x19mm rounds indexes 0-3 of row 1
			{ "PE GZH", "BT GZH", "7N42" }, // 9x21mm rounds indexes 0-2 of row 2
			{ "SP-5 GS", "SP-6 GS", "BP GS" } }; // 9x39mm rounds indexes 0-2 of row 3
	private String[] fortyFive = { "RIP", "ACP Match FMJ", "ACP AP" }; // .45 rounds indexes 0-2
	private String[] fourSix = { "Action SX", "FMJ SX", "AP SX" }; // 4.6x30mm rounds indexes 0-2
	private String[] fiveSeven = { "SS198LF", "L191 Tracer", "SS190" }; // 5.7x28mm rounds indexes 0-2
	private String[] twelveG = { "Magnum Buckshot", "Flechette", "RIP", "AP-20 Slug" }; // 12 Gauge indexes 0-3
	private String[] twentyG = { "5.6 Buckshot", "Poleva-6u Slug" }; // 20 Gauge indexes 0-1
	private String[] twentyThree = { "Shrapnel-10 Buckshot", "Barrikada Slug", // Normal 23x75mm indexes 0-1
			"Zveda Flashbang Round" }; // Special flashbang round index 2
	private String[] threeSixSix = { "TKM Geksa", "TKM EKO", "TKM AP-M" }; // .366 rounds indexes 0-2
	private String[] fiveFourFive = { "PRS GS", "PS GS", "BT GS", "7N40", "BP GS", "BS GS", "PPBS GS Igolnik" };
	// 5.45x39mm rounds indexes 0-6
	private String[] fiveFiveSix = { "Warmageddon", "M856", "M855", "M856A1", "M855A1", "M995", "SSA AP" };
	// 5.56x45mm rounds indexes 0-6
	private String[][] sevenSixTwo = { { "TT LRNPC", "TT AKBS", "TT PST GZH" }, // 7.62x25mm rounds indexes 0-2 of row 0
			{ "HP", "T-45M1 GZH", "PS GZH", "BP GZH", "MAI AP" }, // 7.62x39mm rounds indexes 0-4 of row 1
			{ "Ultra Nosler", "M80", "M61", "M993" }, // 7.62x51mm rounds indexes 0-3 of row 2
			{ "HP BT Tracer", "T-46M GZH", "SNB GZH", "BS GS" } }; // 7.62x54R rounds indexes 0-3 of row 3
	private String[] threeHundred = { "Blackout Whisper", "Blackout BCP FMJ", "Blackout CBJ", "Blackout AP" };
	// .300 rounds indexes 0-3
	private String[] sixEight = { "SIG FMJ", "SIG Hybrid" }; // 6.8x51mm rounds indexes 0-1
	private String[] twelveSeven = { "PS12A", "PS12", "PS12B" }; // 12.7x55mm rounds indexes 0-2
	private String[] threeThreeEight = { "TAC-X", "UCW", "FMJ", "AP" }; // .338 Lapua Magnum rounds indexes 0-3
	private String[] fortyMM = { "M381 HE", "M433 HEDP", "M576 MP-APERS",
			// 40x46mm grenade launcher cartridges indexes 0-2
			"VOG-25" }; // 40x53mm grenade launcher cartridge index 3
	/*
	 * Various accessor and modifier methods for above instance variables.
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getCaliber() {
		return caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Ammo getAmmunition() {
		return ammunition;
	}

	public void setAmmunition(Ammo ammunition) {
		this.ammunition = ammunition;
	}

	public Gun(String weapon) {
		this.setName(weapon);
		if (weapon.equals("PM") || weapon.equals("PP-91")) { // 9x18mm
			this.NineEighteen();
		} else if (weapon.equals("MP-443") || weapon.equals("Glock 17")
				|| weapon.equals("Glock 18C") || weapon.equals("M9A3")
				|| weapon.equals("Saiga-9") || weapon.equals("STM-9")
				|| weapon.equals("PP-19-01") || weapon.equals("MP5") || weapon.equals("MP9")
				|| weapon.equals("MPX") || weapon.equals("Vector")) { // 9x19mm
			this.NineNineteen();
		} else if (weapon.equals("SR-1MP")) { // 9x21mm
			this.NineTwentyOne();
		} else if (weapon.equals("KBP 9A-91") || weapon.equals("AS-VAL")
				|| weapon.equals("VSS Vintorez")) { // 9x39mm
			this.NineThirtyNine();
		} else if (weapon.equals("UMP")) { // .45
			this.FortyFive();
		} else if (weapon.equals("MP7A2")) { // 4.6x30mm
			this.FourSix();
		} else if (weapon.equals("FN 5-7") || weapon.equals("FN P90")) { // 5.7x28mm
			this.FiveSeven();
		} else if (weapon.equals("MP-133") || weapon.equals("MP-153")
				|| weapon.equals("Saiga-12K") || weapon.equals("M870")
				|| weapon.equals("M590A1") || weapon.equals("M3 Super 90")) { // 12 Gauge
			this.TwelveGauge();
		} else if (weapon.equals("TOZ-106")) { // 20 Gauge
			this.TwentyGauge();
		} else if (weapon.equals("KS-23M")) { // 23x75mm
			this.TwentyThreeGauge();
		} else if (weapon.equals("VPO-215")) { // .366
			this.ThreeSixSix();
		} else if (weapon.equals("AKS-74U") || weapon.equals("AK-74") || weapon.equals("AK-74M")
				|| weapon.equals("AK-105") || weapon.equals("AK-12")
				|| weapon.equals("RPK-16")) { // 5.45x39mm
			this.FiveFourFive();
		} else if (weapon.equals("ADAR 2-15") || weapon.equals("TX-15")
				|| weapon.equals("AK-101") || weapon.equals("AK-104") || weapon.equals("M4A1")
				|| weapon.equals("Aug A3") || weapon.equals("HK 416A5")) { // 5.56x45mm
			this.FiveFiveSix();
		} else if (weapon.equals("PPSh-41") || weapon.equals("Golden TT-33")) { // 7.62x25mm
			this.SevenTwentyFive();
		} else if (weapon.equals("SKS") || weapon.equals("VPO-136") || weapon.equals("AKM")
				|| weapon.equals("AK-104") || weapon.equals("RPD") || weapon.equals("RPDN")
				|| weapon.equals("Mk47 Mutant")) { // 7.62x39mm
			this.SevenThirtyNine();
		} else if (weapon.equals("VPO-101") || weapon.equals("MDR") || weapon.equals("SCAR-L")
				|| weapon.equals("SA-58") || weapon.equals("RFB") || weapon.equals("SR-25")
				|| weapon.equals("M1A") || weapon.equals("G28") || weapon.equals("RSASS")
				|| weapon.equals("M700") || weapon.equals("DVL-10")
				|| weapon.equals("T-5000")) { // 7.62x51mm
			this.SevenFiftyOne();
		} else if (weapon.equals("Mosin") || weapon.equals("SV-98") || weapon.equals("SVDS")
				|| weapon.equals("PKM") || weapon.equals("PKP")) { // 7.62x54R
			this.SevenFiftyFour();
		} else if (weapon.equals("MCX")) { // .300
			this.ThreeHundred();
		} else if (weapon.equals("MCX Spear")) { // 6.8x51mm
			this.SixEight();
		} else if (weapon.equals("ASh-12")) { // 12.7x55mm
			this.TwelveSeven();
		} else if (weapon.equals("AXMC")) { // .338 Lapua
			this.ThreeThreeEight();
		}
	}

	private void NineEighteen() { // Method encompassing 9x18mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.nineM(nineM[0][random]));
		switch (this.getName()) {
		case "PM":
			this.setCapacity(8);
			this.setRange("Low");
			break;
		case "PP-91":
			this.setCapacity(20);
			this.setRange("Low");
			break;
		}
	}

	private void NineNineteen() { // Method encompassing 9x19mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 4;
		this.setAmmunition(temp.nineM(nineM[1][random]));
		switch (this.getName()) {
		case "MP-443":
			this.setCapacity(18);
			this.setRange("Low");
			break;
		case "Glock 17":
			this.setCapacity(17);
			this.setRange("Low");
			break;
		case "Glock 18C":
			this.setCapacity(17);
			this.setRange("Low");
			break;
		case "M9A3":
			this.setCapacity(17);
			this.setRange("Low");
			break;
		case "Saiga-9":
			this.setCapacity(30);
			this.setRange("Medium");
			break;
		case "STM-9":
			this.setCapacity(33);
			this.setRange("Medium");
			break;
		case "PP-19-01":
			this.setCapacity(30);
			this.setRange("Medium");
			break;
		case "MP5":
			this.setCapacity(30);
			this.setRange("Medium");
			break;
		case "MP9":
			this.setCapacity(25);
			this.setRange("Medium");
			break;
		case "MPX":
			this.setCapacity(30);
			this.setRange("Medium");
			break;
		case "Vector":
			this.setCapacity(33);
			this.setRange("Medium");
			break;
		}
	}

	private void NineTwentyOne() { // Method encompassing 9x21mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.nineM(nineM[2][random]));
		if (this.getName().equals("SP-1MP")) {
			this.setCapacity(18);
			this.setRange("Low");
		}
	}

	private void NineThirtyNine() { // Method encompassing 9x39mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.nineM(nineM[3][random]));
		switch (this.getName()) {
		case "KBP 9A-91":
			this.setCapacity(20);
			this.setRange("Medium");
			break;
		case "AS-VAL":
			this.setCapacity(30);
			this.setRange("Medium");
			break;
		case "VSS Vintorez":
			this.setCapacity(20);
			this.setRange("Medium");
			break;
		}
	}

	private void FortyFive() { // Method encompassing .45 caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.fortyFive(fortyFive[random]));
		if (this.getName().equals("UMP")) {
			this.setCapacity(30);
			this.setRange("Medium");
		}
	}

	private void FourSix() { // Method encompassing 4.6x30mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.fourSix(fourSix[random]));
		if (this.getName().equals("MP7A2")) {
			this.setCapacity(30);
			this.setRange("Medium");
		}
	}

	private void FiveSeven() { // Method encompassing 5.7x28mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.fiveSeven(fiveSeven[random]));
		switch (this.getName()) {
		case "FN 5-7":
			this.setCapacity(20);
			this.setRange("Medium");
			break;
		case "FN P90":
			this.setCapacity(50);
			this.setRange("Medium");
			break;
		}
	}

	private void TwelveGauge() { // Method encompassing 12 gauge caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 5;
		this.setAmmunition(temp.twelveG(twelveG[random]));
		switch (this.getName()) {
		case "MP-133":
			this.setCapacity(6);
			this.setRange("Short");
			break;
		case "MP-153":
			this.setCapacity(5);
			this.setRange("Short");
			break;
		case "Saiga-12K":
			this.setCapacity(5);
			this.setRange("Short");
			break;
		case "M870":
			this.setCapacity(7);
			this.setRange("Short");
			break;
		case "M590A1":
			this.setCapacity(8);
			this.setRange("Short");
			break;
		case "M3 Super 90":
			this.setCapacity(11);
			this.setRange("Short");
			break;
		}
	}

	private void TwentyGauge() { // Method encompassing twenty gauge caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 2;
		this.setAmmunition(temp.twentyG(twentyG[random]));
		if (this.getName().equals("TOZ-106")) {
			this.setCapacity(3);
			this.setRange("Short");
		}
	}

	private void TwentyThreeGauge() { // Method encompassing twenty three gauge caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.twentyThree(twentyThree[random]));
		if (this.getName().equals("KS-23M")) {
			random = (int) Math.random() * 2;
			this.setCapacity(3);
			this.setRange("Short");
		}
	}

	private void ThreeSixSix() { // Method encompassing .366 caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.threeSixSix(threeSixSix[random]));
		if (this.getName().equals("VPO-215")) {
			random = (int) Math.random() * 2;
			this.setCapacity(5);
			this.setRange("Long");
		}
	}

	private void FiveFourFive() { // Method encompassing 5.45x39mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 7;
		this.setAmmunition(temp.fiveFourFive(fiveFourFive[random]));
		switch (this.getName()) {
		case "AKS-74U":
			random = (int) Math.random() * 2;
			this.setCapacity(30);
			this.setRange("Medium");
			break;
		case "AK-74":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "AK-74M":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "AK-105":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "AK-12":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "RPK-16":
			this.setCapacity(60);
			this.setRange("Long");
			break;
		}
	}

	private void FiveFiveSix() { // Method encompassing 5.45x39mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 7;
		this.setAmmunition(temp.fiveFiveSix(fiveFiveSix[random]));
		switch (this.getName()) {
		case "ADAR 2-15":
			this.setCapacity(30);
			this.setRange("Medium");
			break;
		case "TX-15":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "AK-101":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "AK-104":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "M4A1":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "Aug A3":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "HK 416A5":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		}
	}

	private void SevenTwentyFive() { // Method encompassing 7.62x25mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.sevenSixTwo(sevenSixTwo[0][random]));
		switch (this.getName()) {
		case "PPSh-41":
			this.setCapacity(35);
			this.setRange("Medium");
			break;
		case "Golden TT-33":
			this.setCapacity(8);
			this.setRange("Short");
			break;
		}
	}

	private void SevenThirtyNine() { // Method encompassing 7.62x39mm caliber weapons
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 5;
		this.setAmmunition(temp.sevenSixTwo(sevenSixTwo[1][random]));
		switch (this.getName()) {
		case "SKS":
			this.setCapacity(10);
			this.setRange("Long");
			break;
		case "VPO-136":
			this.setCapacity(10);
			this.setRange("Medium");
			break;
		case "AKM":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "AK-104":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "RPD":
			this.setCapacity(100);
			this.setRange("Long");
			break;
		case "RPDN":
			this.setCapacity(100);
			this.setRange("Long");
			break;
		case "Mk47 Mutant":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		}
	}

	private void SevenFiftyOne() {
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 4;
		this.setAmmunition(temp.sevenSixTwo(sevenSixTwo[2][random]));
		switch (this.getName()) {
		case "VPO-101":
			this.setCapacity(10);
			this.setRange("Medium");
			break;
		case "MDR":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "SCAR-L":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "SA-58":
			this.setCapacity(30);
			this.setRange("Long");
			break;
		case "RFB":
			this.setCapacity(20);
			this.setRange("Long");
			break;
		case "SR-25":
			this.setCapacity(20);
			this.setRange("Long");
			break;
		case "M1A":
			this.setCapacity(20);
			this.setRange("Long");
			break;
		case "G28":
			this.setCapacity(10);
			this.setRange("Long");
			break;
		case "RSASS":
			this.setCapacity(20);
			this.setRange("Long");
			break;
		case "M700":
			this.setCapacity(5);
			this.setRange("Long");
			break;
		case "DVL-10":
			this.setCapacity(10);
			this.setRange("Long");
			break;
		case "T-5000":
			this.setCapacity(5);
			this.setRange("Long");
			break;
		}
	}

	private void SevenFiftyFour() {
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 4;
		this.setAmmunition(temp.sevenSixTwo(sevenSixTwo[3][random]));
		switch (this.getName()) {
		case "Mosin":
			this.setCapacity(5);
			this.setRange("Long");
			break;
		case "SV-98":
			this.setCapacity(10);
			this.setRange("Long");
			break;
		case "SVDS":
			this.setCapacity(10);
			this.setRange("Long");
			break;
		case "PKM":
			this.setCapacity(100);
			this.setRange("Long");
			break;
		case "PKP":
			this.setCapacity(100);
			this.setRange("Long");
			break;
		}
	}

	private void ThreeHundred() {
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 4;
		this.setAmmunition(temp.twentyThree(threeHundred[random]));
		if (this.getName().equals("MCX")) {
			this.setCapacity(30);
			this.setRange("Long");
		}
	}

	private void SixEight() {
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 2;
		this.setAmmunition(temp.twentyThree(sixEight[random]));
		if (this.getName().equals("MCX Spear")) {
			this.setCapacity(25);
			this.setRange("Long");
		}
	}

	private void TwelveSeven() {
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.twentyThree(twelveSeven[random]));
		if (this.getName().equals("ASh-12")) {
			this.setCapacity(10);
			this.setRange("Medium");
		}
	}

	private void ThreeThreeEight() {
		Ammo temp = new Ammo();
		int random = (int) Math.random() * 3;
		this.setAmmunition(temp.twentyThree(threeThreeEight[random]));
		if (this.getName().equals("AXMC")) {
			this.setCapacity(5);
			this.setRange("Long");
		}
	}
}
