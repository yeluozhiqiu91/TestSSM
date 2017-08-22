import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

import java.lang.annotation.Annotation;
import java.util.Collection;

/**
 * Created by wang on 2017/8/22.
 */
public class IgnoreStrategy implements ExclusionStrategy {
    @Override
    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        Collection<Annotation> annotations=fieldAttributes.getAnnotations();
        for(Annotation annotation:annotations){
            if(annotation.annotationType()==Ignore.class){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
        return false;
    }
}
