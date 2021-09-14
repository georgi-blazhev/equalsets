package georgi;


import java.util.HashSet;
import java.util.Set;

public class TeamManager extends Employee implements Comparable{

    private Set<Agent> agentsInTeam = new HashSet<>();
    private final String waveName;
    private final int id;

    public TeamManager(String firstName, String lastName, String project, long badgeNumber, String startDate, String waveName, int id) {
        super(firstName, lastName, project, badgeNumber, startDate);
        this.waveName = waveName;
        this.id = id;
    }

    public boolean addAgentToTeam(Agent agent){

        if (agentsInTeam.contains(agent)){
            System.out.println("Agent " + agent.getLastName() + ", " + agent.getFirstName() + " is already added.");
            return false;
        }
        agentsInTeam.add(agent);
        System.out.println("Agent " + agent.getLastName() + ", " + agent.getFirstName() + " added " + getWaveName() + ".");
        return true;
    }

    public boolean removeAgentFromTeam(Agent agent){
        if (agentsInTeam.contains(agent)){
            System.out.println("Agent " + agent.getLastName() + ", " + agent.getFirstName() + " removed.");
            return true;
        }
        agentsInTeam.add(agent);
        System.out.println("Agent " + agent.getLastName() + ", " + agent.getFirstName() + " is not in " + getWaveName() + ".");
        return false;
    }

    public void printTeamMembers(){
        for (Agent j : agentsInTeam){
            System.out.println(j);
        }
    }

    @Override
    public int compareTo(Object o) {
        TeamManager tm = (TeamManager) o;
        if (this.id > tm.id){
            return 1;
        } else if (this.id < tm.id){
            return -1;
        }
        return 0;
    }

    public String getWaveName() {
        return waveName;
    }

    public Set<Agent> getAgentsInTeam() {
        return agentsInTeam;
    }
}
