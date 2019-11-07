
public class Helloworld {

    String name = "lzlcode";
   //45555
    /*public  static void main(String [] args){
            //sout : 直接输出语句
            System.out.println();
            //
        }*/
    //快加 psvm 主方法的首字母
    public static void main(String[] args) {
        System.out.println("Helloworld.main");
        Helloworld test =new Helloworld();
        test.test1();
    }
    public String test1(){
        System.out.println("ok");
        return "test ok";
    }
}
