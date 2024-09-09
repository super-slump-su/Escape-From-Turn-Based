package game;

public class Enemy {
	private String name; // Textual name of enemy
	private String enemyType; // Specific enemy type (Scav, PMC, Boss)
	private String faction; // Overall faction
	private boolean group; // Solo or group
	private int followers; // Number of followers if in a group
	private boolean raiders; // Scavenger raiders or not
	private boolean boss; // Boss type or not
	private boolean rogues; // Rogues or not
	private boolean goons; // Goons or not
	private double totalHealth; // Combined head and body health pool
	private double headHealth; // Head health pool
	private double bodyHealth; // Body health pool
	private double aim; // Aim modifier based on enemy difficulty (Worst aim to best: Scavengers, PMCs/Raiders, Rogues/Boss Guards, Bosses)
	private Gun primary; // Primary weapon
	private String primaryWeapon; // Name of primary weapon
	private Gun secondary; // Secondary weapon if equipped
	private String secondaryWeapon; // Name of secondary weapon if equipped
	private String[] scavWeapons = { "PM", "SR-1MP", "MP-443", // Pistols indexes 0-2
			"TOZ-106", "MP-133", "MP-153", "Saiga-12K", // Shotguns indexes 3-6
			"PP-91", "Saiga-9", "STM-9", "PPSh-41", // SMGs indexes 7-10
			"AKS-74U", "AK-74", // Assault rifles indexes 11-12
			"SKS", "VPO-101", "VPO-136", "ADAR 2-15", // Assault carbines indexes 13-16
			"VPO-215", "Mosin" }; // Snipers indexes 17-18
	private String[] BEARWeapons = { "PM", "SR-1MP", "MP-443", // Pistols indexes 0-2
			"MP-133", "MP-153", "Saiga-12K", "KS-23M", // Shotguns indexes 3-6
			"PP-91", "PP19-01", "STM-9", "PPSh-41", // SMGs indexes 7-10
			"AKS-74U", "AK-74", "AK-104", "AKM", "ASh-12", "AS VAL", // Assault rifles indexes 11-16
			"SKS", "VPO-101", "VPO-136", "ADAR 2-15", "SVDS", // Assault carbines and DMRs indexes 17-21
			"VPO-215", "Mosin", "SV-98", "T-5000" }; // Snipers indexes 22-25
	private String[] USECWeapons = { "Glock 17", "FN 5-7", "M9A3", // Pistols indexes 0-2
			"M870", "M590A1", "M3 Super 90", // Shotguns indexes 3-5
			"MP5", "MP7A2", "MP9", "MPX", "FN P90", "UMP", "Vector", // SMGs indexes 6-12
			"MCX", "M4A1", "MDR", "SCAR-L", "SA-58", // Assault rifles indexes 13-17
			"TX-15", "RFB", "SR-25", "M1A", "G28", "RSASS", // Assault carbines and DMRs indexes 18-23
			"M700", "DVL-10", "AXMC" }; // Snipers indexes 24-26
	private String[] raiderWeapons = { "AS-VAL", "KBP 9A-91", "AKS-74U", "AK-74M", "AK-12", "AK-104", "AK-105", // RUS weaponry indexes 0-6
			"MP7A2", "FN P90", "MP5", "MCX", "MDR", "M4A1", "AUG A3", "SA-58" }; // UN weaponry indexes 7-14
	private String[] rogueWeapons = { "MCX Spear", "MDR", "M4A1", "HK 416A5", "AUG A3", "SA-58" }; // UN weaponry indexes 0-5
	/*
	 * Various accessor and modifier methods for above instance variables.
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnemyType() {
		return enemyType;
	}

	public void setEnemyType(String type) {
		this.enemyType = type;
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	public Boolean getRaiders() {
		return raiders;
	}

	public void setRaiders(Boolean raiders) {
		this.raiders = raiders;
	}

	public Boolean getRogues() {
		return rogues;
	}

	public void setRogues(Boolean rogues) {
		this.rogues = rogues;
	}

	public Boolean getGoons() {
		return goons;
	}

	public void setGoons(Boolean goons) {
		this.goons = goons;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}

	public Boolean getGroup() {
		return group;
	}

	public void setGroup(Boolean group) {
		this.group = group;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public double getTotalHealth() {
		return totalHealth;
	}

	public void setTotalHealth(double health) {
		this.totalHealth = health;
	}

	public double getHeadHealth() {
		return headHealth;
	}

	public void setHeadHealth(double health) {
		this.headHealth = health;
	}

	public double getBodyHealth() {
		return bodyHealth;
	}

	public void setBodyHealth(double health) {
		this.bodyHealth = health;
	}

	public double getAim() {
		return aim;
	}

	public void setAim(double aim) {
		this.aim = aim;
	}

	public String getPrimaryWeapon() {
		return primaryWeapon;
	}

	public void setPrimaryWeapon(String weapon) {
		this.primaryWeapon = weapon;
	}

	public String getSecondaryWeapon() {
		return secondaryWeapon;
	}

	public void setSecondaryWeapon(String weapon) {
		this.secondaryWeapon = weapon;
	}

	public Gun getPrimary() {
		return primary;
	}

	public void setPrimary(Gun primary) {
		this.primary = primary;
	}

	public Gun getSecondary() {
		return secondary;
	}

	public void setSecondary(Gun secondary) {
		this.secondary = secondary;
	}

	private void setPrimary(String weapon) {
		this.primary = new Gun(weapon);
	}

	private void setSecondary(String weapon) {
		this.secondary = new Gun(weapon);
	}
	/*
	 * Overall method for creating enemies for the player to fight.
	 * Creates an array of Enemy types for the current enemy encounter.
	 */
	public Enemy[] createEnemies(String map, String time) {
		Enemy[] temp = new Enemy[4];
		Enemy first = new Enemy();
		int random = (int) (Math.random() * (20)) + 1;
		if (random < 11) { // Majority of enemies fought will be scavengers (scavs)
			first.setEnemyType("Scavenger");
			first.setBoss(false);
			random = (int) (Math.random() * 5) + 1;
			if (random > 2) { // Three-fifths chance of a group of scavs (duo, trio, or squad)
				first.setGroup(true);
				random = (int) (Math.random() * 3) + 2;
				for (int i = 0; i < random; i++) {
					temp[i] = createScav();
					temp[i].setGroup(true);
				}
			} else {
				temp[0] = createScav();
				temp[0].setGroup(false);
			}
		} else if (random > 10 && random < 16) { // Second largest population of enemies will be PMCs
			first.setEnemyType("PMC");
			first.setBoss(false);
			random = (int) (Math.random() * 5) + 1;
			if (random > 4) { // One-fifth chance of a group of PMCs (duo, trio, or squad)
				first.setGroup(true);
				random = (int) (Math.random() * 3) + 2;
				if (random == 1) { // BEAR squad
					random = (int) (Math.random() * 4) + 1;
					for (int i = 0; i < random; i++) {
						temp[i] = createBEAR();
						temp[i].setGroup(true);
					}
				} else { // USEC squad
					random = (int) (Math.random() * 3) + 2;
					for (int i = 0; i < random; i++) {
						temp[i] = createUSEC();
						temp[i].setGroup(true);
					}
				}
			} else {
				random = (int) (Math.random() * 2) + 1;
				if (random == 1) { // Solo BEAR
					temp[0] = createBEAR();
					temp[0].setGroup(false);
				} else { // Solo USEC
					temp[0] = createUSEC();
					temp[0].setGroup(false);
				}
			}
		} else { // Bosses, rogues, or raiders depending on map
			first.setEnemyType("Boss");
			first.setBoss(true);
			if (map.equals("Day")) {
				if (map.equals("Customs")) { // Reshala or the Goons
					random = (int) (Math.random() * (20)) + 1;
					if (random > 15) { // One-quarter chance of the Goons
						temp = createGoons();
					} else { // Reshala
						temp[0] = createBoss(map, time);
					}
				} else if (map.equals("Woods")) { // Shturman or the Goons
					random = (int) (Math.random() * (20)) + 1;
					if (random > 15) { // One-quarter chance of the Goons
						temp = createGoons();
					} else { // Shturman
						temp[0] = createBoss(map, time);
					}
				} else if (map.equals("Shoreline")) { // Sanitar or the Goons
					random = (int) (Math.random() * (20)) + 1;
					if (random > 15) { // One-quarter chance of the Goons
						temp = createGoons();
					} else { // Sanitar
						temp[0] = createBoss(map, time);
					}
				} else if (map.equals("Lighthouse")) { // Zryachiy, the Goons, or Rogues
					random = (int) (Math.random() * (20)) + 1;
					if (random < 6) { // One-quarter chance of the Goons
						temp = createGoons();
					} else if (random < 16) { // One-half chance of a squad of Rogues
						temp = createRogues();
					} else { // One-quarter chance of Zryachiy
						temp[0] = createBoss(map, time);
					}
				} else if (map.equals("Reserve")) { // Glukhar or Raiders
					random = (int) (Math.random() * (20)) + 1;
					if (random < 16) { // Three-quarters chance of Raiders
						temp = createRaiders();
					} else { // One-quarter chance of Glukhar
						temp[0] = createBoss(map, time);
					}
				}
				else if (map.equals("Labs")) { // Raiders
						temp = createRaiders();
				}
				temp[0] = createBoss(map, time);
				if (temp[0].getGroup()) {
					for (int i = 1; i < (temp[0].getFollowers() + 1); i++) {
						temp[i] = createGuard();
					}
				}
			}
		}
		first = null;
		return temp;
	}

