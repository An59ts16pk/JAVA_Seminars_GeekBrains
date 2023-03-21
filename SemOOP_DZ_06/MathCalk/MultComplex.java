package SemOOP_DZ_06.MathCalk;

import SemOOP_DZ_06.Number.Complex;

public class MultComplex implements Option{
    @Override
    public String discription() {
        return "Умножение комплексных чисел";
    }

    @Override
    public void execute() {
        Complex newC = new Complex();
        System.out.println("\nВыбрано умножение комплексных чисел.");
        System.out.println("  Первое число ");
        Complex operand1 = new Complex(1);
        System.out.println("  Второе число ");
        Complex operand2 = new Complex(1);
        Operation operation = new Operation();

        newC.setRealPart(operand1.getRealPart() * operand2.getRealPart() +
                operand1.getImaginaryPart() * (operand2.getImaginaryPart() * (-1)));
        newC.setImaginaryPart(operand1.getRealPart() * operand2.getImaginaryPart() +
                operand1.getImaginaryPart() * operand2.getRealPart());

        String str = String.format("%-16s Результат:         %s * %s = %s",
         " ", operand1.toString(), operand2.toString(), newC.toString());
        operation.getAnswer(str);
    }
}
