/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.model;

/**
*
* @author Chaskiel, Jared, Heather
*/

import java.io.Serializable;
import java.util.Objects;
import mormontrail.controller.MapControl;
import mormontrail.controller.InventoryItems;


public class Game implements Serializable{
   
	// class instance variables
	public int daysOnTrail;
	public int pace;
	public double milesTraveled;
	public double currentMoneyBalance;
	private Player player;
	private MapControl map;
	private InventoryItems[] inventory;

	public InventoryItems[] getInventory() {
		return inventory;
	}

	public void setInventory(InventoryItems[] inventory) {
		this.inventory = inventory;
	}
   
    public Game() {
   }

	public int getDaysOnTrail() {
		return daysOnTrail;
	}

	public void setDaysOnTrail(int daysOnTrail) {
		this.daysOnTrail = daysOnTrail;
	}

	public int getPace() {
		return pace;
	}

	public void setPace(int pace) {
		this.pace = pace;
	}

	public double getMilesTraveled() {
		return milesTraveled;
	}

	public void setMilesTraveled(double milesTraveled) {
		this.milesTraveled = milesTraveled;
	}

	public double getCurrentMoneyBalance() {
		return currentMoneyBalance;
	}

	public void setCurrentMoneyBalance(double currentMoneyBalance) {
		this.currentMoneyBalance = currentMoneyBalance;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public MapControl getMap() {
		return map;
	}

	public void setMap(MapControl map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Game{" + "daysOnTrail=" + daysOnTrail + ", pace=" + pace + ", milesTraveled=" + milesTraveled + ", currentMoneyBalance=" + currentMoneyBalance + '}';
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 67 * hash + this.daysOnTrail;
		hash = 67 * hash + this.pace;
		hash = 67 * hash + (int) (Double.doubleToLongBits(this.milesTraveled) ^ (Double.doubleToLongBits(this.milesTraveled) >>> 32));
		hash = 67 * hash + (int) (Double.doubleToLongBits(this.currentMoneyBalance) ^ (Double.doubleToLongBits(this.currentMoneyBalance) >>> 32));
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
		final Game other = (Game) obj;
		if (this.daysOnTrail != other.daysOnTrail) {
			return false;
		}
		if (this.pace != other.pace) {
			return false;
		}
		if (Double.doubleToLongBits(this.milesTraveled) != Double.doubleToLongBits(other.milesTraveled)) {
			return false;
		}
		if (Double.doubleToLongBits(this.currentMoneyBalance) != Double.doubleToLongBits(other.currentMoneyBalance)) {
			return false;
		}
		return true;
	}

    
}