	public Enemy createScav() {
		Enemy scav = new Enemy();
		scav.setName("The scav");
		scav.setEnemyType("Scav");
		scav.setFaction("Scavengers");
		scav.setTotalHealth(440);
		scav.setHeadHealth(35);
		scav.setBodyHealth(405);
		scav.setRaiders(false);
		scav.setRogues(false);
		scav.setGoons(false);
		scav.setBoss(false);
		scav.setGroup(false);
		scav.setFollowers(0);
		int random = (int) (Math.random() * 17) + 3;
		if (random != 19) { // Scav non-pistols indexes 3-18
			scav.setPrimaryWeapon(scavWeapons[random]);
			scav.setPrimary(scavWeapons[random]);
			scav.setSecondaryWeapon("");
		} else { // Scav pistols indexes 0-2
			scav.setPrimaryWeapon("");
			random = (int) (Math.random() * 3);
			scav.setSecondaryWeapon(scavWeapons[random]);
			scav.setSecondary(scavWeapons[random]);
		}
		return scav;
	}

	public Enemy createBEAR() {
		Enemy bear = new Enemy();
		bear.setName("The BEAR");
		bear.setEnemyType("PMC");
		bear.setFaction("BEAR");
		bear.setTotalHealth(440);
		bear.setHeadHealth(35);
		bear.setBodyHealth(405);
		bear.setRaiders(false);
		bear.setRogues(false);
		bear.setGoons(false);
		bear.setBoss(false);
		bear.setGroup(false);
		bear.setFollowers(0);
		int random = (int) (Math.random() * 24) + 3;
		if (random != 26) { // BEAR non-pistols indexes 3-25
			bear.setPrimaryWeapon(BEARWeapons[random]);
			bear.setPrimary(BEARWeapons[random]);
			bear.setSecondaryWeapon("");
		} else { // BEAR pistols indexes 0-2
			bear.setPrimaryWeapon("");
			random = (int) (Math.random() * 3);
			bear.setSecondaryWeapon(BEARWeapons[random]);
			bear.setSecondary(BEARWeapons[random]);
		}
		return bear;
	}

