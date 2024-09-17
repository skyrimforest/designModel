package org.skyrim.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

//调用者角色
public class Waiter {
//    持有多个命令对象
    private List<Command> commands=new ArrayList<>();
    public void setCommand(Command cmd){
//        将cmd对象存储到list集合中
        commands.add(cmd);
    }
//    发起命令功能 喊 订单来了
    public void orderUp(){
        System.out.println("美女服务员: 大厨新订单来啦");
        for(Command command:commands){
            if(command!=null){
                command.execute();
            }
        }
    }
}
