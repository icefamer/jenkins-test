package com.icefamer.server.service.cms_manage.dao;

import com.icefamer.server.domain.cms.CmsConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author sean
 * @version 1.0.0
 * @ClassName CmsConfigRepositoryTest.java
 * @Description TODO
 * @createTime 2019年10月29日 12:07:00
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsConfigRepositoryTest {

    @Autowired
    private CmsConfigRepository cmsConfigRepository;

    @Test
    public void exampleTest(){
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("name", p -> p.contains())
                .withIgnoreCase("model");
        CmsConfig cmsConfig = new CmsConfig();
        cmsConfig.setName("播");
        Example<CmsConfig> example = Example.of(cmsConfig, exampleMatcher);
        Pageable pageable = PageRequest.of(0, 10);
        Page<CmsConfig> all = cmsConfigRepository.findAll(example, pageable);
        System.out.println(all);
    }

}