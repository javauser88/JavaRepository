package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class ColorBallTest {

	public static void main(String[] args) {
		
		ColorBall ball_1 = new ColorBall("RED", 01);
		ColorBall ball_2 = new ColorBall("YELLOW", 02);
		ColorBall ball_3 = new ColorBall("GREEN", 03);
		
		Map<ColorBall, Integer> ballMap = new HashMap<>();
		ballMap.put(ball_1, 01);
		ballMap.put(ball_2, 02);
		ballMap.put(ball_3, 03);
		
		ball_1.setColor("GREEN");
		ball_1.setBallId(03);
		
//		ballMap.put(ball_1, 01);
//		ballMap.put(ball_2, 02);
//		ballMap.put(ball_3, 03);
		
		System.out.println(ballMap.size());
		System.out.println(ball_1.toString());
		
		
	}

}
