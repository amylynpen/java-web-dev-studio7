package org.launchcode.studio7;

public abstract class BaseDisc {
    protected int capacity;
    protected boolean isNew;
    protected boolean isEmpty;
    protected boolean isWrittenByLaser;

    public BaseDisc(){
        this.isEmpty = false;
        this.isNew = false;
        this.isWrittenByLaser = false;
    }

    public BaseDisc(int capacity, boolean isNew, boolean isEmpty, boolean isWrittenByLaser){

    }

}
