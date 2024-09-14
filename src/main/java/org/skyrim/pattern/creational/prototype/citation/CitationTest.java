package org.skyrim.pattern.creational.prototype.citation;

public class CitationTest {
    public static void main(String[] args) {
//        创建原型对象
        Citation citation=new Citation();
        Student stu=new Student();
        stu.setName("张三");
        citation.setStu(stu);
//        克隆奖状对象
        Citation clone = citation.clone();
        Student stu1=citation.getStu();
        clone.setStu(stu1);
        clone.getStu().setName("李四");
//        citation.setName("张三");
//        clone.setName("李四");
//        调用show方法展示
        citation.show();
        clone.show();
    }
}
