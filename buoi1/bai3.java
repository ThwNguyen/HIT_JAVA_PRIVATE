import java.util.Scanner;

public class bai3{
    public static void main (String[] args)
    {    
        for (int x = 0; x <= 20; x++)   // x: trau dung an 5 -> toi da 20 trau           
            for (int y = 0; y <= 33; y++)   // y: trau nam an 3 -> toi da 33 trau
                for (int z = 0; z <= 100; z++) // z: 3 trau gia an 1 -> toi da 100 trau
                    if (x+y+z == 100 && 5*x + 3*y + z/3 == 100)
                   //      tram trau        tram co
                    {
                        System.out.println("Trau dung = " + x);
                        System.out.println("Trau nam = " + y);
                        System.out.println("Trau gia = " + z);
                        System.out.println(" ");
                    }
    }
}