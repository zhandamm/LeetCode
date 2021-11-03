package LeetCode;



public class LongestPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
      if (strings.length==0) {
          System.out.println("");
      }
        String prefix = strings[0]; // Элемент массива который будем сравнивать изначально
      for (int i = 1; i< strings.length; i++){ // Элемент массива с которого будем начинать сравнение
          while (strings[i].indexOf(prefix)!=0){ // Если по всему массиву нет совпадений то продолжаем
              prefix = prefix.substring(0, prefix.length()-1);
              if (prefix.isEmpty()) {
                  System.out.println("");
              }
              System.out.println(prefix);
          }

      }
    }
}
