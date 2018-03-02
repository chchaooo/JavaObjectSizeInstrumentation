//import sizeof.ObjectShallowSize;

public class Main {
    
    static boolean     booleanValue    = true;
    static byte        byteValue       = 1;
    static short       shortValue      = 1;
    static char        charValue       = 'a';
    static int         intValue        = 1;
    static float       floatValue      = 0;
    static long        longValue       = 1;
    static double      doubleValue     = 0;
    
    static class BasicValue{
        boolean     booleanValue    = true;
        byte        byteValue       = 1;
        short       shortValue      = 1;
        char        charValue       = 'a';
        int         intValue        = 1;
        float       floatValue      = 0;
        long        longValue       = 1;
        double      doubleValue     = 0;
        
    }
    
    static Integer[] arr = new Integer[10];
    
    static Boolean     aBoolean    = true;
    static Byte        aByte       = 1;
    static Short       aShort      = 1;
    static Character   aChar       = 'a';
    static Integer     anInt        = 1;
    static Float       aFloat      = 0.0f;
    static Long        aLong       = 1l;
    static Double      aDouble     = 0d;
    
    static String str = "";
    
    /** 对象头(8) + 类指针(4) + padding(4) = 16 */
    static class Empty{
        
    }
    
    /** 对象头(8) + 类指针(4) + a(4) = 16 */
    static class A {
        int a;
    }
    
    /** 对象头(8) + 类指针(4) + a(4) + b(4) + padding(4) = 24 */
    static class B {
        int a;
        int b;
    }
    
    /** 对象头(8) + 类指针(4) + a(4) + b(4) + c(4) = 24 */
    static class C {
        int a;
        int b;
        int c;
    }
    
    /** 对象头(8) + 类指针(4) + a(4) + b(4) + c(4) + d(4) + padding(4) = 32 */
    static class D {
        int a;
        int b;
        int c;
        int d;
    }
    
    static class E {
        int a;
        int b;
        int c;
        int d;
        int e;
    }
    
    static class F {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
    }
    
    static class AWith1Boolean {
        boolean a;
    }
    
    static class AWith2Boolean {
        boolean a;
        boolean b;
    }
    
    static class AWith3Boolean {
        boolean a;
        boolean b;
        boolean c;
    }
    
    static class AWith4Boolean {
        boolean a;
        boolean b;
        boolean c;
        boolean d;
    }
    
    static class AWith5Boolean {
        boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
    }
    
    static class ObjectMultiA {
        String str;  // 4
        int i1; // 4
        byte b1; // 1
        byte b2; // 1
        int i2;  // 4
        Object obj; //4
        byte b3;  // 1
    }
    
    public static void main(String[] args) {
        
        /**
         * 基本类型：
         * sizeOf只能计算对象类型所占用的空间，无法计算基本类型占用的空间
         * 基本类型传过去之后会自动封装为对象类型
         * */
        //        System.out.println("boolean:\t"+ ObjectShallowSize.sizeOf(booleanValue));
        //        System.out.println("byte:\t\t"+ ObjectShallowSize.sizeOf(byteValue));
        //        System.out.println("short:\t\t"+ ObjectShallowSize.sizeOf(shortValue));
        //        System.out.println("char:\t\t"+ ObjectShallowSize.sizeOf(charValue));
        //        System.out.println("int:\t\t"+ ObjectShallowSize.sizeOf(intValue));
        //        System.out.println("float:\t\t"+ ObjectShallowSize.sizeOf(floatValue));
        //        System.out.println("long:\t\t"+ ObjectShallowSize.sizeOf(longValue));
        //        System.out.println("double:\t\t"+ ObjectShallowSize.sizeOf(doubleValue));
        //        System.out.println();
        
        /**
         * 封装类型:
         *
         * */
        System.out.println("Boolean:\t"+ SizeOfObject.sizeOf(aBoolean));
        System.out.println("Byte:\t\t"+ SizeOfObject.sizeOf(aByte));
        System.out.println("Short:\t\t"+ SizeOfObject.sizeOf(aShort));
        System.out.println("Character:\t"+ SizeOfObject.sizeOf(aChar));
        System.out.println("Integer:\t"+ SizeOfObject.sizeOf(anInt));
        System.out.println("Float:\t\t"+ SizeOfObject.sizeOf(aFloat));
        System.out.println("Long:\t\t"+ SizeOfObject.sizeOf(aLong));
        System.out.println("Double:\t\t"+ SizeOfObject.sizeOf(aDouble));
        System.out.println();
        
        /**
         * empty对象：
         * 引用:4bytes,对齐到8；对象头占4字节，对齐到8
         * */
        System.out.println("emptyObj:\t"+ SizeOfObject.sizeOf(new Object()));
        
        /**对象With int*/
        System.out.println("Obj1Int:\t"+ SizeOfObject.sizeOf(new A()));
        System.out.println("Obj2Int:\t"+ SizeOfObject.sizeOf(new B()));
        System.out.println("Obj3Int:\t"+ SizeOfObject.sizeOf(new C()));
        System.out.println("Obj4Int:\t"+ SizeOfObject.sizeOf(new D()));
        System.out.println("Obj5Int:\t"+ SizeOfObject.sizeOf(new E()));
        System.out.println("Obj6Int:\t"+ SizeOfObject.sizeOf(new F()));
        System.out.println();
        
        /**对象With boolean*/
        System.out.println("Obj1bool:\t"+ SizeOfObject.sizeOf(new AWith1Boolean()));
        System.out.println("Obj2bool:\t"+ SizeOfObject.sizeOf(new AWith2Boolean()));
        System.out.println("Obj3bool:\t"+ SizeOfObject.sizeOf(new AWith3Boolean()));
        System.out.println("Obj4bool:\t"+ SizeOfObject.sizeOf(new AWith4Boolean()));
        System.out.println("Obj5bool:\t"+ SizeOfObject.sizeOf(new AWith5Boolean()));
        System.out.println();
        
        /**数组*/
        System.out.println("arr:\t\t"+ SizeOfObject.sizeOf(arr));
        
        /**多值对象*/
        System.out.println("ObjMultiA:\t"+ SizeOfObject.sizeOf(new ObjectMultiA()));
    }
}

