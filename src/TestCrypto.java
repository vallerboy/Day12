import java.util.Scanner;
public class TestCrypto {
    public static void main(String[] args) {
        Crypto crypto = new Crypto();
        crypto.crypto("Oskar");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj klucz publiczny: ");
        String publicKey = scanner.nextLine();

        System.out.print("Podaj klucz prywatny: ");
        String privateKey = scanner.nextLine();

        DeCrypto deCrypto = new DeCrypto(privateKey, publicKey);
        System.out.println(deCrypto.decrypto());

    }
}
