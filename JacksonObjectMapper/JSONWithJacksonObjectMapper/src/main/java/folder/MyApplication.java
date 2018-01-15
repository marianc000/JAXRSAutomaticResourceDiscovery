package folder;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class MyApplication extends Application {

    /**
     * The default lifecycle for resource class instances is per-request. The
     * default lifecycle for providers is singleton.
     */
    @Override
    public Set<Class<?>> getClasses() {
        System.out.println(">getClasses()");
        return new HashSet<Class<?>>() {
            {
                add(MyResource.class);
            }
        };
    }
}
