package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.rob.sh.yang.test.union.rev20140101.Union;
import org.onosproject.yang.gen.v1.http.rob.sh.yang.test.union.rev20140101.union.Container;

/**
 * Created by root1 on 25/10/16.
 */
public class UnionStore implements Union {


    private Container container;

    public void container(Container container) {
        this.container = container;
    }

    /**
     * Returns the attribute yangUnionOpType.
     *
     * @return yangUnionOpType value of yangUnionOpType
     */
    public OnosYangOpType yangUnionOpType() {
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

    public void processEdit(Union union) {
        processContainer(union, union.container().yangContainerOpType());
    }

    private void processContainer(
            Union union, Union.OnosYangOpType
            onosYangNodeOperationType) {
        if (union.container() == null) {
            return;
        }

        if (container() != null && !(container() instanceof
                UcontainerStore)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        UcontainerStore ucontainerStore
                = (UcontainerStore) container();
        Container container = union.container();

        switch (union.container().yangContainerOpType()) {
            case CREATE: {
                if (ucontainerStore != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                ucontainerStore = new UcontainerStore();
                container(ucontainerStore);
                ucontainerStore.processEdit(container);
                return;
            }
            case DELETE: {
                if (ucontainerStore == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                ucontainerStore.processEdit(container);
                container(null);
                return;
            }

            case REPLACE: {
                if (ucontainerStore != null) {
                    ucontainerStore.processEdit(container);
                    return;
                }
                ucontainerStore = new UcontainerStore();
                container(ucontainerStore);
                ucontainerStore.processEdit(container);
                return;
            }

            case REMOVE: {
                if (ucontainerStore == null) {
                    return;
                }
                ucontainerStore.processEdit(container);
                container(null);
                return;
            }
            case MERGE: {
                if (ucontainerStore == null) {
                    ucontainerStore = new UcontainerStore();
                    container(ucontainerStore);
                    ucontainerStore.processEdit(container);
                    return;
                }
                ucontainerStore.processEdit(container);
                return;
            }
            case NONE: {
                if (ucontainerStore == null) {
                    if (container != null) {
                        ucontainerStore = new UcontainerStore();
                        container(ucontainerStore);
                        ucontainerStore
                                .processEdit(container);
                    }
                    return;
                }
                ucontainerStore.processEdit(container);
                return;
            }
            default:
        }
    }
}
