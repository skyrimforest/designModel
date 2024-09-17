package org.skyrim.pattern.behavioral.responsibility;

public class Client {
    public static void main(String[] args) {
        LeaveRequest leave=new LeaveRequest("小明",5,"身体不适");
//        各级领导对象
        GroupLeader groupLeader=new GroupLeader();
        Manager manager=new Manager();
        GeneralManager generalManager=new GeneralManager();
//        设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
//        小明提交请假申请
        groupLeader.submit(leave);
    }
}
