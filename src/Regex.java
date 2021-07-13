import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String nameRegex = "^\\D+$";
    public static final String phoneRegex = "^[0-9]{10}$";
    public static final String email = "^[A-Za-z0-9]+[A-Za-z0-9]*(@gmail.com)$";
    public static final String id = "^[0-9]+$";
    private static final String DATE_PATTERN= "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";

    public static boolean validateName(String regex) {
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validatePhone(String phoneRegexx) {
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneRegexx);
        return matcher.matches();
    }

    public static boolean validateEmail(String mailRegex) {
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(mailRegex);
        return matcher.matches();
    }

    public static boolean validateId(String ids) {
        Pattern pattern = Pattern.compile(id);
        Matcher matcher = pattern.matcher(ids);
        return matcher.matches();
    }
    public  static  boolean vaLiDateNgaySinh(String ngaySinhRegex){
        Pattern pattern=Pattern.compile(DATE_PATTERN);
        Matcher matcher=pattern.matcher(ngaySinhRegex);
        return matcher.matches();

    }
}
