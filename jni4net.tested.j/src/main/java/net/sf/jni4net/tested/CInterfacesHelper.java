// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package net.sf.jni4net.tested;

@net.sf.jni4net.attributes.ClrType
public class CInterfacesHelper extends system.Object {
    
    //<generated-proxy>
    private static system.Type staticType;
    
    protected CInterfacesHelper(net.sf.jni4net.inj.INJEnv __env, int __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("()V")
    public CInterfacesHelper() {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        net.sf.jni4net.tested.CInterfacesHelper.__ctorCInterfacesHelper0(this);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    private native static void __ctorCInterfacesHelper0(net.sf.jni4net.inj.IClrProxy thiz);
    
    @net.sf.jni4net.attributes.ClrMethod("(I)Lnet/sf/jni4net/tested/CWithJavaInterface;")
    public native final net.sf.jni4net.tested.CWithJavaInterface createCWithJavaInterface(int i);
    
    @net.sf.jni4net.attributes.ClrMethod("(I)Lnet/sf/jni4net/tested/CWithJavaInterfaceUnreg;")
    public native final system.Object CWithJavaInterfaceUnreg(int i);
    
    public static system.Type typeof() {
        return net.sf.jni4net.tested.CInterfacesHelper.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        net.sf.jni4net.tested.CInterfacesHelper.staticType = staticType;
    }
    //</generated-proxy>
}
