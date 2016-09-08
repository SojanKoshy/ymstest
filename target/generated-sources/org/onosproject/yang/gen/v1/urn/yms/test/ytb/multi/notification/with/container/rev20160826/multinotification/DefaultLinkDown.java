/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification
            .linkdown.Router;

/**
 * Represents the implementation of linkDown.
 */
public class DefaultLinkDown implements LinkDown {

    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected OnosYangNodeOperationType onosYangNodeOperationType;
    protected Router router;

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public Router router() {
        return router;
    }

    @Override
    public int hashCode() {
        return Objects.hash(onosYangNodeOperationType, router);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultLinkDown) {
            DefaultLinkDown other = (DefaultLinkDown) obj;
            return
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType) &&
                 Objects.equals(router, other.router);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .add("router", router)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    /**
     * Creates an instance of linkDown.
     *
     * @param builderObject builder object of linkDown
     */
    protected DefaultLinkDown(LinkDownBuilder builderObject) {
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.router = builderObject.router();
        this.yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    @Override
    public LinkDown processSubtreeFiltering(LinkDown appInstance, boolean isSelectAllSchemaChild) {
        LinkDownBuilder subTreeFilteringResultBuilder = new LinkDownBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processChildNodesSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        for (Object yangAugmentedInfo : this.yangAugmentedInfoMap().values()) {
            Object yangAugmentedOpParamInfo = appInstance.yangAugmentedInfo(yangAugmentedInfo.getClass());
            Object processSubtreeFiltering;
            try {
                Class<?>[] interfaces = yangAugmentedInfo.getClass().getInterfaces();
                processSubtreeFiltering = yangAugmentedInfo.getClass()
                    .getMethod("processSubtreeFiltering", interfaces[0]).invoke(yangAugmentedInfo,
                        yangAugmentedOpParamInfo);
                if (processSubtreeFiltering != null) {
                    subTreeFilteringResultBuilder
            .addYangAugmentedInfo(processSubtreeFiltering, processSubtreeFiltering.getClass());
                }
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                continue;
            }
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode) {
            return processSubtreeFiltering(appInstance, true);
        }
        return subTreeFilteringResultBuilder.build();
    }
    private boolean processChildNodesSubTreeFiltering(LinkDown appInstance, LinkDownBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (router()  != null) {
            isAnySelectOrContainmentNode = true;
            if (appInstance.router() != null) {
                Router result = router.processSubtreeFiltering(appInstance.router(), false);
                if (result != null) {
                    subTreeFilteringResultBuilder.router(result);
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultLinkDown.
     */
    protected DefaultLinkDown() {
    }

    /**
     * Returns the attribute LinkDownBuilder.
     *
     * @return value of LinkDownBuilder
     */
    public static LinkDownBuilder builder() {
        return new LinkDownBuilder();
    }


    /**
     * Represents the builder implementation of linkDown.
     */
    public static class LinkDownBuilder implements LinkDown.LinkDownBuilder {

        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected OnosYangNodeOperationType onosYangNodeOperationType;
        protected Router router;


        @Override
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        @Override
        public Router router() {
            return router;
        }

        @Override
        public LinkDownBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        @Override
        public LinkDownBuilder router(Router router) {
            this.router = router;
            return this;
        }

        @Override
        public void addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }

        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }
        @Override
        public LinkDown build() {
            return new DefaultLinkDown(this);
        }

        /**
         * Creates an instance of linkDownBuilder.
         */
        public LinkDownBuilder() {
        }
    }
}
