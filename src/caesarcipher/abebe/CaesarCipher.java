package caesarcipher.abebe;

public class CaesarCipher {
	
// caesar encryption algorithm
	public String  encrypt(String plainText) {
		//the encrypted message
		String cipherText = "";
		//we make the algorithm case insensitive
		plainText = plainText.toUpperCase();
		//consider all the letters in the plain text 
		
		for(int i=0;i<plainText.length();i++) {
			char character = plainText.charAt(i);
			// find the numerical representation associated with that character 
			//in the alphabet
			int charIndex = Constants.ALPHABET.indexOf(character);
			//caesar encryption is just a simple shift of characters according to the key
			//use modular arthmetic to transform the valuse within the range [0, num_og_letters_in_alphabet]
		int encryptionIndex = Math.floorMod(charIndex + Constants.KEY,Constants.ALPHABET.length() );
		//keep appending the encrypted character to the cipher text
		cipherText = cipherText + Constants.ALPHABET.charAt(encryptionIndex);
		}
		return cipherText;
		
	}
	public String decrypt(String cipherText) {
		
		String plainText ="";
		for(int i =0;i<cipherText.length();i++) {
			char character = cipherText.charAt(i);
			int charIndex = Constants.ALPHABET.indexOf(character);
			int decryptIndex = Math.floorMod(charIndex - Constants.KEY,Constants.ALPHABET.length());
			plainText= plainText +Constants.ALPHABET.charAt(decryptIndex);	
		}
		return plainText;
	}
}
