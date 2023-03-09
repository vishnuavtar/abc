package march7.March9;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// Task7: Create a list of String and print the values in the list using CompletableFuture RunAsync
public class Seven {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Runnable runnable=()->{
			System.out.println("Runnable Thread Name:"+Thread.currentThread().getName());
			List<String> stList=Arrays.asList("emp1","emp2","emp3");
			printElements(stList);
		};
		
		CompletableFuture<Void> completableFuture=CompletableFuture.runAsync(runnable);
		
		completableFuture.get();
		
		System.out.println("Main Thread Name:"+Thread.currentThread().getName());
		System.out.println("Main Finished");
	}

	private static void printElements(List<String> stList) {
		for(String s:stList){
			System.out.println(s);
		}
		
	}
}

    

