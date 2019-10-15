package com.icefamer.service.cms_manage.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsManageRepositoryTest {

    @Autowired
    private CmsManageRepository cmsManageRepository;

    @Test
    public void findAllTest(){
        System.out.println(cmsManageRepository.findAll().size());
    }

}
