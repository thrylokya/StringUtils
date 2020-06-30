import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCamelCase {

    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        convertToCamelCase(sentence);
        convertToSentenceCase(sentence);
    }

    public static String  convertToCamelCase(String string)
    {
        StringTokenizer str=new StringTokenizer(string, " ");
        String finalString=convertToLowerCase(str," ");
        return finalString;
    }

    public static String  convertToSentenceCase(String string)
    {
        StringTokenizer str=new StringTokenizer(string, ".");
        String finalString=convertToLowerCase(str,".");
        return finalString;
    }

    private static String convertToLowerCase(StringTokenizer stringTokenizer, String delim)
    {
        StringBuilder stringBuilder=new StringBuilder();

        while(stringTokenizer.hasMoreTokens())
        {
            String token=stringTokenizer.nextToken();
            String tokenValue=token;
            token=token.toLowerCase().substring(1);
            String camelCaseStr=tokenValue.substring(0,1).toUpperCase().concat(token);
            stringBuilder.append(camelCaseStr);

            stringBuilder.append(delim);
        }
        String result=stringBuilder.toString().substring(0,stringBuilder.toString().length()-1);
        System.out.println(result);
        return result;
    }
}
