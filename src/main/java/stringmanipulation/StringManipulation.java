package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        String even = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even = even + s.charAt(i);
            }
        }
        return even;
    }
}