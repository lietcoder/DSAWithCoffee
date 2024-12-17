package StringStringBufferExamples;

public class StringIntro
{
    static void compareStrings() {
        String s = "nani";
        String t = "nani";
        String st =t;

        System.out.println("s and t are: " + s + "  " + t);
        System.out.println(s == t);
        System.out.println(s.equals(t) );
        System.out.println(s == st);
        System.out.println(s.equals(st));
        System.out.println(st == s);
        System.out.println(st.equals(s));

        String a = new String("nani");
        String b = new String("nani");
        System.out.println("a and b are: " + a + "  " + b);
        String c=b;

        System.out.println(a.equals(c));
        System.out.println(a==c);

        System.out.println(a.equals(b));
        System.out.println(a==b);





    }
}
