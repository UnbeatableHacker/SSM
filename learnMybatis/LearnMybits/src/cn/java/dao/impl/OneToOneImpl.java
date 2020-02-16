/**
 * Project Name:LearnMybits
 * File Name:oneToOneImpl.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月15日下午12:13:11
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.java.entity.Husband;

/**
 * Description: <br/>
 * Date: 2020年2月15日 下午12:13:11 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class OneToOneImpl {
    SqlSession session = null;

    @Before
    public void init() throws IOException {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = ssfb.build(ins);
        session = factory.openSession();
    }

    /**
     * 
     * Description: 一对一对应<br/>
     *
     * @author songXZ
     */
    @Test
    public void oneToOne() {
        Husband hus1 = session.selectOne("cn.java.dao.impl.OneToOneImpl.oneToOne", 1L);
        System.out.println(hus1);
    }
}
