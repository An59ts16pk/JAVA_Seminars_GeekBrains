package SemOOP_DZ_06.MathCalk;

import SemOOP_DZ_06.Number.Complex;

public class DivComplex implements Option{
    @Override
    public String discription() {
        return "Деление комплексных чисел";
    }

    @Override
    public void execute() {
        Complex newC = new Complex();
        System.out.println("\nВыбрано деление комплексных чисел.");
        System.out.println("  Первое число ");
        Complex operand1 = new Complex(1);
        System.out.println("  Второе число ");
        Complex operand2 = new Complex(1);
        Operation operation = new Operation();

        newC.setRealPart((operand1.getRealPart() * operand2.getRealPart() -
                operand1.getImaginaryPart() * operand2.getImaginaryPart()*(-1)) /
                (Math.pow(operand2.getRealPart(), 2) - Math.pow(operand2.getImaginaryPart(),
                        2)*(-1)));
        newC.setImaginaryPart((operand2.getRealPart() * operand1.getImaginaryPart() -
                operand1.getRealPart() * operand2.getImaginaryPart()) / (Math.pow(
                operand2.getRealPart(), 2) - Math.pow(operand2.getImaginaryPart(),
                2)*(-1)));

        String str = String.format("%-16s Результат:         %s / %s = %s",
         " ", operand1.toString(), operand2.toString(), newC.toString());
        operation.getAnswer(str);

    }
}
