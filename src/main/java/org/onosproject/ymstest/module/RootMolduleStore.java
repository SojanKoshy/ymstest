package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.root.module.RootModule;
import org.onosproject.yang.gen.v1.root.module.rootmodule.Container;

/**
 * Created by root1 on 9/11/16.
 */
public class RootMolduleStore implements RootModule {

    private Container container;

    public void container(Container container) {
        this.container = container;
    }


    /**
     * Returns the attribute yangRootModuleOpType.
     *
     * @return yangRootModuleOpType value of yangRootModuleOpType
     */
    public OnosYangOpType yangRootModuleOpType() {
        return null;
    }

    /**
     * Returns the attribute container.
     *
     * @return container value of container
     */
    public Container container() {
        return container;
    }

    public void processEdit(RootModule rootModule) {
        processContainer(rootModule, rootModule.container().yangContainerOpType());
    }

    private void processContainer(
            RootModule rootModule, RootModule.OnosYangOpType
            onosYangNodeOperationType) {
        if (rootModule.container() == null) {
            return;
        }

        if (container() != null && !(container() instanceof
                RootConatinerStore)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        RootConatinerStore rootConatinerStore
                = (RootConatinerStore) container();
        Container container = rootModule.container();

        switch (rootModule.container().yangContainerOpType()) {
            case CREATE: {
                if (rootConatinerStore != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                rootConatinerStore = new RootConatinerStore();
                container(rootConatinerStore);
                rootConatinerStore.processEdit(container);
                return;
            }
            case DELETE: {
                if (rootConatinerStore == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                rootConatinerStore.processEdit(container);
                container(null);
                return;
            }

            case REPLACE: {
                if (rootConatinerStore != null) {
                    rootConatinerStore.processEdit(container);
                    return;
                }
                rootConatinerStore = new RootConatinerStore();
                container(rootConatinerStore);
                rootConatinerStore.processEdit(container);
                return;
            }

            case REMOVE: {
                if (rootConatinerStore == null) {
                    return;
                }
                rootConatinerStore.processEdit(container);
                container(null);
                return;
            }
            case MERGE: {
                if (rootConatinerStore == null) {
                    rootConatinerStore = new RootConatinerStore();
                    container(rootConatinerStore);
                    rootConatinerStore.processEdit(container);
                    return;
                }
                rootConatinerStore.processEdit(container);
                return;
            }
            case NONE: {
                if (rootConatinerStore == null) {
                    if (container != null) {
                        rootConatinerStore = new RootConatinerStore();
                        container(rootConatinerStore);
                        rootConatinerStore
                                .processEdit(container);
                    }
                    return;
                }
                rootConatinerStore.processEdit(container);
                return;
            }
            default:
        }
    }
}
