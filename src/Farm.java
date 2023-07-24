import java.util.Arrays;

public class Farm {
    private String addres;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;
    private String OwnerName;
    private Cow cow;
    private Sheep sheep;
    private Horse horse;

    public Farm(String addres, String ownerName, Cow cow, Sheep sheep, Horse horse) {
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
        this.addres = addres;
        this.OwnerName = ownerName;
    }

    public Farm(String addres, Cow[] cows, Horse[] horses, Sheep[] sheeps, String ownerName) {
        this.addres = addres;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.OwnerName = ownerName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "\nFarm{" +
                "\naddres='" + addres + '\'' +
                "\n" + Arrays.toString(cows) +
                ",\n horses=" + Arrays.toString(horses) +
                ",\n sheeps=" + Arrays.toString(sheeps) +
                ",\n OwnerName='" + OwnerName + '\'' +
                '}';
    }
}
