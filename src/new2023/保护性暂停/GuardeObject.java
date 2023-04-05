package new2023.保护性暂停;

/**
 * @Author zhangxuhui
 * @Date 2023/4/5
 * @email zxh_1633@163.com
 * 线程传递结果的中间对象
 */
public class GuardeObject {

    private Object response;

    //get response by timeOut
    public Object get(long timeOut){
        synchronized (this){
            long start = System.currentTimeMillis();
            long con = 0;
            while (response == null){
                long waitTime = timeOut - con;
                if (waitTime <= 0){
                    break;
                }
                try {
                    this.wait(waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                con = System.currentTimeMillis() - start;
            }
            return response;
        }
    }

    //get response
    public Object get(){
        synchronized (this){
            while (response == null){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return response;
        }
    }


    //set response
    public void complete(Object o){
        synchronized (this){
            this.response = o;
            this.notifyAll();
        }
    }

}
