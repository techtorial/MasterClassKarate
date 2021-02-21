import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Regex {

    public static void main(String[] args) {

        String lowerLeter = "";
        String upperCaseLetter = "L";
        String specialCharacter = ",";
        String number = "8";

        String anyCharacterRegex = ".";

        // matches
//        System.out.println(lowerLeter.matches(anyCharacterRegex));
//        System.out.println(upperCaseLetter.matches(anyCharacterRegex));
//        System.out.println(specialCharacter.matches(anyCharacterRegex));
//        System.out.println(number.matches(anyCharacterRegex));

        String word = "sdgsg,.fdsds.ee3rew";

        String regexForAnyCharacterAnyTime = ".*a.*r.*";
//        System.out.println(word.matches(regexForAnyCharacterAnyTime));

        String onlyLetters = "[0-9]*";
//        System.out.println(word.matches(onlyLetters));

        String phoneNumber = "332-563-4201";
        String regexForPhoneNumber = "\\d{3}-[0-9]{3}-[0-9]{4}";
//        System.out.println(phoneNumber.matches(regexForPhoneNumber));


        String regexForDoesntContain = "[^0-9]*";
//        System.out.println(word.matches(regexForDoesntContain));

        String str = "sdr5fdfsdmk,5645fgd.hgf";
        String[] arr = str.split("[\\D]");
//        System.out.println(Arrays.toString(arr));

        String str2 = "Techtorial";

        // string T:2 C:1 ...

        Map<Character, Integer> count = new HashMap<Character, Integer>();

        str2.toUpperCase().chars().mapToObj(ch->(char)ch).forEach(ch-> count.put(ch, (count.containsKey(ch)) ?
                count.get(ch)+1 : 1));

        String str3 = count.toString().replace("=",":")
                .replaceAll("[{},]","");

        System.out.println(str3);

    }


}
