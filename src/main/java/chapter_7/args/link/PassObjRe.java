package chapter_7.args.link;

/**
 * Created by Vlad on 27.01.2016.
 */
public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a & ob.b to call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a & ob.b after call: " + ob.a + " " + ob.b);
    }
}
