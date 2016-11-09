package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.augment1.Augment1;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.Interfaces;


/**
 * Created by root1 on 12/10/16.
 */
public class Agument1Store implements Augment1 {
    protected Augment1.OnosYangOpType onosYangOpType;
    private Interfaces interfaces;

    /**
     * Returns the attribute yangAugment1OpType.
     *
     * @return yangAugment1OpType value of yangAugment1OpType
     */
    @Override
    public OnosYangOpType yangAugment1OpType() {
        return onosYangOpType;
    }

    /**
     * Returns the attribute interfaces.
     *
     * @return interfaces value of interfaces
     */
    @Override
    public Interfaces interfaces() {
        return interfaces;
    }

    public void interfaces(Interfaces interfaces) {
        this.interfaces = interfaces;
    }

    /**
     * Checks if the passed Augment1 maps the content match query condition.
     */
   /* @Override
    public Augment1 processSubtreeFiltering(Augment1 augment1, boolean isSelectAllSchemaChild){
        return null;
    }*/
    public void processEdit(
            Augment1 nodePara) {
        if (nodePara.interfaces() == null) {
            return;
        }

        if (interfaces() != null && !(interfaces() instanceof
                InterfacesContainerStore)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        InterfacesContainerStore interfacesStore
                = (InterfacesContainerStore) interfaces();
        Interfaces terminationPointsPara = nodePara.interfaces();

        switch (nodePara.yangAugment1OpType()) {
            case CREATE: {
                interfacesStore = new InterfacesContainerStore();
                interfaces(interfacesStore);
                interfacesStore.processEdit(terminationPointsPara);
                return;
            }
            case DELETE: {
                if (interfacesStore == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                interfacesStore.processEdit(terminationPointsPara);
                interfaces(null);
                return;
            }

            case REPLACE: {
                if (interfacesStore != null) {
                    interfacesStore.processEdit(terminationPointsPara);
                    return;
                }
                interfacesStore = new InterfacesContainerStore();
                interfaces(interfacesStore);
                interfacesStore.processEdit(terminationPointsPara);
                return;
            }

            case REMOVE: {
                if (interfacesStore == null) {
                    return;
                }
                interfacesStore.processEdit(terminationPointsPara);
                interfaces(null);
                return;
            }
            case MERGE: {
                if (interfacesStore == null) {
                    interfacesStore = new InterfacesContainerStore();
                    interfaces(interfacesStore);
                    interfacesStore.processEdit(terminationPointsPara);
                    return;
                }
                interfacesStore.processEdit(terminationPointsPara);
                return;
            }
            case NONE: {
                if (interfacesStore == null) {
                    if (terminationPointsPara != null) {
                        interfacesStore = new InterfacesContainerStore();
                        interfaces(interfacesStore);
                        interfacesStore
                                .processEdit(terminationPointsPara);
                    }
                    return;
                }
                interfacesStore.processEdit(terminationPointsPara);
                return;
            }
            default:
        }
    }
}
