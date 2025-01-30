package practice;

public class  Manager extends Employee {
    private int teamSize;

    public Manager(int teamSize, String name, double salary){
        super(name, salary);
        this.teamSize = teamSize;
    }
    public double GetTeamSize(){ return this.teamSize;}

    public void setAccountNumber(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String getDetails(){
        return this.teamSize + super.getDetails();
    }

}
