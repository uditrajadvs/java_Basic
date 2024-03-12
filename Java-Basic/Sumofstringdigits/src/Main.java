public class Main {
    public static void main(String[] args) {
        String input ="4Aj3oks9485";
        int ans=calculate(input);
        System.out.println("sum of the string digits:"+ans);
    }
    public static int calculate(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
            if (Character.isDigit(input.charAt(i))) {
                int num = input.charAt(i)-'0';
                sum += num;
            }
        }
        return sum;
    }
}