// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package system.reflection;

@net.sf.jni4net.attributes.ClrType
public class MemberInfo extends system.Object implements system.reflection.ICustomAttributeProvider {
    
    //<generated-proxy>
    private static system.Type staticType;
    
    protected MemberInfo(net.sf.jni4net.inj.INJEnv __env, int __handle) {
            super(__env, __handle);
    }
    
    protected MemberInfo() {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("(Z)[LSystem/Object;")
    public native system.Object[] GetCustomAttributes(boolean inherit);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;Z)[LSystem/Object;")
    public native system.Object[] GetCustomAttributes(system.Type attributeType, boolean inherit);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;Z)Z")
    public native boolean IsDefined(system.Type attributeType, boolean inherit);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/MemberTypes;")
    public native system.Enum getMemberType();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native java.lang.String getName();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type getDeclaringType();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type getReflectedType();
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int getMetadataToken();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/Module;")
    public native system.Object getModule();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/UInt32;LSystem/UInt32;LSystem/IntPtr;)V")
    public native void GetTypeInfo(int iTInfo, int lcid, system.ValueType ppTInfo);
    
    public static system.Type typeof() {
        return system.reflection.MemberInfo.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        system.reflection.MemberInfo.staticType = staticType;
    }
    //</generated-proxy>
}
