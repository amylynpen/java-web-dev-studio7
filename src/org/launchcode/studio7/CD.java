package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    private String name;
    private String contents;
    private String discType;
    private int spinRate = 2000;

    public CD(int capacity, boolean isNew, boolean isEmpty, boolean isWrittenByLaser) {
        super(capacity, isNew, isEmpty, isWrittenByLaser);
    }

    @Override
    public void spinDisc() {
    }

    @Override
    public void readData() {
    }

    @Override
    public void writeData(String name, String contents) {
    }

    @Override
    public void getInfo() {
    }

    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
