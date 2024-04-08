package org.apache.jsp.libs.composum.nodes.console.tools.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_defineObjects_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_component_var_type_scope;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_call_script_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_include_resourceType_replaceSelectors_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_include_resourceType_nobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_cpn_defineObjects_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cpn_component_var_type_scope = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sling_call_script_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sling_include_resourceType_replaceSelectors_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sling_include_resourceType_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _jspx_tagPool_cpn_defineObjects_nobody.release();
    _jspx_tagPool_cpn_component_var_type_scope.release();
    _jspx_tagPool_sling_call_script_nobody.release();
    _jspx_tagPool_sling_include_resourceType_replaceSelectors_nobody.release();
    _jspx_tagPool_sling_include_resourceType_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  cpn:defineObjects
      com.composum.sling.cpnl.DefineObjectsTag _jspx_th_cpn_defineObjects_0 = (com.composum.sling.cpnl.DefineObjectsTag) _jspx_tagPool_cpn_defineObjects_nobody.get(com.composum.sling.cpnl.DefineObjectsTag.class);
      _jspx_th_cpn_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_cpn_defineObjects_0.setParent(null);
      int _jspx_eval_cpn_defineObjects_0 = _jspx_th_cpn_defineObjects_0.doStartTag();
      if (_jspx_th_cpn_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_cpn_defineObjects_nobody.reuse(_jspx_th_cpn_defineObjects_0);
        return;
      }
      _jspx_tagPool_cpn_defineObjects_nobody.reuse(_jspx_th_cpn_defineObjects_0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      java.lang.String contextPath = null;
      com.composum.sling.core.BeanContext beanContext = null;
      java.lang.String composumBase = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      contextPath = (java.lang.String) _jspx_page_context.findAttribute("contextPath");
      beanContext = (com.composum.sling.core.BeanContext) _jspx_page_context.findAttribute("beanContext");
      composumBase = (java.lang.String) _jspx_page_context.findAttribute("composumBase");
      out.write('\n');
      //  cpn:component
      com.composum.sling.cpnl.ComponentTag _jspx_th_cpn_component_0 = (com.composum.sling.cpnl.ComponentTag) _jspx_tagPool_cpn_component_var_type_scope.get(com.composum.sling.cpnl.ComponentTag.class);
      _jspx_th_cpn_component_0.setPageContext(_jspx_page_context);
      _jspx_th_cpn_component_0.setParent(null);
      // /libs/composum/nodes/console/tools/page/page.jsp(5,0) name = var type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setVar("console");
      // /libs/composum/nodes/console/tools/page/page.jsp(5,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setType("com.composum.sling.nodes.console.ConsoleModel");
      // /libs/composum/nodes/console/tools/page/page.jsp(5,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setScope("request");
      int _jspx_eval_cpn_component_0 = _jspx_th_cpn_component_0.doStartTag();
      if (_jspx_eval_cpn_component_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.composum.sling.nodes.console.ConsoleModel console = null;
        if (_jspx_eval_cpn_component_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_cpn_component_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_cpn_component_0.doInitBody();
        }
        console = (com.composum.sling.nodes.console.ConsoleModel) _jspx_page_context.findAttribute("console");
        do {
          out.write("\n");
          out.write("<html data-context-path=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${slingRequest.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-composum-base=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${composumBase}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("<head>\n");
          out.write("    ");
          if (_jspx_meth_sling_call_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_call_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("</head>\n");
          out.write("<body id=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${console.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${console.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" tools-console console\" data-tools=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${console.dataSet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("<div id=\"ui\">\n");
          out.write("    ");
          if (_jspx_meth_sling_include_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_include_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_call_2(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("</div>\n");
          if (_jspx_meth_sling_call_3(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write('\n');
          if (_jspx_meth_sling_include_2(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("</body>\n");
          out.write("</html>\n");
          int evalDoAfterBody = _jspx_th_cpn_component_0.doAfterBody();
          console = (com.composum.sling.nodes.console.ConsoleModel) _jspx_page_context.findAttribute("console");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_cpn_component_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_cpn_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_cpn_component_var_type_scope.reuse(_jspx_th_cpn_component_0);
        return;
      }
      _jspx_tagPool_cpn_component_var_type_scope.reuse(_jspx_th_cpn_component_0);
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

  private boolean _jspx_meth_sling_call_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_0 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_0.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/console/tools/page/page.jsp(8,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_0.setScript((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${composumBase}composum/nodes/console/page/head-meta.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_sling_call_0 = _jspx_th_sling_call_0.doStartTag();
    if (_jspx_th_sling_call_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_0);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_0);
    return false;
  }

  private boolean _jspx_meth_sling_call_1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_1 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_1.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/console/tools/page/page.jsp(9,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_1.setScript("head-clientlibs.jsp");
    int _jspx_eval_sling_call_1 = _jspx_th_sling_call_1.doStartTag();
    if (_jspx_th_sling_call_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_1);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_1);
    return false;
  }

  private boolean _jspx_meth_sling_include_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_include_0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _jspx_tagPool_sling_include_resourceType_replaceSelectors_nobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_include_0.setPageContext(_jspx_page_context);
    _jspx_th_sling_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/console/tools/page/page.jsp(13,4) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_0.setResourceType("composum/nodes/console/dialogs");
    // /libs/composum/nodes/console/tools/page/page.jsp(13,4) name = replaceSelectors type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_0.setReplaceSelectors("minimal");
    int _jspx_eval_sling_include_0 = _jspx_th_sling_include_0.doStartTag();
    if (_jspx_th_sling_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_replaceSelectors_nobody.reuse(_jspx_th_sling_include_0);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_replaceSelectors_nobody.reuse(_jspx_th_sling_include_0);
    return false;
  }

  private boolean _jspx_meth_sling_include_1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_include_1 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _jspx_tagPool_sling_include_resourceType_nobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_include_1.setPageContext(_jspx_page_context);
    _jspx_th_sling_include_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/console/tools/page/page.jsp(14,4) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_1.setResourceType("composum/nodes/console/components/navbar");
    int _jspx_eval_sling_include_1 = _jspx_th_sling_include_1.doStartTag();
    if (_jspx_th_sling_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_1);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_1);
    return false;
  }

  private boolean _jspx_meth_sling_call_2(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_2 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_2.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/console/tools/page/page.jsp(15,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_2.setScript("content.jsp");
    int _jspx_eval_sling_call_2 = _jspx_th_sling_call_2.doStartTag();
    if (_jspx_th_sling_call_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_2);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_2);
    return false;
  }

  private boolean _jspx_meth_sling_call_3(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_3 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_3.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/console/tools/page/page.jsp(17,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_3.setScript("body-clientlibs.jsp");
    int _jspx_eval_sling_call_3 = _jspx_th_sling_call_3.doStartTag();
    if (_jspx_th_sling_call_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_3);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_3);
    return false;
  }

  private boolean _jspx_meth_sling_include_2(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_include_2 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _jspx_tagPool_sling_include_resourceType_nobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_include_2.setPageContext(_jspx_page_context);
    _jspx_th_sling_include_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/console/tools/page/page.jsp(18,0) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_2.setResourceType("composum/nodes/console/components/tryLogin");
    int _jspx_eval_sling_include_2 = _jspx_th_sling_include_2.doStartTag();
    if (_jspx_th_sling_include_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_2);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_2);
    return false;
  }
}
