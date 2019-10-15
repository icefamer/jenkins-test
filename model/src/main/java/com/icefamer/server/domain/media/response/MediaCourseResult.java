package com.icefamer.server.domain.media.response;

import com.icefamer.server.domain.media.MediaFile;
import com.icefamer.server.domain.media.MediaVideoCourse;
import com.icefamer.server.model.response.ResponseResult;
import com.icefamer.server.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by admin on 2018/3/5.
 */
@Data
@ToString
@NoArgsConstructor
public class MediaCourseResult extends ResponseResult {
    public MediaCourseResult(ResultCode resultCode, MediaVideoCourse mediaVideoCourse) {
        super(resultCode);
        this.mediaVideoCourse = mediaVideoCourse;
    }

    MediaFile mediaVideo;
    MediaVideoCourse mediaVideoCourse;
}
