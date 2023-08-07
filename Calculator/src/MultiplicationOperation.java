/**
 * Класс, реализующий умножение комплексных чисел.
 */

public class MultiplicationOperation implements iOperation {

    /**
     * Выполняет умножение двух комплексных чисел a и b.
     * @param a первое комплексное число
     * @param b второе комплексное число
     * @return результат умножения a и b
     */
    
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary(),
                a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal());
    }
}
