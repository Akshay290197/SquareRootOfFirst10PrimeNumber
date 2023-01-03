import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquareRootOfFirst10PrimeNumbers {
    public static void main(String[] args) {
        List<Double> sqrt= Stream.iterate(1,i->i+1)
                .filter(SquareRootOfFirst10PrimeNumbers::isPrime)
                .map(Math::sqrt).limit(10).collect(Collectors.toList());
        System.out.print(sqrt+" ");
    }
    public static boolean isPrime(int n){
        return n>1 && IntStream.range(2,n).noneMatch(a->n%a==0);
    }
}
