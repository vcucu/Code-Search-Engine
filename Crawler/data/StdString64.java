16
https://raw.githubusercontent.com/wmm1996528/unidbg_douyin10/master/src/main/java/com/github/unidbg/unix/struct/StdString64.java
package com.github.unidbg.unix.struct;

import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

/**
 * Note: Only compatible with libc++, though libstdc++'s std::string is a lot simpler.
 */
public class StdString64 extends StdString {

    StdString64(Pointer p) {
        super(p);
        unpack();
    }

    public byte isTiny;
    public long size;
    public Pointer value;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("isTiny", "size", "value");
    }

    @Override
    public Pointer getDataPointer() {
        boolean isTiny = (this.isTiny & 1) == 0;
        if (isTiny) {
            return getPointer().share(1);
        } else {
            return value;
        }
    }

    @Override
    public long getDataSize() {
        boolean isTiny = (this.isTiny & 1) == 0;
        if (isTiny) {
            return (this.isTiny & 0xff) >> 1;
        } else {
            return size;
        }
    }
}
