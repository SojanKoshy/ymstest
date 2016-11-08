package org.onosproject.ymstest.module;

import org.onosproject.event.ListenerRegistry;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.MultiNotification;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.MultiNotificationOpParam;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.MultiNotificationService;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification.DefaultLinkDown;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification.LinkDown;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification.MultiNotificationEvent;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification.MultiNotificationEventListener;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification.MultiNotificationEventSubject;

/**
 * Created by sojan on 3/9/16.
 */
public class MultiNotificationManger extends ListenerRegistry<MultiNotificationEvent, MultiNotificationEventListener>
        implements MultiNotificationService {
    private MultiNotificationEventSubject subject;

    public MultiNotificationEventSubject getSubject() {
        return subject;
    }

    public void setSubject(MultiNotificationEventSubject subject) {
        this.subject = subject;
    }

    @Override
    public MultiNotification getMultiNotification(MultiNotificationOpParam multiNotification) {
        System.out.println("MultiNotificationManger getMultiNotification");
        return null;
    }

    @Override
    public void setMultiNotification(MultiNotificationOpParam multiNotification) {
        System.out.println("MultiNotificationManger setMultiNotification");
    }

    public void sendNotification() {
        this.setSubject(new MultiNotificationEventSubject());
        LinkDown linkDown = new DefaultLinkDown.LinkDownBuilder().build();
        subject.linkDown(linkDown);

        process(new MultiNotificationEvent(MultiNotificationEvent.Type.LINKDOWN, subject));
    }
}

