public class HandlingNullReference {
    public static void main(String[] args) {
        String[] words = {"hello",null, "world"};
        for (String word : words) {
            try {
                System.out.println("Length of word: " + word.length());
            } catch (NullPointerException e) {
                System.out.println("Found null reference!");
            }
        }
    }
}
