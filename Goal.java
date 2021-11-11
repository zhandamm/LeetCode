package LeetCode;

public class Goal {
    public String interpret(String command) {
        StringBuilder newstr = new StringBuilder(command);
        for (int i = 0; i<newstr.length(); i++){
            char c = newstr.charAt(i);
            char c2 = newstr.charAt(i+1);
            if (c==c2){
                newstr.append('o');
            }

        }
        return newstr.toString();

    }

    public static void main(String[] args) {
        Goal g = new Goal();
        System.out.println(g.interpret("G()(al)"));
    }
}