	public Enemy createUSEC() {
		Enemy usec = new Enemy();
		usec.setName("The USEC");
		usec.setEnemyType("PMC");
		usec.setFaction("USEC");
		usec.setTotalHealth(440);
		usec.setHeadHealth(35);
		usec.setBodyHealth(405);
		usec.setRaiders(false);
		usec.setRogues(false);
		usec.setGoons(false);
		usec.setBoss(false);
		usec.setGroup(false);
		usec.setFollowers(0);
		int random = (int) (Math.random() * 25) + 3;
		if (random != 27) { // USEC non-pistols indexes 3-26
			usec.setPrimaryWeapon(USECWeapons[random]);
			usec.setPrimary(USECWeapons[random]);
			usec.setSecondaryWeapon("");
		} else { // USEC pistols indexes 0-2
			usec.setPrimaryWeapon("");
			random = (int) (Math.random() * 3);
			usec.setSecondaryWeapon(USECWeapons[random]);
			usec.setSecondary(USECWeapons[random]);
		}
		return usec;
	}

	/*
	 * Raiders will appear in squads of four. They primarily spawn in the Labs, but
	 * have appeared in the Reserve. They are stronger than typical scavengers and
	 * will have a larger health pool. They also have better aim.
	 */
	public Enemy[] createRaiders() {
		Enemy[] raiders = new Enemy[4];
		for (int i = 0; i < 4; i++) {
			Enemy temp = new Enemy();
			temp.setName("The raider");
			temp.setEnemyType("Raiders");
			temp.setFaction("Scavengers");
			temp.setTotalHealth(752);
			temp.setHeadHealth(42);
			temp.setBodyHealth(710);
			temp.setRaiders(false);
			temp.setRogues(true);
			temp.setGoons(false);
			temp.setBoss(true);
			temp.setGroup(true);
			temp.setFollowers(0);
			int random = (int) (Math.random() * 15);
			temp.setPrimaryWeapon(raiderWeapons[random]);
			temp.setPrimary(raiderWeapons[random]);
		}
		return raiders;
	}

