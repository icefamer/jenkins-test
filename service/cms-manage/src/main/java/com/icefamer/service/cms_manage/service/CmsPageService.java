package com.icefamer.service.cms_manage.service;

import com.icefamer.server.domain.cms.request.QueryPageRequest;
import com.icefamer.server.model.response.QueryResponseResult;

public interface CmsPageService {
    QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
