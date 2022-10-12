package eopi.strings;

public class ComputeSpreadSheetColumnEncoding {
    public static void main(String[] args) {
        System.out.println(String.valueOf((char)('A' + 25 - 1)));
        System.out.println(titleToNumber("AA"));
        System.out.println(convertToTitle(701));

        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(1));
    }

    public static int titleToNumber(String columnTitle) {
        int val = 0, total = 0;
        for (int i = columnTitle.length() - 1, pow = 1; i >= 0; i--, pow *= 26) {
            val = columnTitle.charAt(i) - 'A' + 1;
            total += val * pow;
        }
        return total;
    }

    //Doesn't work properly
    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        int val = 0, temp = 27;
        if(columnNumber<=26){
            return (String.valueOf((char)('A' + columnNumber - 1)));
        }
        while (columnNumber != 0 && temp>26) {
            val = columnNumber % 26;
            if (val != 0) {
                str.append((char) ('A' + val - 1));
            } else {
                str.append('Z');
            }
            temp = columnNumber/26;
            columnNumber/=26;
        }
        if(columnNumber!=0){
            val = columnNumber % 26;
            if (val != 0) {
                str.append((char) ('A' + val - 1));
            } else {
                str.append('Z');
            }
        }
        return str.reverse().toString();

    }
}

