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
package org.apache.sling.scripting.sightly.apps.demo.home;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class head__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<!-- /*\r\n    Licensed to the Apache Software Foundation (ASF) under one\r\n    or more contributor license agreements.  See the NOTICE file\r\n    distributed with this work for additional information\r\n    regarding copyright ownership.  The ASF licenses this file\r\n    to you under the Apache License, Version 2.0 (the\r\n    \"License\"); you may not use this file except in compliance\r\n    with the License.  You may obtain a copy of the License at\r\n\r\n    http://www.apache.org/licenses/LICENSE-2.0\r\n\r\n    Unless required by applicable law or agreed to in writing,\r\n    software distributed under the License is distributed on an\r\n    \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\r\n    KIND, either express or implied.  See the License for the\r\n    specific language governing permissions and limitations\r\n    under the License.\r\n*/ -->\r\n<meta charset=\"utf-8\"/>\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"/>\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\r\n<title>demo Home Page</title>\r\n<link rel=\"stylesheet\" href=\"/content/demo/static/styles.css\"/>\r\n");
{
    String var_0 = (("<!-- " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "jcr:title"), "comment"))) + " -->");
    out.write(renderContext.getObjectModel().toString(var_0));
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

