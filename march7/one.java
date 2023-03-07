package march7;

public class one {


    public static void main(String args[]){

System.out.print("Thread main started");

Thread thread1 = new  MyTask();
Thread thread2 = new MyTask();
thread1.start();
thread2.start();

    }
    
}

class MyTask extends Thread{

public MyTask(){

}

public void run(){
    for(int i =0; i<10; i++){

        System.out.print("["+Thread.currentThread().getName()+"]"+i);

        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

}
