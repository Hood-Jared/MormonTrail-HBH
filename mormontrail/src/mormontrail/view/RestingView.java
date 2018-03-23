/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Chaskiel
 */
public class RestingView extends View {

    public RestingView() {
        super("\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                + "\n*                                          *"
                + "\n*   Choose how far you want to travel       *"
                + "\n* Traveling a long distance can be tireing  *"
                + "\n*        and can affect how far you go      *"
                + "\n*      Enter the distance you want to go    *"
                + "\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");

    }

    @Override
    public boolean doAction(String value) {

        int distance = parseInt(value);

        int hoursToRest;
        hoursToRest = distance * 24 / 20;
        System.out.println("You must rest " + hoursToRest + " hours");

        return true;
    }

}
