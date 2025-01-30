package practice;

public class  Intern extends Employee{
    private String universityName;

    public Intern(String universityName, String name, double salary){
        super(name, salary);
        this.universityName = universityName;

    }
    public String GetUniversityName(){return this.universityName;}
    public void SetUniversityName(String universityName){
        this.universityName = universityName;
    }

    @Override
    public String getDetails(){
        return this.universityName + super.getDetails();

    }
}
