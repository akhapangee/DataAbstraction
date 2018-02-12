/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.games;

/**
 *
 * @author Akhilesh
 */
public class BallFactory {

    public static Ball getBall(String ball) {
        if (ball.equalsIgnoreCase("foot")) {
            return new FootBall();
        } else if (ball.equalsIgnoreCase("volley")) {
            return new VolleyBall();
        } else if (ball.equalsIgnoreCase("basket")) {
            return new BasketBall();
        } else if(ball.equalsIgnoreCase("cricket")){
            return new CricketBall();
        }
        return null;
    }
}
