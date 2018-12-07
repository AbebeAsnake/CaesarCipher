package caesarcipher.abebe;

public class App {

	public static void main(String[] args) {
CaesarCipher caesarCipher = new CaesarCipher();
String plainText = "this one is actually the text we want to hide from others";
	String cipherText = caesarCipher.encrypt(plainText);
	System.out.println(cipherText);
	 plainText =caesarCipher.decrypt(cipherText);
	System.out.println(plainText);
	}

}
