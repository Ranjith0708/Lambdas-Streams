package Lambda;

@FunctionalInterface
public interface FilterCondition {
    abstract boolean check(Hotel hotel);
}
