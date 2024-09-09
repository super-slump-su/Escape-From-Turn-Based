package game;

public class Gun {
	private String name;
	private String range; // Short, medium, long
	private String caliber; // Size of bullets
	private int capacity; // How many bullets in magazine
	private Ammo ammunition;
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
	private String[] fiveFourFive = { "PRS GS", "PS GS", "BT GS", "7N40", "BP GS", "BS GS", "PPBS GS Igolnik" }; // 5.45x39mm rounds indexes 0-6
	private String[] fiveFiveSix = { "Warmageddon", "M856", "M855", "M856A1", "M855A1", "M995", "SSA AP" }; // 5.56x45mm rounds indexes 0-6
	private String[][] sevenSixTwo = { { "TT LRNPC", "TT AKBS", "TT PST GZH" }, // 7.62x25mm rounds indexes 0-2 of row 0
			{ "HP", "T-45M1 GZH", "PS GZH", "BP GZH", "MAI AP" }, // 7.62x39mm rounds indexes 0-4 of row 1
			{ "Ultra Nosler", "M80", "M61", "M993" }, // 7.62x51mm rounds indexes 0-3 of row 2
			{ "HP BT Tracer", "T-46M GZH", "SNB GZH", "BS GS" } }; // 7.62x54R rounds indexes 0-3 of row 3
	private String[] threeHundred = { "Blackout Whisper", "Blackout BCP FMJ", "Blackout CBJ", "Blackout AP" }; // .300 rounds indexes 0-3
	private String[] sixEight = { "SIG FMJ", "SIG Hybrid" }; // 6.8x51mm rounds indexes 0-1
	private String[] twelveSeven = { "PS12A", "PS12", "PS12B" }; // 12.7x55mm rounds indexes 0-2
	private String[] threeThreeEight = { "TAC-X", "UCW", "FMJ", "AP" }; // .338 Lapua Magnum rounds indexes 0-3
	private String[] fortyMM = { "M381 HE", "M433 HEDP", "M576 MP-APERS", // 40x46mm Grenade Launcher Cartridges indexes 0-2
			"VOG-25" }; // 40x53mm grenade launcher cartridge index 3

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
		Ammo temp = new Ammo();
		String ammo = "";
		int random = 0;
		if (this.getName().equals("PM") || this.getName().equals("PP-91")) { // 9x18mm
			this.NineEighteen();
		}
		else if (this.getName().equals("MP-443") || this.getName().equals("Glock 17") || this.getName().equals("Glock 18C") 
				|| this.getName().equals("M9A3") || this.getName().equals("Saiga-9") || this.getName().equals("STM-9")
				|| this.getName().equals("PP-19-01") || this.getName().equals("MP5") || this.getName().equals("MP9")
				|| this.getName().equals("MPX") || this.getName().equals("Vector")) { // 9x19mm
			this.NineNineteen();
		}
		else if (this.getName().equals("SR-1MP")) { // 9x21mm
			random = (int) Math.random() * 3;
			ammo = nineM[2][random];
			this.setAmmunition(temp.nineM(ammo));
		}
		else if (this.getName().equals("KBP 9A-91") || this.getName().equals("AS-VAL") || this.getName().equals("VSS Vintorez")) { // 9x39mm
			random = (int) Math.random() * 3;
			ammo = nineM[3][random];
			this.setAmmunition(temp.nineM(ammo));
		}
		else if (this.getName().equals("UMP")) { // .45
			random = (int) Math.random() * 3;
			ammo = fortyFive[random];
			this.setAmmunition(temp.fortyFive(ammo));
		}
		else if (this.getName().equals("MP7A2")) { // 4.6x30mm
			random = (int) Math.random() * 3;
			ammo = fourSix[random];
			this.setAmmunition(temp.fourSix(ammo));
		}
		else if (this.getName().equals("FN 5-7") || this.getName().equals("FN P90")) { // 5.7x28mm
			random = (int) Math.random() * 3;
			ammo = fiveSeven[random];
			this.setAmmunition(temp.fiveSeven(ammo));
		}
		else if (this.getName().equals("MP-133") || this.getName().equals("MP-153") || this.getName().equals("Saiga-12K")
				|| this.getName().equals("M870") || this.getName().equals("M590A1") || this.getName().equals("M3 Super 90")) { // 12 Gauge
			random = (int) Math.random() * 5;
			ammo = twelveG[random];
			this.setAmmunition(temp.twelveG(ammo));
		}
		else if (this.getName().equals("TOZ-106")) { // 20 Gauge
			random = (int) Math.random() * 2;
			ammo = twentyG[random];
			this.setAmmunition(temp.twentyG(ammo));
		}
		else if (this.getName().equals("KS-23M")) { // 23x75mm
			random = (int) Math.random() * 3;
			ammo = twentyThree[random];
			this.setAmmunition(temp.twentyThree(ammo));
		}
		else if (this.getName().equals("VPO-215")) { // .366
			random = (int) Math.random() * 3;
			ammo = threeSixSix[random];
			this.setAmmunition(temp.threeSixSix(ammo));
		}
		else if (this.getName().equals("AKS-74U") || this.getName().equals("AK-74") || this.getName().equals("AK-74M")
				|| this.getName().equals("AK-105") || this.getName().equals("AK-12") || this.getName().equals("RPK-16")) { // 5.45x39mm
			random = (int) Math.random() * 7;
			ammo = fiveFourFive[random];
			this.setAmmunition(temp.fiveFourFive(ammo));
		}
		else if (this.getName().equals("ADAR 2-15") || this.getName().equals("TX-15") || this.getName().equals("AK-101") 
				|| this.getName().equals("AK-104") || this.getName().equals("M4A1") || this.getName().equals("Aug A3") 
				|| this.getName().equals("HK 416A5")) { // 5.56x45mm
			random = (int) Math.random() * 7;
			ammo = fiveFiveSix[random];
			this.setAmmunition(temp.fiveFiveSix(ammo));
		}
		else if (this.getName().equals("PPSh-41") || this.getName().equals("Golden TT-33")) { // 7.62x25mm
			random = (int) Math.random() * 3;
			ammo = sevenSixTwo[0][random];
			this.setAmmunition(temp.sevenSixTwo(ammo));
		}
		else if (this.getName().equals("SKS") || this.getName().equals("VPO-136") || this.getName().equals("AKM")
				|| this.getName().equals("AK-104") || this.getName().equals("RPD") || this.getName().equals("RPDN")
				|| this.getName().equals("Mk47 Mutant")) { // 7.62x39mm
			random = (int) Math.random() * 5;
			ammo = sevenSixTwo[1][random];
			this.setAmmunition(temp.sevenSixTwo(ammo));
		}
		else if (this.getName().equals("VPO-101") || this.getName().equals("MDR") || this.getName().equals("SCAR-L")
				|| this.getName().equals("SA-58") || this.getName().equals("RFB") || this.getName().equals("SR-25")
				|| this.getName().equals("M1A") || this.getName().equals("G28") || this.getName().equals("RSASS")
				|| this.getName().equals("M700") || this.getName().equals("DVL-10") || this.getName().equals("T-5000")) { // 7.62x51mm
			random = (int) Math.random() * 4;
			ammo = sevenSixTwo[2][random];
			this.setAmmunition(temp.sevenSixTwo(ammo));
		}
		else if (this.getName().equals("Mosin") || this.getName().equals("SV-98") || this.getName().equals("SVDS")
				|| this.getName().equals("PKM") || this.getName().equals("PKP")) { // 7.62x54R
			random = (int) Math.random() * 4;
			ammo = sevenSixTwo[3][random];
			this.setAmmunition(temp.sevenSixTwo(ammo));
		}
		else if (this.getName().equals("MCX")) { // .300
			random = (int) Math.random() * 4;
			ammo = threeHundred[random];
			this.setAmmunition(temp.threeHundred(ammo));
		}
		else if (this.getName().equals("MCX Spear")) { // 6.8x51mm
			random = (int) Math.random() * 2;
			ammo = sixEight[random];
			this.setAmmunition(temp.sixEight(ammo));
		}
		else if (this.getName().equals("ASh-12")) { // 12.7x55mm
			random = (int) Math.random() * 3;
			ammo = twelveSeven[random];
			this.setAmmunition(temp.twelveSeven(ammo));
		}
		else if (this.getName().equals("AXMC")) { // .338 Lapua
			random = (int) Math.random() * 4;
			ammo = threeThreeEight[random];
			this.setAmmunition(temp.threeThreeEight(ammo));
		}
	}
	
	public void NineEighteen() { // Method encompassing 9x18mm caliber weapons
		Ammo temp = new Ammo();
		int random = 0;
		random = (int) Math.random() * 3;
		this.setAmmunition(temp.nineM(nineM[0][random]));
		temp = null;
		if (this.getName().equals("PM")) {
			this.setCapacity(8);
			this.setRange("Low");
		} else if (this.getName().equals("PP-91")) {
			this.setCapacity(30);
			this.setRange("Low");
		}
	}

	public void NineNineteen() { // Method encompassing 9x19mm caliber weapons
		Ammo temp = new Ammo();
		int random = 0;
		random = (int) Math.random() * 4;
		this.setAmmunition(temp.nineM(nineM[1][random]));
		temp = null;
		if (this.getName().equals("MP-443")) {
			this.setCapacity(18);
			this.setRange("Low");
		} else if (this.getName().equals("Glock 17")) {
			this.setCapacity(17);
			this.setRange("Low");
		} else if (this.getName().equals("Glock 18C")) {
			this.setCapacity(17);
			this.setRange("Low");
		} else if (this.getName().equals("M9A3")) {
			this.setCapacity(17);
			this.setRange("Low");
		} else if (this.getName().equals("Saiga-9")) {
			this.setCapacity(30);
			this.setRange("Medium");
		} else if (this.getName().equals("STM-9")) {
			this.setCapacity(33);
			this.setRange("Medium");
		} else if (this.getName().equals("PP-19-01")) {
			this.setCapacity(30);
			this.setRange("Medium");
		} else if (this.getName().equals("MP5")) {
			this.setCapacity(30);
			this.setRange("Medium");
		} else if (this.getName().equals("MP9")) {
			this.setCapacity(25);
			this.setRange("Medium");
		} else if (this.getName().equals("MPX")) {
			this.setCapacity(30);
			this.setRange("Medium");
		} else if (this.getName().equals("Vector")) {
			this.setCapacity(33);
			this.setRange("Medium");
		}
	}
	public void NineTwentyOne() { // Method encompassing 9x21mm caliber weapons
		Ammo temp = new Ammo();
		int random = 0;
		random = (int) Math.random() * 3;
		this.setAmmunition(temp.nineM(nineM[2][random]));
		temp = null;
		if (this.getName().equals("MP-443")) {
			this.setCapacity(18);
			this.setRange("Low");
		}
	}
}
