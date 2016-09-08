package org.onosproject.ymstest.module;

import org.onosproject.yms.ynh.YangNotificationEvent;
import org.onosproject.yms.ynh.YangNotificationListener;

/**
 * Created by sojan on 5/9/16.
 */
public class LinkListener implements YangNotificationListener {

    @Override
    public void event(YangNotificationEvent event) {
        System.out.println("\n***** Received notification by LinkListener ******");
        System.out.println(event.subject().getNotificationRootContext().getName());
    }
}
