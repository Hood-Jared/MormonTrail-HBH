/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mormontrail.controller.GameController;
import mormontrail.controller.InventoryController;
import mormontrail.exception.InventoryControlException;
import mormontrail.view.StartProgramView;
import mormontrail.model.Player;

/**
 *
 * @author jared
 */
public class InventoryView extends View {

    private void sellInventory() throws InventoryControlException {
        throw new InventoryControlException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showInventory() throws InventoryControlException {

        throw new InventoryControlException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InventoryView() {
        super("\nInventory Menu"
                + "\nV - View Inventory"
                + "\nS - Sell Inventory"
                + "\nP - Print Inventory List"
                + "\nQ - Quit"
                + "\n");

    }

    @Override
    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'V': {
                try {
                    this.showInventory();
                } catch (InventoryControlException ex) {

                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                    return false;
                }
            }

            break;
            case 'S':
                try {
                    this.sellInventory();
                } catch (InventoryControlException ex) {
                    {
                        ErrorView.display(this.getClass().getName(), ex.getMessage());
                        return false;
                    }

                }
            case 'P': {
                try {
                    doAction.PrintInventory();
                } catch (FileNotFoundException ex) {

                    ErrorView.display(this.getClass().getName(), "Invalid Input - Please try again.");
                    return false;
                }
            }
            break;
            case 'Q':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Input - Please try again.");
                break;

        }
        return false;
    }

    private static class doAction {

        private static void PrintInventory() throws FileNotFoundException {

            File file = new File("C:/MormonTrail/file.txt");
            PrintWriter printWriter = new PrintWriter("file.txt");
            printWriter.println("hello");
            printWriter.close();
            
        }

    }
}
