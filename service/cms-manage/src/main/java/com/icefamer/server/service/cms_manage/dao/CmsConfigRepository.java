package com.icefamer.server.service.cms_manage.dao;

import com.icefamer.server.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author sean
 * @version 1.0.0
 * @ClassName CmsConfigRepository.java
 * @Description TODO
 * @createTime 2019年10月29日 12:06:00
 */
public interface CmsConfigRepository extends MongoRepository<CmsConfig, String> {
}
