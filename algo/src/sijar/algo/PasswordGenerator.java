
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * The class PasswordGenerator is reposibile for...
 *
 * <p>
 * Copyright
 */
public class PasswordGenerator {

	private static final int PASSWORD_LENGTH = 16;
	private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMBERS = "0123456789";
	private static final String SYMBOLS = "!#$%&\'()*+,-./:;<=>?@^[\\]^_`{|}~";
	private static final SecureRandom random = new SecureRandom();

	private static String generatePassword(String... seeds){
		char[] pwd = new char[PASSWORD_LENGTH];
		StringBuilder seedBuilder = new StringBuilder();
		for (String seed : seeds)seedBuilder.append(seed);

		for (int i=0; i<pwd.length;) {
			int indexRandom = random.nextInt(seedBuilder.length());
			pwd[i++] = seedBuilder.charAt(indexRandom);
		}
		return new String(pwd);
	}


	public static String generateStrongPassword(){
		return generatePassword(LOWERCASE,UPPERCASE,SYMBOLS,NUMBERS);
	}

	public static String generateSimplePassword(){
		return generatePassword(LOWERCASE);
	}

	public static String generatePassword2(){
		return generatePassword(LOWERCASE,UPPERCASE);
	}

	public static String generatePassword3(){
		return generatePassword(LOWERCASE,UPPERCASE,NUMBERS);
	}

	public static String generatePassword4(){
		return generatePassword(NUMBERS,SYMBOLS);
	}

	public static String generatePassword5(){
		return generatePassword(SYMBOLS);
	}

	public static String generatePassword6(){
		return generatePassword(NUMBERS);
	}

	public static void main(String[] args) {
		final Set<String> allPasswords = new HashSet<>(); //to test randomness

		int iteration = 0;
		while(++iteration > 0) {
			//String pwd = PasswordGenerator.generateSimplePassword();
			//String pwd = PasswordGenerator.generatePassword6();
			//String pwd = PasswordGenerator.generatePassword5();
			//String pwd = PasswordGenerator.generatePassword4();
			//String pwd = PasswordGenerator.generatePassword3();
			//String pwd = PasswordGenerator.generatePassword2();
			//String pwd = PasswordGenerator.generatePassword3();
			String pwd = PasswordGenerator.generateStrongPassword();
			if(!allPasswords.contains(pwd)){
				allPasswords.add(pwd);
				System.out.println("generated password :" + pwd + " iteration :" + iteration);
			}
			else {
				System.out.println("collision detected for :" + pwd + " at iteration " + iteration);						//System.exit(0);
			}
		}
	}
}
