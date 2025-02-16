
package javaapplication34;

// BY EXTENDING THE THREAD CLASS
public class Assignment26 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
    
}
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread is running : "+i);
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