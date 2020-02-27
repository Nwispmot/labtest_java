public class Task4 {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("слишком много аргументов");
            return;
        }
        String str1 = args[0];
        String str2 = args[1];
        boolean ok = false;
        int i = 0, j = 0;

        while (i <= str1.length() && j < str2.length()) {
            if (str2.charAt(j) == '*') {
                while (j < str2.length() && str2.charAt(j) == '*')
                    j++;
                if (j < str2.length())
                {
                    int start = i;
                    i = str1.length() - 1;
                    while (i >= start && str1.charAt(i) != str2.charAt(j))
                        i--;
                    if (i < start)
                        break;
                }
                else {
                    ok = true;
                    break;
                }
            }
            else if (i < str1.length() && str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }
            else
                break;
        }
        if (i == str1.length() && j == str2.length())
            ok = true;

        System.out.println(ok ? "OK" : "KO");
    }
}
