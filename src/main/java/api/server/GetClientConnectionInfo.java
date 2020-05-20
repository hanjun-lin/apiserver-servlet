package api.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetClientConnectionInfo
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/GetClientConnectionInfo" })
public class GetClientConnectionInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public GetClientConnectionInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		main(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		main(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		main(request, response);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		main(request, response);
	}

	/**
	 * main method
	 */
	protected void main(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		int j = 0;
		PrintWriter out = response.getWriter();
		out.println("Served at: " + request.getContextPath());
		out.println("http method : " + request.getMethod() + "<br />");
		out.println("http protocol : " + request.getProtocol() + "<br />");
		out.println("http auth type : " + request.getAuthType() + "<br />");
		out.println("http character encoding : " + request.getCharacterEncoding() + "<br />");
		out.println("http content length : " + request.getContentLength() + "<br />");
		out.println("http content type : " + request.getContentType() + "<br />");
		out.println("http context path : " + request.getContextPath() + "<br />");
		out.println("http local addr : " + request.getLocalAddr() + "<br />");
		out.println("http local name : " + request.getLocalName() + "<br />");
		out.println("http local port : " + request.getLocalPort() + "<br />");
		out.println("http path info : " + request.getPathInfo() + "<br />");
		out.println("http path translated : " + request.getPathTranslated() + "<br />");
		out.println("http query string : " + request.getQueryString() + "<br />");
		out.println("http remote addr : " + request.getRemoteAddr() + "<br />");
		out.println("http remote host : " + request.getRemoteHost() + "<br />");
		out.println("http remote port : " + request.getRemotePort() + "<br />");
		out.println("http remote user : " + request.getRemoteUser() + "<br />");
		out.println("http request session id : " + request.getRequestedSessionId() + "<br />");
		out.println("http request uri : " + request.getRequestURI() + "<br />");
		out.println("http scheme : " + request.getScheme() + "<br />");
		out.println("http server name : " + request.getServerName() + "<br />");
		out.println("http server port : " + request.getServerPort() + "<br />");
		out.println("http servlet path : " + request.getServletPath() + "<br />");
		out.println("http isAsyncStarted : " + request.isAsyncStarted() + "<br />");
		out.println("http isAsyncSupported : " + request.isAsyncSupported() + "<br />");
		out.println("http isRequestedSessionIdFromCookie : " + request.isRequestedSessionIdFromCookie() + "<br />");
		out.println("http isRequestedSessionIdFromURL : " + request.isRequestedSessionIdFromURL() + "<br />");
		out.println("http isRequestedSessionIdValid : " + request.isRequestedSessionIdValid() + "<br />");
		out.println("http isSecure : " + request.isSecure() + "<br />");
		out.println("http isTrailerFieldsReady : " + request.isTrailerFieldsReady() + "<br />");
		out.println("http BASIC_AUTH : " + HttpServletRequest.BASIC_AUTH + "<br />");
		out.println("http CLIENT_CERT_AUTH : " + HttpServletRequest.CLIENT_CERT_AUTH + "<br />");
		out.println("http DIGEST_AUTH : " + HttpServletRequest.DIGEST_AUTH + "<br />");
		out.println("http FORM_AUTH : " + HttpServletRequest.FORM_AUTH + "<br />");
		out.println("----- headers from request / client -----<br />");
		Enumeration<String> headerNames = request.getHeaderNames();
		String headerName = "", headerValue = "";
		while (headerNames.hasMoreElements()) {
			headerName = ""; headerValue = "";
			headerName = headerNames.nextElement();
			headerValue = request.getHeader(headerName);
			out.println(headerName + " : " + headerValue + "<br />");
		}
		out.println("----- attributes from request / client -----<br />");
		Enumeration<String> attributeNames = request.getAttributeNames();
		String attributeName = "", attributeValue = "";
		while (attributeNames.hasMoreElements()) {
			attributeName = ""; attributeValue = "";
			attributeName = attributeNames.nextElement();
			attributeValue = request.getHeader(attributeName);
			out.println(attributeName + " : " + attributeValue + "<br />");
		}
		out.println("----- cookies from request / client -----<br />");
		Cookie[] cookie = request.getCookies();
		if (null != cookie) {
			for (int i=0; i< cookie.length; i++) {
				if (i > 0) out.println(" --- " + "<br />");
				out.println("comment : " + cookie[i].getComment() + "<br />");
				out.println("domain : " + cookie[i].getDomain() + "<br />");
				out.println("max age : " + cookie[i].getMaxAge() + "<br />");
				out.println("name : " + cookie[i].getName() + "<br />");
				out.println("path : " + cookie[i].getPath() + "<br />");
				out.println("value : " + cookie[i].getValue() + "<br />");
				out.println("version : " + cookie[i].getVersion() + "<br />");
				out.println("secure : " + cookie[i].getSecure() + "<br />");
				out.println("toString : " + cookie[i].toString() + "<br />");
				out.println("isHttpOnly : " + cookie[i].isHttpOnly() + "<br />");
			}
		}
		out.println("----- locales from request / client -----<br />");
		Enumeration<Locale> locales = request.getLocales();
		Locale locale = null;
		j = 0;
		while (locales.hasMoreElements()) {
			if (j > 0) out.println(" --- " + "<br />");
			locale = null;
			locale = locales.nextElement();
			out.println("country : " + locale.getCountry() + "<br />");
			out.println("display country : " + locale.getDisplayCountry() + "<br />");
			out.println("display language : " + locale.getDisplayLanguage() + "<br />");
			out.println("display name : " + locale.getDisplayName() + "<br />");
			out.println("display script : " + locale.getDisplayScript() + "<br />");
			out.println("display variant : " + locale.getDisplayVariant() + "<br />");
			out.println("ISO3 country : " + locale.getISO3Country() + "<br />");
			out.println("ISO3 language : " + locale.getISO3Language() + "<br />");
			out.println("language : " + locale.getLanguage() + "<br />");
			out.println("script : " + locale.getScript() + "<br />");
			out.println("variant : " + locale.getVariant() + "<br />");
			out.println("toLanguageTag : " + locale.toLanguageTag() + "<br />");
			j++;
		}
		out.println("----- parameters from request / client -----<br />");
		Enumeration<String> parameterNames = request.getParameterNames();
		String parameterName = "", parameterValue = "";
		String[] parameterValues = null;
		while (parameterNames.hasMoreElements()) {
			parameterName = ""; parameterValue = ""; parameterValues = null;
			parameterName = parameterNames.nextElement();
			parameterValue = request.getParameter(parameterName);
			parameterValues = request.getParameterValues(parameterName);
			if (null != parameterValues) {
				if (parameterValues.length > 1) {
					for (int i=0; i<parameterValues.length; i++) {
						out.println(parameterName + " : [" + i + "] " + parameterValues[i] + "<br />");
					}
				} else {
					out.println(parameterName + " : " + parameterValue + "<br />");
				}
			} else {
				out.println(parameterName + " : " + parameterValue + "<br />");
			}
		}
		/*
		out.println("----- parts from request / client of multipart/form-data -----<br />");
		if (null != request.getParts()) {
			Collection<Part> parts = request.getParts();
			Part part = null;
			Iterator<Part> itPart = parts.iterator();
			j = 0;
			while (itPart.hasNext()) {
				if (j > 0) out.println(" --- " + "<br />");
				part = null;
				part = itPart.next();
				out.println("content type : " + part.getContentType() + "<br />");
				out.println("name : " + part.getName() + "<br />");
				out.println("size : " + part.getSize() + "<br />");
				out.println("submitted file name : " + part.getSubmittedFileName() + "<br />");
				j++;
			}
		}
		*/
	}
}