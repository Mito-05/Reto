import java.util.Random;

public class Tamagochi {
    private int hunger ;
    private int energy ;
    private int moodcount;


    public Tamagochi(int hunger, int energy) {
        this.hunger = 4;
        this.energy = 4;
        this.moodcount = 4;

    }

    public int getMoodcount() {
        return moodcount;
    }

    public void setMoodcount(int moodcount) {
        this.moodcount = moodcount;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }


    public String play() {
        this.energy -= 1;
        this.moodcount += 1;
        this.hunger += 1;
        if (energy <= 0) {
            return "(-_-) zZZ";
        }
        else if (hunger < 3) {
            return "(-_-)";
        }
        else if (moodcount >= 8) {
            return ":-)";
        }
        else if (moodcount < 2) {
            return "ఠ_ఠ";
        }
        else {
            return ":-|";
        }
    }
    public String eat() {
        this.energy -= 1;
        this.hunger -= 2;
        if (energy <= 0) {
            return "(-_-) zZZ";
        }
        else if (hunger < 3) {
            return "(-_-)";
        }
        else if (moodcount >= 8) {
            return ":-)";
        }
        else if (moodcount < 2) {
            return "ఠ_ఠ";
        }
        else {
            return ":-|";
        }
    }
    public String sleep() {
        this.energy += 2;
        if (energy <= 0) {
            return "(-_-) zZZ";
        }
        else if (hunger < 3) {
            return "(-_-)";
        }
        else if (moodcount >= 8) {
            return ":-)";
        }
        else if (moodcount < 2) {
            return "ఠ_ఠ";
        }
        else {
            return ":-|";
        }
    }
}
