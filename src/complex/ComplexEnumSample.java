package complex;

import java.util.List;

public class ComplexEnumSample {

    public static void main(String[] args) {
        double op1 = 10.0;
        double op2 = 2.0;

        for (Operation op : List.of(Operation.SUMA, Operation.RESTA, Operation.PRODUCTO, Operation.DIVISION)) {
            System.out.println(op.name() + " [" + op1 + ", " + op2 + "] ==> " + op.eval(op1, op2));
        }
    }
}
