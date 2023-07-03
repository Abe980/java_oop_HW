package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    
    public boolean isReturnOrder() ;  // возвращает хочет ли посетитель вернуть заказ
    public void setReturnOrder(boolean returnOrder) ; // устанавливает хочет ли посетитель вернуть заказ
    Actor getActor();
}
