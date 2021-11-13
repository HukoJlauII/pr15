import java.util.*;

public class Main {
    public void ex1()
    {
        HashSet<Integer> h = new HashSet<>();
        for (int i=0;i<10;i++)
        {
            h.add((int)(Math.random()*100));
        }
        System.out.println(h.toString());
        TreeSet<Integer> t = new TreeSet<>();
        t.addAll(h);
        System.out.println(t.toString());
    }



    public void ex2()
    {
        Map map=new Map();
        map.createMap();
        System.out.println("Same names:"+ map.getSameFirstNameCount());
        System.out.println("Same surnames: "+ map.getSameSecondNameCount());
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.ex1();
        m.ex2();
        double[] floats =new double[20];
        for (int i=0;i<20;i++)
            floats[i]=Math.ceil((Math.random()*20)*100)/100;
        HashTable ht=new HashTable(20);
        ht.addHash(floats);
        ht.PrintHash();
        System.out.print("Input key to find in table: ");
        Scanner s=new Scanner(System.in);
        double toFind=s.nextDouble();
        if( ht.findNode(toFind)==-1)
        {
            System.out.println("Element doesn't exist in Hash");
        }
        else
        {
            System.out.println("Element found at hash "+ ht.findNode(toFind));
        }

    }


}
