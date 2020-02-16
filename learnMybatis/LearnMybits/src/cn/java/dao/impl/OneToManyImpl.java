/**
 * Project Name:LearnMybits
 * File Name:OneToMany.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月15日下午2:50:11
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.java.entity.Customer;

/**
 * Description: <br/>
 * Date: 2020年2月15日 下午2:50:11 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class OneToManyImpl {

    SqlSession session = null;

    @Before
    public void init() throws IOException {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = ssfb.build(ins);
        session = factory.openSession();
    }

    @Test
    public void oneToMany() {
        // Customer one =
        // session.selectOne("cn.java.dao.impl.OneToManyImpl.oneToMany", 1L);
        List<Customer> one = session.selectList("cn.java.dao.impl.OneToManyImpl.oneToMany", 1L);
        System.out.println(one);
    }
}
