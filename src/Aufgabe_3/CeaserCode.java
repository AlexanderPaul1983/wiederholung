package Aufgabe_3;



public class CeaserCode {

        public static int key; // Der Verschlüsselungsschlüssel

        public static String encrypt(String word, int key) {
            StringBuilder encryptedWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char originalChar = word.charAt(i);

                if (Character.isLetter(originalChar)) {
                    char base = Character.isUpperCase(originalChar) ? 'A' : 'a';
                    int originalAlphabetPosition = originalChar - base;
                    int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                    char newChar = (char) (base + newAlphabetPosition);
                    encryptedWord.append(newChar);
                } else {
                    encryptedWord.append(originalChar);
                }
            }

            return encryptedWord.toString();
        }

        public static String decrypt(String word, int key) {
            StringBuilder decryptedWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char originalChar = word.charAt(i);

                if (Character.isLetter(originalChar)) {
                    char base = Character.isUpperCase(originalChar) ? 'A' : 'a';
                    int originalAlphabetPosition = originalChar - base;
                    int newAlphabetPosition = (originalAlphabetPosition - key + 26) % 26;
                    char newChar = (char) (base + newAlphabetPosition);
                    decryptedWord.append(newChar);
                } else {
                    decryptedWord.append(originalChar);
                }
            }

            return decryptedWord.toString();
        }

        public static void main(String[] args) {
            String originalText = "Hello World";
            String encryptedText = encrypt(originalText, 3);
            System.out.println("Verschlüsselt: " + encryptedText);

            String decryptedText = decrypt(encryptedText, 3);
            System.out.println("Entschlüsselt: " + decryptedText);
        }
    }

