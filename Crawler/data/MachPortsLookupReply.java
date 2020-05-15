16
https://raw.githubusercontent.com/wmm1996528/unidbg_douyin10/master/src/main/java/com/github/unidbg/ios/struct/kernel/MachPortsLookupReply.java
package com.github.unidbg.ios.struct.kernel;

import com.github.unidbg.pointer.UnicornStructure;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

public class MachPortsLookupReply extends UnicornStructure {

    public MachPortsLookupReply(Pointer p) {
        super(p);
    }

    public int retCode;
    public Pointer outPort;
    public int ret;
    public int mask;
    public int reserved1;
    public int reserved2;
    public int cnt;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("retCode", "outPort", "ret", "mask", "reserved1", "reserved2", "cnt");
    }
}