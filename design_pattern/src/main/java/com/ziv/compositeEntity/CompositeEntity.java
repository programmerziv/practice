package com.ziv.compositeEntity;

public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1,String data2){
        cgo.setDate(data1,data2);
    }

    public String[] getData(){
        return cgo.getData();
    }

}
