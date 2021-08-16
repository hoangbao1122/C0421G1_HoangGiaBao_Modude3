package model.Service.common;

public class Validate {
    public static String validateName(String name) {
        String message = null;
        String regex = "([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        if (!name.matches(regex)) {
            message = "Invalid name";
        }
        return message;
    }
    public static String validatePoint(int point) {
        String message = null;
        if (point < 0 || point > 100) {
            message = "Điểm của bạn không đúng với định dạng";
        }
        return message;
    }
    public static boolean validateNumber(String num) {
        String regex = "^\\d$";
        return num.matches(regex);
    }
    public static String validateEmail(String email){
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String message = null;
        if (!email.matches(regex)){
            message = "Invalid email";
        }
        return message;
    }
    public static String validatePhone(String phone){
        String regex = "^[0-9\\-\\+]{9,15}$";
        String message = null;
        if (!phone.matches(regex)){
            message = "Invalid Phone";
        }
        return message;
    }
}
