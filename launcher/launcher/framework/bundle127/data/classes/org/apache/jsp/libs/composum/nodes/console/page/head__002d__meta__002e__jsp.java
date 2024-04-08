package org.apache.jsp.libs.composum.nodes.console.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head__002d__meta__002e__jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("  <meta charset=\"UTF-8\"/>\n");
      out.write("  <!-- disable caching -->\n");
      out.write("  <meta http-equiv=\"Cache-Control\" content=\"no-cache, no-store, must-revalidate\"/>\n");
      out.write("  <meta http-equiv=\"Pragma\" content=\"no-cache\"/>\n");
      out.write("  <meta http-equiv=\"Expires\" content=\"0\"/>\n");
      out.write("  <!-- responsive viewport -->\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1, maximum-scale=1, user-scalable=no\"/>\n");
      out.write("  <!-- full screen application mode -->\n");
      out.write("  <meta name=\"mobile-web-app-capable\" content=\"yes\"/>\n");
      out.write("  <meta name=\"apple-mobile-web-app-capable\" content=\"yes\"/>\n");
      out.write("  <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black-translucent\"/>\n");
      out.write("  <!-- switch of auto link for phone numbers -->\n");
      out.write("  <meta name=\"format-detection\" content=\"telephone=no\"/>\n");
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
