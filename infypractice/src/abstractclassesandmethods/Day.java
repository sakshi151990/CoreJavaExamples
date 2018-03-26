package abstractclassesandmethods;

import java.util.Calendar;

public enum Day{
	SUNDAY(1),MONDAY(2);
	
	private int value;

	Day(int arg1) {
		value=arg1;
	}

	public int getValue() {
		return value;
	}
	
	
	
}

	

