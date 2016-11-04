package org.krisbox.ihub.examples.utils.rest.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.krisbox.ihub.examples.models.rest.Authentication;
import org.krisbox.ihub.examples.models.rest.file.BirtFile;
import org.krisbox.ihub.examples.models.rest.file.BirtFolder;
import org.krisbox.ihub.examples.utils.BIRT_RESULT_DEF;
import org.krisbox.ihub.examples.utils.logging.impl.BirtExecutorLoggerImpl;
import org.krisbox.ihub.examples.utils.rest.RestActions;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.krisbox.ihub.examples.utils.rest.endpoints.RestConstants;
import org.krisbox.ihub.examples.utils.rptdesign.BirtReportProperties;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.*;

import static org.krisbox.ihub.examples.utils.rest.endpoints.RestConstants.ENDPOINTS.GET_FILES;

/**
 * Created by kclark on 11/4/16.
 */
public class RestActionsImpl extends BirtExecutorLoggerImpl implements RestActions {
    private Authentication authentication;
    private BirtFolder birtFolder;

    public RestActionsImpl() {
        super();
    }

    private Map<String, Object> createHttpPostClient(BirtReportProperties birtProps) {
        debug(this.getClass(), "createHttpPostClient(BirtReportProperties birtProps)");

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("HttpClient", new DefaultHttpClient());
        map.put("HttpPost",   new HttpPost(birtProps.getHostname() + "/api/v2/login"));

        return map;
    }

    private String prepAndSendGet(String url, Map<String, String> params, BirtReportProperties birtProps) {
        StringBuilder body = new StringBuilder();
        String entity = new String();
        try {
            HttpResponse response;
            HttpClient httpclient = new DefaultHttpClient(); // create new httpClient
            HttpGet httpGet = new HttpGet(url); // create new httpGet object

            params.forEach((key, value) -> {
                httpGet.setHeader(key, value);
            });

            BirtFolder folder = null;


            response = httpclient.execute(httpGet); // execute httpGet
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                body.append(statusLine + "\n");
                HttpEntity e = response.getEntity();
                entity = EntityUtils.toString(e);
                debug(this.getClass(), "%%%%%%%%%%%%%%%%%%%%%%%%%%" + entity);;

            } else {
                body.append(statusLine + "\n");
            }
            httpGet.releaseConnection();
        }catch(Exception ex){
            fatal(this.getClass(), ex);
        }

        debug(this.getClass(), "%%%%%%%%%%%%%%%%%%%%%%%%%%" + entity);

        return entity;
    }

    private Object sendGet(BirtReportProperties birtProps,
                   String endpoint, Map<String, String> params,
                   RestConstants.ENDPOINTS resultDef) throws MalformedURLException, IOException {
        debug(this.getClass(), "createHttpGetClient(BirtReportProperties birtProps)");

        Gson gson = new GsonBuilder().create();

        switch(resultDef) {
            case GET_DATAOBJECTS_DATAOBJECTID:
                break;
            case GET_DATAOBJECTS_DATAOBJECTID_DATASETNAME:
                break;
            case GET_FILES:
                BirtFolder f = gson.fromJson(prepAndSendGet(birtProps.getHostname() + "/api/v2/files/search", params, birtProps), BirtFolder.class);
                debug(this.getClass(), "*********************************************" + f.toString());
                break;
            case GET_FILES_FILEID:
                break;
            case GET_FILES_FILEID_DOWNLOAD:
                break;
            case GET_FILES_FILEID_PRIVILEGES:
                break;
            case GET_FILES_FILEID_SEARCH:
                break;
            case GET_FILES_SEARCH:
                break;
            case GET_JOBS:
                break;
            case GET_JOBS_JOBID_STATUS:
                break;
            case GET_USERGROUPS:
                break;
            case GET_USERGROUPS_USERGROUPID:
                break;
            case GET_USERGROUPS_USERGROUPID_USERS:
                break;
            case GET_USERS:
                break;
            case GET_USERS_USERID:
                break;
            case GET_USERS_USERID_USERGROUPS:
                break;
            case GET_VERSION:
                break;
            case GET_VERSION_API:
                break;
            case GET_VISUALS_VISUALID_BOOKMARKS:
                break;
            case GET_VISUALS_VISUALID_BOOKMARKS_BOOKMARKNAME:
                break;
            case GET_VISUALS_VISUALID_PARAMETERS:
                break;
            case GET_VISUALS_VISUALID_PARAMETERS_PICKLIST:
                break;
            case GET_VISUALS_VISUALID_PDF:
                break;
            case GET_VISUALS_VISUALID_RESULTSETS:
                break;
            case GET_VISUALS_VISUALID_RESULTSETS_RESULTSETNAME:
                break;
            case GET_VISUALS_VISUALID_XLSX:
                break;
        //return gson.fromJson(entity, BirtFolder.class);
        }

        return null;
    }

    private ArrayList<NameValuePair> createPostParameters(Map<String, String> params) {
        debug(this.getClass(), "createPostParameters(Map<String, String> params)");
        ArrayList<NameValuePair> postParameters;
        postParameters = new ArrayList<NameValuePair>();

        params.forEach((key, value) -> {
            postParameters.add(new BasicNameValuePair(key, value));
        });

        return postParameters;
    }

    private ArrayList<NameValuePair> createGetParameters(Map<String, String> params) {
        debug(this.getClass(), "createGetParameters(Map<String, String> params)");
        ArrayList<NameValuePair> getParameters;
        getParameters = new ArrayList<NameValuePair>();

        params.forEach((key, value) -> {
            getParameters.add(new BasicNameValuePair(key, value));
        });

        return getParameters;
    }

    private Object getResponse(HttpResponse response) throws IOException {
        InputStream resp = response.getEntity().getContent();
        String body = IOUtils.toString(resp, "UTF-8");
        debug(this.getClass(), body);
        Gson gson = new GsonBuilder().create();
        Authentication auth = gson.fromJson(body, Authentication.class);

        return auth;
    }

    private HttpResponse executePost(HttpPost post, HttpClient client) throws IOException {
        debug(this.getClass(), "executePost(HttpPost post, HttpClient client) throws IOException");
        return client.execute(post);
    }

    private void getRootItems() {

    }

    public void login(BirtReportProperties birtReportProperties) {
        debug(this.getClass(), "login(BirtReportProperties birtReportProperties");

        try {
            Map<String, Object> map = createHttpPostClient(birtReportProperties);

            HttpPost post = (HttpPost) map.get("HttpPost");
            HttpClient client = (HttpClient) map.get("HttpClient");

            post.setEntity(new UrlEncodedFormEntity(createPostParameters(birtReportProperties.getLoginParameters())));
            authentication = (Authentication) getResponse(executePost(post, client));
            debug(this.getClass(), authentication.getAuthToken());
        }catch(Exception ex){
            fatal(this.getClass(), ex);
        }
    }

    public void getFolderItems(BirtReportProperties birtReportProperties) {
        try {
            Map<String, String> params = new HashMap<String, String>();
            debug(this.getClass(), birtReportProperties.getHostname());
            debug(this.getClass(), birtReportProperties.getVolume());
            debug(this.getClass(), birtReportProperties.getUsername());
            debug(this.getClass(), authentication.getAuthToken());
            params.put("TagetVolume", birtReportProperties.getVolume());
            params.put("AuthToken", authentication.getAuthToken());

            BirtFolder f = (BirtFolder) sendGet(birtReportProperties, "/api/v2/files/search", params, GET_FILES);
        }catch(Exception ex){
            fatal(this.getClass(), ex);
        }
    }
}
