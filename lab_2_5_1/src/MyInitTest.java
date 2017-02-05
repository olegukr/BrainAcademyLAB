/**
 * Create class MyInitTest with two initialization blocks,
 * two static initialization blocks and two constructors (one constructor()
 * must invoke second constructor(int)). On each block write code
 * that prints on console type of block and block number.
 * For example:
 * “static initialization block 1”
 * “static initialization block 2”
 * “non-static initialization block 1”
 * “non-static initialization block 2”
 * “constructor 1” “constructor 2”
 *
 * Created by olegpoberezhets on 05.02.17.
 */
public class MyInitTest {

//            * “static initialization block 1”
    static {
    System.out.println("static initialization block 1");
    }
    //            * “static initialization block 2”

    static {
        System.out.println("static initialization block 2");
    }
//            * “non-static initialization block 1”
{
    System.out.println("non-static initialization block 1");
}
//            * “non-static initialization block 2”
{
    System.out.println("non-static initialization block 2");
}
//            * “constructor 1”
    public MyInitTest(){
        this(1);
        System.out.println("constructor 1");
    }
//              “constructor 2”
   public  MyInitTest(int val){
        System.out.println("constructor 2");
    }

}
