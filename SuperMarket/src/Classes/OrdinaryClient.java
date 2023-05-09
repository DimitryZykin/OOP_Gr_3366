package Classes;

/**
 * Класс, представляющий обычного клиента.
 */
public class OrdinaryClient extends Actor{
    /**
     * Конструктор класса.
     * @param name имя клиента.
     */
    public OrdinaryClient(String name){
        super(name);
    }
    /**
     * Получение имени клиента.
     * @return имя клиента.
     */
    @Override
    public String getName(){        
        return super.name;
    }
    /**
     * Проверка готовности клиента сделать заказ.
     * @return true (клиент готов сделать заказ) / false (нет).
     */
    @Override
    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }
    /**
     * Проверка готовности клиента забрать заказ.
     * @return true (готов) / false (нет).
     */
    @Override
    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }
    /**
     * Установка метки (флага) о желании клиента сделать заказ.
     * @param makeOrder значение флага.
     */
    @Override
    public void setMakeOrder(boolean makeOrder){
       super.isMakeOrder = makeOrder;
    }
    /**
     * Установка метки (флага) о готовности клиента забрать заказ.
     * @param pickUpOrder значение флага.
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder){
       super.isTakeOrder = pickUpOrder;   
    }
    /**
     * Получение объекта клиента.
     * @return объект клиента
     */
    @Override
    public Actor getActor(){
        return this;
    }
    /**
     * Проверка возможности возврата товара.
     * @return true (возврат возможен) / false (нет).
     */
    @Override
    public boolean isCanReturn(){
        return super.isCanReturn;
    }
    /**
     * Метка (флаг) о возможности клиента вернуть заказ.
     * @param canReturn значение флага
     */
    @Override
    public void setReturnOrder(boolean canReturn){
        super.isCanReturn = canReturn;
    }
}
