package day08;

/*
需求：数据库的操作
1. 连接数据库
2. 操作数据库
   增删改查
3. 关闭数据库连接
 */

class User
{

}

interface UserInfoDao
{
    public void add(User user);
    public void delete(User user);
}

class UserInfoByJDBC implements UserInfoDao
{
    /*
    1. JDBC连接数据库
    2. 使用sql添加语句添加数据
    3. 关闭连接
     */
    public void add(User user)
    {

    }

    /*
    1. JDBC连接数据库
    2. 使用sql语句删除数据
    3. 关闭连接
     */
    public void delete(User user)
    {

    }
}

class UserInfoByHibernate implements UserInfoDao
{
    /*
    1. Hibernate连接数据库
    2. 使用sql添加语句添加数据
    3. 关闭连接
     */
    public void add(User user)
    {

    }

    /*
    1. Hibernate连接数据库
    2. 使用sql语句删除数据
    3. 关闭连接
    */
    public void delete(User user)
    {

    }
}

public class Demo05
{
    public static void main(String[] args)
    {
        User user = new User();
        /*
        UserInfoByJDBC ui = new UserInfoByJDBC();
        ui.add(user);
        ui.delete(user);
         */
        UserInfoDao ui = new UserInfoByJDBC();
        ui.add(user);
        ui.delete(user);

        UserInfoDao uh = new UserInfoByHibernate();
        uh.add(user);
        uh.delete(user);
    }
}
