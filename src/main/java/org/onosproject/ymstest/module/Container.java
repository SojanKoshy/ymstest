package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.model.exp1.Exp1;

import java.lang.reflect.Method;

/**
 * Created by root1 on 18/10/16.
 */
public class Container {

    private Object containerStore;

    public Object containerStore() {
        return containerStore;
    }

    public void containerStore(Object containerStore) {
        this.containerStore = containerStore;
    }


    public Object processContainer(Object containerObject, Exp1.OnosYangOpType containerOpType,
                                   Object containerStoreTypeObject) throws Exception {
        if (containerObject == null) {
            return containerStore();
        }
        Class<?>[] interfaces = containerStoreTypeObject.getClass().getInterfaces();
        Method method = containerStoreTypeObject.getClass().getDeclaredMethod("processEdit", interfaces[0]);
        switch (containerOpType) {
            case CREATE: {
                if (containerStore != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                containerStore(containerObject);
                method.invoke(containerStoreTypeObject, containerStore);
                return containerStore();
            }
            case DELETE: {
                if (containerStore == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                method.invoke(containerStoreTypeObject, containerStore);
                containerStore(null);
                return containerStore();
            }

            case REPLACE: {
                if (containerStore != null) {
                    method.invoke(containerStoreTypeObject, containerStore);
                    return containerStore();
                }
                containerStore = containerStoreTypeObject;
                containerStore(containerStore);
                method.invoke(containerStoreTypeObject, containerStore);
                return containerStore();
            }

            case REMOVE: {
                if (containerStore == null) {
                    return containerStore();
                }
                method.invoke(containerStoreTypeObject, containerStore);
                containerStore(null);
                return containerStore();
            }
            case MERGE: {
                if (containerStore == null) {
                    containerStore = containerStoreTypeObject;
                    containerStore(containerStore);
                    method.invoke(containerStoreTypeObject, containerStore);
                    return containerStore();
                }
                method.invoke(containerStoreTypeObject, containerStore);
                return containerStore();
            }
            case NONE: {
                if (containerStore == null) {
                    if (containerObject != null) {
                        containerStore = containerStoreTypeObject;
                        containerStore(containerStore);
                        method.invoke(containerStoreTypeObject, containerStore);
                    }
                    return containerStore();
                }
                method.invoke(containerStoreTypeObject, containerStore);
                return containerStore();
            }
            default:
        }
        return containerStore();
    }
}
