/**
 * Project Name:LearnMybits
 * File Name:ComputerImpl.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月15日下午8:29:08
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.java.entity.Computer;

/**
 * Description: <br/>
 * Date: 2020年2月15日 下午8:29:08 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class ComputerImpl {
    SqlSession session = null;

    @Before
    public void init() throws IOException {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = ssfb.build(ins);
        session = factory.openSession();
    }

    // ----------------------------foreach标签--------------------------------------
    /**
     * 
     * Description: list传参<br/>
     *
     * @author songXZ
     */
    @Test
    public void delectMore1() {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        int delete = session.delete("cn.java.dao.impl.ComputerImpl.delectMore1", asList);
        session.commit();
        System.out.println(delete);
    }

    /**
     * 
     * Description: 数组传参<br/>
     *
     * @author songXZ
     */
    @Test
    public void delectMore2() {
        int[] attr = { 5, 6, 7 };
        // String[] attr = {'5','6','7'};也可以
        int delete = session.delete("cn.java.dao.impl.ComputerImpl.delectMore2", attr);
        session.commit();
        System.out.println(delete);
    }

    // -------------------------------trim标签-------------------------------------------
    /**
     * 
     * Description: 动态sql查询<br/>
     *
     * @author songXZ
     */
    @Test
    public void dynamicSelect() {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("brand", "联想");
        param.put("price", 9000);
        List<Map<String, Object>> list = session.selectList("cn.java.dao.impl.ComputerImpl.dynamicSelect", param);
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    // -------------------------添加数据时返回主键值-----------------------------------------
    @Test
    public void insertCom1() {
        Computer param = new Computer(null, "外星人", 16F, "Windows10", 10000F, "i8");
        System.out.println("param=" + param);
        int flag = session.insert("cn.java.dao.impl.ComputerImpl.insertCom1", param);
        session.commit();
        System.out.println("flag=" + flag);
        System.out.println("执行后：" + param);
    }

    @Test
    public void insertCom2() {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("brand", "ThinkiPad");
        param.put("memory", 16F);
        param.put("system", "Linux");
        param.put("price", 12000F);
        param.put("cpu", "i6");
        System.out.println("param=" + param);
        int flag = session.insert("cn.java.dao.impl.ComputerImpl.insertCom2", param);
        session.commit();
        System.out.println("flag=" + flag);
        System.out.println("执行后：" + param);
    }
}
