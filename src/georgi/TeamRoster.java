package georgi;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class TeamRoster{

    private final String name;
    private Map<TeamManager, Set<Agent>> teamsOnFloor = new HashMap<>();

    public TeamRoster() {
        this.name = "Teams Roster";
    }

    public boolean addTeamToRoster(TeamManager tm, Set<Agent> agents){
        if (teamsOnFloor.containsValue(agents)){
            System.out.println("This team has already been added to the roster.");
            return false;
        }
        teamsOnFloor.put(tm, tm.getAgentsInTeam());
        System.out.println(tm.getWaveName() + " added to roster with TM: " + tm.getLastName() + ", " + tm.getFirstName() + ".");
        return true;
    }

    public boolean removeTeamFromRoster(TeamManager tm, Set<Agent> agents){
        if (teamsOnFloor.containsValue(agents)){
            System.out.println("This team has been removed from the roster.");
            return true;
        }
        teamsOnFloor.put(tm, tm.getAgentsInTeam());
        System.out.println("TeamRoster " + this.name + " does not exist in current roster.");
        return false;
    }

}
