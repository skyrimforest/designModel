package org.skyrim.pattern.behavioral.state.after;

//电梯开启状态类
public class OpeningState extends LiftState{
//    当前状态要执行的方法
    @Override
    public void open() {
        System.out.println("电梯开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
//        调用context中的close方法
        super.context.close();
        System.out.println("电梯关闭...");
    }

    @Override
    public void run() {
//    啥也不做
    }

    @Override
    public void stop() {
//什么都不做 开启状态下 不能关闭
    }
}