	public Enemy[] createRogues() {
		Enemy[] rogues = new Enemy[4];
		for (int i = 0; i < 4; i++) {
			Enemy temp = new Enemy();
			temp.setName("The rogue");
			temp.setEnemyType("Boss");
			temp.setFaction("Rogues");
			temp.setTotalHealth(780);
			temp.setHeadHealth(40);
			temp.setBodyHealth(740);
			temp.setRaiders(false);
			temp.setRogues(true);
			temp.setGoons(false);
			temp.setBoss(true);
			temp.setGroup(true);
			temp.setFollowers(0);
			int random = (int) (Math.random() * 6);
			temp.setPrimaryWeapon(rogueWeapons[random]);
			temp.setPrimary(rogueWeapons[random]);
		}
		return rogues;
	}

	public Enemy createGuard() { // Followers of the Boss
		Enemy guard = new Enemy();
		guard.setName("The boss's guard");
		guard.setEnemyType("Scav");
		guard.setFaction("Scavengers");
		guard.setTotalHealth(580);
		guard.setHeadHealth(40);
		guard.setBodyHealth(540);
		guard.setRaiders(false);
		guard.setRogues(false);
		guard.setGoons(false);
		guard.setBoss(false);
		guard.setGroup(true);
		guard.setFollowers(0);
		int random = (int) (Math.random() * 2) + 1;
		if (random == 1) { // USEC weaponry
			random = (int) (Math.random() * 25) + 3;
			guard.setPrimaryWeapon(USECWeapons[random]);
			guard.setPrimary(USECWeapons[random]);
			guard.setSecondaryWeapon("");
		} else { // BEAR weaponry
			random = (int) (Math.random() * 24) + 3;
			guard.setPrimaryWeapon(BEARWeapons[random]);
			guard.setPrimary(BEARWeapons[random]);
			guard.setSecondaryWeapon("");
		}
		return guard;
	}

