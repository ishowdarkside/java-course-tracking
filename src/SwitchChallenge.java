public class SwitchChallenge {
    public static void main(String[] args){
        char letter = 'H';
        String word = getWord(letter);
        System.out.println(word);
    }

    public static String getWord(char letter){
        return switch(letter){
            case 'A' ->  "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> letter + " not found";
        };
    }


}
