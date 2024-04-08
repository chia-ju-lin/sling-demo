package org.apache.jsp.libs.composum.nodes.browser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dialogs__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_defineObjects_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_include_resourceType_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_call_script_nobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sling_defineObjects_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sling_include_resourceType_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sling_call_script_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sling_defineObjects_nobody.release();
    _jspx_tagPool_sling_include_resourceType_nobody.release();
    _jspx_tagPool_sling_call_script_nobody.release();
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
      if (_jspx_meth_sling_include_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_sling_call_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_sling_call_1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_sling_call_2(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_sling_call_3(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_sling_include_1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_sling_call_4(_jspx_page_context))
        return;
      out.write('\n');
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

  private boolean _jspx_meth_sling_include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_include_0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _jspx_tagPool_sling_include_resourceType_nobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_include_0.setPageContext(_jspx_page_context);
    _jspx_th_sling_include_0.setParent(null);
    // /libs/composum/nodes/browser/dialogs.jsp(4,0) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_0.setResourceType("composum/nodes/console/dialogs");
    int _jspx_eval_sling_include_0 = _jspx_th_sling_include_0.doStartTag();
    if (_jspx_th_sling_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_0);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_0);
    return false;
  }

  private boolean _jspx_meth_sling_call_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_0 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_0.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_0.setParent(null);
    // /libs/composum/nodes/browser/dialogs.jsp(5,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_0.setScript("dialogs/access-policy-entry.jsp");
    int _jspx_eval_sling_call_0 = _jspx_th_sling_call_0.doStartTag();
    if (_jspx_th_sling_call_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_0);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_0);
    return false;
  }

  private boolean _jspx_meth_sling_call_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_1 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_1.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_1.setParent(null);
    // /libs/composum/nodes/browser/dialogs.jsp(6,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_1.setScript("dialogs/version-add-label.jsp");
    int _jspx_eval_sling_call_1 = _jspx_th_sling_call_1.doStartTag();
    if (_jspx_th_sling_call_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_1);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_1);
    return false;
  }

  private boolean _jspx_meth_sling_call_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_2 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_2.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_2.setParent(null);
    // /libs/composum/nodes/browser/dialogs.jsp(7,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_2.setScript("dialogs/version-delete-label.jsp");
    int _jspx_eval_sling_call_2 = _jspx_th_sling_call_2.doStartTag();
    if (_jspx_th_sling_call_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_2);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_2);
    return false;
  }

  private boolean _jspx_meth_sling_call_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_3 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_3.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_3.setParent(null);
    // /libs/composum/nodes/browser/dialogs.jsp(8,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_3.setScript("dialogs/version-delete.jsp");
    int _jspx_eval_sling_call_3 = _jspx_th_sling_call_3.doStartTag();
    if (_jspx_th_sling_call_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_3);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_3);
    return false;
  }

  private boolean _jspx_meth_sling_include_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_include_1 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _jspx_tagPool_sling_include_resourceType_nobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_include_1.setPageContext(_jspx_page_context);
    _jspx_th_sling_include_1.setParent(null);
    // /libs/composum/nodes/browser/dialogs.jsp(9,0) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_1.setResourceType("composum/nodes/console/components/codeeditor/editdialog");
    int _jspx_eval_sling_include_1 = _jspx_th_sling_include_1.doStartTag();
    if (_jspx_th_sling_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_1);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_1);
    return false;
  }

  private boolean _jspx_meth_sling_call_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_4 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_4.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_4.setParent(null);
    // /libs/composum/nodes/browser/dialogs.jsp(10,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_4.setScript("dialogs/property.jsp");
    int _jspx_eval_sling_call_4 = _jspx_th_sling_call_4.doStartTag();
    if (_jspx_th_sling_call_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_4);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_4);
    return false;
  }
}
