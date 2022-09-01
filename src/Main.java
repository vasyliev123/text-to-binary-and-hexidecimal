public class Main {
    public static void main(String[] args) {

        //INPUT STRING//
        String text = "zzz";

        int length = text.length();

        TextToBinary(text, length);
        TextToHexadecimal(text, length);

    }

    public static void TextToHexadecimal(String text, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i< length; i++)
        {
            int a = text.charAt(i);
            while(a!=0)
            {
                if(a%16==15)
                {
                    stringBuilder.append('F');
                }
                if(a%16==14)
                {
                    stringBuilder.append('E');
                }
                if(a%16==13)
                {
                    stringBuilder.append('D');
                }
                if(a%16==12)
                {
                    stringBuilder.append('C');
                }
                if(a%16==11)
                {
                    stringBuilder.append('B');
                }
                if(a%16==10)
                {
                    stringBuilder.append('A');
                }
                else {
                    stringBuilder.append(a%16);
                }
                a=a/16;
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.reverse());
    }
    private static void TextToBinary(String text, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i< length; i++)
        {
            int a = text.charAt(i);


            while(a!=0)
            {
               if(a%2==1)
               {
                   stringBuilder.append(1);
               }
               else{
                   stringBuilder.append(0);
               }
               a=(a/2);
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.reverse());
    }
}
