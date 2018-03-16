
/**
 *
 * @author jared
 */

package mormontrail.controller;
import java.io.Serializable;
import java.util.Objects;

public class InventoryController implements Serializable{

    public static int invItemUsage;
    public static int quantity;
    public static int daysOfTravel;
    public static int qtyActors;
    
    public static int calcInventoryUsage(int quantity, int daysOfTravel, int qtyActors)  {
         
            if (quantity <= 0 || quantity >= 100) {
             return -1;
            }
            
        return invItemUsage = quantity * ( qtyActors * daysOfTravel );
       }
}
//public static InventoryItem createItems(){



/*
items = create an array InventoryItem objects

item1 = new InventoryItem object
Assign values to each attribute in the InventoryItem object
Assign items1 to a position in the items array

item2 = new InventoryItem object
Assign values to each attribute in the InventoryItem object
Assign items2 to a position in the items array

*/
//RETURN items


  //  
    
   // 
  //  private Object quantity;
    
    //public double getInvItem() {
   //     return double quantity;
 //   }

   // public void setInvItem(double quantity) {
  //      this.quantity = quantity;
    //}

   // public void getinvItemUsage() {
      //  double invItemUsage;
       
  //  }

   // public void setinvItemUsage(double invItemUsage) {
     //   this.invItemUsage = invItemUsage;
   // }

   // @Override
  //  public int hashCode() {
   //     int hash = 5;
  //      hash = 17 * hash + Objects.hashCode(this.quantity);
  //      hash = 17 * hash + Objects.hashCode(this.invItemUsage);
  //      return hash;
    
   // @Override
   // public String toString() {
   //     return "You have{" + "quantity=" + quantity + ", invItemUsage=" + invItemUsage + '}';
  //  }
     
