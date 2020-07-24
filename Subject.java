package com.example.patient.Observer;

import com.example.patient.Observer.ISubject;
import com.example.patient.Observer.Iobserver;
import com.example.patient.startgeypatient.PatientDataModel;

import java.util.ArrayList;
import java.util.Iterator;

public class Subject implements ISubject {

    ArrayList<Iobserver>  iobserverArrayList;

    public Subject() {
        iobserverArrayList=new ArrayList<Iobserver>();
    }

    @Override
    public void subScribe(Iobserver iobserver) {
        iobserverArrayList.add(iobserver);
    }

    @Override
    public void unSubScribe(Iobserver iobserver) {
        iobserverArrayList.remove(iobserver);
    }



    public void updateState()
    {
        Iterator<Iobserver> iterator= iobserverArrayList.iterator();
        while(iterator.hasNext()){
            Iobserver iobserver=iterator.next();
            iobserver.update();
        }
    }
}