import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formater {

    public String[] splitItems() {

        Pattern pattern = Pattern.compile("##");
        String[] items = pattern.split(replaceApples());
        return items;
    }

    public String replaceApples () {

        String rText = replaceBread();
        Pattern applePattern = Pattern.compile("(apples)", Pattern.CASE_INSENSITIVE);
        Matcher appleMatcher = applePattern.matcher(rText);
        String appleFormat = appleMatcher.replaceAll("Apples");
        return appleFormat;
    }

    public String replaceBread () {

        String rText = replaceCookies();
        Pattern breadPattern = Pattern.compile("(bread)", Pattern.CASE_INSENSITIVE);
        Matcher breadMatcher = breadPattern.matcher(rText);
        String breadFormat = breadMatcher.replaceAll("Bread");
        return breadFormat;
    }

    public String replaceCookies () {

        String rText = replaceMilk();
        Pattern cookiePattern = Pattern.compile("(cookies)|(Co0kieS)", Pattern.CASE_INSENSITIVE);
        Matcher cookieMatcher = cookiePattern.matcher(rText);
        String cookieFormat = cookieMatcher.replaceAll("Cookies");
        return cookieFormat;
    }

    public String replaceMilk () {

        String rText = Main.readRawDataToString();
        Pattern milkPattern = Pattern.compile("(milk)|(Milk)", Pattern.CASE_INSENSITIVE);
        Matcher milkMatcher = milkPattern.matcher(rText);
        String milkFormat = milkMatcher.replaceAll("Milk");
        return milkFormat;
    }
}
