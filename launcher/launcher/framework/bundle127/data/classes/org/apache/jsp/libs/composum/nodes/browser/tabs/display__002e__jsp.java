package org.apache.jsp.libs.composum.nodes.browser.tabs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class display__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_defineObjects_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_component_type_scope_id;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sling_defineObjects_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cpn_component_type_scope_id = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sling_defineObjects_nobody.release();
    _jspx_tagPool_cpn_component_type_scope_id.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  sling:defineObjects
      org.apache.sling.scripting.jsp.taglib.DefineObjectsTag _jspx_th_sling_defineObjects_0 = (org.apache.sling.scripting.jsp.taglib.DefineObjectsTag) _jspx_tagPool_sling_defineObjects_nobody.get(org.apache.sling.scripting.jsp.taglib.DefineObjectsTag.class);
      _jspx_th_sling_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_sling_defineObjects_0.setParent(null);
      int _jspx_eval_sling_defineObjects_0 = _jspx_th_sling_defineObjects_0.doStartTag();
      if (_jspx_th_sling_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_sling_defineObjects_nobody.reuse(_jspx_th_sling_defineObjects_0);
        return;
      }
      _jspx_tagPool_sling_defineObjects_nobody.reuse(_jspx_th_sling_defineObjects_0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      out.write('\n');
      //  cpn:component
      com.composum.sling.cpnl.ComponentTag _jspx_th_cpn_component_0 = (com.composum.sling.cpnl.ComponentTag) _jspx_tagPool_cpn_component_type_scope_id.get(com.composum.sling.cpnl.ComponentTag.class);
      _jspx_th_cpn_component_0.setPageContext(_jspx_page_context);
      _jspx_th_cpn_component_0.setParent(null);
      // /libs/composum/nodes/browser/tabs/display.jsp(5,0) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setId("browser");
      // /libs/composum/nodes/browser/tabs/display.jsp(5,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setType("com.composum.sling.nodes.browser.Browser");
      // /libs/composum/nodes/browser/tabs/display.jsp(5,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setScope("request");
      int _jspx_eval_cpn_component_0 = _jspx_th_cpn_component_0.doStartTag();
      if (_jspx_eval_cpn_component_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.composum.sling.nodes.browser.Browser browser = null;
        if (_jspx_eval_cpn_component_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_cpn_component_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_cpn_component_0.doInitBody();
        }
        browser = (com.composum.sling.nodes.browser.Browser) _jspx_page_context.findAttribute("browser");
        do {
          out.write("\n");
          out.write("  <div class=\"display detail-panel\" data-path=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.currentPathUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-mapped=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.mappedUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("    <div class=\"display-toolbar detail-toolbar\">\n");
          out.write("      <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("        <span class=\"resolver fa fa-external-link btn btn-default\" title=\"Resolver Mapping ON/OFF\"></span>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"prefix btn-group btn-group-sm toolbar-input-field\" role=\"group\">\n");
          out.write("        <div class=\"input-group input-group-sm\">\n");
          out.write("          <span class=\"input-group-addon\" title=\"Path prefix\">/_/</span>\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Path prefix\">\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"selectors btn-group btn-group-sm toolbar-input-field\" role=\"group\">\n");
          out.write("        <div class=\"input-group input-group-sm\">\n");
          out.write("          <span class=\"input-group-addon\" title=\"Sling selectors\">.x.</span>\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Sling selectors\">\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"extension btn-group btn-group-sm toolbar-input-field\" role=\"group\">\n");
          out.write("        <div class=\"input-group input-group-sm\">\n");
          out.write("          <span class=\"input-group-addon\" title=\"Extension\">.xt</span>\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Ext.\">\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"suffix btn-group btn-group-sm toolbar-input-field\" role=\"group\">\n");
          out.write("        <div class=\"input-group input-group-sm\">\n");
          out.write("          <span class=\"input-group-addon\" title=\"Sling suffix\">/..</span>\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Sling suffix\">\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"parameters btn-group btn-group-sm toolbar-input-field\" role=\"group\">\n");
          out.write("        <div class=\"input-group input-group-sm\">\n");
          out.write("          <span class=\"fa fa-question input-group-addon\" title=\"URL parameter\"></span>\n");
          out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"URL parameter\">\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("      <div class=\"webview btn-group btn-group-sm\" role=\"group\">\n");
          out.write("        <button type=\"button\" class=\"reload fa fa-refresh btn btn-default\" title=\"Reload\"><span class=\"label\">Reload</span></button>\n");
          out.write("        <button type=\"button\" class=\"open fa fa-globe btn btn-default\" title=\"Open in a separate view\"><span class=\"label\">Open</span></button>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("    <div class=\"embedded frame-container detail-content\">\n");
          out.write("      <iframe src=\"\" width=\"100%\" height=\"100%\"\n");
          out.write("              sandbox=\"allow-same-origin allow-scripts allow-modals allow-popups allow-forms allow-downloads\"></iframe>\n");
          out.write("    </div>\n");
          out.write("  </div>\n");
          int evalDoAfterBody = _jspx_th_cpn_component_0.doAfterBody();
          browser = (com.composum.sling.nodes.browser.Browser) _jspx_page_context.findAttribute("browser");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_cpn_component_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_cpn_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_cpn_component_type_scope_id.reuse(_jspx_th_cpn_component_0);
        return;
      }
      _jspx_tagPool_cpn_component_type_scope_id.reuse(_jspx_th_cpn_component_0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
