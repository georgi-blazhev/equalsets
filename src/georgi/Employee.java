package georgi;

public abstract class Employee{

    private final String firstName;
    private final String lastName;
    private final String project;
    private final long badgeNumber;
    private final String startDate;

    public Employee(String firstName, String lastName, String project, long badgeNumber, String startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.project = project;
        this.badgeNumber = badgeNumber;
        this.startDate = startDate;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof  Agent)) return false;
        Agent agent = (Agent) obj;

        return this.firstName.equalsIgnoreCase(agent.getFirstName()) &&
                this.lastName.equalsIgnoreCase(agent.getLastName()) &&
                this.project.equalsIgnoreCase(agent.getProject()) &&
                this.badgeNumber == agent.getBadgeNumber() &&
                this.startDate.equalsIgnoreCase(agent.getStartDate());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int)badgeNumber;
        hash = 31 * hash + (firstName == null ? 0 : firstName.hashCode());
        hash = 31 * hash + (lastName == null ? 0 : lastName.hashCode());
        hash = 31 * hash + (project == null ? 0 : project.hashCode());
        hash = 31 * hash + (startDate == null ? 0 : startDate.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", project='" + project + '\'' +
                ", badgeNumber=" + badgeNumber +
                ", startDate='" + startDate + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProject() {
        return project;
    }

    public long getBadgeNumber() {
        return badgeNumber;
    }

    public String getStartDate() {
        return startDate;
    }
}
