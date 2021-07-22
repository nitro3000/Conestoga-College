package Lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TeamDriver {
    public static void main(String[] args) {
        Team t = new Team ( );

        String name;
        char position;
        double avgPoint;
        double avgRebounds;
        double avgAssists;

        try
        {
            Scanner scan = new Scanner(new File ("C:\\Users\\Lenovo X220 Tablet\\Desktop\\TeamFile.txt"));
            while (scan.hasNext ())
            {
                name = scan.next ()+" "+scan.next ();
                position = scan.next ().charAt (0);
                avgPoint = scan.nextDouble();
                avgRebounds = scan.nextDouble();
                avgAssists = scan.nextDouble();

                t.addPlayer (new Player (name, position, avgPoint, avgRebounds, avgAssists));
            }
            scan.close ();
        }
        catch (IOException e)
        {
            System.out.println ("*** I/O Error ***\n" +e );
        }
        System.out.println (t.toString ( ));

// OUT creating file.txt ***********************************************************************************************
        PrintStream oFile;

        t.addPlayer (new Player ("John Doe", 'C', 19.19, 15.15, 4.4));
        t.addPlayer (new Player ("Jack Spratt", 'F', 11.11, 7.7, 3.3));
        t.addPlayer (new Player ("Donald Duck", 'G', 13.13, 4.4, 6.6));
        t.addPlayer (new Player ("Bugs Bunny", 'G', 8.8, 2.2, 1.1));
        t.addPlayer (new Player ("Paul Bunyan", 'C', 5.5, 1.1, 2.2));
        t.addPlayer (new Player ("Pecos Bill", 'G', 9.9, 3.3, 6.6));
        t.addPlayer (new Player ("Rip van Winkle", 'F', 8.0, 4.0, 2.0));

        System.out.println (t.toString ( ));

        try

        {
            oFile = new PrintStream ("C:\\Users\\Lenovo X220 Tablet\\Desktop\\TeamFile.txt");
            oFile.println (t.toFile ( ));
            oFile.close ( );
        }
        catch (IOException e)


        {
            System.out.println ("*** I/O Error ***\n" +e );

        }
    }
}
