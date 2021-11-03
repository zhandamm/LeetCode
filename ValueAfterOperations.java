package LeetCode;

public class ValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {

            switch (operation) {
                case "X++" -> x++;
                case "X--" -> x--;
                case "--X" -> --x;
                case "++X" -> ++x;
            }

        }
        return x;
    }
    /* АЛЬТЕРНАТИВНОЕ РЕШЕНИЕ, БОЛЕЕ ПРОСТОЕ
      int X = 0;
    int finalVal = Integer.MIN_VALUE;
    for(String operation : operations){
        if(operation.equals("++X") || operation.equals("X++"))
            X++;
        else
            X--;
    }
    return X;
}
     */
    public static void main(String[] args) {
        String[] operations = {"x++", "x++", "x--" };
        ValueAfterOperations val = new ValueAfterOperations();
        System.out.println(val.finalValueAfterOperations(operations));

    }
}
