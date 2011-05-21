package me.qmx.jitescript;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import static me.qmx.jitescript.util.CodegenUtils.*;

/**
 *
 * @author qmx
 */
public class JiteClass implements Opcodes {

    private final List<MethodDefinition> methods = new ArrayList<MethodDefinition>();
    private ClassWriter cw;
    private final String className;

    public JiteClass(String className) {
        this.className = className;
    }

    public void defineMethod(String methodName, int modifiers, String signature, MethodBody methodBody) {
        this.methods.add(new MethodDefinition(methodName, modifiers, signature, methodBody));
    }

    byte[] toBytes() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void init() {
        cw = new ClassWriter(0);
    }
}
