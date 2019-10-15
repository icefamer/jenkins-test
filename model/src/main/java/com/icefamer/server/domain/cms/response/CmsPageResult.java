package com.icefamer.server.domain.cms.response;

import com.icefamer.server.domain.cms.CmsPage;
import com.icefamer.server.model.response.ResponseResult;
import com.icefamer.server.model.response.ResultCode;
import lombok.Data;

/**
 * Created by mrt on 2018/3/31.
 */
@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode,CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
