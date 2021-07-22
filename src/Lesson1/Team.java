package Lesson1;

import java.util.ArrayList;

public class Team {
//    String [] roster;
//    int teamSize;
//
//    public Team()
//    {
//        roster = new String[20];
//        teamSize = 0;
//    }
//
//    public Team(int arraySize)
//    {
//        roster = new String[arraySize];
//        teamSize = 0;
//    }
//
//    public void addPlayer(String playerName){
//        if (teamSize<roster.length)
//        {
//            roster[teamSize]=playerName;
//            teamSize++;
//        }
//    }
//
//    public String toString()
//    {
//        String teamRoster = "Team Roster\n\n";
//        int i = 0;
//        while ( i < teamSize)
//        {
//            teamRoster=teamRoster+roster[i]+"\n";
//            i++;
//        }
//        return teamRoster;
//    }
// changing Team class to use Player class
//    private Player [] roster;
//    private int teamSize;
    private ArrayList<Player>roster;


    public Team()
    {
        roster = new ArrayList<Player>();
//        roster = new Player[7];
//        teamSize = 0;
    }

//    public Team(int arraySize)
//    {
//        roster = new Player[arraySize];
//        teamSize = 0;
//    }

    public void addPlayer(Player player){
//        if (teamSize<roster.length)
//        {
//            roster[teamSize]=player;
//            teamSize++;
//        }
        roster.add (player);
    }

    public String toString()
    {
        String teamRoster = "Team Roster\n\n";
//        int i = 0;
//        while ( i < teamSize)
//        {
//            teamRoster=teamRoster+roster[i].toString ()+"\n";
//            i++;
//        }
//        return teamRoster;
//        for (int i = 0; i <(teamSize) ; i++)
//        {
//            teamRoster=teamRoster+roster[i].toString ()+"\n";
//        }
//        return teamRoster;
        //change size of [roster] or null pointer-e will thrown
        for (Player p:roster)
        {
            teamRoster=teamRoster+p.toString ()+"\n";
        }
        return teamRoster;
    }

    public String toFile()
    {
        String fileRoster = "";
        for (Player p : roster)
        {
            fileRoster=fileRoster+p.toFile ()+"\n";
        }
        return fileRoster;
    }
}
