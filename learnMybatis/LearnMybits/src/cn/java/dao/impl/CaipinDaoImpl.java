/**
 * Project Name:LearnMybits
 * File Name:CaipinDaoImpl.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月12日下午8:39:31
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.java.entity.Caipin;

/**
 * Description: <br/>
 * Date: 2020年2月12日 下午8:39:31 <br/>
 * 
 * @author songXZ
 * @version
 * @param <V>
 * @see
 */
public class CaipinDaoImpl<V> {

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
     * Description: 1. 获取所有记录<br/>
     *
     * @author songXZ
     * @throws Exception
     */
    @Test
    public void getAllCaipins() throws Exception {
        // 测试mybatis
        // SqlSessionFactoryBuilder--》SqlSessionFactory--》SqlSession
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = ssfb.build(ins);
        SqlSession session = factory.openSession();
        List<Map<String, Object>> list = session.selectList("cn.java.dao.impl.CaipinDaoImpl.getAllCaipins");

        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    /**
     * 
     * Description: 2. 使用Map得到一条记录<br/>
     *
     * @author songXZ
     */
    @Test
    public void getOneByMap() {
        Map<String, Object> map = session.selectOne("cn.java.dao.impl.CaipinDaoImpl.getOneByMap");
        System.out.println(map);
    }

    /**
     * 
     * Description: 3. 使用JavaBean得到一条记录<br/>
     *
     * @author songXZ
     * @throws Exception
     */
    @Test
    public void getOneByBean() throws Exception {
        Caipin one = session.selectOne("cn.java.dao.impl.CaipinDaoImpl.getOneByBean");
        System.out.println(one);
    }

    /**
     * 
     * Description: 4. 带一个参数的查询<br/>
     *
     * @author songXZ
     * @throws Exception
     */
    @Test
    public void selectByMapHaveOneparameter() throws Exception {
        Map<String, Object> one = session.selectOne("cn.java.dao.impl.CaipinDaoImpl.selectByMapHaveOneparameter", 21);
        System.out.println(one);
    }

    /**
     * 
     * Description: 5. 带多个参数<br/>
     *
     * @author songXZ
     * @throws Exception
     */
    @Test
    public void selectByMapHaveManyParameter() throws Exception {
        Map<String, Object> paraMap = new HashMap<String, Object>();
        paraMap.put("minPrice", 15);
        paraMap.put("maxPrice", 25);
        List<Map<String, Object>> list = session
                .selectList("cn.java.dao.impl.CaipinDaoImpl.selectByMapHaveManyParameter", paraMap);

        System.out.println(list);
    }

    /**
     * 
     * Description: 6. 使用JavaBean传递多参数<br/>
     *
     * @author songXZ
     * @throws Exception
     */
    @Test
    public void selectByMapHaveManyParameterByBean() throws Exception {
        Caipin caipinPara = new Caipin();
        caipinPara.setPrice(20F);
        caipinPara.setId(0);

        List<Map<String, Object>> list = session
                .selectList("cn.java.dao.impl.CaipinDaoImpl.selectByMapHaveManyParameterByBean", caipinPara);

        System.out.println(list);
    }

    /**
     * 
     * Description: 7. 向数据库中添加记录<br/>
     *
     * @author songXZ
     */
    @Test
    public void addCaipin() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 24);
        map.put("foodName", "宫保鸡丁");
        map.put("price", 25);
        int insert = session.insert("cn.java.dao.impl.CaipinDaoImpl.addCaipin", map);
        session.commit();
        if (insert > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    /**
     * 
     * Description: 8. 修改数据<br/>
     *
     * @author songXZ
     */
    @Test
    public void updateCaipin() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("price", 30);
        map.put("id", 24);
        int update = session.update("cn.java.dao.impl.CaipinDaoImpl.updateCaipin", map);
        session.commit();
        if (update > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    /**
     * 
     * Description: 9. 删除数据<br/>
     *
     * @author songXZ
     */
    @Test
    public void deleteByID() {
        int delete = session.delete("cn.java.dao.impl.CaipinDaoImpl.deleteByID", 24);
        session.commit();
        if (delete > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    // -----------------------#取值和$取值的区别---------------------------------------------------------

    /**
     * 
     * Description: 10. 使用#取值实现$取值的效果<br/>
     *
     * @author songXZ
     */
    @Test
    public void selectAll() {
        List<Map<String, Object>> list = session.selectList("cn.java.dao.impl.CaipinDaoImpl.selectAll", "好吃");
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    // -------------------------sql标签和include标签----------------------------------------------------------
    /**
     * 
     * Description: 11. 使用sql标签和include标签<br/>
     *
     * @author songXZ
     */
    @Test
    public void getInfoUseSqlAndInclude() {
        List<Map<String, Object>> list = session.selectList("cn.java.dao.impl.CaipinDaoImpl.getInfoUseSqlAndInclude");
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    // ---------------------------------动态SQL----------------------------------
    /**
     * 
     * Description: 12. 动态sql查询<br/>
     *
     * @author songXZ
     */
    @Test
    public void dymanicSelect() {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("brand", "联想");
        param.put("price", 7000);
        List<Map<String, Object>> list = session.selectList("cn.java.dao.impl.CaipinDaoImpl.dymanicSelect", param);
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    /**
     * 
     * Description: 13. 动态sql更改<br/>
     *
     * @author songXZ
     */
    @Test
    public void dymanicUpdate() {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("brand", "TkindPad");
        param.put("price", 7000);
        param.put("id", 4);
        int flag = session.update("cn.java.dao.impl.CaipinDaoImpl.dymanicUpdate", param);
        session.commit();
        System.out.println("flag=" + flag);
    }
}
