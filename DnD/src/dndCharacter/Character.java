/**
 * 
 */
package dndCharacter;

/**
 * @author Sean Butler
 *
 */

import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.*;

public class Character {
	
	//core stats
	int level, maxHP, currentHP, strScore, strMod, dexScore, dexMod, conScore, conMod, intScore;
	int intMod, wisScore, wisMod, chaScore, chaMod;
	
	int numberOfStats = 15;
	List<String> statsArray;
	
	//skills
	int acrobatics, animal, arcana, athletics, deception, history, insight, intimidation, 
	investigation, medicine, nature, perception, performance, persuasion, religion, 
	sleight, stealth, survival;
	
	int numberOfSkills = 18;
	List<String> skillsArray;
	
	//Saving Throws
	int strSave; int dexSave; int conSave; int intSave; int wisSave; int chaSave;
	List<String> savingThrows;
	
	
	//Read from saved .txt file core stats of str,int ect and then runs
	// readCoreStatsFromFile - assigns variables to data saved to array from above action
	// returnCoreStats - prints core stats
	
	public void getSavingThrows() throws Exception  {
		String fileName = "Sean\\SavingThrows.txt";
		Path path = Paths.get(fileName);
		byte[] bytes = Files.readAllBytes(path);
		savingThrows = Files.readAllLines(path, StandardCharsets.UTF_16);
		
		this.readSavingThrowsFromFile();
		this.returnSavingThrows();
	  }
	
	
	public void readSavingThrowsFromFile() {
		strSave = Integer.parseInt(savingThrows.get(0));
		dexSave = Integer.parseInt(savingThrows.get(1));
		conSave = Integer.parseInt(savingThrows.get(2));
		intSave = Integer.parseInt(savingThrows.get(3));
		wisSave = Integer.parseInt(savingThrows.get(4));
		chaSave = Integer.parseInt(savingThrows.get(5));
	}
	
	public void returnSavingThrows() {
		System.out.println(this.getStrSave());
		System.out.println(this.getDexSave());
		System.out.println(this.getConSave());
		System.out.println(this.getIntSave());
		System.out.println(this.getWisSave());
		System.out.println(this.getChaSave() + "\n");
	}
	
	
	public String getStrSave() {
		return "Str Save: " + strSave;
	}


	public String getDexSave() {
		return "Dex Save: " + dexSave;
	}


	public String getConSave() {
		return "Con Save: " + conSave;
	}


	public String getIntSave() {
		return "Int Save: " + intSave;
	}

	public String getWisSave() {
		return "Wis Save: " + wisSave;
	}

	public String getChaSave() {
		return "Cha Save: " + chaSave;
	}


