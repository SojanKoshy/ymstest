package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.model.exp1.Exp1;
import org.onosproject.yang.gen.v1.urn.model.exp1.exp1.Sample;

/**
 * Created by root1 on 21/10/16.
 */
public class Exp1Store extends Container implements Exp1{

    private Sample sample;

    public void sample(Sample sample) {
        this.sample = sample;
    }

    /**
     * Returns the attribute yangExp1OpType.
     *
     * @return yangExp1OpType value of yangExp1OpType
     */
    @Override
    public OnosYangOpType yangExp1OpType(){
        return null;
    }

    /**
     * Returns the attribute sample.
     *
     * @return sample value of sample
     */
    public Sample sample(){
        return sample;
    }
    public void processEdit(Exp1 exp1) throws Exception {
            sample((Sample)this.processContainer(exp1.sample(), exp1.sample().yangSampleOpType(), new SampleStore()));
    }

}
