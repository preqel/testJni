package testjni.example.com.testjni;



public class myJNI {


    static {
        System.loadLibrary("JniTest");
    }


    public static native String sayHello();

}
