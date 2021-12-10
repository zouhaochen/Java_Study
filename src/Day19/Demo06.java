package Day19;

/*

MyReader: 专门用于读取数据的类
    |--MyTextReader: 读取文本数据
        |--MyBufferTextReader: 增强，加入缓冲技术
    |--MyMediaReader: 读取媒体数据
        |--MyBufferMediaReader: 增强，加入缓冲技术
    |--MyDateReader: 读取日期数据
        |--MyBufferDateReader: 增强，加入缓冲技术

改进方法
class MyBufferReader
{
    MyBufferReader(MyTextReader text)
    {
    }

    MyBufferReader(MyMediaReader media)
    {
    }
}

上述类扩展性很差，找到其参数的共同类型，通过多态的形式可以提高扩展性
MyReader: 专门用于读取数据的类
    |--MyTextReader: 读取文本数据
    |--MyMediaReader: 读取媒体数据
    |--MyDateReader: 读取日期数据
    |--MyBufferReader
带着缓冲技术的reader:

class MyBufferReader extends MyReader
{
    private MyReader = r;
    MyBufferReader(MyReader r)
    {
    }
}

装饰模式比继承要灵活，避免了继承体系臃肿
而且降低了类与类之间的关系

装饰类因为增强以有对象，具备的功能和已有对象是相同的，只不过提供了更强的功能
所以装饰类和被装饰类通常都是属于一个体系中

从继承结构变成了组合结构
 */
public class Demo06
{
}
