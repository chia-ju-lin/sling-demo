package org.apache.jsp.libs.composum.nodes.browser.tabs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class json__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/core");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_sling_defineObjects_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_component_type_scope_id;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_nobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sling_defineObjects_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cpn_component_type_scope_id = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_remove_var_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sling_defineObjects_nobody.release();
    _jspx_tagPool_cpn_component_type_scope_id.release();
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
      // /libs/composum/nodes/browser/tabs/json.jsp(6,0) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setId("browser");
      // /libs/composum/nodes/browser/tabs/json.jsp(6,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setType("com.composum.sling.nodes.browser.Browser");
      // /libs/composum/nodes/browser/tabs/json.jsp(6,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          if (_jspx_meth_c_set_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_c_set_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    <div class=\"json detail-panel\">\n");
          out.write("        <div class=\"json-toolbar detail-toolbar\">\n");
          out.write("            <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                <div class=\"depth input-group input-group-sm widget number-field-widget\">\n");
          out.write("                    <span class=\"fa fa-level-down input-group-addon text-muted\" title=\"content depth\"></span>\n");
          out.write("                    <input type=\"text\" class=\"form-control\"/>\n");
          out.write("                    <span class=\"input-group-addon spinner\">\n");
          out.write("              <span class=\"decrement fa fa-minus\" title=\"decrement\"></span>\n");
          out.write("              <span class=\"increment fa fa-plus\" title=\"increment\"></span>\n");
          out.write("          </span>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"props btn-group btn-group-sm widget select-buttons-widget\">\n");
          out.write("                <button type=\"button\" data-value=\"source\" class=\"fa fa-sticky-note-o btn btn-default\"\n");
          out.write("                        title=\"render as JSON source\"><span class=\"label\">Source</span></button>\n");
          out.write("                <button type=\"button\" data-value=\"notype\" class=\"fa fa-times btn btn-default\"\n");
          out.write("                        title=\"no type hints in values\"><span class=\"label\">no type</span></button>\n");
          out.write("                <button type=\"button\" data-value=\"type\" class=\"fa fa-exclamation btn btn-default\"\n");
          out.write("                        title=\"type hints in values\"><span class=\"label\">no type</span></button>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"binary btn-group btn-group-sm widget select-buttons-widget\">\n");
          out.write("                <button type=\"button\" data-value=\"link\" class=\"fa fa-external-link btn btn-default\"\n");
          out.write("                        title=\"embed link to binary data\"><span class=\"label\">Link</span></button>\n");
          out.write("                <button type=\"button\" data-value=\"base64\" class=\"fa fa-plus-square btn btn-default\"\n");
          out.write("                        title=\"embed binary data base64 encoded\"><span class=\"label\">Base 64</span></button>\n");
          out.write("                <button type=\"button\" data-value=\"skip\" class=\"fa fa-minus-square-o btn btn-default\"\n");
          out.write("                        title=\"skip binary data\"><span class=\"label\">Skip</span></button>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                <div class=\"indent input-group input-group-sm widget number-field-widget\" data-options=\"0:2:4\">\n");
          out.write("                    <span class=\"fa fa-indent input-group-addon text-muted\" title=\"text indent\"></span>\n");
          out.write("                    <input type=\"text\" class=\"form-control\"/>\n");
          out.write("                    <span class=\"input-group-addon spinner\">\n");
          out.write("              <span class=\"decrement fa fa-minus\" title=\"decrement\"></span>\n");
          out.write("              <span class=\"increment fa fa-plus\" title=\"increment\"></span>\n");
          out.write("          </span>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                <button type=\"button\" class=\"copy fa fa-copy btn btn-default\" title=\"Copy JSON to clipboard\"><span\n");
          out.write("                        class=\"label\">Copy</span></button>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                <a href=\"\" class=\"download fa fa-download btn btn-default\" title=\"Download as JSON file\"><span\n");
          out.write("                        class=\"label\">Download</span></a>\n");
          out.write("                <button type=\"button\" class=\"upload fa fa-upload btn btn-default\"\n");
          out.write("                        title=\"Update from an uploaded JSON file\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${writeDisabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("><span class=\"label\">Upload</span>\n");
          out.write("                </button>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"menu btn-group btn-group-sm dropdown\" role=\"group\">\n");
          out.write("                <button type=\"button\" class=\"reload fa fa-refresh btn btn-default\" title=\"Reload JSON view\"><span\n");
          out.write("                        class=\"label\">Reload</span></button>\n");
          out.write("                <button type=\"button\" class=\"fa fa-bars btn btn-default dropdown-toggle\"\n");
          out.write("                        data-toggle=\"dropdown\" title=\"Source type...\"><span class=\"label\">Source type...</span>\n");
          out.write("                </button>\n");
          out.write("                <ul class=\"dropdown-menu dropdown-menu-right\" role=\"menu\">\n");
          out.write("                    <li class=\"active\"><a href=\"#json\" class=\"json\"\n");
          out.write("                                          title=\"Show a JSON view of the source\">JSON</a></li>\n");
          out.write("                    <li><a href=\"#xml\" class=\"xml\"\n");
          out.write("                           title=\"Show a XML view of the source\">XML</a></li>\n");
          out.write("                </ul>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("        <div class=\"embedded frame-container detail-content\">\n");
          out.write("            <iframe src=\"\" width=\"100%\" height=\"100%\" sandbox=\"\"></iframe>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    ");
          if (_jspx_meth_c_remove_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_c_remove_1(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/browser/tabs/json.jsp(7,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_set_0.setVar("writeAllowed");
    // /libs/composum/nodes/browser/tabs/json.jsp(7,4) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_set_0.setValue(new org.apache.sling.scripting.jsp.jasper.el.JspValueExpression("/libs/composum/nodes/browser/tabs/json.jsp(7,4) '${browser.permissible['nodes/repository/resources']['write']}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${browser.permissible['nodes/repository/resources']['write']}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
    // /libs/composum/nodes/browser/tabs/json.jsp(8,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_set_1.setVar("writeDisabled");
    // /libs/composum/nodes/browser/tabs/json.jsp(8,4) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_set_1.setValue(new org.apache.sling.scripting.jsp.jasper.el.JspValueExpression("/libs/composum/nodes/browser/tabs/json.jsp(8,4) '${writeAllowed?'':' disabled'}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${writeAllowed?'':' disabled'}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
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
    // /libs/composum/nodes/browser/tabs/json.jsp(76,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /libs/composum/nodes/browser/tabs/json.jsp(77,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_remove_1.setVar("writeAllowed");
    int _jspx_eval_c_remove_1 = _jspx_th_c_remove_1.doStartTag();
    if (_jspx_th_c_remove_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_1);
      return true;
    }
    _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_1);
    return false;
  }
}
