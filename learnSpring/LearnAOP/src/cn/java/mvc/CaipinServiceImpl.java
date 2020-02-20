/**
 * Project Name:LearnAOP
 * File Name:CaipinServiceImpl.java
 * Package Name:cn.java.mvc
 * Date:2020年2月20日下午2:30:38
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description: 菜品业务层<br/>
 * Date: 2020年2月20日 下午2:30:38 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
@Component
public class CaipinServiceImpl implements CaipinService {

    @Autowired
    private CaipinDao caipinDao;

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.mvc.CaipinService#saveCaipin()
     */
    @Override
    public void saveCaipin() {
        caipinDao.addCaipin();
    }
}
