package DataStructure;

/**
 * Author: ENIAC
 * E-mail: ZHAOZHEN1002@GMAIL.COM
 * Date:   02/14/1946
 */

public class HelloWorld {
    private String greeting;

    public HelloWorld() {
        greeting = "Hello World!";
    }

    /* print "Hello World!" on the screen! */
    public void sayHello() {
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        HelloWorld firstWord = new HelloWorld();
        firstWord.sayHello();
    }
}
