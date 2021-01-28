package ru.company.onetwo33.javalvl2.homework1;

class RunningTrack implements Blockable {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean action(Sportable sportable) {
        return sportable.run(length);
    }
}
