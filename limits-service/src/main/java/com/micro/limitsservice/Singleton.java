package com.micro.limitsservice;

public class Singleton
        /*{
    public static final Singleton instance=new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){

        return instance;
    }

}*/
{
    private static volatile Singleton instance;

  private Singleton(){}
    public static Singleton getInstance(){

if(instance==null){
    synchronized (Singleton.class){

    instance=new Singleton();
}
      }

      return instance;
    }

}