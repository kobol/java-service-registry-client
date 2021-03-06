/**
 *  Copyright 2012 Rackspace
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.rackspacecloud.client.service_registry.clients;

import com.rackspacecloud.client.service_registry.ClientResponse;
import com.rackspacecloud.client.service_registry.objects.Limits;
import org.apache.http.client.methods.HttpGet;

public class AccountClient extends BaseClient {
    public AccountClient(AuthClient authClient, String apiUrl) {
        super(authClient, apiUrl);
    }

    public Limits getLimits() throws Exception {
        ClientResponse response = this.performRequest("/limits", null, new HttpGet(), true, Limits.class);

        return (Limits)response.getBody();
    }
}
