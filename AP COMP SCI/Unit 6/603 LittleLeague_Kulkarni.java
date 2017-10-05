/**
 *Arya Kulkarni
 *Little League
 */
import java.util.*;
class LL{
    public static void main(String[] args){
        ArrayList<Players> LL = new ArrayList<>();
        LL.add(new Players("Falcons","Jason McScallopZ"));
        LL.add(new Players("Pirates","Joe Arggggggg"));
        LL.add(new Players("Falcons","Arya Smells"));
        LL.add(new Players("Pirates","Al Yourbase"));
        LL.add(new Players("Falcons","Alex Smellsworse"));
        LL.add(new Players("Falcons","Katie ThinksIt’sOkToBeLate"));
        LL.add(new Players("Pirates","Jeremy Meh"));


        RosterPrinter printer = new RosterPrinter();
        System.out.println("Sort by player name: " + printer.byName(LL).toString());
        System.out.println();
        System.out.println();
        printer.byTeam(LL);


    }
}
class RosterPrinter{
    public ArrayList<Players> byName(ArrayList<Players> player){
      for(int i=1; i<player.size();i++){
          for(int j=0;j<i;j++){
              if(player.get(i).getName().compareTo(player.get(j).getName())<0){
                  player.add(j,player.get(i));
                  player.remove(i+1);
              }
          }
      }
      return player;
    }

    public void byTeam(ArrayList<Players> player){
        byName(player);

        while (player.size()!=0){
            String tName = player.get(0).getTeam();
            System.out.println(tName+":");
            for(int i=0; i<player.size();i++){
                if(tName.equals(player.get(i).getTeam())){
                    System.out.println(player.get(i).getName());
                    player.remove(i);
                    i--;
                }
            }
            System.out.println("\n");
        }
    }
}
class Players{
    String team, name;

    public Players(String team, String name){
        this.team = team;
        this.name = name;
    }
    public String getTeam(){
        return team;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name ;
    }
}