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

package org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826;

import org.onosproject.event.ListenerService;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification
            .MultiNotificationEvent;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification
            .MultiNotificationEventListener;

/**
 * Abstraction of an entity which represents the functionality of multiNotificationService.
 */
public interface MultiNotificationService
        extends ListenerService<MultiNotificationEvent, MultiNotificationEventListener> {

    /**
     * Returns the attribute MultiNotification.
     *
     * @param multiNotification value of MultiNotification
     * @return value of MultiNotification
     */
    MultiNotification getMultiNotification(MultiNotificationOpParam multiNotification);

    /**
     * Sets the value to attribute multiNotification.
     *
     * @param multiNotification value of multiNotification
     */
    void setMultiNotification(MultiNotificationOpParam multiNotification);

}
