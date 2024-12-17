package CrackingCode;

public class Main {
    public static void main(String[] args) {
        CharCountString15 chCntStr = new CharCountString15();
//        System.out.println("result string is: "+ chCntStr.charCountString("aaaaabbaabccd"));
//        System.out.println("result string is: "+ chCntStr.charCountString("aaabbccde"));
//        System.out.println("result string is: "+ chCntStr.charCountString("abcddee"));
//        System.out.println("result string is: "+ chCntStr.charCountString("aabbcc"));

        StringPermutation13 stringPermutation13 = new StringPermutation13();
       // System.out.println("isPermutation: "+stringPermutation13.ispermutation("waterbottle", "erbottlewat"));

        StringUniquesChars11 stringUniquesChars11 = new StringUniquesChars11();
//        System.out.println("string has unique chars: "+stringUniquesChars11.isUniqueChars("abcdefg"));
//        System.out.println("string has unique chars1 : "+stringUniquesChars11.isUniqueChars("abcdefgf"));
//
        //System.out.println("string has unique chars: "+stringUniquesChars11.isUniqueChars1("abcdeaabfgh"));
//        System.out.println("string has unique chars1 : "+stringUniquesChars11.isUniqueChars1("abcdefgf"));
        StringRevevrsal12 stringRevevrsal12 = new StringRevevrsal12();
//        System.out.println("reversed string is: "+ stringRevevrsal12.reverseString("abcdefgh"));
        StringBuffer sb = new StringBuffer();
        String s = "abcdeaabfgh";
        sb.append(s);
//        System.out.println("reversed string1 is: "+ stringRevevrsal12.reverseStringNoSpace( sb));
        StringUniqueChars stringUniqueChars = new StringUniqueChars();
        System.out.println("Does string contains unique chars: "+stringUniqueChars.isUnique("abcdefghi"));
        System.out.println("Does string contains unique chars1: "+stringUniqueChars.isUnique("sfasdfsafsfsfaerwe"));

    }
}
