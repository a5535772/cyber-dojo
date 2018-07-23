package com.leo.cyber.dojo01.one.hundred.doors;

public class Door {

	public Door(int doorNum, boolean isOpen, int visitTimes) {
		super();
		this.doorNum = doorNum;
		this.isOpen = isOpen;
		this.visitTimes = visitTimes;
	}

	private int doorNum;
	private boolean isOpen = Boolean.FALSE;
	private int visitTimes = 0;

	public int getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public int getVisitTimes() {
		return visitTimes;
	}

	public void addVisitTimes() {
		this.visitTimes++;
		this.isOpen = !this.isOpen;
	}

}
