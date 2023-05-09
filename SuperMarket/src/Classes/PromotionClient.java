package Classes;

/**
 * Класс акционного клиента.
 */
public class PromoClient extends Actor{
    private String promoName;
    private static int promoNumber;
    private static int maxPromoClients = 10;
    /**
     * Конструктор класса PromoClient.
     * @param name имя клиента.
     * @param promoName название акции.
     * @param promoNumber номер клиента в акции.
     * @param maxPromoClients максимальное количество участников акции.
     */
    public PromoClient(String name, String promoName, int promoNumber){
        super(name);
        this.promoName = promoName;
        PromoClient.promoNumber = promoNumber;
    }
    /**
     * Возвращает название акции.
     * @return название акции.
     */
    public String getPromoName(){
        return promoName;
    }
    /**
     * Возвращает номер клиента в акции.
     * @return номер клиента в акции.
     */
    public static int getPromoNumber(){
        return promoNumber;
    }
    /**
     * Возвращает максимальное количество участников акции.
     * @return максимальное количество участников акции.
     */
    public static int getMaxPromoClients(){
        return maxPromoClients;
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
     * @return true (возможно) / false - (нет).
     */
    @Override
    public boolean isCanReturn(){
        return super.isCanReturn;
    }
    /**
     * Установка флага о возможности клиента вернуть заказ.
     * @param canReturn значение флага
     */
    @Override
    public void setReturnOrder(boolean canReturn){
        super.isCanReturn = canReturn;
    }
}