	public void getCoreStats() throws Exception  {
		String fileName = ("Sean\\CoreStats.txt");
		
		try {
			Path path = Paths.get(fileName);
			byte[] bytes = Files.readAllBytes(path);
			statsArray = Files.readAllLines(path, StandardCharsets.UTF_16);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.readCoreStatsFromFile();
		this.returnCoreStats();
	  }
	
	
	public void readCoreStatsFromFile() {
		level = Integer.parseInt(statsArray.get(0));
		maxHP = Integer.parseInt(statsArray.get(1));
		currentHP = Integer.parseInt(statsArray.get(2));
		strScore = Integer.parseInt(statsArray.get(3));
		strMod = Integer.parseInt(statsArray.get(4));
		dexScore = Integer.parseInt(statsArray.get(5));
		dexMod = Integer.parseInt(statsArray.get(6));
		conScore = Integer.parseInt(statsArray.get(7));
		conMod = Integer.parseInt(statsArray.get(8));
		intScore = Integer.parseInt(statsArray.get(9));
		intMod = Integer.parseInt(statsArray.get(10));
		wisScore = Integer.parseInt(statsArray.get(11));
		wisMod = Integer.parseInt(statsArray.get(12));
		chaScore = Integer.parseInt(statsArray.get(13));
		chaMod = Integer.parseInt(statsArray.get(14));
	}
	
	public void returnCoreStats() {
		System.out.println( ("Level = " + level + "\n" +
				"maxHP = " + maxHP + "\n" +
				"currentHP = " + currentHP + "\n" + 
				"strScore = " + strScore + "\n" +
				"strMod = " + strMod + "\n" +
				"dexScore = " + dexScore + "\n" +
				"dexMod = " + dexMod + "\n" +
				"conScore = " + conScore + "\n" +
				"conMod = " + conMod + "\n" +
				"intScore = " + intScore + "\n" +
				"intMod = " + intMod + "\n" +
				"wisScore = " + wisScore + "\n" +
				"wisMod = " + wisMod + "\n" +
				"chaScore = " + chaScore + "\n" +
				"chaMod = " + chaMod + "\n"));
	}

	public void getSkills() throws Exception{
		String fileName = "Sean\\Skills.txt";
		Path path = Paths.get(fileName);
		byte[] bytes = Files.readAllBytes(path);
		skillsArray = Files.readAllLines(path, StandardCharsets.UTF_16);
		
		this.readSkillsFromFile();
		this.returnSkills();
	}
	
	public void readSkillsFromFile() {
		acrobatics = Integer.parseInt(skillsArray.get(0));
		animal  = Integer.parseInt(skillsArray.get(1));
		arcana  = Integer.parseInt(skillsArray.get(2));
		athletics = Integer.parseInt(skillsArray.get(3));
		deception = Integer.parseInt(skillsArray.get(4));
		history = Integer.parseInt(skillsArray.get(5));
		insight = Integer.parseInt(skillsArray.get(6));
		intimidation = Integer.parseInt(skillsArray.get(7));
		investigation = Integer.parseInt(skillsArray.get(8));
		medicine = Integer.parseInt(skillsArray.get(9));
		nature = Integer.parseInt(skillsArray.get(10));
		perception = Integer.parseInt(skillsArray.get(11));
		performance = Integer.parseInt(skillsArray.get(12));
		persuasion = Integer.parseInt(skillsArray.get(13));
		religion = Integer.parseInt(skillsArray.get(14));
		sleight = Integer.parseInt(skillsArray.get(15));
		stealth = Integer.parseInt(skillsArray.get(16));
		survival = Integer.parseInt(skillsArray.get(17));
	}
	
	public void returnSkills() {
		System.out.println("Acrobatics = " + acrobatics + "\n" + 
							"Animal Handling = " + animal + "\n" +
							"Arcana = " + arcana + "\n" +
							"Athletics = " + athletics + "\n" +
							"Deception = " + deception + "\n" +
							"History = " + history + "\n" +
							"Intimidation = " + intimidation + "\n" +
							"Investigation = " + investigation + "\n" +
							"Medicine = " + medicine + "\n" +
							"Perception = " + perception + "\n" +
							"Performance = " + performance + "\n" +
							"Persuasion = " + persuasion + "\n" +
							"Religion = " + religion + "\n" +
							"Sleight = " + sleight + "\n" +
							"Stealth = " + stealth + "\n" +
							"Survival = " + survival + "\n");
		
	}
	
	public void rollDice(int numberOfDice, int diceCounter) {
		int var = 1;
		for(int i = 0; i < numberOfDice; i++) {
			var += new Random().nextInt(diceCounter);
		}
		System.out.println("You rolled " + numberOfDice + "d" + diceCounter + " to get = " + var + "\n");
	}
	
	public void rollAttack() {
		int var = 0;
		int totalVar = 0;
		System.out.println("Rolling Weapon Damage:");
		// Main damage on wep - 3d12
		for(int i = 0; i < 3; i++) {
			var += new Random().nextInt(1 + 12);
		}
		System.out.println("Main Damage = " + var);
		//reset Var to zero to be able to print each indiviudal damage
		totalVar += var;
		var = 0;
		
		// Radiant damage on wep - 2d12
		for(int i = 0; i < 2; i++) {
			var += new Random().nextInt(1 + 8);
		}
		System.out.println("Radiant Damage = " + var);
		//reset Var to zero to be able to print each indiviudal damage
		totalVar += var;
		var = 0;
		
		// Sneak damage - 9d6
		for(int i = 0; i < 9; i++) {
			var += new Random().nextInt(1 + 6);
		}
		System.out.println("Sneak Damage = " + var);
		//reset Var to zero to be able to print each indiviudal damage
		totalVar += var;
		var = 0;
		
		//+10 due to +4 on wep and +6 of dex
		totalVar += 10;
		
		System.out.println("Total Damage = " + totalVar);
	}
	

	public static void main(String[] args) throws Exception {
		Character me = new Character();
		me.getCoreStats();
		me.getSkills();
		me.getSavingThrows();
		//1st int - number of dice, 2nd max dice number ie 5,10 to roll 5 lots of 10 sided dice
		me.rollDice(1, 20);
		me.rollAttack();
	}
	
	

}
