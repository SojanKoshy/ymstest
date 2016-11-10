package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.IdentityRef;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.IdentityRefOpParam;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.C;

/**
 * Created by root1 on 10/11/16.
 */
public class IdentityRefStore implements IdentityRef {

    private C c;

    public void c(C c) {
        this.c = c;
    }

    /**
     * Returns the attribute yangIdentityRefOpType.
     *
     * @return yangIdentityRefOpType value of yangIdentityRefOpType
     */
    public OnosYangOpType yangIdentityRefOpType() {
        return null;
    }

    /**
     * Returns the attribute c.
     *
     * @return c value of c
     */
    public C c() {
        return c;
    }

    public void processEdit(IdentityRefOpParam identityRefOpParam) {
        processC(identityRefOpParam, identityRefOpParam.yangIdentityRefOpType());
        System.out.println("yangIdentityRefOpType" +
                identityRefOpParam.yangIdentityRefOpType().toString());

    }

    private void processC(IdentityRefOpParam identityRef, OnosYangOpType onosYangOpType) {


        if (identityRef.c() == null) {
            return;
        }

        if (c() != null && !(c() instanceof
                CStore)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        CStore storedNode = (CStore) c();
        C container = identityRef.c();
        switch (identityRef.c().yangCOpType()) {
            case CREATE: {
                if (storedNode != null) {
                    throw new RuntimeException(
                            "Node: is already " +
                                    "created");
                }
                storedNode = new CStore();
                c(storedNode);
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
                c(null);
                return;
            }

            case REPLACE: {
                if (storedNode != null) {
                    storedNode.processEdit(container);

                }
                storedNode = new CStore();
                c(storedNode);
                storedNode.processEdit(container);
                return;
            }

            case REMOVE: {
                if (storedNode == null) {
                    return;
                }
                storedNode.processEdit(container);
                c(storedNode);
                return;
            }
            case MERGE: {
                if (storedNode == null) {
                    storedNode = new CStore();
                    c(storedNode);
                    storedNode.processEdit(container);

                }
                storedNode.processEdit(container);
                return;
            }
            case NONE: {
                if (storedNode == null) {
                    if (container != null) {
                        storedNode = new CStore();
                        c(storedNode);
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
