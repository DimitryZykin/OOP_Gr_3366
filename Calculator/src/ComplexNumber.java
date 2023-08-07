/**
 * Класс, представляющий комплексное число.
 */
public class ComplexNumber {
    private double realPart; // действительная часть комплексного числа
    private double imaginaryPart; // мнимая часть комплексного числа

    /**
     * Конструктор
     * @param realPart действительная часть комплексного числа
     * @param imaginaryPart мнимая часть комплексного числа
     */

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * Переопределение метода toString() - возвращает строковое представление комплексного числа.
     * @return строковое представление комплексного числа
     */

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + (-imaginaryPart) + "i";
        }
    }

    /**
     * Возвращает действительную часть комплексного числа.
     * @return действительная часть комплексного числа
     */

    public double getReal() {
        return realPart;
    }

    /**
     * Возвращает мнимую часть комплексного числа.
     * @return мнимая часть комплексного числа
     */
    
    public double getImaginary() {
        return imaginaryPart;
    }
}
