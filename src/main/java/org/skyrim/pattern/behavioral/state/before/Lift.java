package org.skyrim.pattern.behavioral.state.before;
//电梯类
//ILift的子实现类
//太多switch了
public class Lift implements ILift{
    private int state;

    @Override
    public void setState(int state) {
        this.state=state;
    }

    @Override
    public void open() {
        switch (state){
//            当前电梯状态
            case OPENING_STATE:
//                什么都不做
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了");
//                设置当前电梯状态为开启
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了");
//                设置当前电梯状态为开启
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
