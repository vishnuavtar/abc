package march7.March9;

// Task9: Print Hello World using CompletableFuture SupplyAsync and thenAccept

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Example10 {
    
	
        public static void main(String[] args) throws InterruptedException, ExecutionException {
            
            Supplier<String> s1=()->{
                System.out.println("Supplier thread "+Thread.currentThread().getName());
                return "Hello";
            };
    
            CompletableFuture.supplyAsync(s1)
                    .thenApply(r->{
                        System.out.println("thenApply thread "+Thread.currentThread().getName());
                        return r+" World";
                    });
            
        }
    
    }
    
