/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfstudy;

/**
 *
 * @author NgT
 */
public class Generic {
    // phuong thuc generic co ten la printArray                         

    public static < E> void printArray(E[] inputArray) {
        // Hien thi cac phan tu mang              
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Tao cac mang Integer, Double va Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Mang intArray bao gom:");
        printArray(intArray); // truyen mot mang Integer

        System.out.println("\nMang doubleArray bao gom:");
        printArray(doubleArray); // truyen mot mang Double

        System.out.println("\nMang charArray bao gom:");
        printArray(charArray); // truyen mot mang Character
    }
}

class MaximumTest {
    // xac dinh gioi han max cua cac doi tuong Comparable

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // gia su ban dau x la lon nhat       
        if (y.compareTo(max) > 0) {
            max = y; // y la lon nhat
        }
        if (z.compareTo(max) > 0) {
            max = z; // bay gio z la lon nhat                 
        }
        return max; // tra ve doi tuong lon nhat   
    }

    public static void main(String args[]) {
        System.out.printf("Max cua %d, %d va %d la %d\n\n",
                3, 4, 5, maximum(3, 4, 5));

        System.out.printf("Max cua %.1f,%.1f va %.1f la %.1f\n\n",
                6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        System.out.printf("Max cua %s, %s va %s la %s\n", "pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
    }
}

class Box<T> {

  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public static void main(String[] args) {
     Box<Integer> integerBox = new Box<Integer>();
     Box<String> stringBox = new Box<String>();
    
     integerBox.add(new Integer(10));
     stringBox.add(new String("Hello World"));

     System.out.printf("Gia tri integer la:%d \n\n", integerBox.get());
     System.out.printf("Gia tri string la:%s \n", stringBox.get());
  }
}