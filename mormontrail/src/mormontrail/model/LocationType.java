/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.model;

/**
 *
 * @author heatherholt
 */
public enum LocationType {
	
	Town("Town", 1),
	Fort("Fort", 2),
	River("River", 3),
	Landmark("Landmark", 4);
	
	private String name;
	private int type;

	LocationType(String name, int type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getType() {
		return type;
	}

	@Override
	public String toString() {
		return "LocationType{" + "name=" + name + ", type=" + type + '}';
	}
	
	
}
