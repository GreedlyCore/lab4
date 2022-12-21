package based;

import helper.Printer;

public final class Nature extends Entity {


    Law[] lawsOfNature;
    boolean isTruth;

    public Nature(Law[] laws) {
        super("Nature");
        this.lawsOfNature = laws;
        this.isTruth = true;

    }

    public Nature(String name) {
        super(name);
        isTruth = true;


    }

    public Nature() {
        super("Nature");
        isTruth = true;


    }

    public void generateLaws() {
        Law[] laws = new Law[10];
        for (int i = 0; i < 10; i++) {
            laws[i] = new Law(false);
        }
        this.lawsOfNature = laws;

    }

    public boolean isTruth() {
        return isTruth;
    }

    public void setTruth(boolean truth) {
        isTruth = truth;
    }

    public void setLawsIsBroken(boolean value) {
        for (int i = 0; i < lawsOfNature.length; i++) {
            lawsOfNature[i].setBroken(value);
        }
        isTruth = false;
    }


    @Override
    public String toString() {
        if (isTruth) {
            return super.getName();
        }
        return Printer.setSpaces("broke laws of", super.getName());

    }

}
