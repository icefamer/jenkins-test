package com.icefamer.server.api.cms;

import com.icefamer.server.domain.cms.request.QueryPageRequest;
import com.icefamer.server.model.response.QueryResponseResult;

public interface CmsPageControllerApi extends CmsControllerApi {
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
