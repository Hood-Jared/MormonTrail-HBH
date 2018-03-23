package mormontrail.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// @author Chaskiel
public class RiverCrossingControl {

    public int calcCrossingOfRiver(int weight, int depth) {

        if (weight < 100 || depth < 1) {
            return -1;
        }

        if (weight > 300 || depth > 5) {
            return -1;
        }

        int probability = weight * depth;

        int result = probability / 100;

        return result;

    }

}
