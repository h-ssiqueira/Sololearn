import java.util.*;

public class Bowling_Game {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }

    public class Bowling {
        HashMap<String, Integer> players;
        Bowling() {
            players = new HashMap<String, Integer>();
        }
        public void addPlayer(String name, int p) {
            players.put(name, p);
        }
        //your code goes here
        public void getWinner(){
        Map.Entry<String,Integer> j = null;;
            for(Map.Entry<String,Integer> m:players.entrySet()){
                if(j == null || m.getValue().compareTo(j.getValue())>0)
                    j=m;
            }
            System.out.print(j.getKey());
        }
    }
}