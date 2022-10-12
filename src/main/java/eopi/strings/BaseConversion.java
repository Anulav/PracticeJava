package eopi.strings;

public class BaseConversion {
    public static void main(String[] args) {
        //System.out.println(baseConversionNaive("A51",2,10));
        System.out.println(convertBase("AA51",16,10));
    }


    public static String convertBase(String num, int b1, int b2){
        boolean isNegative = num.startsWith("-");
        int numAsInt = 0;
        for (int i = (isNegative? 1: 0) ; i < num.length() ; i++) {
            numAsInt *= b1;
            numAsInt += Character.isDigit(num.charAt(i))? num.charAt(i) - '0' : num.charAt(i) - 'A' + 10;
        }
       /* String numAsString = constructFromBaseNaive(numAsInt,b2);
        return isNegative? "-"+numAsString: numAsString ;*/
        return (isNegative? "-": "") + (numAsInt == 0? "0" : constructFromBaseRecursive(numAsInt,b2));
    }

    public static String constructFromBaseNaive(int numToInteger, int base){
        String numberToString = "";
        StringBuilder stringBuilder = new StringBuilder();
        while(numToInteger!=0){
            int modNum =  (numToInteger%base);
            String temp = modNum > 9 ? String.valueOf('A'+ modNum - 10) : String.valueOf(modNum);
            stringBuilder.append(temp);
            numToInteger/=base;
        }
        return stringBuilder.reverse().toString();
    }

    public static String constructFromBaseRecursive(int numAsInt, int base){
        return (numAsInt == 0 ? "": constructFromBaseRecursive(numAsInt/base,base)+
                (char)(numAsInt % base >= 10? 'A'+ numAsInt % base -10 : '0'+numAsInt%base));
    }




    //This solution only works for values of basesFrom 1-9 only
    public static String baseConversionNaive(String str, int baseFrom, int baseTo){
        int dec = 0; StringBuilder newStr = new StringBuilder();
        for (int i = str.length()-1, pow = 1; i >=0 ; i--, pow*=baseFrom) {
                    dec += Integer.parseInt(String.valueOf(str.charAt(i)))*pow;
        }
        while(dec!= 0) {
            int temp = dec%baseTo;
            if (temp > 9) {
                newStr.append((char)('A' + temp % 10));

            } else {
                newStr.append(String.valueOf(temp));
            }
            dec/=baseTo;
        }
        return newStr.reverse().toString();
    }

}
