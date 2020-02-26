public class Task4 {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("слишком много аргументов");
            return;
        }
        String str1 = args[0];
        String str2 = args[1];
        boolean ok = true;

        for (int i = 0, j = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
            }
            else if (str2.charAt(j) == '*') {
                break;
            }
            else
                ok = false;
        }
        System.out.println(ok);
    }
}
