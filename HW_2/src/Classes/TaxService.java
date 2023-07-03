package Classes;

import Interfaces.iActorBehaviuor;


public class TaxService implements iActorBehaviuor {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder;

    public TaxService() {
        this.name = "Tax audit";
    }

     public String getName() {        
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    public boolean isReturnOrder() {
      return isReturnOrder;
    }

    public void setReturnOrder(boolean retOder) {
      isReturnOrder = retOder;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}
