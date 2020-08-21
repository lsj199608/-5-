public class ArrayReferenceObjectExample {
    public static void main(String[] args){
        String[] strArray = new String[3];
        strArray[0] = "a";
        strArray[1] = "a";
        strArray[2] = new String("a");

        System.out.println(strArray[0] == strArray[1]); //문자열이 같으므로  String 객체 공유.
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[1] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
    }
}
