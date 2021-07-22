package Lesson4.Assignment;
//For this lesson's assignment, take the two concrete classes we created and make the team roster project work with both of them. I chose the team roster that wrote an output file, but any of the team roster projects will work using either of these lists in place of the arrays or ArrayLists we used in Lessons 2 and 3. The only change I had to make was to the Team class, since that is the class that defines the team list. My solutions are below if you want to look at them, but try to work it out on your own first. Let me know in the Discussion Area if you have any problems.

//Here is my solution using the concrete class MyConcreteList:

//public class Team
//{
//    private MyList<Player> roster; // ArrayList to hold the roster
//    public Team()
//    {
//        roster = new MyConcreteList<Player>(); // create ArrayList
//    }
//    public void addPlayer(Player player)
//    {
//        roster.add(player); // add player to roster
//    }
//    public String toString()
//    {
//        String teamRoster = "Team Roster\n\n"; // output String
//        for (int i = 0; i < roster.size(); i++)     // for each player in roster
//        {
//            teamRoster = teamRoster + roster.get(i).toString() + "\n"; // add name to output
//        }
//        return teamRoster;     // return output string
//    }
//    public String toFile()
//    {
//        String fileRoster = ""; // output String
//        for (int i = 0; i < roster.size(); i++)     // for each player in roster
//        {
//            fileRoster = fileRoster + roster.get(i).toFile() + "\n"; // add name to output        }
//            return fileRoster;      // return output string
//        }
//    }

//And here's my solution using MyConcreteArrayList:

//    public class Team
//    {
//        private MyList<Player> roster; // ArrayList to hold the roster
//        public Team()
//        {
//            roster = new MyConcreteArrayList<Player>(); // create ArrayList
//        }
//        public void addPlayer(Player player)
//        {
//            roster.add(player); // add player to roster
//        }
//        public String toString()
//        {
//            String teamRoster = "Team Roster\n\n"; // output String
//
//            for (int i = 0; i < roster.size(); i++)     // for each player in roster
//            {
//                teamRoster = teamRoster + roster.get(i).toString() + "\n"; // add name to output
//            }
//            return teamRoster;     // return output string
//        }
//        public String toFile()
//        {
//            String fileRoster = ""; // output String
//            for (int i = 0; i < roster.size(); i++)     // for each player in roster
//            {
//                fileRoster = fileRoster + roster.get(i).toFile() + "\n"; // add name to output
//            }
//            return fileRoster;      // return output string
//        }
//    }