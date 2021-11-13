package day07;

interface Program
{
    public abstract void java();
}

class Athlete
{
    void play(){}
}

class Football extends Athlete implements Program
{
    void play() {}
    public void java() {}
}

public class Demo09 {

}
