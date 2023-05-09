package Classes;
import java.util.ArrayList;
import java.util.List;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;
/**
 * Класс Market - магазин.
 */
public class Market implements iMarketBehaviour,iQueueBehaviour{
    // Список клиентов, которые находятся в очереди
    private List<iActorBehaviour> queue;
    /**
     * Конструктор класса хранения очереди клиентов.
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
    /**
     * Фиксирует клиента и добавляет его в магазин.
     * @param actor - клиент, зашедший в магазин.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor){
        System.out.printf("Клиент %s зашел в магазин\n", actor.getActor().getName());
        takeInQueue(actor);
    }
    /**
     * Метод takeInQueue добавляет клиента в очередь.
     * @param actor - клиент, ожидающий своей очереди.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor){
        this.queue.add(actor);
        System.out.printf("Клиент %s встал в очередь\n", actor.getActor().getName());
    }
    /**
     * Удаление клиента из магазина.
     * @param actors - список клиентов, уходящих из магазина.
     */
    @Override
    public void releaseFromMarket(List<Actor> actors){
        for(Actor actor:actors){
            System.out.printf("Клиент %s ушел из магазина\n", actor.getName());
            queue.remove(actor);
        }    
    }
    /**
     * Вызывает методы takeOrder, giveOrder, returnOrder и releaseFromQueue.
     */
    @Override
    public void update(){
        takeOrder();
        giveOrder();
        returnOrder();
        releaseFromQueue();
    }
    /**
     * Выдача заказа клиенту.
     */
    @Override
    public void giveOrder(){
        for(iActorBehaviour actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.printf("Клиент %s получил свой заказ\n", actor.getActor().getName());
            }
        }    
    }
    /**
     * Удаление клиента из очереди при получении им заказа.
     */
    @Override
    public void releaseFromQueue(){
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue){
        if(actor.isTakeOrder()){
            releaseActors.add(actor.getActor());
            System.out.printf("Клиент %s ушел из очереди\n", actor.getActor().getName());
        }
       }
    releaseFromMarket(releaseActors);
    }
    /**
     * Приём заказа от клиента.
     */
    @Override
    public void takeOrder(){
        for(iActorBehaviour actor:queue){
            if(!actor.isMakeOrder()){
            actor.setMakeOrder(true);
            System.out.printf("Клиент %s сделал заказ\n", actor.getActor().getName());
            }
        }    
    }
    /**
     * Возвращает заказ от клиента, если есть возможность.
     */
    @Override
    public void returnOrder(){
        for(iActorBehaviour actor: queue){
            if(!((iReturnOrder) actor).isCanReturn()){
                ((iReturnOrder) actor).setReturnOrder(true);
                System.out.printf("Клиент %s вернул свой заказ\n", actor.getActor().getName());
            }
        }
    }
}
