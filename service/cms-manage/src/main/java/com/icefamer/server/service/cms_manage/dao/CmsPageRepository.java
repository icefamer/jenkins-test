package com.icefamer.server.service.cms_manage.dao;

import com.icefamer.server.domain.cms.CmsPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsPageRepository extends MongoRepository<CmsPage, String> {
    CmsPage findByPageName(String pageName);
    CmsPage findByPageNameAndPageType(String pageName, String pageType);
    CmsPage findBySiteIdAndPageType(String siteId, String PageType);
    int countBySiteIdAndPageType(String siteId, String pageType);
    Page<CmsPage> findBySiteIdAndPageType(String siteId, String pageType, Pageable pageable);
}
