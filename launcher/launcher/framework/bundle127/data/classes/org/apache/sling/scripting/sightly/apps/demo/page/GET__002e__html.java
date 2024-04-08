/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.demo.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class GET__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_resource = bindings.get("resource");
Collection var_collectionvar2_list_coerced$ = null;
Object _dynamic_properties = bindings.get("properties");
out.write("<!-- /*\r\n    Licensed to the Apache Software Foundation (ASF) under one\r\n    or more contributor license agreements.  See the NOTICE file\r\n    distributed with this work for additional information\r\n    regarding copyright ownership.  The ASF licenses this file\r\n    to you under the Apache License, Version 2.0 (the\r\n    \"License\"); you may not use this file except in compliance\r\n    with the License.  You may obtain a copy of the License at\r\n\r\n    http://www.apache.org/licenses/LICENSE-2.0\r\n\r\n    Unless required by applicable law or agreed to in writing,\r\n    software distributed under the License is distributed on an\r\n    \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\r\n    KIND, either express or implied.  See the License for the\r\n    specific language governing permissions and limitations\r\n    under the License.\r\n*/ -->\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n    ");
{
    Object var_includedresult0 = renderContext.call("include", "head.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult0));
}
out.write("\r\n</head>\r\n    <body>\r\n        <nav>\r\n            <a href=\"/content/demo/home.html\">Home</a>\r\n            ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_dynamic_resource, "listChildren");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index10 = 0;
                            for (Object child : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal12 = (((var_index10 >= 0) && (var_index10 <= var_end7)) && true);
                                    if (var_traversal12) {
                                        out.write("\r\n                | <a");
                                        {
                                            String var_attrcontent13 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(child, "path"), "uri")) + ".html");
                                            out.write(" href=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                                            out.write("\"");
                                        }
                                        out.write(">");
                                        {
                                            Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(child, "name"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</a>\r\n            ");
                                    }
                                }
                                var_index10++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\r\n        </nav>\r\n        <div class=\"body\">\r\n            ");
{
    Object var_includedresult15 = renderContext.call("include", "body.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult15));
}
out.write("\r\n            <div class=\"explanation\">");
{
    String var_17 = (((("\r\n                This is a standard Sling page. The title and description rendered are \r\n                taken from the resource properties. The resource currently being rendered is\r\n                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_resource, "path"), "text"))) + " and its resource type is ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "sling:resourceType"), "text"))) + " \r\n            ");
    out.write(renderContext.getObjectModel().toString(var_17));
}
out.write("</div>\r\n        </div>\r\n        <footer>\r\n            ");
{
    Object var_includedresult18 = renderContext.call("include", "footer.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult18));
}
out.write("\r\n        </footer>\r\n    </body>\r\n</html>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

