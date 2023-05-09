package Interfaces;

/**
 * интерфейс iReturnOrder определяет поведение возврата товара.
 */
public interface iReturnOrder {    
    /**
     * метод для проверки возможности возврата товара.
     * @return true (возврат возможен) / false - (нет).
     */
    boolean isCanReturn();
    /**
     * возвращает заказ от клиента.
     * @param canReturn флаг возврата заказа.
     */
    void setReturnOrder(boolean canReturn);
}
