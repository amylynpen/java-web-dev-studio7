package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    private String name;
    private String contents;
    private String discType;
    private int spinRate = 2000;

    // TODO: Implement your custom interface.

    public DVD(int size, boolean isNew, boolean isEmpty, boolean isWrittenByLaser){
        super(size, isNew, isEmpty, isWrittenByLaser);
    }

    @Override
    public void spinDisc() {
        System.out.printf("A CD spins at a rate of %d", spinRate);
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

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
