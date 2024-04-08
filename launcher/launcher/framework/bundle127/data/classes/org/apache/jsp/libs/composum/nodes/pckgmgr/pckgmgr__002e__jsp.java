package org.apache.jsp.libs.composum.nodes.pckgmgr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pckgmgr__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_nobody;

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
    _jspx_tagPool_c_set_var_value_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_remove_var_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _jspx_tagPool_cpn_defineObjects_nobody.release();
    _jspx_tagPool_cpn_component_type_scope_id.release();
    _jspx_tagPool_sling_call_script_nobody.release();
    _jspx_tagPool_sling_include_resourceType_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_remove_var_nobody.release();
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
      // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(6,0) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setId("pckgmgr");
      // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(6,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setType("com.composum.sling.core.pckgmgr.view.PackageManagerBean");
      // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(6,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setScope("request");
      int _jspx_eval_cpn_component_0 = _jspx_th_cpn_component_0.doStartTag();
      if (_jspx_eval_cpn_component_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.composum.sling.core.pckgmgr.view.PackageManagerBean pckgmgr = null;
        if (_jspx_eval_cpn_component_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_cpn_component_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_cpn_component_0.doInitBody();
        }
        pckgmgr = (com.composum.sling.core.pckgmgr.view.PackageManagerBean) _jspx_page_context.findAttribute("pckgmgr");
        do {
          out.write("\n");
          out.write("    ");

        if (!pckgmgr.isReadAllowed()) {
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
          out.write("    <body id=\"pckgmgr\" class=\"console left-open top-open\">\n");
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
          out.write("            ");
          if (_jspx_meth_c_set_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_c_set_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            <div id=\"split-view-horizontal-split\" class=\"split-pane horizontal-split fixed-left\">\n");
          out.write("                <div class=\"split-pane-component left-pane\">\n");
          out.write("                    <div>\n");
          out.write("                        <div class=\"tree-panel\">\n");
          out.write("                            <div id=\"package-tree\" data-selected=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pckgmgr.path}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"tree-actions action-bar btn-toolbar\" role=\"toolbar\">\n");
          out.write("                            <div class=\"align-left\">\n");
          out.write("                                <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                    <button type=\"button\" class=\"refresh glyphicon-refresh glyphicon btn btn-default\"\n");
          out.write("                                            title=\"Refresh tree view\"><span class=\"label\">Refresh</span></button>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                    <button type=\"button\" class=\"create fa fa-plus btn btn-default\"\n");
          out.write("                                            title=\"Create a new package\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${writeDisabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("><span\n");
          out.write("                                            class=\"label\">Create</span></button>\n");
          out.write("                                    <button type=\"button\" class=\"delete fa fa-minus btn btn-default\"\n");
          out.write("                                            title=\"Delete selected package\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${writeDisabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("><span\n");
          out.write("                                            class=\"label\">Delete</span></button>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                    <button type=\"button\" class=\"upload fa fa-upload btn btn-default\"\n");
          out.write("                                            title=\"Upload a new package\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${writeDisabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("><span\n");
          out.write("                                            class=\"label\">Upload</span></button>\n");
          out.write("                                    <a type=\"button\" class=\"download fa fa-download btn btn-default\"\n");
          out.write("                                       title=\"Download selected package\"><span class=\"label\">Download</span></a>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"split-pane-divider\"></div>\n");
          out.write("                <div class=\"split-pane-component right-pane\">\n");
          out.write("                    <div id=\"split-view-vertical-split\" class=\"split-pane vertical-split fixed-top\">\n");
          out.write("                        <div class=\"split-pane-component top-pane\">\n");
          out.write("                            <div id=\"pckgmgr-query\">\n");
          out.write("                                ");
          if (_jspx_meth_sling_call_2(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"split-pane-divider\"></div>\n");
          out.write("                        <div class=\"split-pane-component bottom-pane\">\n");
          out.write("                            <div id=\"pckgmgr-view\">\n");
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
          out.write("            ");
          if (_jspx_meth_c_remove_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_c_remove_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    ");
          if (_jspx_meth_sling_call_4(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_include_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </body>\n");
          out.write("    </html>\n");
          out.write("    ");
}
          out.write('\n');
          int evalDoAfterBody = _jspx_th_cpn_component_0.doAfterBody();
          pckgmgr = (com.composum.sling.core.pckgmgr.view.PackageManagerBean) _jspx_page_context.findAttribute("pckgmgr");
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
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(13,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(16,8) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(17,8) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_0.setResourceType("composum/nodes/console/components/navbar");
    int _jspx_eval_sling_include_0 = _jspx_th_sling_include_0.doStartTag();
    if (_jspx_th_sling_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_0);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(19,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_set_0.setVar("writeAllowed");
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(19,12) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_set_0.setValue(new org.apache.sling.scripting.jsp.jasper.el.JspValueExpression("/libs/composum/nodes/pckgmgr/pckgmgr.jsp(19,12) '${pckgmgr.permissible['nodes/packages/manager']['write']}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pckgmgr.permissible['nodes/packages/manager']['write']}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(20,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_set_1.setVar("writeDisabled");
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(20,12) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_set_1.setValue(new org.apache.sling.scripting.jsp.jasper.el.JspValueExpression("/libs/composum/nodes/pckgmgr/pckgmgr.jsp(20,12) '${writeAllowed?'':' disabled'}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${writeAllowed?'':' disabled'}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
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
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(58,32) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(64,32) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_3.setScript("view.jsp");
    int _jspx_eval_sling_call_3 = _jspx_th_sling_call_3.doStartTag();
    if (_jspx_th_sling_call_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_3);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_3);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(78,12) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_remove_0.setVar("writeDisabled");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }

  private boolean _jspx_meth_c_remove_1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_1 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_1.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(79,12) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_remove_1.setVar("writeAllowed");
    int _jspx_eval_c_remove_1 = _jspx_th_c_remove_1.doStartTag();
    if (_jspx_th_c_remove_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_1);
      return true;
    }
    _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_1);
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
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(82,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_call_4.setScript("script.jsp");
    int _jspx_eval_sling_call_4 = _jspx_th_sling_call_4.doStartTag();
    if (_jspx_th_sling_call_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_4);
      return true;
    }
    _jspx_tagPool_sling_call_script_nobody.reuse(_jspx_th_sling_call_4);
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
    // /libs/composum/nodes/pckgmgr/pckgmgr.jsp(83,4) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_include_1.setResourceType("composum/nodes/console/components/tryLogin");
    int _jspx_eval_sling_include_1 = _jspx_th_sling_include_1.doStartTag();
    if (_jspx_th_sling_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_1);
      return true;
    }
    _jspx_tagPool_sling_include_resourceType_nobody.reuse(_jspx_th_sling_include_1);
    return false;
  }
}
