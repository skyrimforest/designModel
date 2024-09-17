package org.skyrim.pattern.behavioral.responsibility;

//抽象处理者类
public abstract class Handler {
    protected final static int NUM_ONE=1;
    protected final static int NUM_THREE=3;
    protected final static int NUM_SEVEN=7;
//    定义该领导处理的请假天数区间
    private int numStart;
    private int numEnd;
//    声明后继者(声明上级领导)
    private Handler nextHandler;
    public Handler(int numStart){
        this.numStart=numStart;
    }

    public Handler(int numStart,int numEnd){
        this.numStart=numStart;
        this.numEnd=numEnd;
    }
//设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
//    各级领导处理请假条的方法
    protected abstract void handleLeave(LeaveRequest leave);
//    提交请假条
    public final void submit(LeaveRequest leave){
//        该领导进行审批，查看是否通过
//        if(this.numStart<leave.getNum()&&leave.getNum()<=this.numEnd){
            this.handleLeave(leave);
//        }
        if(this.nextHandler!=null && leave.getNum()>this.numEnd){
//            提交给上级领导审批
            this.nextHandler.submit(leave);
        }else{
            System.out.println("流程结束!");
        }
    }
}
