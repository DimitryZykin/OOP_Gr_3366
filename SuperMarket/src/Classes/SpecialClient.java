package Classes;

/**
 * Класс специального клиента.
 */
public class SpecialClient extends Actor{
    private int idVIP;
    /**
     * Конструктор класса SpecialClient.
     * @param name имя клиента.
     * @param idVIP идентификатор VIP-клиента.
     */
    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
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
     * Получение идентификатора VIP-клиента.
     * @return идентификатор VIP-клиента.
     */
    public int getIdVIP(){
        return idVIP;
    }
    /**
     * Проверка, хочет ли клиент сделать заказ.
     * @return true (хочет) / false (нет).
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
     * Установка флага о желании клиента сделать заказ.
     * @param makeOrder значение флага.
     */
    @Override
    public void setMakeOrder(boolean makeOrder){
       super.isMakeOrder = makeOrder;
    }
    /**
     * Установка флага о готовности клиента забрать заказ.
     * @param pickUpOrder значение флага.
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder){
       super.isTakeOrder = pickUpOrder;   
    }
    /**
     * Получение объекта клиента.
     * @return объект клиента.
     */
    @Override
    public Actor getActor(){
        return this;
    }  
    /**
     * Проверка возможности возврата товара.
     * @return true (возможено) / false - (нет).
     */
    @Override
    public boolean isCanReturn(){
        return super.isCanReturn;
    }
    /**
     * Установка флага о возможности клиента вернуть заказ.
     * @param canReturn значение флага.
     */
    @Override
    public void setReturnOrder(boolean canReturn){
        super.isCanReturn = canReturn;
    }
}
