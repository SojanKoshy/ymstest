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

package org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology;

import org.onosproject.event.AbstractEvent;

/**
 * Represents event implementation of topologyEvent.
 */
public class TopologyEvent extends AbstractEvent<TopologyEvent.Type, TopologyEventSubject> {

    public enum Type {
        /**
         * Represents node-limit-reached.
         */
        NODE_LIMIT_REACHED
    }

    /**
     * Creates TopologyEventSubject event with type and subject.
     *
     * @param type event type
     * @param subject subject TopologyEventSubject
     */
    public TopologyEvent(Type type, TopologyEventSubject subject) {
        super(type, subject);
    }

    /**
     * Creates TopologyEventSubject event with type, subject and time.
     *
     * @param type event type
     * @param subject subject TopologyEventSubject
     * @param time time of event
     */
    public TopologyEvent(Type type, TopologyEventSubject subject, long time) {
        super(type, subject, time);
    }

}
