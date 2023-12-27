package com.example.demo.importer;

import com.example.demo.bean.LocalServicempl;
import com.example.demo.bean.RedisServicempl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.text.MessageFormat;
import java.util.Map;

public class MyCacheSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableMyCache.class.getName());
        CacheType type = (CacheType) annotationAttributes.get("type");
        switch (type) {
            case LOCAL: {
                return new String[]{LocalServicempl.class.getName()};
            }
            case REDIS: {
                return new String[]{RedisServicempl.class.getName()};
            }
            default: {
                throw new RuntimeException(MessageFormat.format("unsupport cache type {0}", type.toString()));
            }
        }
    }
}
