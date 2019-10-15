package com.icefamer.server.service.cms_manage.service.Impl;

import com.icefamer.server.domain.cms.CmsPage;
import com.icefamer.server.domain.cms.request.QueryPageRequest;
import com.icefamer.server.model.response.CommonCode;
import com.icefamer.server.model.response.QueryResponseResult;
import com.icefamer.server.model.response.QueryResult;
import com.icefamer.server.service.cms_manage.dao.CmsManageRepository;
import com.icefamer.server.service.cms_manage.service.CmsPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CmsPageServiceImpl implements CmsPageService {

    @Autowired
    private CmsManageRepository cmsManageRepository;

    @Override
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {
        if (queryPageRequest == null){
            queryPageRequest = new QueryPageRequest();
        }
        if (page <= 0){
            page = 1;
        }
        page -= 1;
        if (size <= 0){
            size = 20;
        }
        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsManageRepository.findAll(pageable);
        QueryResult<CmsPage> queryResult = new QueryResult<>();
        queryResult.setList(all.getContent());
        queryResult.setTotal(all.getTotalElements());
        return new QueryResponseResult(CommonCode.SUCCESS, queryResult);
    }
}
