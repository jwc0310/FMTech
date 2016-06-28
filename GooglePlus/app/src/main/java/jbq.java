import android.content.Context;

public final class jbq
{
  static final String a = jdr.a(jbq.class);
  final Context b;
  
  public jbq(Context paramContext)
  {
    this.b = paramContext;
  }
  
  static qqs a(Context paramContext, izx paramizx, byte[] paramArrayOfByte)
  {
    jdp localjdp = jdp.a(paramContext);
    qqs localqqs = new qqs();
    localqqs.a = localjdp.b();
    localqqs.b = new jdo(paramContext).a();
    localqqs.c = Integer.valueOf(50);
    localqqs.d = jdp.a(paramizx);
    localqqs.e = paramArrayOfByte;
    return localqqs;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbq
 * JD-Core Version:    0.7.0.1
 */