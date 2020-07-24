package com.example.patient.Observer;

public class MainClass {

 public static void main(String[] args)
 {
  ObserverA observerA=new ObserverA();
  ObserverB observerB=new ObserverB();

  Subject subject=new Subject();
  subject.subScribe(observerA);
  subject.subScribe(observerB);

  subject.updateState();

  subject.unSubScribe(observerA);
  subject.updateState();


  subject.unSubScribe(observerB);
  subject.updateState();


 }


}


