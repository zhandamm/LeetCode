package LeetCode;

public class DefangIPaddr {
    public String defangIPaddr(String address) {
        String s=address.replace(".","[.]");
        return s;
    }
    public static void main(String[] args) {
    }
}
