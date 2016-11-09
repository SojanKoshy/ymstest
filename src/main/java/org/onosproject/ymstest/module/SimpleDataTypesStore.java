package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypes;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypesOpParam;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Cont;

/**
 * Created by sojan on 4/9/16.
 */
public class SimpleDataTypesStore implements SimpleDataTypes {
    private Cont cont;

    @Override
    public OnosYangOpType yangSimpleDataTypesOpType() {
        return null;
    }

    @Override
    public Cont cont() {
        return cont;
    }

    public void cont(Cont cont) {
        this.cont = cont;
    }

    public void processEdit(SimpleDataTypesOpParam simpleDataTypesOpParam) {
        processContainer(simpleDataTypesOpParam, simpleDataTypesOpParam.yangSimpleDataTypesOpType());
    }

    private void processContainer(SimpleDataTypesOpParam dataTypesOpParam, OnosYangOpType onosYangOpType) {


        if (dataTypesOpParam.cont() == null) {
            return;
        }

        if (cont() != null && !(cont() instanceof
                ContainerStore)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        ContainerStore storedNode = (ContainerStore) cont();
        Cont container = dataTypesOpParam.cont();

        switch (dataTypesOpParam.cont().yangContOpType()) {
            case CREATE: {
                if (storedNode != null) {
                    throw new RuntimeException(
                            "Node: is already " +
                                    "created");
                }
                storedNode = new ContainerStore();
                cont(storedNode);
                storedNode.processEdit(container);
                return;

            }
            case DELETE: {
                if (storedNode == null) {
                    throw new RuntimeException(
                            "Node: is not in " +
                                    "store");
                }
                storedNode.processEdit(container);
                cont(null);
                return;
            }

            case REPLACE: {
                if (storedNode != null) {
                    storedNode.processEdit(container);

                }
                storedNode = new ContainerStore();
                cont(storedNode);
                storedNode.processEdit(container);
                return;
            }

            case REMOVE: {
                if (storedNode == null) {
                    return;
                }
                storedNode.processEdit(container);
                cont(storedNode);
                return;
            }
            case MERGE: {
                if (storedNode == null) {
                    storedNode = new ContainerStore();
                    cont(storedNode);
                    storedNode.processEdit(container);

                }
                storedNode.processEdit(container);
                return;
            }
            case NONE: {
                if (storedNode == null) {
                    if (container != null) {
                        storedNode = new ContainerStore();
                        cont(storedNode);
                        storedNode.processEdit(container);
                    }

                }
                storedNode.processEdit(container);
                return;
            }
            default:
        }
    }
}
