package com.icefamer.server.service.cms_manage.service.Impl;

import com.icefamer.server.domain.cms.CmsPage;
import com.icefamer.server.domain.cms.request.QueryPageRequest;
import com.icefamer.server.model.response.CommonCode;
import com.icefamer.server.model.response.QueryResponseResult;
import com.icefamer.server.model.response.QueryResult;
import com.icefamer.server.service.cms_manage.dao.CmsPageRepository;
import com.icefamer.server.service.cms_manage.service.CmsPageService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;


@Service
public class CmsPageServiceImpl implements CmsPageService {

    @Autowired
    private CmsPageRepository cmsPageRepository;

    /**
     * 根据查询条件进行模糊分页查询
     * @param page
     * @param size
     * @param queryPageRequest
     * @return 页面列表
     */
    @Override
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {
        ExampleMatcher exampleMatcher = ExampleMatcher
                .matching().withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());
        CmsPage cmsPage = new CmsPage();
        if (StringUtils.isNotEmpty(queryPageRequest.getSiteId())){
            cmsPage.setSiteId(queryPageRequest.getSiteId());
        }
        if (StringUtils.isNotEmpty(queryPageRequest.getPageAliase())){
            cmsPage.setPageAliase(queryPageRequest.getPageAliase());
        }
        Example<CmsPage> example = Example.of(cmsPage, exampleMatcher);
        if (page <= 0){
            page = 1;
        }
        page -= 1;
        if (size <= 0){
            size = 20;
        }
        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        QueryResult<CmsPage> queryResult = new QueryResult<>();
        queryResult.setList(all.getContent());
        queryResult.setTotal(all.getTotalElements());
        return new QueryResponseResult(CommonCode.SUCCESS, queryResult);
    }
}
