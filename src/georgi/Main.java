package georgi;



public class Main {



    public static void main(String[] args) {

        Agent georgiBlazhev = new Agent("Georgi", "Blazhev", "Just Eat", 1115, "21/06/2018");
        Agent renginRemzi = new Agent("Rengin", "Remzi", "Just Eat", 1111, "21/06/2018");

        TeamManager kadrieAdemova = new TeamManager("Kadrie", "Ademova",
                "Just Eat", 600, "22/03/2016", "Wave 8", 8);

        kadrieAdemova.addAgentToTeam(georgiBlazhev);
        kadrieAdemova.addAgentToTeam(georgiBlazhev);
        kadrieAdemova.addAgentToTeam(renginRemzi);


        TeamRoster teamsOnFloor = new TeamRoster();
        teamsOnFloor.addTeamToRoster(kadrieAdemova, kadrieAdemova.getAgentsInTeam());


    }
}
