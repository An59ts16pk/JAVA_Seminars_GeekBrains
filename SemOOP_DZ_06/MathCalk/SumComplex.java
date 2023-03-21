package SemOOP_DZ_06.MathCalk;

import SemOOP_DZ_06.Number.Complex;

public class SumComplex implements Option{

    @Override
    public String discription() {
        return "Сложение комплексных чисел";
    }

    @Override
    public void execute() {
        Complex newC = new Complex();
        System.out.println("\nВыбрано сложение комплексных чисел.");
        System.out.println("  Первое число ");
        Complex operand1 = new Complex(1);
        System.out.println("  Второе число ");
        Complex operand2 = new Complex(1);
        Operation operation = new Operation();


        newC.setRealPart(operand1.getRealPart() + operand2.getRealPart());
        newC.setImaginaryPart(operand1.getImaginaryPart() + operand2.getImaginaryPart());

        String str = String.format("%-16s Результат:         %s + %s = %s",
         " ", operand1.toString(), operand2.toString(), newC.toString());
        operation.getAnswer(str);

    }
}
