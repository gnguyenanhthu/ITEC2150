package ch2a_2c_composition;

import java.util.ArrayList;

public class Schedule
{
    private ArrayList<String> classTimes;

	public Schedule() {
		this.classTimes = new ArrayList<String>();
	}
	
	public void addClassTime(String classTime){
		this.classTimes.add(classTime);
	}

	@Override
	public String toString() {
		return "classTimes=" + classTimes;
	}
    
    //TODO: Define all necessary methods for Schedule
}