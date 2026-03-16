package Module1.Strings;

public class RomanNumerals_Exe {
    public static void main(String[] args) {
        int n, t, c;
        StringBuilder Roman = new StringBuilder();
        for (int i = 1; i <= 110; i++) {
            Roman.delete(0, Roman.length());
            n = i;
            if (n >= 100) {
                Roman.append("C ");
                n -= 100;
            }
            t = n / 10;
            if (t == 9) Roman.append("XC ");
            else {
                if (t >= 5) {
                    Roman.append("L ");
                    t -= 5;
                }
                Roman.append("X ".repeat(t));
            }

            c = n % 10;
            switch (c) {
                case 1:
                    Roman.append("I");
                    break;
                case 2:
                    Roman.append("II");
                    break;
                case 3:
                    Roman.append("III");
                    break;
                case 4:
                    Roman.append("IV");
                    break;
                case 5:
                    Roman.append("V");
                    break;
                case 6:
                    Roman.append("VI");
                    break;
                case 7:
                    Roman.append("VII");
                    break;
                case 8:
                    Roman.append("VIII");
                    break;
                case 9:
                    Roman.append("IX");
                default:
            }
            System.out.println(Roman);
        }
    }
}
