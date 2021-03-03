package test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test02Mybatis {
    public static void main(String[] args) throws IOException {
        // 创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 读取核心配置文件流信息
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 解析核心配置文件流,得到SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 通过工厂创建sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 生成dao接口的实现类对象
      /*  AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        // 调用方法执行
        List<Account> list = mapper.findAll();
        for (Account account : list) {
            System.out.println(account);
        }*/
        is.close();
    }
}
