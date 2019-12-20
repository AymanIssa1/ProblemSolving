package ayman.problemsolving.com;

public class DefangingAnIPAddress {

    public static void main(String... args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.')
                stringBuilder.append("[.]");
            else
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

}
