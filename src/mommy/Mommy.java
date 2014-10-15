package mommy;

/**
 * Created by hjli on 10/15/14.
 */
public class Mommy {
    public String dojo(String input) {

        if(input.contains("A") || input.contains("E") ||
                input.contains("I") || input.contains("O") ||
                input.contains("U"))
            return doJo(input);

        return doSmallString(input);
    }

    private String doSmallString(String input) {
        String regex = "[aAeEiIoOuU]+";
        String result = input;

        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(String.valueOf(input.charAt(i)).matches(regex)){
                count = count + 1;
            }
        }
        if( count >=input.length() * 0.3  )
        {
            result =  input.replaceAll(regex, "mommy");
        }
        return result;
    }

    private String doJo(String input) {
        System.out.println("here");
        String[] mySets = input.split("[^aeiou]");
        System.out.println(mySets);


        return null;
    }
}
