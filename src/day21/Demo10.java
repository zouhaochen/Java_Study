package day21;

/*
有五个学生，每个学生有3门课的成绩
从键盘输入以上数据（包括姓名，三门课成绩）
输入的格式：如：ZhangSan, 30, 40, 60计算出总成绩
并把学生的信息和计算出的总分数高低顺序存放在磁盘文件"stud.txt"中

1. 描述学生对象
2. 定义一个可以操作学生对象的工具类

思想
1. 通过获取键盘录入一行数据，并将该行数据中的信息取出，封装成学生对象
2. 因为学生对象有很多，那么就需要存储，使用到集合
   因为要对学生的总分进行排序，所以要使用TreeSet
3. 将集合中的信息写入到一个文件中
 */

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>
{
    private String name;
    private int math, cn, en;
    private int sum;

    Student(String name, int math, int cn, int en)
    {
        this.name = name;
        this.math = math;
        this.cn = cn;
        sum = math+cn+en;
    }

    public String getName()
    {
        return name;
    }

    public int getSum()
    {
        return sum;
    }

    public int hashCode()
    {
        return name.hashCode()+sum*78;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Student))
            throw new ClassCastException("类型不匹配");
        Student s = (Student)obj;

        return this.name.equals(s.name) && this.sum==s.sum;
    }

    public int compareTo(Student student)
    {
        int num = new Integer(this.sum).compareTo(new Integer(student.sum));
        if(num == 0)
            return this.name.compareTo(student.name);
        return num;
    }

    public String toString()
    {
        return "Student["+name+", "+math+", "+cn+", "+en+"]";
    }
}

class StudentInfoTool
{
    //默认排序方式（倒序）
    public static Set<Student> getStudents() throws IOException
    {
        return getStudents(null);
    }

    //传入比较器排序
    public static Set<Student> getStudents(Comparator<Student> cmp) throws IOException
    {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        Set<Student> studentSet = null;

        if(cmp==null)
            studentSet = new TreeSet<Student>();

        else
            studentSet = new TreeSet<Student>(cmp);

        while((line = bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;
            String[] info = line.split(",");

            Student stu = new Student(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]));
            studentSet.add(stu);
        }
        bufr.close();

        return studentSet;
    }

    public static void writeToFile(Set<Student> studentSet) throws IOException
    {
        BufferedWriter bufw = new BufferedWriter(new FileWriter("stuinfo.txt"));

        for(Student stu : studentSet)
        {
            bufw.write(stu.toString()+"\t");
            bufw.write(stu.getSum()+"");
            bufw.newLine();
            bufw.flush();
        }

        bufw.close();
    }
}

public class Demo10
{
    public static void main(String[] args) throws IOException
    {
        //正序排序，强行逆转
        Comparator<Student> cmp = Collections.reverseOrder();
        Set<Student> students = StudentInfoTool.getStudents(cmp);
        StudentInfoTool.writeToFile(students);
    }
}
