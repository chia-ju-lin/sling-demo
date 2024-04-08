package org.apache.jsp.libs.composum.nodes.browser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class browser__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/core");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_defineObjects_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_component_type_scope_id;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_call_script_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_include_resourceType_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_cpn_defineObjects_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cpn_component_type_scope_id = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sling_call_script_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sling_include_resourceType_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _jspx_tagPool_cpn_defineObjects_nobody.release();
    _jspx_tagPool_cpn_component_type_scope_id.release();
    _jspx_tagPool_sling_call_script_nobody.release();
    _jspx_tagPool_sling_include_resourceType_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      com.composum.sling.cpnl.ComponentTag _jspx_th_cpn_component_0 = (com.composum.sling.cpnl.ComponentTag) _jspx_tagPool_cpn_component_type_scope_id.get(com.composum.sling.cpnl.ComponentTag.class);
      _jspx_th_cpn_component_0.setPageContext(_jspx_page_context);
      _jspx_th_cpn_component_0.setParent(null);
      // /libs/composum/nodes/browser/browser.jsp(6,0) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setId("browser");
      // /libs/composum/nodes/browser/browser.jsp(6,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setType("com.composum.sling.nodes.browser.Browser");
      // /libs/composum/nodes/browser/browser.jsp(6,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("    ");

        if (!browser.isReadAllowed()) {
            slingResponse.sendError(HttpServletResponse.SC_FORBIDDEN);
        } else {
    
          out.write("\n");
          out.write("    <html data-context-path=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${slingRequest.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-composum-base=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${composumBase}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("    ");
          if (_jspx_meth_sling_call_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    <body id=\"browser\" class=\"console left-open top-open\">\n");
          out.write("    <div id=\"ui\">\n");
          out.write("        ");
          if (_jspx_meth_sling_call_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_sling_include_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        <div id=\"content-wrapper\">\n");
          out.write("            <div id=\"split-view-horizontal-split\" class=\"split-pane horizontal-split fixed-left\">\n");
          out.write("                <div class=\"split-pane-component left-pane\">\n");
          out.write("                    <div id=\"browser-nav-split\" class=\"split-pane vertical-split fixed-bottom favorites-closed\">\n");
          out.write("                        <div class=\"split-pane-component top-pane\">\n");
          out.write("                            ");
          if (_jspx_meth_sling_include_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"split-pane-divider\"></div>\n");
          out.write("                        <div class=\"split-pane-component bottom-pane\">\n");
          out.write("                            <div>\n");
          out.write("                                <div class=\"tree-panel\">\n");
          out.write("                                    <div id=\"browser-tree\" data-selected=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.path}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div id=\"browser-tree-actions\" class=\"tree-actions action-bar btn-toolbar\"\n");
          out.write("                                     role=\"toolbar\">\n");
          out.write("                                    <div class=\"align-left\">\n");
          out.write("                                        <div class=\"menu btn-group btn-group-sm dropup\" role=\"group\">\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    class=\"glyphicon-menu-hamburger glyphicon btn btn-default dropdown-toggle\"\n");
          out.write("                                                    data-toggle=\"dropdown\" title=\"More actions...\"><span class=\"label\">More...</span>\n");
          out.write("                                            </button>\n");
          out.write("                                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
          out.write("                                                <li><a href=\"#\" class=\"checkout");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.writeAllowed?'':' disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("                                                       title=\"Checkout/Checkin the selected node\">Checkout</a></li>\n");
          out.write("                                                <li><a href=\"#\" class=\"lock");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.writeAllowed?'':' disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("                                                       title=\"Lock/Unlock the selected node\">Lock</a></li>\n");
          out.write("                                                <li><a href=\"#\" class=\"mixins");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.writeAllowed?'':' disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("                                                       title=\"View/Change the nodes mixin types\">Mixin Types...</a></li>\n");
          out.write("                                                <li><a href=\"#\" class=\"move");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.writeAllowed?'':' disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("                                                       title=\"Move the selected node\">Move\n");
          out.write("                                                    Node</a></li>\n");
          out.write("                                                <li><a href=\"#\" class=\"rename");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.writeAllowed?'':' disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("                                                       title=\"Rename the selected node\">Rename</a></li>\n");
          out.write("                                            </ul>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                    class=\"create glyphicon-plus glyphicon btn btn-default\"\n");
          out.write("                                                    title=\"Create a new node\"><span class=\"label\">Create</span></button>\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                    class=\"delete glyphicon-minus glyphicon btn btn-default\"\n");
          out.write("                                                    title=\"Delete selected node\"><span class=\"label\">Delete</span>\n");
          out.write("                                            </button>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                            <button type=\"button\" class=\"copy fa fa-copy btn btn-default\"\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_2(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                    title=\"Copy selected node to clipboard\"><span\n");
          out.write("                                                    class=\"label\">Copy</span></button>\n");
          out.write("                                            <button type=\"button\" class=\"paste fa fa-paste btn btn-default\"\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_3(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                    title=\"Paste node from clipboard into the selected node\"><span\n");
          out.write("                                                    class=\"label\">Paste</span></button>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    class=\"refresh glyphicon-refresh glyphicon btn btn-default\"\n");
          out.write("                                                    title=\"Refresh the selected tree node\"><span\n");
          out.write("                                                    class=\"label\">Refresh</span></button>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"align-right\">\n");
          out.write("                                        <div class=\"filter btn-group btn-group-sm dropup\" role=\"group\">\n");
          out.write("                                            <label class=\"filter\"><span>default</span></label>\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    class=\"glyphicon-filter glyphicon btn btn-default dropdown-toggle\"\n");
          out.write("                                                    data-toggle=\"dropdown\" aria-expanded=\"false\"\n");
          out.write("                                                    title=\"Filter for the tree\"><span class=\"label\">Filter</span>\n");
          out.write("                                            </button>\n");
          out.write("                                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
          out.write("                                            </ul>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                            <button type=\"button\" class=\"favorites fa btn btn-default\"\n");
          out.write("                                                    title=\"Toogle favorites view on/off\"><span\n");
          out.write("                                                    class=\"label\">Favorites</span></button>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"split-pane-divider split-pane-divider-main-horizontal\"></div>\n");
          out.write("                <div class=\"split-pane-component right-pane\">\n");
          out.write("                    <div id=\"split-view-vertical-split\" class=\"split-pane vertical-split fixed-top\">\n");
          out.write("                        <div class=\"split-pane-component top-pane query-split-pane\">\n");
          out.write("                            <div id=\"browser-query\">\n");
          out.write("                                ");
          if (_jspx_meth_sling_call_2(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"split-pane-divider split-pane-divider-main-vertical\"></div>\n");
          out.write("                        <div class=\"split-pane-component bottom-pane\">\n");
          out.write("                            <div id=\"browser-view\">\n");
          out.write("                                ");
          if (_jspx_meth_sling_call_3(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"close-top\"><a href=\"#\" class=\"fa fa-angle-double-up\"\n");
          out.write("                                                      title=\"Collapse top panel\"></a></div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"open-top\"><a href=\"#\" class=\"fa fa-angle-double-down\" title=\"Restore top panel\"></a>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"close-left\"><a href=\"#\" class=\"fa fa-angle-double-left\" title=\"Collapse left panel\"></a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"open-left\"><a href=\"#\" class=\"fa fa-angle-double-right\" title=\"Restore left panel\"></a>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    ");
          if (_jspx_meth_sling_call_4(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_include_2(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </body>\n");
          out.write("    </html>\n");
          out.write("    ");
}
          out.write('\n');
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
    // /libs/composum/nodes/browser/browser.jsp(13,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_0.setScript("head.jsp");
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
    // /libs/composum/nodes/browser/browser.jsp(16,8) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_1.setScript("dialogs.jsp");
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
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_include_0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _jspx_tagPool_sling_include_resourceType_nobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_include_0.setPageContext(_jspx_page_context);
    _jspx_th_sling_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/browser/browser.jsp(17,8) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_0.setResourceType("composum/nodes/console/components/navbar");
    int _jspx_eval_sling_include_0 = _jspx_th_sling_include_0.doStartTag();
    if (_jspx_th_sling_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_0);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_0);
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
    // /libs/composum/nodes/browser/browser.jsp(23,28) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_1.setResourceType("composum/nodes/browser/components/favorites");
    int _jspx_eval_sling_include_1 = _jspx_th_sling_include_1.doStartTag();
    if (_jspx_th_sling_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_1);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/browser/browser.jsp(56,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!browser.writeAllowed}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled=\"disabled\"");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/browser/browser.jsp(60,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!browser.writeAllowed}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled=\"disabled\"");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/browser/browser.jsp(67,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!browser.writeAllowed}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled=\"disabled\"");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/browser/browser.jsp(71,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!browser.writeAllowed}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled=\"disabled\"");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
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
    // /libs/composum/nodes/browser/browser.jsp(109,32) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_2.setScript("query.jsp");
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
    // /libs/composum/nodes/browser/browser.jsp(115,32) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_3.setScript("view.jsp");
    int _jspx_eval_sling_call_3 = _jspx_th_sling_call_3.doStartTag();
    if (_jspx_th_sling_call_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_3);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_3);
    return false;
  }

  private boolean _jspx_meth_sling_call_4(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_call_4 = (org.apache.sling.scripting.jsp.taglib.CallTag) _jspx_tagPool_sling_call_script_nobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_call_4.setPageContext(_jspx_page_context);
    _jspx_th_sling_call_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/browser/browser.jsp(131,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_4.setScript("script.jsp");
    int _jspx_eval_sling_call_4 = _jspx_th_sling_call_4.doStartTag();
    if (_jspx_th_sling_call_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_4);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_4);
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
    // /libs/composum/nodes/browser/browser.jsp(132,4) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
