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
/**
 * Represents the implementation of multiNotificationEventSubject.
 */
public class MultiNotificationEventSubject {

    protected LinkDown linkDown;
    protected LinkUp linkUp;

    /**
     * Returns the attribute linkDown.
     *
     * @return value of linkDown
     */
    public LinkDown linkDown() {
        return linkDown;
    }

    /**
     * Returns the attribute linkUp.
     *
     * @return value of linkUp
     */
    public LinkUp linkUp() {
        return linkUp;
    }

    /**
     * Sets the value to attribute linkDown.
     *
     * @param linkDown value of linkDown
     */
    public void linkDown(LinkDown linkDown) {
        this.linkDown = linkDown;
    }

    /**
     * Sets the value to attribute linkUp.
     *
     * @param linkUp value of linkUp
     */
    public void linkUp(LinkUp linkUp) {
        this.linkUp = linkUp;
    }
}
