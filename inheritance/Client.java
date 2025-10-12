package inheritance;

public class Client {
    public static void main(String[] args) {
        //case 1
        P obj1 = new P();
        System.out.println(obj1.d); //p class data member
        System.err.println(obj1.d1); //p class data member
        obj1.fun(); //P class method
        obj1.fun1(); //P class method

        //case 2 preferred
        P obj2 = new C();
        System.out.println(obj2.d); //p class data member
        System.err.println(obj2.d1); //p class data member
        System.out.println(((C)obj2).d2); //c class data member
        obj2.fun(); //C class method
        obj2.fun1(); //C class method
        ((P)obj2).fun(); //C class method //no use of casting here
        ((C)obj2).fun1(); //C class method

        //case 3 
        /* C obj3 = new P(); //not allowed may lead to runtime error
        System.out.println(obj3.d); //c class data member
        System.err.println(obj3.d2); //c class data member
        System.out.println(obj3.d1); //p class data member */

        //case 4 preferred
        C obj4 = new C();
        System.out.println(obj4.d); //c class data member
        System.err.println(obj4.d2); //c class data member
        System.out.println(obj4.d1); //p class data member  
    }
    
}
