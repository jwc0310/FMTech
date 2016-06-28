import java.lang.reflect.Field;

class csh<E>
  extends csf<E>
{
  public csh(Class<E> paramClass)
  {
    super(paramClass, new Object[0]);
    Field[] arrayOfField = this.a.getFields();
    this.b = new csg[arrayOfField.length];
    for (int i = 0; i < arrayOfField.length; i++)
    {
      Field localField = arrayOfField[i];
      csg localcsg = new csg();
      localcsg.b = localField.getName();
      localcsg.a = localcsg.b.charAt(0);
      csf.a(localcsg, localField, false);
      if ((localcsg.d == 8) || (localcsg.e == 8))
      {
        String str1 = String.valueOf("Cannot use default JSON for object containing fields of non-basic types: ");
        String str2 = String.valueOf(this.a);
        String str3 = String.valueOf(localcsg.c.getName());
        throw new RuntimeException(1 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + str2 + "." + str3);
      }
      this.b[i] = localcsg;
    }
  }
  
  csh(Class paramClass, Object... paramVarArgs)
  {
    super(paramClass, paramVarArgs);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csh
 * JD-Core Version:    0.7.0.1
 */