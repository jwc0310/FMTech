import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class jco
{
  private giz a;
  
  static
  {
    jdr.a(jco.class);
  }
  
  public jco(Context paramContext)
  {
    this.a = ((giz)mbb.a(paramContext, giz.class));
  }
  
  /* Error */
  public final jak a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: iconst_m1
    //   4: if_icmpeq +51 -> 55
    //   7: aload_0
    //   8: getfield 26	jco:a	Lgiz;
    //   11: iload_1
    //   12: invokeinterface 31 2 0
    //   17: ifeq +38 -> 55
    //   20: aload_0
    //   21: getfield 26	jco:a	Lgiz;
    //   24: iload_1
    //   25: invokeinterface 34 2 0
    //   30: ldc 36
    //   32: getstatic 42	jak:g	Ljak;
    //   35: getfield 46	jak:h	I
    //   38: invokeinterface 51 3 0
    //   43: invokestatic 53	jak:a	(I)Ljak;
    //   46: astore 4
    //   48: aload 4
    //   50: astore_3
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_3
    //   54: areturn
    //   55: getstatic 42	jak:g	Ljak;
    //   58: astore_3
    //   59: goto -8 -> 51
    //   62: astore_2
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_2
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	jco
    //   0	67	1	paramInt	int
    //   62	4	2	localObject	Object
    //   50	9	3	localjak1	jak
    //   46	3	4	localjak2	jak
    // Exception table:
    //   from	to	target	type
    //   7	48	62	finally
    //   55	59	62	finally
  }
  
  public final void a(int paramInt, jak paramjak)
  {
    if (paramInt != -1) {}
    try
    {
      if (this.a.c(paramInt)) {
        this.a.b(paramInt).b("guns_registration_status", paramjak.h).d();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(jak paramjak1, jak paramjak2)
  {
    try
    {
      Iterator localIterator = this.a.a(new String[] { "logged_in" }).iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        if (a(i) == paramjak1) {
          a(i, paramjak2);
        }
      }
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jco
 * JD-Core Version:    0.7.0.1
 */