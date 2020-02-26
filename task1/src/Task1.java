import java.io.*;
import java.util.Arrays;

public class Task1 {
    private static String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br  = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.exit(0);
        }
        return resultStringBuilder.toString();
    }

    private static int[] stringToInt(String[] mass){
        int[] ints = new int[mass.length];
        for (int i = 0; i < mass.length; i++)
        {
            try {
                ints[i] = Integer.parseInt(mass[i]);
            }
            catch (Exception e)
            {
                System.out.println(e);
                System.exit(0);
            }
        }
        return ints;
    }
    public static void main(String[] args) throws IOException {
        String file = readFromInputStream(new FileInputStream(args[0]));
        int[] ints = stringToInt(file.split("\n"));
        Arrays.sort(ints);
        int mid = ints[ints.length / 2];
        int percentil = ints[(int)((ints.length - 1) * 0.9)];
        int sum = 0;
        for (int i = (ints.length / 2) + 1; i < ints.length; i++)
        {
            if (ints[i] < percentil)
                sum += ints[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(ints));
    }
}

