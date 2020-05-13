9
https://raw.githubusercontent.com/hvalls/vertx-asyncapi-contract/master/src/main/java/com/hvalls/vertx/asyncapi/ClasspathHelper.java
package com.hvalls.vertx.asyncapi;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;

class ClasspathHelper {

    static String loadFileFromClasspath(String location) {

        InputStream inputStream = ClasspathHelper.class.getResourceAsStream(location);

        if (inputStream == null) {
            inputStream = ClasspathHelper.class.getClassLoader().getResourceAsStream(location);
        }

        if (inputStream == null) {
            inputStream = ClassLoader.getSystemResourceAsStream(location);
        }

        if (inputStream != null) {
            try {
                return IOUtils.toString(inputStream, Charset.defaultCharset());
            } catch (IOException e) {
                throw new RuntimeException("Could not read " + location + " from the classpath", e);
            }
        }

        throw new RuntimeException("Could not find " + location + " on the classpath");
    }
}