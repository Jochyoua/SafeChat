package studio.thevipershow.safechat.api.checks;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckPriority {
    Priority priority() default Priority.NORMAL;

    enum Priority {
        LOW((byte) 0x00), NORMAL((byte) 0x01), HIGH((byte) 0x02);

        public final byte v;

        Priority(byte v) {
            this.v = v;
        }
    }
}
