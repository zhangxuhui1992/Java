## 两阶段终止模式
    
stop方法，会真正杀死线程，但是如果线程锁住了共享资源，那么杀死线程后。
将再也没有机会释放锁，其他线程将无法再获取锁；
system.exit(0)停止整个系统，不适合停止线程。
使用interrupt设置打断标记

## 守护线程
setDaemon(true);设置为守护线程，在其他非守护线程运行结束后，即使守护线程未执行结束，也将
强制立即结束。