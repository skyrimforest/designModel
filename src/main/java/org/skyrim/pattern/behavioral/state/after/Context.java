package org.skyrim.pattern.behavioral.state.after;

//环境角色类
public abstract class Context {
    protected final static OpeningState OPENING_STATE=new OpeningState();
    protected final static ClosingState CLOSING_STATE=new ClosingState();
    protected final static RunningState RUNNING_STATE=new RunningState();
    protected final static StoppingState STOPPING_STATE=new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

//    设置当前状态对象
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
//        设置当前状态对象中的context对象
        this.liftState.setContext(this);
    }
    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void stop(){
        this.liftState.stop();
    }
}
