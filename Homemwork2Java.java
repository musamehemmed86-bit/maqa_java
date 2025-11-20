package Homemwork2;


public class Homemwork2Java{
    public static void main(String[] args) {
        int a = 25;
        double b = a;   // автоматическое преобразование

        System.out.println(b);
        //2
        double x = 7.9;
        int y = (int) x;

        System.out.println(y);
        //3
        byte al = 90;
        byte bal = 60;
        byte c = (byte) (al + bal);

        System.out.println(c);
        //4
        short s = 1000;
        byte bwq = (byte) s;

        System.out.println(bwq);
        //5
        char cq = 'D';
        int code = cq;
        System.out.println(code);
        System.out.println((int) 'D');
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println((int) 'a');
        System.out.println((int) '0');
  //6
        int nqa = 66;
        char chn = (cq);
        System.out.println(cq);
        System.out.println((char) 66); // B
        System.out.println((char) 70); // F
        System.out.println((char) 71); // G
        System.out.println((char) 72); // H
        System.out.println((char) 97); // a
        System.out.println((char) 98); // b

//7
        String cb = "456";
        int num = Integer.parseInt(cb);

        int result = num + 100;
        System.out.println(result);
//8
        int i = 5;
        int qaqa = 2;

        double result9 = (double) i / qaqa;
        System.out.println(result9); // 2.5
        double cbhf = 5;
        double fhd = 2;
//9
        long big = 123456;
        short small = (short) big;

        System.out.println(small);
//10


                String qwert = "99";

                double dfg = Double.parseDouble(qwert);
                double multiplied = dfg * 1.5;

                int integer = (int) multiplied;

                System.out.println("Дробное: " + multiplied);
                System.out.println("Целое: " + integer);
            }

}

