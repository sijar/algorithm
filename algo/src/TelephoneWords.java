


public class TelephoneWords {

    private String phoneNumber = "9999999999";

    private final char[] KEYPAD_WORDS = new char[]{'0','1','A','D','G','J','M','P','T','W'};


    public TelephoneWords(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void printTelephoneWords(){
        char[] numbers = phoneNumber.toCharArray();
        StringBuffer words = new StringBuffer();

        for(int i=0; i<numbers.length; ++i){
            //System.out.println(numbers[i]);
            words.append(KEYPAD_WORDS[numbers[i]-48]);
        }
        System.out.println(words);

    }


    public static void main(String[] args) {
        TelephoneWords tw = new TelephoneWords("9430201234");
        tw.printTelephoneWords();
    }

}
