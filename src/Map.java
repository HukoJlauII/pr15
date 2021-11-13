import java.util.LinkedList;
import java.util.List;

public class Map {
    List<MapNode> map =new LinkedList<>();
    public void createMap()
    {
        String[] names = {"Maxim", "Artyom", "Mikhail", "Ivan"};
        String[] surnames={"Ivanov","Petrov","Sidorov"};
        for(int i=0;i<10;i++)
        {
            map.add(new MapNode(surnames[(int)(Math.random()*surnames.length)],names[(int)(Math.random()*names.length)] ));
        }

    }
//    public void outMap()
//    {
//        for (MapNode m:map)
//        {
//            System.out.println(m);
//        }
//    }
    public int getSameFirstNameCount ()
    {
        int count =0;
        boolean[] isCount=new boolean[map.size()];

        for (int i=0;i<map.size();i++)
        {
            if (!isCount[i])
            {
                String namePattern=map.get(i).getName();
                isCount[i]=true;
                for (int j=i+1;j<map.size();j++)
                {
                    if (map.get(j).getName()==namePattern)
                    {
                        isCount[j]=true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public int getSameSecondNameCount ()
    {
        int count =0;
        boolean[] isCount=new boolean[map.size()];

        for (int i=0;i<map.size();i++)
        {
            if (!isCount[i])
            {
                String surnamePattern=map.get(i).getSurname();
                isCount[i]=true;
                for (int j=i+1;j<map.size();j++)
                {
                    if (map.get(j).getSurname()==surnamePattern)
                    {
                        isCount[j]=true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
