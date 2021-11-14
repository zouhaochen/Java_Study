package day08;

/*
多态：可以理解为事物存在的多种形态
人：男人，女人
动物：猫，狗

猫 x = new 猫（）
动物 x = new 猫（）

1. 多态的体现
   父类的引用指向了自己的子类对象
2. 多态的前提
   必须是类与类之间有关系，要么继承，要么实现
   通常还有一个前提：存在覆盖
3. 多态的好处
   多态的出现大大的提高程序的扩展性
4. 多态的弊端
   提高了扩展性，但是只能使用父类的引用访问父类中的成员
5. 多态的应用
6. 多态的出现代码中的特点（多态使用的注意事项）
 */

/*
动物
猫，狗
 */
abstract class Animal
{
    public abstract void eat();
}

class Cat extends Animal
{
    public void eat()
    {
        System.out.println("Eat Fish");
    }

    public void catMouse()
    {
        System.out.println("Catch Mouse");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("Eat bone");
    }
    public void watchHouse()
    {
        System.out.println("Watch House");
    }
}

public class Demo01
{
    public static void main(String[] args)
    {
        /*
        Cat c = new Cat();
        c.eat();

        Dog d = new Dog();
        d.eat();

        Cat c1 = new Cat();
        eatFunction(c1);
        Dog d1 = new Dog();
        eatFunction(d1);
        */

        //类型提升：向上转型
        Animal c = new Cat();
        c.eat();
        //如果想要调用猫的特有方法时如何操作？
        //强制将父类的引用转成子类类型
        Cat c1 = (Cat)c;
        c1.catMouse();

        //千万不要出现这样的操作：将父类对象转成子类类型
        //我们能转换的是父类引用指向了自己的子类对象时，该引用可以被提升，也可以被转换
        //多态自始至终都是子类对象在做变化
        /*
        Animal a = new Animal();
        Cat c = (Cat)a;
         */
        function(new Cat());
        function(new Dog());
    }

    /*
    public static void eatFunction(Cat c)
    {
        c.eat();
    }

    public static void eatFunction(Dog d)
    {
        d.eat();
    }
    */

    public static void function(Animal a)
    {
        a.eat();

        if(a instanceof Cat)
        {
            Cat c = (Cat)a;
            c.catMouse();
        }
        else if(a instanceof Dog)
        {
            Dog d = (Dog)a;
            d.watchHouse();
        }
    }
}
