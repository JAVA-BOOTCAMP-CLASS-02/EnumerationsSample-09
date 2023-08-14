package complex;

public enum Operation implements Calculate {

    SUMA {
        @Override
        public double eval(double op1, double op2) {
            return op1 + op2;
        }
    },

    RESTA {
        @Override
        public double eval(double op1, double op2) {
            return op1 - op2;
        }
    },

    PRODUCTO {
        @Override
        public double eval(double op1, double op2) {
            return op1 * op2;
        }
    },

    DIVISION {
        @Override
        public double eval(double op1, double op2) {
            return op1 / op2;
        }
    }
}
