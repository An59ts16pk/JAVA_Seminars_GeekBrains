package SemOOP_DZ_06.MathCalk;

import SemOOP_DZ_06.Number.Rational;

public class MultRational implements Option{
    @Override
    public String discription() {
        return  "Умножение рациональных чисел";
    }

    @Override
    public void execute() {
        Rational newR = new Rational();
        System.out.println("\nВыбрано умножение рациональных чисел.");
        System.out.println("  Первое число ");
        Rational operand1 = new Rational(1);
        System.out.println("  Второе число ");
        Rational operand2 = new Rational(1);
        Operation operation = new Operation();

        newR.setNumerator(operand1.getNumerator() * operand2.getNumerator());
        newR.setDenominator(operand1.getDenominator() * operand2.getDenominator());

        int ni = NodInt.nodInt(newR.getNumerator(), newR.getDenominator());
        newR.setNumerator(newR.getNumerator() / ni);
        newR.setDenominator(newR.getDenominator() / ni);

        String str = String.format("          Результат: %s * %s = %s",
         operand1.toString(), operand2.toString(), newR.toString());
        operation.getAnswer(str);

    }
}
