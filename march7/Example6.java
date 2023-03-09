package march7;

//Task8: Create a list of Strings("Julie","John","Bob") and check if John is prsent, if prsent print "Equal Found" using CompletableFuture SupplyAsync and thenAccept



    import java.util.Arrays;
    import java.util.List;
    import java.util.concurrent.CompletableFuture;
    import java.util.concurrent.ExecutionException;
    import java.util.function.Consumer;
    import java.util.function.Supplier;
    
    

public class Example6 {
    
        
        public static void main(String[] args) throws InterruptedException, ExecutionException {
            
            Supplier<List<String>> sp=()->{
                System.out.println("Supplier Thread Name:"+Thread.currentThread().getName());
                List<String> stList=Arrays.asList("Julie","John","Bob");
                return stList;
            };
            
            Consumer<List<String>> c1=(r)->{
                for(String s:r){
                    if("John".equals(s)){
                        System.out.println("Equal Found");
                    }
                }
            };
            
            CompletableFuture<Void> f1=CompletableFuture.supplyAsync(sp)
                        .thenAccept(c1);
            System.out.println(f1.get());
            System.out.println("Main Thread Name:"+Thread.currentThread().getName());
            System.out.println("Main Finished");		
            
        }
    
    }
    
