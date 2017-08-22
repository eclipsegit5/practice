package practice1;

public class ThreadRunnable implements Runnable{
	public void run(){
        
        for(int i=0; i < 5; i++){
                System.out.println("Child Thread : " + i);
               
                try{
                        Thread.sleep(100);
                }
                catch(InterruptedException ie){
                        System.out.println("Child thread interrupted! " + ie);
                }
        }
       
        System.out.println("Child thread finished!");
}

	public static void main(String[] args) {

		Thread t = new Thread(new ThreadRunnable(), "My Thread");
        
     
       
        t.start();
       
        for(int i=0; i < 5; i++){
               
                System.out.println("Main thread : " + i);
               
                try{
                        Thread.sleep(100);
                }
                catch(InterruptedException ie){
                        System.out.println("Child thread interrupted! " + ie);
                }
        }
        System.out.println("Main thread finished!");
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
        currentThread.setName("Set Thread Name Example");
        System.out.println("Thread Name : "+ currentThread.getName());
	}

}
