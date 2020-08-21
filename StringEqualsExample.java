public class StringEqualsExample {
    public static void main(String[] args){
        String strVar1="raen";
        String strVar2="raen";

        if(strVar1 == strVar2) {
            System.out.println("참조가 같음");
        }else{
            System.out.println("참조가 다름");
        }
        if(strVar1.equals(strVar2)){
            System.out.println("문자열이 같음");
        }

        String strvar3 = new String("raen");
        String strvar4 = new String("raen");

        if(strvar3 ==strvar4) {
            System.out.println("참조가 같음");
        }else{
            System.out.println("참조가 다름");
        }
        if(strvar3.equals(strvar4)){
            System.out.println("문자열 같음");
        }

        if(strVar1 ==strvar3) {
            System.out.println("참조가 같음");
        }else{
            System.out.println("참조가 다름");
        }
        if(strVar1.equals(strvar4)){
            System.out.println("문자열 같음");
        }
    }
}
