package org.skyrim.pattern.structual.adapter.objectadapter;

//对象适配器
//客户类没有接口规范也可以使用它
//场景:新旧系统无缝对接
//三方组件与自己的要求不同
//JDK内 Reader、InputStream的适配就使用了InputStreamReader
//StreamDecoder/Reader/InputStream很标准的继承+聚合
public class SDAdapterTF implements SDCard {
//    声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard=tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
