/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author NgT
 */
public class StringBufferAndStringBuilder {

}

class BufferTest {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello");
        buffer.append(" java");
        System.out.println(buffer);
    }
}

class BuilderTest {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        builder.append(" java");
        System.out.println(builder);
    }
}

//Kiểm tra hiệu suất của lớp StringBuffer và StringBuilder trong Java
class ConcatTest {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append("Vietjack");
        }
        System.out.println("Thoi gian tieu ton boi StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb2.append("Vietjack");
        }
        System.out.println("Thoi gian tieu ton boi StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
