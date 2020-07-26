package com.calculator.service.CalcSerice;

public class Response {

	private int x, y, result;

	public Response(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
}
