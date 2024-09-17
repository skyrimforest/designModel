package org.skyrim.pattern.behavioral.state.after;

//抽象状态类
public abstract class LiftState {
//    声明环境角色类变量
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //    电梯开启/关闭/运行/停止操作
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
