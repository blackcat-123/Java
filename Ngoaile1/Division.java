

public class Division extends BinaryExpression {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return String.format("(%d / %d)", left, right);
    }

    @Override
    public double evaluate() throws ArithmeticException {

        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            double result = left.evaluate() / right.evaluate();
            return result;
        }
    }

    public static void main(String[] args) {

    }
} 