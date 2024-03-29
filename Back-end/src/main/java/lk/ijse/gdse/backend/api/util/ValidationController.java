package lk.ijse.gdse.backend.api.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationController {

    public static boolean isValidCustomerIdFormat(String id) {
        String regexPattern = "^C\\d{2}-\\d{3}$";
        return id.matches(regexPattern);
    }
    public static boolean isValidCustomerNameFormat(String name) {
        String regexPattern = "^[A-Za-z ]{5,}$";
        return name.matches(regexPattern);
    }
    public static boolean isValidCustomerAddressFormat(String address) {
        String regexPattern = "^[A-Za-z0-9 ]{8,}$";
        return address.matches(regexPattern);
    }
    public static boolean isValidCustomerSalaryFormat(String salary) {
        System.out.println(salary);
        String CUS_SALARY_REGEX = "^[0-9]{2,}([.][0-9]{2})?$";
        Pattern pattern = Pattern.compile(CUS_SALARY_REGEX);
        Matcher matcher = pattern.matcher(salary);
        return matcher.matches();
    }

    public static boolean isValidItemIdFormat(String id) {
        String regexPattern = "^I\\d{2}-\\d{3}$";
        return id.matches(regexPattern);
    }
    public static boolean isValidItemNameFormat(String name) {
        String regexPattern = "^[A-Za-z ]{3,20}$";
        return name.matches(regexPattern);
    }
    public static boolean isValidQtyFormat(String qty) {
        String regexPattern = "^[0-9]{1,}$";
        return qty.matches(regexPattern);
    }
    public static boolean isValidUnitPriceFormat(String unitPrice) {
        System.out.println(unitPrice);
        String regexPattern = "^[0-9]{2,}([.][0-9]{2})?$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(unitPrice);
        return matcher.matches();
    }
}
