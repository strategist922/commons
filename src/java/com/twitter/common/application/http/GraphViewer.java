// =================================================================================================
// Copyright 2011 Twitter, Inc.
// -------------------------------------------------------------------------------------------------
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this work except in compliance with the License.
// You may obtain a copy of the License in the LICENSE file, or at:
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// =================================================================================================

package com.twitter.common.application.http;

import com.google.inject.Binder;

/**
 * A utility class to register the file resources for the graph viewer.
 *
 * @author William Farner
 */
public final class GraphViewer {

  private GraphViewer() {
    // Utility class.
  }

  /**
   * Registers required resources with the binder.
   *
   * @param binder Binder to register with.
   */
  public static void registerResources(Binder binder) {
    Registration.registerHttpAsset(binder, "/graphview/dygraph-combined.js", GraphViewer.class,
        "dygraph-combined.js", "application/javascript", true);
    Registration.registerHttpAsset(binder,
        "/graphview", GraphViewer.class, "graphview.html", "text/html", false);
  }
}
