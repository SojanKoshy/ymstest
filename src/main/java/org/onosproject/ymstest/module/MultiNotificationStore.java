package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.MultiNotification;

/**
 * Created by sojan on 8/9/16.
 */
public class MultiNotificationStore implements MultiNotification {
    @Override
    public MultiNotification processSubtreeFiltering(MultiNotification multiNotification,
                                                     boolean isSelectAllSchemaChild) {
        System.out.println("MultiNotificationStore:processSubtreeFiltering");
        return null;
    }
}
