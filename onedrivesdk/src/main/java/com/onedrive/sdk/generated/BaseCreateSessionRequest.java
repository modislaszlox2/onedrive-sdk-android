// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.onedrive.sdk.generated;

import com.onedrive.sdk.concurrency.*;
import com.onedrive.sdk.core.*;
import com.onedrive.sdk.extensions.*;
import com.onedrive.sdk.http.*;
import com.onedrive.sdk.generated.*;
import com.onedrive.sdk.options.*;
import com.onedrive.sdk.serializer.*;

import java.util.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Create Session Request.
 */
public class BaseCreateSessionRequest extends BaseRequest implements IBaseCreateSessionRequest {
    protected final CreateSessionBody mBody;

    /**
     * The request for this CreateSession
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseCreateSessionRequest(final String requestUrl, final IOneDriveClient client, final List<Option> options, final ChunkedUploadSessionDescriptor item) {
        super(requestUrl, client, options, UploadSession.class);
        mBody = new CreateSessionBody();
        mBody.item = item;
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #post(ICallback)}
     */
    @Deprecated public void create(final ICallback<UploadSession> callback) {
        this.post(callback);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #post()}
     */
    @Deprecated public UploadSession create() throws ClientException {
        return this.post();
    }

    public void post(final ICallback<UploadSession> callback) {
        send(HttpMethod.POST, callback, mBody);
    }

    public UploadSession post() throws ClientException {
        return send(HttpMethod.POST, mBody);
    }

    public ICreateSessionRequest select(final String value) {
        getQueryOptions().add(new QueryOption("select", value));
        return (CreateSessionRequest)this;
    }

    public ICreateSessionRequest top(final int value) {
        getQueryOptions().add(new QueryOption("top", value+""));
        return (CreateSessionRequest)this;
    }

    public ICreateSessionRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("expand", value));
        return (CreateSessionRequest)this;
    }
}
