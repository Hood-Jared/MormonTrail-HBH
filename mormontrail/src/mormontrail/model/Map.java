/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author heather
 */
public class Map {
    
	// class instance variables
	private String description;
	private int locationSequence;
	private Location location;

	public Map() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLocationSequence() {
		return locationSequence;
	}

	public void setLocationSequence(int locationSequence) {
		this.locationSequence = locationSequence;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Map{" + "description=" + description + ", locationSequence=" + locationSequence + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 83 * hash + Objects.hashCode(this.description);
		hash = 83 * hash + this.locationSequence;
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
		final Map other = (Map) obj;
		if (this.locationSequence != other.locationSequence) {
			return false;
		}
		if (!Objects.equals(this.description, other.description)) {
			return false;
		}
		return true;
	}
	
	
}
