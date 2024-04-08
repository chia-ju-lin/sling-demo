package org.apache.jsp.libs.composum.nodes.browser.dialogs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class access__002d__policy__002d__entry__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_component_type_scope_id;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _jspx_tagPool_cpn_form_enctype_classes_action;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_cpn_component_type_scope_id = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cpn_form_enctype_classes_action = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  cpn:component
      com.composum.sling.cpnl.ComponentTag _jspx_th_cpn_component_0 = (com.composum.sling.cpnl.ComponentTag) _jspx_tagPool_cpn_component_type_scope_id.get(com.composum.sling.cpnl.ComponentTag.class);
      _jspx_th_cpn_component_0.setPageContext(_jspx_page_context);
      _jspx_th_cpn_component_0.setParent(null);
      // /libs/composum/nodes/browser/dialogs/access-policy-entry.jsp(4,0) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setId("browser");
      // /libs/composum/nodes/browser/dialogs/access-policy-entry.jsp(4,0) name = type type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_component_0.setType("com.composum.sling.nodes.browser.Browser");
      // /libs/composum/nodes/browser/dialogs/access-policy-entry.jsp(4,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("  <div id=\"access-policy-entry-dialog\" class=\"add access-entry dialog modal fade\"\n");
          out.write("       tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
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

  private boolean _jspx_meth_cpn_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_component_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cpn:form
    com.composum.sling.cpnl.FormTag _jspx_th_cpn_form_0 = (com.composum.sling.cpnl.FormTag) _jspx_tagPool_cpn_form_enctype_classes_action.get(com.composum.sling.cpnl.FormTag.class);
    _jspx_th_cpn_form_0.setPageContext(_jspx_page_context);
    _jspx_th_cpn_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_component_0);
    // /libs/composum/nodes/browser/dialogs/access-policy-entry.jsp(10,8) name = classes type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_form_0.setClasses("widget-form default");
    // /libs/composum/nodes/browser/dialogs/access-policy-entry.jsp(10,8) name = enctype type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_form_0.setEnctype("multipart/form-data");
    // /libs/composum/nodes/browser/dialogs/access-policy-entry.jsp(10,8) name = action type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cpn_form_0.setAction((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("/bin/cpm/core/system.accessPolicy.json${browser.current.pathEncoded}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
        out.write("            <h4 class=\"modal-title\">Add Access Policy Entry</h4>\n");
        out.write("          </div>\n");
        out.write("\n");
        out.write("          <div class=\"modal-body\">\n");
        out.write("            <div class=\"messages\">\n");
        out.write("              <div class=\"alert\"></div>\n");
        out.write("            </div>\n");
        out.write("            <input name=\"path\" type=\"hidden\">\n");
        out.write("            <div class=\"form-group principal\">\n");
        out.write("              <label class=\"control-label\">Principal</label>\n");
        out.write("              <input name=\"principal\" class=\"widget text-widget form-control\" type=\"text\">\n");
        out.write("            </div>\n");
        out.write("            <div class=\"form-group rule\">\n");
        out.write("              <div class=\"widget radio-group-widget form-control\">\n");
        out.write("                <div class=\"radio-inline allow\"><label><input type=\"radio\" name=\"rule\" value=\"allow\">Allow</label></div>\n");
        out.write("                <div class=\"radio-inline deny\"><label><input type=\"radio\" name=\"rule\" value=\"deny\">Deny</label></div>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"privileges widget multi-form-widget form-group\" data-name=\"privileges\">\n");
        out.write("              <label class=\"control-label\">Privileges</label>\n");
        out.write("              <div class=\"multi-form-content\">\n");
        out.write("                <div class=\"multi-form-item\">\n");
        out.write("                  <select name=\"privilege\" class=\"widget select-widget form-control\">\n");
        out.write("                  </select>\n");
        out.write("                </div>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"restrictions widget multi-form-widget form-group\" data-name=\"restrictions\">\n");
        out.write("              <label class=\"control-label\">Restrictions</label>\n");
        out.write("              <div class=\"multi-form-content\">\n");
        out.write("                <div class=\"multi-form-item\">\n");
        out.write("                  <select name=\"restrictionKey\" class=\"key widget select-widget form-control\">\n");
        out.write("                    ");
        out.write("\n");
        out.write("                    ");
        out.write("\n");
        out.write("                    ");
        out.write("\n");
        out.write("                  </select>\n");
        out.write("                  <input name=\"restrictionValue\" class=\"value widget text-widget form-control\" type=\"text\">\n");
        out.write("                </div>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("          </div>\n");
        out.write("\n");
        out.write("          <div class=\"modal-footer buttons\">\n");
        out.write("            <button type=\"button\" class=\"btn btn-default cancel\" data-dismiss=\"modal\">Cancel</button>\n");
        out.write("            <button type=\"button\" class=\"btn btn-primary save\">Save</button>\n");
        out.write("          </div>\n");
        out.write("\n");
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
