/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import mormontrail.Mormontrail;

/**
 *
 * @author jared
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
	
	protected final BufferedReader keyboard = Mormontrail.getInFile();
	protected final PrintWriter console = Mormontrail.getOutFile();

    public View() {

    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false;
        String value;
        do {
            value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
            value = null;

        } while (!done);
    }

    @Override
    public String getInput() {

        boolean valid = false;
        String value = null;

        while (!valid) {

            this.console.println("\n" + this.displayMessage);

            value = this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(), "\n*** You must enter a value ***");
                continue;

            }

            break;
        }
        return value;
    }

}
