package bai13;

public class Validator {
    public static boolean nameCheck(String name) throws FullNameException {
        String regexName = "^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}";
        if (name.matches(regexName)) {
            return true;
        } else {
            try {
                throw new FullNameException("Xin hay nhap lai");
            } catch (FullNameException e) {
                System.out.println(e);
            }
            return false;
        }
    }
}
