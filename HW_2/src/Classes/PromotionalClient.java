package Classes;

/*
 * создаем класс акционного посетителя, наследуем от Actor
 */
public class PromotionalClient extends Actor{
    // создаем поля
    private String promoName;  // название акции
    private int promoID;  // id участника акции
    private static int promotionCount = 0; // количество созданных акционных покупателей

    /*
     * конструктор принимающий аргументами имя посетителя, название акции и id участника акции
     */
    public PromotionalClient(String name, String promoName, int promoID) {
        super(name+" - участник акции " + promoName); // задаем имя через конструктор родителя
        this.promoID = promoID;
        promotionCount++;  // добавляем один к количеству участников акции
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public boolean isReturnOrder(){
      return super.isReturnOrder;
    }

    public void setReturnOrder(boolean retOrder) {
      super.isReturnOrder = retOrder;
    }

    public Actor getActor() {
      return this;
    }
    
}
