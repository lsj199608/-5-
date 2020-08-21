public class ArrayCopyByForExample {
    public static void main(String[] args){
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for(int i=0; i< oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }
        for(int i=0; i< newIntArray.length; i++){
            System.out.print(newIntArray[i]+", ");
        }

        String[] oldStrArray = {"java", "array"," copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
        for(int i=0; i< newStrArray.length; i++){
            System.out.printf(newStrArray[i] + ",");
        }
    }
}
