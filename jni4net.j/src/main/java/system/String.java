// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package system;

@net.sf.jni4net.attributes.ClrType
public class String extends system.Object implements system.IComparable, system.ICloneable, system.IConvertible, system.collections.IEnumerable {
    
    //<generated-proxy>
    private static system.Type staticType;
    
    protected String(net.sf.jni4net.inj.INJEnv __env, int __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("([CII)V")
    public String(char[] value, int startIndex, int length) {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        system.String.__ctorString0(this, value, startIndex, length);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("([C)V")
    public String(char[] value) {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        system.String.__ctorString1(this, value);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("(CI)V")
    public String(char c, int count) {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        system.String.__ctorString2(this, c, count);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("([CII)V")
    private native static void __ctorString0(net.sf.jni4net.inj.IClrProxy thiz, char[] value, int startIndex, int length);
    
    @net.sf.jni4net.attributes.ClrMethod("([C)V")
    private native static void __ctorString1(net.sf.jni4net.inj.IClrProxy thiz, char[] value);
    
    @net.sf.jni4net.attributes.ClrMethod("(CI)V")
    private native static void __ctorString2(net.sf.jni4net.inj.IClrProxy thiz, char c, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;)I")
    public native int CompareTo(system.Object obj);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Object;")
    public native system.Object Clone();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/TypeCode;")
    public native system.Enum GetTypeCode();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)Z")
    public native boolean ToBoolean(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)C")
    public native char ToChar(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/SByte;")
    public native byte ToSByte(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)B")
    public native byte ToByte(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)S")
    public native short ToInt16(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/UInt16;")
    public native short ToUInt16(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)I")
    public native int ToInt32(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/UInt32;")
    public native int ToUInt32(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)J")
    public native long ToInt64(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/UInt64;")
    public native long ToUInt64(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)F")
    public native float ToSingle(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)D")
    public native double ToDouble(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/Decimal;")
    public native system.Decimal ToDecimal(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/DateTime;")
    public native system.DateTime ToDateTime(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/String;")
    public native java.lang.String ToString(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;LSystem/IFormatProvider;)LSystem/Object;")
    public native system.Object ToType(system.Type conversionType, system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Collections/IEnumerator;")
    public native system.collections.IEnumerator GetEnumerator();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;[LSystem/String;)LSystem/String;")
    public native static java.lang.String Join(java.lang.String separator, system.String[] value);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;[LSystem/String;II)LSystem/String;")
    public native static java.lang.String Join(java.lang.String separator, system.String[] value, int startIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)Z")
    public native boolean Equals(java.lang.String value);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/StringComparison;)Z")
    public native final boolean Equals(java.lang.String value, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;)Z")
    public native static boolean Equals(java.lang.String a, java.lang.String b);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;LSystem/StringComparison;)Z")
    public native static boolean Equals(java.lang.String a, java.lang.String b, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(I)C")
    public native final char getChars(int index);
    
    @net.sf.jni4net.attributes.ClrMethod("(I[CII)V")
    public native final void CopyTo(int sourceIndex, char[] destination, int destinationIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("()[C")
    public native final char[] ToCharArray();
    
    @net.sf.jni4net.attributes.ClrMethod("(II)[C")
    public native final char[] ToCharArray(int startIndex, int length);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)Z")
    public native static boolean IsNullOrEmpty(java.lang.String value);
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native final int getLength();
    
    @net.sf.jni4net.attributes.ClrMethod("([C)[LSystem/String;")
    public native final system.String[] Split(char[] separator);
    
    @net.sf.jni4net.attributes.ClrMethod("([CI)[LSystem/String;")
    public native final system.String[] Split(char[] separator, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("([CLSystem/StringSplitOptions;)[LSystem/String;")
    public native final system.String[] Split(char[] separator, system.Enum options);
    
    @net.sf.jni4net.attributes.ClrMethod("([CILSystem/StringSplitOptions;)[LSystem/String;")
    public native final system.String[] Split(char[] separator, int count, system.Enum options);
    
    @net.sf.jni4net.attributes.ClrMethod("([LSystem/String;LSystem/StringSplitOptions;)[LSystem/String;")
    public native final system.String[] Split(system.String[] separator, system.Enum options);
    
    @net.sf.jni4net.attributes.ClrMethod("([LSystem/String;ILSystem/StringSplitOptions;)[LSystem/String;")
    public native final system.String[] Split(system.String[] separator, int count, system.Enum options);
    
    @net.sf.jni4net.attributes.ClrMethod("(I)LSystem/String;")
    public native final java.lang.String Substring(int startIndex);
    
    @net.sf.jni4net.attributes.ClrMethod("(II)LSystem/String;")
    public native final java.lang.String Substring(int startIndex, int length);
    
    @net.sf.jni4net.attributes.ClrMethod("([C)LSystem/String;")
    public native final java.lang.String Trim(char[] trimChars);
    
    @net.sf.jni4net.attributes.ClrMethod("([C)LSystem/String;")
    public native final java.lang.String TrimStart(char[] trimChars);
    
    @net.sf.jni4net.attributes.ClrMethod("([C)LSystem/String;")
    public native final java.lang.String TrimEnd(char[] trimChars);
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native final boolean IsNormalized();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Text/NormalizationForm;)Z")
    public native final boolean IsNormalized(system.Enum normalizationForm);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native final java.lang.String Normalize();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Text/NormalizationForm;)LSystem/String;")
    public native final java.lang.String Normalize(system.Enum normalizationForm);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;)I")
    public native static int Compare(java.lang.String strA, java.lang.String strB);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;Z)I")
    public native static int Compare(java.lang.String strA, java.lang.String strB, boolean ignoreCase);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;LSystem/Globalization/CultureInfo;LSystem/Globalization/CompareOptions;)I")
    public native static int Compare(java.lang.String strA, java.lang.String strB, system.Object culture, system.Enum options);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ILSystem/String;IILSystem/Globalization/CultureInfo;LSystem/Globalization/CompareOptions;)I")
    public native static int Compare(java.lang.String strA, int indexA, java.lang.String strB, int indexB, int length, system.Object culture, system.Enum options);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;LSystem/StringComparison;)I")
    public native static int Compare(java.lang.String strA, java.lang.String strB, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;ZLSystem/Globalization/CultureInfo;)I")
    public native static int Compare(java.lang.String strA, java.lang.String strB, boolean ignoreCase, system.Object culture);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ILSystem/String;II)I")
    public native static int Compare(java.lang.String strA, int indexA, java.lang.String strB, int indexB, int length);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ILSystem/String;IIZ)I")
    public native static int Compare(java.lang.String strA, int indexA, java.lang.String strB, int indexB, int length, boolean ignoreCase);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ILSystem/String;IIZLSystem/Globalization/CultureInfo;)I")
    public native static int Compare(java.lang.String strA, int indexA, java.lang.String strB, int indexB, int length, boolean ignoreCase, system.Object culture);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ILSystem/String;IILSystem/StringComparison;)I")
    public native static int Compare(java.lang.String strA, int indexA, java.lang.String strB, int indexB, int length, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)I")
    public native int CompareTo(java.lang.String strB);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;)I")
    public native static int CompareOrdinal(java.lang.String strA, java.lang.String strB);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ILSystem/String;II)I")
    public native static int CompareOrdinal(java.lang.String strA, int indexA, java.lang.String strB, int indexB, int length);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)Z")
    public native final boolean Contains(java.lang.String value);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)Z")
    public native final boolean EndsWith(java.lang.String value);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/StringComparison;)Z")
    public native final boolean EndsWith(java.lang.String value, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ZLSystem/Globalization/CultureInfo;)Z")
    public native final boolean EndsWith(java.lang.String value, boolean ignoreCase, system.Object culture);
    
    @net.sf.jni4net.attributes.ClrMethod("(C)I")
    public native final int IndexOf(char value);
    
    @net.sf.jni4net.attributes.ClrMethod("(CI)I")
    public native final int IndexOf(char value, int startIndex);
    
    @net.sf.jni4net.attributes.ClrMethod("(CII)I")
    public native final int IndexOf(char value, int startIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("([C)I")
    public native final int IndexOfAny(char[] anyOf);
    
    @net.sf.jni4net.attributes.ClrMethod("([CI)I")
    public native final int IndexOfAny(char[] anyOf, int startIndex);
    
    @net.sf.jni4net.attributes.ClrMethod("([CII)I")
    public native final int IndexOfAny(char[] anyOf, int startIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)I")
    public native final int IndexOf(java.lang.String value);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;I)I")
    public native final int IndexOf(java.lang.String value, int startIndex);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;II)I")
    public native final int IndexOf(java.lang.String value, int startIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/StringComparison;)I")
    public native final int IndexOf(java.lang.String value, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ILSystem/StringComparison;)I")
    public native final int IndexOf(java.lang.String value, int startIndex, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;IILSystem/StringComparison;)I")
    public native final int IndexOf(java.lang.String value, int startIndex, int count, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(C)I")
    public native final int LastIndexOf(char value);
    
    @net.sf.jni4net.attributes.ClrMethod("(CI)I")
    public native final int LastIndexOf(char value, int startIndex);
    
    @net.sf.jni4net.attributes.ClrMethod("(CII)I")
    public native final int LastIndexOf(char value, int startIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("([C)I")
    public native final int LastIndexOfAny(char[] anyOf);
    
    @net.sf.jni4net.attributes.ClrMethod("([CI)I")
    public native final int LastIndexOfAny(char[] anyOf, int startIndex);
    
    @net.sf.jni4net.attributes.ClrMethod("([CII)I")
    public native final int LastIndexOfAny(char[] anyOf, int startIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)I")
    public native final int LastIndexOf(java.lang.String value);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;I)I")
    public native final int LastIndexOf(java.lang.String value, int startIndex);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;II)I")
    public native final int LastIndexOf(java.lang.String value, int startIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/StringComparison;)I")
    public native final int LastIndexOf(java.lang.String value, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ILSystem/StringComparison;)I")
    public native final int LastIndexOf(java.lang.String value, int startIndex, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;IILSystem/StringComparison;)I")
    public native final int LastIndexOf(java.lang.String value, int startIndex, int count, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(I)LSystem/String;")
    public native final java.lang.String PadLeft(int totalWidth);
    
    @net.sf.jni4net.attributes.ClrMethod("(IC)LSystem/String;")
    public native final java.lang.String PadLeft(int totalWidth, char paddingChar);
    
    @net.sf.jni4net.attributes.ClrMethod("(I)LSystem/String;")
    public native final java.lang.String PadRight(int totalWidth);
    
    @net.sf.jni4net.attributes.ClrMethod("(IC)LSystem/String;")
    public native final java.lang.String PadRight(int totalWidth, char paddingChar);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)Z")
    public native final boolean StartsWith(java.lang.String value);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/StringComparison;)Z")
    public native final boolean StartsWith(java.lang.String value, system.Enum comparisonType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ZLSystem/Globalization/CultureInfo;)Z")
    public native final boolean StartsWith(java.lang.String value, boolean ignoreCase, system.Object culture);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native final java.lang.String ToLower();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Globalization/CultureInfo;)LSystem/String;")
    public native final java.lang.String ToLower(system.Object culture);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native final java.lang.String ToLowerInvariant();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native final java.lang.String ToUpper();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Globalization/CultureInfo;)LSystem/String;")
    public native final java.lang.String ToUpper(system.Object culture);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native final java.lang.String ToUpperInvariant();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native final java.lang.String Trim();
    
    @net.sf.jni4net.attributes.ClrMethod("(ILSystem/String;)LSystem/String;")
    public native final java.lang.String Insert(int startIndex, java.lang.String value);
    
    @net.sf.jni4net.attributes.ClrMethod("(CC)LSystem/String;")
    public native final java.lang.String Replace(char oldChar, char newChar);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;)LSystem/String;")
    public native final java.lang.String Replace(java.lang.String oldValue, java.lang.String newValue);
    
    @net.sf.jni4net.attributes.ClrMethod("(II)LSystem/String;")
    public native final java.lang.String Remove(int startIndex, int count);
    
    @net.sf.jni4net.attributes.ClrMethod("(I)LSystem/String;")
    public native final java.lang.String Remove(int startIndex);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Object;)LSystem/String;")
    public native static java.lang.String Format(java.lang.String format, system.Object arg0);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Object;LSystem/Object;)LSystem/String;")
    public native static java.lang.String Format(java.lang.String format, system.Object arg0, system.Object arg1);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Object;LSystem/Object;LSystem/Object;)LSystem/String;")
    public native static java.lang.String Format(java.lang.String format, system.Object arg0, system.Object arg1, system.Object arg2);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;[LSystem/Object;)LSystem/String;")
    public native static java.lang.String Format(java.lang.String format, system.Object[] args);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;LSystem/String;[LSystem/Object;)LSystem/String;")
    public native static java.lang.String Format(system.IFormatProvider provider, java.lang.String format, system.Object[] args);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/String;")
    public native static java.lang.String Copy(java.lang.String str);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;)LSystem/String;")
    public native static java.lang.String Concat(system.Object arg0);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;LSystem/Object;)LSystem/String;")
    public native static java.lang.String Concat(system.Object arg0, system.Object arg1);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;LSystem/Object;LSystem/Object;)LSystem/String;")
    public native static java.lang.String Concat(system.Object arg0, system.Object arg1, system.Object arg2);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;LSystem/Object;LSystem/Object;LSystem/Object;)LSystem/String;")
    public native static java.lang.String Concat(system.Object arg0, system.Object arg1, system.Object arg2, system.Object arg3);
    
    @net.sf.jni4net.attributes.ClrMethod("([LSystem/Object;)LSystem/String;")
    public native static java.lang.String Concat(system.Object[] args);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;)LSystem/String;")
    public native static java.lang.String Concat(java.lang.String str0, java.lang.String str1);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;LSystem/String;)LSystem/String;")
    public native static java.lang.String Concat(java.lang.String str0, java.lang.String str1, java.lang.String str2);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;LSystem/String;LSystem/String;)LSystem/String;")
    public native static java.lang.String Concat(java.lang.String str0, java.lang.String str1, java.lang.String str2, java.lang.String str3);
    
    @net.sf.jni4net.attributes.ClrMethod("([LSystem/String;)LSystem/String;")
    public native static java.lang.String Concat(system.String[] values);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/String;")
    public native static java.lang.String Intern(java.lang.String str);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/String;")
    public native static java.lang.String IsInterned(java.lang.String str);
    
    public static system.Type typeof() {
        return system.String.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        system.String.staticType = staticType;
    }
    //</generated-proxy>
}
