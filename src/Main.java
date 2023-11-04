public class Main {
    public static void main(String[] args) {
        int [] table = new int[9];
        table[0] = 30;
        table[1] = 3;
        table[2] = 6;
        table[3] = 2;
        table[4] = 3;
        table[5] = 10;
        table[6] = 18;
        table[7] = 0;
        table[8] = 5;
        for (int i = 0; i < table.length; i++)
        {
            System.out.print(table[i] + " ");
        }
        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table.length; j++)
            {
                if (table[i] < table[j])
                {
                    int tmp = table[i];
                    table[i] = table[j];
                    table[j] = tmp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < table.length; i++)
        {
            System.out.print(table[i] + " ");
        }
    }
}