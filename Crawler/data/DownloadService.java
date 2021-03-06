1
https://raw.githubusercontent.com/pengfeigao/AgoraCallApi/master/call-plugin-api/src/main/java/com/basetools/net/service/DownloadService.java
package com.basetools.net.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * 文件下载
 */
public interface DownloadService {
    @Streaming
    @GET
    Call<ResponseBody> downloadFile(@Url String fileUrl);
}
