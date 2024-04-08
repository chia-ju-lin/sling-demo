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
package org.apache.sling.scripting.sightly.apps.demo.component1;

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

Object _dynamic_properties = bindings.get("properties");
{
    String var_0 = (("<!-- /*\r\n    Licensed to the Apache Software Foundation (ASF) under one\r\n    or more contributor license agreements.  See the NOTICE file\r\n    distributed with this work for additional information\r\n    regarding copyright ownership.  The ASF licenses this file\r\n    to you under the Apache License, Version 2.0 (the\r\n    \"License\"); you may not use this file except in compliance\r\n    with the License.  You may obtain a copy of the License at\r\n\r\n    http://www.apache.org/licenses/LICENSE-2.0\r\n\r\n    Unless required by applicable law or agreed to in writing,\r\n    software distributed under the License is distributed on an\r\n    \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\r\n    KIND, either express or implied.  See the License for the\r\n    specific language governing permissions and limitations\r\n    under the License.\r\n    \r\n    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "richText"), "unsafe"))) + "\r\n*/ -->");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("\r\n<p>component 1</p>\r\n<p>rendered by get.html</p>\r\n<h2>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "jcr:title"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h2>");
{
    String var_2 = (("\r\n\r\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "richText"), "html"))) + "\r\n");
    out.write(renderContext.getObjectModel().toString(var_2));
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

