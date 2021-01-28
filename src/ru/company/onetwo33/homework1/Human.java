package ru.company.onetwo33.javalvl2.homework1;

class Human implements Sportable {

    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        System.out.println("Человек бежит");
        if (length <= this.maxRun) {
            System.out.println("Успешно пробежал!");
            return true;
        } else {
            System.out.println("Не смог пробежать");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        System.out.println("Человек прыгает");
        if (height <= this.maxJump) {
            System.out.println("Успешно перепрыгнул!");
            return true;
        } else {
            System.out.println("Не смог перепрыгнуть");
            return false;
        }
    }
}
