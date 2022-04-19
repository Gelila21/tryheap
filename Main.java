
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
public static void main(String[] args){
try{
ArrayList<Integer> readArray = new ArrayList<Integer>() ;
File file = new File("/Users/gelilachaka/downloads/data_random.txt");
try (Scanner reader = new Scanner(file)) {
    while (reader.hasNextInt()){
    readArray.add(reader.nextInt());
    }
}
int[] arr = new int[readArray.size()];
for (int i =0; i< readArray.size(); i++)
arr[i] = readArray.get(i);
Heap h = new Heap();
h.buildHeap(arr);
h.printHeap ( "output.txt");
}catch (IOException e){
System.out.println("Error while reading") ;
}
}
}