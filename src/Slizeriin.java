
public class Slizeriin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int authority ;

    public Slizeriin(String name, String surname, int power, int transgressiya, int cunning, int determination, int ambition, int resourcefulness,int authority) {
        super(name, surname, power, transgressiya);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;//находичивость
        this.authority = authority;//жажда власти
    }

    @Override
    public String toString() {
        return "Slizeriin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", authority=" + authority +
                "} " + super.toString();
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}