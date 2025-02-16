
package javaapplication34;

// BY RUNNABLE INTERFACE
public class Assignmentt26 {
    public static void main(String[] args) {
       MyRunnable myRunnable = new MyRunnable();
       Thread thread= new Thread(myRunnable);
        thread.start();
    }
    
}
class MyRunnable implements Runnable{
   // @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Runnable thread running : "+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
                
            {
                System.out.println("Thread interrupted: "+e.getMessage());
            }
        }
    }
}