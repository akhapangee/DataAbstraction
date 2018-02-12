/*
 * Factory design pattern
 */
package com.akhilesh.main;

import com.akhilesh.games.Ball;
import com.akhilesh.games.BallFactory;

/**
 *
 * @author Akhilesh
 */
public class BallFactoryClient {

    public static void main(String[] args) {
//        Ball ball = BallFactory.getBall("foot");
//        Ball ball = BallFactory.getBall("cricket");
        Ball ball = BallFactory.getBall("volley");
//        Ball ball = BallFactory.getBall("basket");
        ball.play();
    }
}
