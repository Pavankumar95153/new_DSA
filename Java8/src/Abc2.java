public class Abc2 {
    public static void main(String[] args){
        String str = "Hello world";
        String [] splits = str.split("\\s");
        for(String splitsTraverse: splits){
            System.out.println(splitsTraverse);
        }
    }

}