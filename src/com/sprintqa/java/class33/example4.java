package com.sprintqa.java.class33;

public class example4 {
	public static void main(String[] args) throws AgeBelow18Exceptoin {
		throw new AgeBelow18Exceptoin("Age below 18");
	}
}


class AgeBelow18Exceptoin extends Exception{

	AgeBelow18Exceptoin(String msg){
		super(msg);
	}
	
}