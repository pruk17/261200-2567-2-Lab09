public class Penguin implements SwimAble{
    public String swim(){
        return "water is my friend!";
    }
    @Override
    public String move() {
        return "I can walk";
    }
}
