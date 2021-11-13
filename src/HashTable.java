import java.util.ArrayList;

public class HashTable {
    public  ArrayList<Double>[] Hash;
    private int Tablesize;

    public HashTable(int tablesize)
    {
        Tablesize = tablesize;
        Hash=new ArrayList[tablesize];
        for (int i=0;i<tablesize;i++)
        {
            Hash[i]=new ArrayList<>();
        }

    }

    public int Hashfunc(double key, int n)
    {
        return (int)(key%n);
    }
    public void addHash(double[] element)
    {
        for (int i=0;i<element.length;i++)
        {
            Hash[Hashfunc(element[i],Tablesize)].add(element[i]);
        }
    }
    public int findNode(double key)
    {
        if(Hash[Hashfunc(key,Tablesize)].size()==0) {
            return -1;
        }
        else
        {
            return Hashfunc(key,Tablesize);
        }
    }
    public void PrintHash()
    {
        for (int i=0;i<Tablesize;i++)
        {
            System.out.printf("%2d: ",i);
            if (Hash[i].size()==0) {
                System.out.println("null");
            }
            else
            {
                for (int j=0;j<Hash[i].size();j++)
                {
                    System.out.print(Hash[i].get(j)+" -> ");
                }
                System.out.println("end");
            }
        }
    }
}
