package lambdaExpr;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}
