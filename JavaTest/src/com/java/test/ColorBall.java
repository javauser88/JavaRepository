package com.java.test;

public class ColorBall {
	private String color;
	private int ballId;
	
	
	
	public ColorBall(String color, int ballId) {
		this.color = color;
		this.ballId = ballId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBallId() {
		return ballId;
	}
	public void setBallId(int ballId) {
		this.ballId = ballId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ballId;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColorBall other = (ColorBall) obj;
		if (ballId != other.ballId)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ColorBall [color=" + color + ", ballId=" + ballId + "]";
	}
	
	
	

}
