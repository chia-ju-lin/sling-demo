package org.apache.jsp.libs.composum.nodes.console.dialogs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class node__002d__create__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_form_enctype_classes_action;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sling_defineObjects_nobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cpn_component_type_scope_id = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cpn_form_enctype_classes_action = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sling_defineObjects_nobody.release();
    _jspx_tagPool_cpn_component_type_scope_id.release();
    _jspx_tagPool_cpn_form_enctype_classes_action.release();
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
      // /libs/composum/nodes/console/dialogs/node-create.jsp(6,0) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setId("browser");
      // /libs/composum/nodes/console/dialogs/node-create.jsp(6,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setType("com.composum.sling.nodes.browser.Browser");
      // /libs/composum/nodes/console/dialogs/node-create.jsp(6,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("  <div id=\"node-create-dialog\" class=\"dialog modal fade\" role=\"dialog\" aria-hidden=\"true\">\n");
          out.write("    <div class=\"modal-dialog\">\n");
          out.write("      <div class=\"modal-content form-panel default\">\n");
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_cpn_form_0(_jspx_th_cpn_component_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("      </div>\n");
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

  private boolean _jspx_meth_cpn_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:form
    com.composum.sling.cpnl.FormTag _jspx_th_cpn_form_0 = (com.composum.sling.cpnl.FormTag) _jspx_tagPool_cpn_form_enctype_classes_action.get(com.composum.sling.cpnl.FormTag.class);
    _jspx_th_cpn_form_0.setPageContext(_jspx_page_context);
    _jspx_th_cpn_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/console/dialogs/node-create.jsp(11,8) name = classes type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_form_0.setClasses("widget-form");
    // /libs/composum/nodes/console/dialogs/node-create.jsp(11,8) name = enctype type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_form_0.setEnctype("multipart/form-data");
    // /libs/composum/nodes/console/dialogs/node-create.jsp(11,8) name = action type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_form_0.setAction("/bin/cpm/nodes/node.create.json");
    int _jspx_eval_cpn_form_0 = _jspx_th_cpn_form_0.doStartTag();
    if (_jspx_eval_cpn_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cpn_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cpn_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cpn_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("          <div class=\"modal-header\">\n");
        out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span\n");
        out.write("                aria-hidden=\"true\">&times;</span></button>\n");
        out.write("            <h4 class=\"modal-title\">Create New Node</h4>\n");
        out.write("          </div>\n");
        out.write("          <div class=\"modal-body\">\n");
        out.write("            <div class=\"messages\">\n");
        out.write("              <div class=\"alert\"></div>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("            <input name=\"_charset_\" type=\"hidden\" value=\"UTF-8\" />\n");
        out.write("            <div class=\"form-group\">\n");
        out.write("              <label class=\"control-label\">Parent Path</label>\n");
        out.write("              <div class=\"path input-group widget path-widget\" data-rules=\"mandatory\">\n");
        out.write("                <input name=\"path\" class=\"form-control\" type=\"text\" />\n");
        out.write("                <span class=\"input-group-btn\">\n");
        out.write("                  <button class=\"select btn btn-default\" type=\"button\" title=\"Select Repository Path\">...</button>\n");
        out.write("                </span>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group\">\n");
        out.write("              <label class=\"control-label\">Primary Type</label>\n");
        out.write("              <input name=\"type\" class=\"widget primary-type-widget form-control\" type=\"text\"\n");
        out.write("                     placeholder=\"enter primary type\" autofocus data-rules=\"mandatory\" />\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group\">\n");
        out.write("              <label class=\"control-label\">New Node Name</label>\n");
        out.write("              <input name=\"name\" class=\"widget text-field-widget form-control\" type=\"text\"\n");
        out.write("                     placeholder=\"enter node name\" data-rules=\"mandatory\" />\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group default sling\">\n");
        out.write("              <label class=\"control-label\">Title <span>('jcr:title'; optional)</span></label>\n");
        out.write("              <input name=\"title\" class=\"widget text-field-widget form-control\" type=\"text\"\n");
        out.write("                     placeholder=\"enter the title of the new node\" />\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group sling\">\n");
        out.write("              <label class=\"control-label\">Sling Resource Type <span>(optional)</span></label>\n");
        out.write("              <input name=\"resourceType\" class=\"widget text-field-widget form-control\" type=\"text\"\n");
        out.write("                     placeholder=\"enter the Sling resource type if useful\" />\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group index\">\n");
        out.write("              <label class=\"control-label\">Index Type (property | ordered)</label>\n");
        out.write("              <input name=\"indexType\" class=\"widget text-field-widget form-control\" type=\"text\"\n");
        out.write("                     placeholder=\"enter the type of index\" />\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group linked\">\n");
        out.write("              <label class=\"control-label\">Linked File Path</label>\n");
        out.write("              <div class=\"path input-group widget path-widget\" data-filter=\"referenceable\">\n");
        out.write("                <input name=\"jcrContent\" class=\"form-control\" type=\"text\" />\n");
        out.write("                <span class=\"input-group-btn\">\n");
        out.write("                  <button class=\"select btn btn-default\" type=\"button\" title=\"Select Repository Path\">...</button>\n");
        out.write("                </span>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group binary\">\n");
        out.write("              <label class=\"control-label\">Mime Type</label>\n");
        out.write("              <input name=\"mimeType\" type=\"text\" class=\"form-control\" />\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group binary\">\n");
        out.write("              <label class=\"control-label\">Upload File</label>\n");
        out.write("              <input name=\"file\" class=\"widget file-upload-widget form-control\" type=\"file\"\n");
        out.write("                     data-options=\"hidePreview\"/>\n");
        out.write("            </div>\n");
        out.write("          </div>\n");
        out.write("\n");
        out.write("          <div class=\"modal-footer buttons\">\n");
        out.write("            <button type=\"button\" class=\"btn btn-default cancel\" data-dismiss=\"modal\">Cancel</button>\n");
        out.write("            <button type=\"submit\" class=\"btn btn-primary create\">Create</button>\n");
        out.write("          </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_cpn_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cpn_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cpn_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_cpn_form_enctype_classes_action.reuse(_jspx_th_cpn_form_0);
      return true;
    }
    _jspx_tagPool_cpn_form_enctype_classes_action.reuse(_jspx_th_cpn_form_0);
    return false;
  }
}
