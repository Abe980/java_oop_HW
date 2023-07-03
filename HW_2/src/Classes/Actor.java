package Classes;

import Interfaces.iActorBehaviuor;

/*
 * абстрактный класс, с подключенным интерфейсом iActorBehaviuor
 */
public abstract class Actor implements iActorBehaviuor {
    // объявляем поля
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;

    // конструктор
    public Actor(String name) {
        this.name = name;
    }

    /*
     * абстрактный метод для получения имени
     */
    abstract public String getName();

    // public boolean isTakeOrder() {
    //     return isTakeOrder;
    // }

    // public boolean isMakeOrder() {
    //     return isMakeOrder;
    // }

    // public void setTakeOrder(boolean takeOrder) {
    //     isTakeOrder = takeOrder;
    // }

    // public void setMakeOrder(boolean makeOrder) {
    //     isMakeOrder = makeOrder;
    // }
}
