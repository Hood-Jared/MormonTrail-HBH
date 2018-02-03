/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.mormontrail.model;
import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Chaskiel
 */
public class River implements Serializable{
    
    
     private String weight;
     
     private String riverDepth; 
     
     public River(){ 
}

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRiverDepth() {
        return riverDepth;
    }

    public void setRiverDepth(String riverDepth) {
        this.riverDepth = riverDepth;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.weight);
        hash = 43 * hash + Objects.hashCode(this.riverDepth);
        return hash;
    }

    @Override
    public String toString() {
        return "River{" + "weight=" + weight + ", riverDepth=" + riverDepth + '}';
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
        final River other = (River) obj;
        if (!Objects.equals(this.weight, other.weight)) {
            return false;
        }
        if (!Objects.equals(this.riverDepth, other.riverDepth)) {
            return false;
        }
        return true;
    }
     
}
