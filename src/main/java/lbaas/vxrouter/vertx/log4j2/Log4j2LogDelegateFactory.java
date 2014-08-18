/*
 * Copyright (c) 2014 Globo.com - ATeam
 * All rights reserved.
 *
 * This source is subject to the Apache License, Version 2.0.
 * Please see the LICENSE file for more information.
 *
 * Authors: See AUTHORS file
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */
package lbaas.vxrouter.vertx.log4j2;

import org.vertx.java.core.logging.impl.LogDelegate;
import org.vertx.java.core.logging.impl.LogDelegateFactory;

public class Log4j2LogDelegateFactory implements LogDelegateFactory {

    public LogDelegate createDelegate(String name) {
        return new Log4j2LogDelegate(name);
    }

}
