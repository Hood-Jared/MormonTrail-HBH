/**
 *
 * @author jared
 */
package mormontrail.controller;

import Exception.exception.InventoryControlException;
import java.io.Serializable;
import java.util.Objects;
import mormontrail.model.Game;

public class InventoryController implements Serializable {

    public static int invItemUsage;
    public static int quantity;
    public static int daysOfTravel;
    public static int qtyActors;

    public static int calcInventoryUsage(int quantity, int daysOfTravel, int qtyActors) throws InventoryControlException {

        if (quantity <= 0 || quantity >= 100) {
           throw new InventoryControlException("Enter a number between 0-100.");
        }

        return invItemUsage = quantity * (qtyActors * daysOfTravel);
    }

    private static void setInventory(int InventoryList[]) {
        int n = InventoryList.length;
        int item;
        for (int m = n; m >= 0; m--) {
            int i = 0;
            int k = 0;

            item = i + 1;

            if (InventoryList[i] > InventoryList[k]) {
                swapInventory(i, k, InventoryList);
            }
        }
        printInventory(InventoryList);
    }

    private static void swapInventory(int i, int j, int[] InventoryList) {

        int temp;
        temp = InventoryList[i];
        InventoryList[i] = InventoryList[j];
        InventoryList[j] = temp;
    }

    private static void printInventory(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\nTest");
    }

    public static int[] main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        return input;

    }

}

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

