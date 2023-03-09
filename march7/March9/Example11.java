package march7.March9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

// Task10: Print Hello World using CompletableFuture SupplyAsync and thenAccept

public class Example11 {
    
        public static void main(String[] args) throws InterruptedException, ExecutionException {
            
            Supplier<Integer> s1=()->{
                System.out.println("Supplier thread "+Thread.currentThread().getName());
                return 10;
            };
    
            CompletableFuture.supplyAsync(s1)
                    .thenApply(r->{
                        System.out.println("thenApply thread "+Thread.currentThread().getName());
                        return r/0;
                    }).exceptionally(ex->{
                        System.out.println(ex.getMessage());
                        return 0; // as it needs to be return an int...returned 0
                    });
            
        }
    
    }
