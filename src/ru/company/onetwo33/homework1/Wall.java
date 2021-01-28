package ru.company.onetwo33.javalvl2.homework1;

class Wall implements Blockable {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean action(Sportable sportable) {
        return sportable.jump(height);
    }
}
