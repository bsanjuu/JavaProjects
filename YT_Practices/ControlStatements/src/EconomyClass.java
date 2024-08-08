public class EconomyClass {
    public static void main(String[] args) {
        int income=120_000;

        String ClassName=(income>100000?"First":"Economy");

        //Simplied If condition
        //        if(income>100_000)
//        {
//            ClassName="First";
//        }
//        else
//        {
//            ClassName="Economy";
//        }
        System.out.println(ClassName);
    }
}
