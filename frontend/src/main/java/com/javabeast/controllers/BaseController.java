package com.javabeast.controllers;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseController {


    public abstract String getViewName();

    public Map<String, Object> getModel(final HttpServletRequest request) {
        final HashMap<String, Object> model = new HashMap<>();
        final String url = getURL(request);
        final String canonical = getCanonical(url, request);
        model.put("url", url);
        model.put("canonical", canonical);
        return model;
    }

    private static String getURL(final HttpServletRequest request) {
        final String scheme = request.getScheme();             // http
        final String serverName = request.getServerName();     // hostname.com
        final int serverPort = request.getServerPort();        // 80
        final String contextPath = request.getContextPath();   // /mywebapp
        final String servletPath = request.getServletPath();   // /servlet/MyServlet
        final String pathInfo = request.getPathInfo();         // /a/b;c=123
        final String queryString = request.getQueryString();          // d=789

        final StringBuilder url = new StringBuilder();
        url.append(scheme).append("://").append(serverName);

        if (serverPort != 80 && serverPort != 443) {
            url.append(":").append(serverPort);
        }

        url.append(contextPath).append(servletPath);

        if (pathInfo != null) {
            url.append(pathInfo);
        }
        return url.toString();
    }

    private static String getCanonical(final String fullUrl, final HttpServletRequest request) {
        final String queryString = request.getQueryString();          // d=789
        final StringBuilder url = new StringBuilder();
        url.append(fullUrl);

        if (queryString != null) {
            url.append("?").append(queryString);
        }
        return url.toString();
    }
}
