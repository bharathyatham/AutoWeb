package modernization.web;

import java.util.Random;

public class CustomStack {
	
	Random rand = new Random();

	/**
	 * @param provide threshold value to the parameter
	 * @return Description of the return value
	 */
	public int generateRandomNumber(int digitLen) {				
		return rand.nextInt(digitLen);
	}

	/**
	 * @param 
	 * @return Description of the return value
	 */
	public int generateRandomNumber() {
		return rand.nextInt();
	}

}
