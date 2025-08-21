package utilities;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

	public class FakerUtility {
		Faker faker=new Faker();
	public String generateFirstName() {
	
	return faker.name().firstName();
}
	public String generateAddress() {
		
		return faker.address().fullAddress();	}
	public int generateNumber() {
		return faker.number().randomDigit();
		
	}
	public String generateEmail() {
		return faker.internet().emailAddress();
	}
	public PhoneNumber generateMobile() {
		return faker.phoneNumber();
	}
}
