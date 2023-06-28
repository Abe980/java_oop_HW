package Domen;

public class HotDrink extends Product{
    // int поле температура
    private int temperature;

    // геттер
    public int getTemperature() {
        return temperature;
    }

    // сеттер
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    //конструкторы
    public  HotDrink(int price, int place, String name, long id){
        super(price,place,name,id);
        this.temperature = 90;
    }
    public HotDrink (int price, int place, String name, long id, int temperature){
        super(price,place,name,id);
        this.temperature = temperature;
    }

    // переопределяем toString
    @Override
    public String toString() {
        return super.toString() + "temperature="+temperature;
    }
    
}
