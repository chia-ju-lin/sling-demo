package demo.servlet;

import org.apache.sling.servlets.annotations.SlingServletFilter;
import org.apache.sling.servlets.annotations.SlingServletFilterScope;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component(
        service = Filter.class,
        property = {
                Constants.SERVICE_RANKING + ":Integer=200"
        }
)
@SlingServletFilter(scope = { SlingServletFilterScope.REQUEST })
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code goes here if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        httpResponse.getWriter().write("pre second Filter class");

        // Continue with the filter chain for other requests
        chain.doFilter(request, response);

        httpResponse.getWriter().write("\n");
        httpResponse.getWriter().write("post chain from second Filter class");
    }

    @Override
    public void destroy() {
        // Cleanup code goes here if needed
    }
}



