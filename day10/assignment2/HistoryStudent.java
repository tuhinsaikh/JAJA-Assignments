package com.assignment2;

public class HistoryStudent extends Student{
	int historyMarks;
	int civicsMarks;
	
	
	public int getHistoryMarks() {
		return historyMarks;
	}


	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}


	public int getCivicsMarks() {
		return civicsMarks;
	}


	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}


	@Override
	public double getPercentage() {
		double percentage = ((this.getHistoryMarks()+ this.getCivicsMarks())/2);
		return percentage;
	}
	
}
