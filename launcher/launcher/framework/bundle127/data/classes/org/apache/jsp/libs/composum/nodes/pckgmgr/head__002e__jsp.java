package org.apache.jsp.libs.composum.nodes.pckgmgr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

static private org.apache.sling.scripting.jsp.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.sling.scripting.jsp.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("cpn:cpm", com.composum.sling.cpnl.CpnlElFunctions.class, "cpm", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_call_script_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_clientlib_type_category_nobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sling_call_script_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cpn_clientlib_type_category_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sling_call_script_nobody.release();
    _jspx_tagPool_cpn_clientlib_type_category_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      if (_jspx_meth_sling_call_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_cpn_clientlib_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_cpn_clientlib_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
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

  private boolean _jspx_meth_sling_call_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_0 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_0.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_0.setParent(null);
    // /libs/composum/nodes/pckgmgr/head.jsp(5,0) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_0.setScript((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpn:cpm('composum/nodes/console/page/head-meta.jsp')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    int _jspx_eval_sling_call_0 = _jspx_th_sling_call_0.doStartTag();
    if (_jspx_th_sling_call_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_0);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_0);
    return false;
  }

  private boolean _jspx_meth_cpn_clientlib_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:clientlib
    com.composum.sling.cpnl.ClientlibTag _jspx_th_cpn_clientlib_0 = (com.composum.sling.cpnl.ClientlibTag) _jspx_tagPool_cpn_clientlib_type_category_nobody.get(com.composum.sling.cpnl.ClientlibTag.class);
    _jspx_th_cpn_clientlib_0.setPageContext(_jspx_page_context);
    _jspx_th_cpn_clientlib_0.setParent(null);
    // /libs/composum/nodes/pckgmgr/head.jsp(6,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_clientlib_0.setType("link");
    // /libs/composum/nodes/pckgmgr/head.jsp(6,0) name = category type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_clientlib_0.setCategory("composum.nodes.console.default");
    int _jspx_eval_cpn_clientlib_0 = _jspx_th_cpn_clientlib_0.doStartTag();
    if (_jspx_th_cpn_clientlib_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_cpn_clientlib_type_category_nobody.reuse(_jspx_th_cpn_clientlib_0);
      return true;
    }
    _jspx_tagPool_cpn_clientlib_type_category_nobody.reuse(_jspx_th_cpn_clientlib_0);
    return false;
  }

  private boolean _jspx_meth_cpn_clientlib_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:clientlib
    com.composum.sling.cpnl.ClientlibTag _jspx_th_cpn_clientlib_1 = (com.composum.sling.cpnl.ClientlibTag) _jspx_tagPool_cpn_clientlib_type_category_nobody.get(com.composum.sling.cpnl.ClientlibTag.class);
    _jspx_th_cpn_clientlib_1.setPageContext(_jspx_page_context);
    _jspx_th_cpn_clientlib_1.setParent(null);
    // /libs/composum/nodes/pckgmgr/head.jsp(7,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_clientlib_1.setType("css");
    // /libs/composum/nodes/pckgmgr/head.jsp(7,0) name = category type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_clientlib_1.setCategory("composum.nodes.console.pckgmgr");
    int _jspx_eval_cpn_clientlib_1 = _jspx_th_cpn_clientlib_1.doStartTag();
    if (_jspx_th_cpn_clientlib_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_cpn_clientlib_type_category_nobody.reuse(_jspx_th_cpn_clientlib_1);
      return true;
    }
    _jspx_tagPool_cpn_clientlib_type_category_nobody.reuse(_jspx_th_cpn_clientlib_1);
    return false;
  }
}