	public Enemy createBoss(String map, String time) {
		Enemy boss = new Enemy();
		boss.setEnemyType("Boss");
		boss.setFaction("Scavengers");
		boss.setBoss(true);
		if (time.equals("Day")) { // Daytime bosses
			if (map.equals("Factory")) { // Tagilla
				boss.setName("Tagilla");
				boss.setTotalHealth(1220);
				boss.setHeadHealth(100);
				boss.setBodyHealth(1120);
				boss.setRaiders(false);
				boss.setRogues(false);
				boss.setGoons(false);
				boss.setGroup(false);
				boss.setFollowers(0);
				int random = (int) (Math.random() * 2) + 1;
				if (random == 1) {
					boss.setPrimaryWeapon("Saiga-12K"); // 12 Gauge
					boss.setPrimary("Saiga-12K");
					boss.setSecondaryWeapon("Dead Blow Hammer");
				} else {
					boss.setPrimaryWeapon("AKS-74U"); // 5.45x39mm
					boss.setPrimary("AKS-74U");
					boss.setSecondaryWeapon("Dead Blow Hammer");
				}
			}
			if (map.equals("Interchange")) { // Killa
				boss.setName("Killa");
				boss.setTotalHealth(890);
				boss.setHeadHealth(70);
				boss.setBodyHealth(820);
				boss.setRaiders(false);
				boss.setRogues(false);
				boss.setGoons(false);
				boss.setGroup(false);
				boss.setFollowers(0);
				boss.setPrimaryWeapon("RPK-16"); // 5.45x39mm
				boss.setPrimary("RPK-16");
			}
			if (map.equals("Reserve")) { // Glukhar
				boss.setName("Glukhar");
				boss.setTotalHealth(1010);
				boss.setHeadHealth(70);
				boss.setBodyHealth(940);
				boss.setRaiders(false);
				boss.setRogues(false);
				boss.setGoons(false);
				boss.setGroup(true);
				boss.setFollowers(3);
				boss.setPrimaryWeapon("ASh-12"); // 12.7x55mm
				boss.setPrimary("ASh-12");
			}
			if (map.equals("Streets")) { // Kaban or Kollontay
				int random = (int) (Math.random() * (20)) + 1;
				if (random < 11) { // Kaban
					boss.setName("Kaban");
					boss.setTotalHealth(1300);
					boss.setHeadHealth(85);
					boss.setBodyHealth(1215);
					boss.setRaiders(false);
					boss.setRogues(false);
					boss.setGoons(false);
					boss.setGroup(true);
					boss.setFollowers(3);
					random = (int) (Math.random() * 2) + 1;
					if (random == 1) {
						boss.setPrimaryWeapon("PKM"); // 7.62x54R
						boss.setPrimary("PKM");
					} else {
						boss.setPrimaryWeapon("PKP"); // 7.62x54R
						boss.setPrimary("PKP");
					}
				} else { // Kollontay
					boss.setName("Kollontay");
					boss.setTotalHealth(1055);
					boss.setHeadHealth(65);
					boss.setBodyHealth(990);
					boss.setRaiders(false);
					boss.setRogues(false);
					boss.setGoons(false);
					boss.setGroup(true);
					boss.setFollowers(3);
					if (random == 1) {
						boss.setPrimaryWeapon("RPD"); // 7.62x39mm
						boss.setPrimary("RPD");
						boss.setSecondaryWeapon("PR-Taran Baton");
					} else {
						boss.setPrimaryWeapon("RPDN"); // 7.62x39mm
						boss.setPrimary("RPDN");
						boss.setSecondaryWeapon("PR-Taran Baton");
					}
				}
			}
			if (map.equals("Customs")) { // Reshala
				boss.setName("Reshala");
				boss.setTotalHealth(812);
				boss.setHeadHealth(62);
				boss.setBodyHealth(750);
				boss.setRaiders(false);
				boss.setRogues(false);
				boss.setGoons(false);
				boss.setGroup(true);
				boss.setFollowers(3);
				boss.setPrimaryWeapon("AK-101"); // 5.56x45mm
				boss.setPrimary("AK-101");
				boss.setSecondaryWeapon("Golden TT-33"); // 7.62x25mm
				boss.setSecondary("Golden TT-33");
			}
			if (map.equals("Woods")) { // Shturman
				boss.setName("Shturman");
				boss.setTotalHealth(812);
				boss.setHeadHealth(62);
				boss.setBodyHealth(750);
				boss.setRaiders(false);
				boss.setRogues(false);
				boss.setGoons(false);
				boss.setGroup(true);
				boss.setFollowers(2);
				boss.setPrimaryWeapon("SVDS"); // 7.62x54R
				boss.setPrimary("SVDS");
				boss.setSecondaryWeapon("Red Rebel Icepick");
			}
			if (map.equals("Shoreline")) { // Sanitar
				boss.setName("Sanitar");
				boss.setTotalHealth(812);
				boss.setHeadHealth(62);
				boss.setBodyHealth(750);
				boss.setRaiders(false);
				boss.setRogues(false);
				boss.setGoons(false);
				boss.setGroup(true);
				boss.setFollowers(3);
				boss.setPrimaryWeapon("VSS Vintorez"); // 9x39mm
				boss.setPrimary("VSS Vintorez");
			}
			if (map.equals("Lighthouse")) { // Zryachiy or Rogues
				int random = (int) (Math.random() * (20)) + 1;
				if (random < 5) { // Zryachiy
					boss.setName("Zryachiy");
					boss.setTotalHealth(812);
					boss.setHeadHealth(62);
					boss.setBodyHealth(750);
					boss.setRaiders(false);
					boss.setRogues(false);
					boss.setGoons(false);
					boss.setGroup(true);
					boss.setFollowers(2);
					boss.setPrimaryWeapon("SVDS"); // 7.62x54R
					boss.setPrimary("SVDS");
				}
			}
		} else { // Nighttime bosses and cultists

		}
		return boss;
	}

