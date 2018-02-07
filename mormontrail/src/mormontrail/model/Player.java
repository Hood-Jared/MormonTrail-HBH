/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
*
* @author Chaskiel, Jared, Heather
*/
public class Player implements Serializable{
   
	//class instance variables
	private String name;
	private int stamina;
	private int age;
	private int gender;
	private int huntingSkill;
	private int gatheringSkill;
	private int money;
	private int healthStatus;
	private ArrayList<Game> games = new ArrayList<Game>();
   
    public Player() {
   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getHuntingSkill() {
		return huntingSkill;
	}

	public void setHuntingSkill(int huntingSkill) {
		this.huntingSkill = huntingSkill;
	}

	public int getGatheringSkill() {
		return gatheringSkill;
	}

	public void setGatheringSkill(int gatheringSkill) {
		this.gatheringSkill = gatheringSkill;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(int healthStatus) {
		this.healthStatus = healthStatus;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
	

	@Override
	public String toString() {
		return "Player{" + "name=" + name + ", stamina=" + stamina + ", age=" + age + ", gender=" + gender + ", huntingSkill=" + huntingSkill + ", gatheringSkill=" + gatheringSkill + ", money=" + money + ", healthStatus=" + healthStatus + '}';
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 43 * hash + Objects.hashCode(this.name);
		hash = 43 * hash + this.stamina;
		hash = 43 * hash + this.age;
		hash = 43 * hash + this.gender;
		hash = 43 * hash + this.huntingSkill;
		hash = 43 * hash + this.gatheringSkill;
		hash = 43 * hash + this.money;
		hash = 43 * hash + this.healthStatus;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Player other = (Player) obj;
		if (this.stamina != other.stamina) {
			return false;
		}
		if (this.age != other.age) {
			return false;
		}
		if (this.gender != other.gender) {
			return false;
		}
		if (this.huntingSkill != other.huntingSkill) {
			return false;
		}
		if (this.gatheringSkill != other.gatheringSkill) {
			return false;
		}
		if (this.money != other.money) {
			return false;
		}
		if (this.healthStatus != other.healthStatus) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		return true;
	}

	
  
   
   
   
}