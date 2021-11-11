package LeetCode;

public class RestoreString {

    public String restoreString(String s, int[] indices) {
        // Использование StringBuilder, потому что строки неизменяемы
        StringBuilder newStr = new StringBuilder(s);

        for(int i = 0 ; i < indices.length; i++){
            // замена символов с помощью заданных индексов
            newStr.setCharAt(indices[i], s.charAt(i)); // setCharAt (позиция куда вставить, символ который вставить )
        }

        // при возврате нам нужно преобразовать его в тип String,
        // потому что здесь нам нужен String как возвращаемый тип,
        // но у нас есть Stringbuilder, который не будет принят
        return newStr.toString();
    }

    public static void main(String[] args) {

        String s = "aiohn";
        int [] incides = {3,1,4,2,0};
        RestoreString restore = new RestoreString();
        System.out.println(restore.restoreString( s, incides));
    }
}
