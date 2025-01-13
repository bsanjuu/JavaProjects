class A extends Thread{
    public void run(){
     
        for (int i = 0; i < 10; i++) {
            System.out.println("AAA");
            try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
        }
        
    }
}

class  B extends Thread
{
    public void run(){
     
        for (int i = 0; i < 10; i++) {
            System.out.println("BBB");
            try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
        }
        
    }
}

public class ThreadPrority {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        //a.setPriority(Thread.MIN_PRIORITY);
        //b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();

    }
    
}