	public Enemy[] createGoons() { // The Goons
		Enemy[] goons = new Enemy[4];
		Enemy knight = new Enemy();
		knight.setName("Knight");
		knight.setEnemyType("Boss");
		knight.setFaction("Rogues");
		knight.setTotalHealth(1120);
		knight.setHeadHealth(80);
		knight.setBodyHealth(1040);
		knight.setRaiders(false);
		knight.setRogues(false);
		knight.setGoons(true);
		knight.setBoss(true);
		knight.setGroup(true);
		knight.setFollowers(0);
		knight.setPrimaryWeapon("Mk47 Mutant"); // 7.62x39mm
		knight.setPrimary("Mk47 Mutant");
		knight.setSecondaryWeapon("Glock 18C"); // 9x19mm
		knight.setSecondary("Glock 18C");
		goons[0] = knight;
		Enemy bigPipe = new Enemy();
		bigPipe.setName("Big Pipe");
		bigPipe.setEnemyType("Boss");
		bigPipe.setFaction("Rogues");
		bigPipe.setTotalHealth(910);
		bigPipe.setHeadHealth(70);
		bigPipe.setBodyHealth(840);
		bigPipe.setRaiders(false);
		bigPipe.setRogues(false);
		bigPipe.setGoons(true);
		bigPipe.setBoss(true);
		bigPipe.setGroup(true);
		bigPipe.setFollowers(0);
		bigPipe.setPrimaryWeapon("MCX"); // .300
		bigPipe.setPrimary("MCX");
		bigPipe.setSecondaryWeapon("M32A1 MSGL"); // 40x46mm
		bigPipe.setSecondary("M32A1 MSGL");
		goons[1] = bigPipe;
		Enemy birdeye = new Enemy();
		birdeye.setName("Birdeye");
		birdeye.setEnemyType("Boss");
		birdeye.setFaction("Rogues");
		birdeye.setTotalHealth(795);
		birdeye.setHeadHealth(70);
		birdeye.setBodyHealth(725);
		birdeye.setRaiders(false);
		birdeye.setRogues(false);
		birdeye.setGoons(true);
		birdeye.setBoss(true);
		birdeye.setGroup(true);
		birdeye.setFollowers(0);
		birdeye.setPrimaryWeapon("RSASS"); // 7.62x51mm
		birdeye.setPrimary("RSASS");
		birdeye.setSecondaryWeapon("M9A3"); // 9x19mm
		birdeye.setSecondary("M9A3");
		goons[2] = birdeye;
		return goons;
	}

	public void shoot() {

	}
}
