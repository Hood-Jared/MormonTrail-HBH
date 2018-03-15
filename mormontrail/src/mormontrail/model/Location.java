/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.model;

import java.io.Serializable;
import java.util.Objects;
import javafx.scene.Scene;

/**
 *
 * @author heather
 */
public class Location implements Serializable {
    
	// class instance variables
	private String name;
	private LocationType sceneType;
	private double distanceFromNauvoo;
	private double distanceToSaltLake;
	private int nextSettlement;

	public Location() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocationType getSceneType() {
		return sceneType;
	}

	public void setSceneType(LocationType sceneType) {
		this.sceneType = sceneType;
	}

	public double getDistanceFromNauvoo() {
		return distanceFromNauvoo;
	}

	public void setDistanceFromNauvoo(double distanceFromNauvoo) {
		this.distanceFromNauvoo = distanceFromNauvoo;
	}

	public double getDistanceToSaltLake() {
		return distanceToSaltLake;
	}

	public void setDistanceToSaltLake(double distanceToSaltLake) {
		this.distanceToSaltLake = distanceToSaltLake;
	}

	public int getNextSettlement() {
		return nextSettlement;
	}

	public void setNextSettlement(int nextSettlement) {
		this.nextSettlement = nextSettlement;
	}

	@Override
	public String toString() {
		return "Location{" + "name=" + name + ", sceneType=" + sceneType + ", distanceFromNauvoo=" + distanceFromNauvoo + ", distanceToSaltLake=" + distanceToSaltLake + ", nextSettlement=" + nextSettlement + '}';
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 71 * hash + Objects.hashCode(this.name);
		hash = 71 * hash + (int) (Double.doubleToLongBits(this.distanceFromNauvoo) ^ (Double.doubleToLongBits(this.distanceFromNauvoo) >>> 32));
		hash = 71 * hash + (int) (Double.doubleToLongBits(this.distanceToSaltLake) ^ (Double.doubleToLongBits(this.distanceToSaltLake) >>> 32));
		hash = 71 * hash + this.nextSettlement;
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
		final Location other = (Location) obj;
		if (this.sceneType != other.sceneType) {
			return false;
		}
		if (Double.doubleToLongBits(this.distanceFromNauvoo) != Double.doubleToLongBits(other.distanceFromNauvoo)) {
			return false;
		}
		if (Double.doubleToLongBits(this.distanceToSaltLake) != Double.doubleToLongBits(other.distanceToSaltLake)) {
			return false;
		}
		if (this.nextSettlement != other.nextSettlement) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		return true;
	}

    public void setScene(Scene scene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
	
}
