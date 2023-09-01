
public class DeadLockExample {
	synchronized void method1(DeadLockExample d) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+ "thread of method1 execute");
		System.out.println(t.getName()+"thread of method2 execute");
		d.method2(this);
		System.out.println(t.getName()+"finally execution of method1 thread");
	}
	synchronized void method2(DeadLockExample d) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"thread of method2 execute");
		System.out.println(t.getName()+"thread of method1 execute");
		d.method1(this);
		System.out.println(t.getName()+"finally execution of method2 thread");
	}
		
	public static void main(String[] args) {
		final DeadLockExample d1 = new DeadLockExample();
		final DeadLockExample d2 = new DeadLockExample();
		Thread t1 = new Thread() {
		public void run() {
			d1.method1(d2);
		}
		};
		Thread t2 = new Thread() {
			public void run() {
				d2.method2(d1);
			}
			};
			
			t1.start();
			t2.start();
		
	}

}
