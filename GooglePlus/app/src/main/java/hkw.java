import android.net.Uri;
import android.os.Handler;
import java.util.HashSet;

public final class hkw
  implements hhn
{
  kl<Uri, HashSet<hhm>> a = new kl();
  private kl<Uri, Integer> b = new kl();
  
  /* Error */
  public final int a(Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 20	hkw:b	Lkl;
    //   6: aload_1
    //   7: invokevirtual 27	kl:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast 29	java/lang/Integer
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull +18 -> 33
    //   18: aload_3
    //   19: invokevirtual 33	java/lang/Integer:intValue	()I
    //   22: istore 4
    //   24: iload 4
    //   26: istore 5
    //   28: aload_0
    //   29: monitorexit
    //   30: iload 5
    //   32: ireturn
    //   33: iconst_0
    //   34: istore 5
    //   36: goto -8 -> 28
    //   39: astore_2
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_2
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	hkw
    //   0	44	1	paramUri	Uri
    //   39	4	2	localObject	Object
    //   13	6	3	localInteger	Integer
    //   22	3	4	i	int
    //   26	9	5	j	int
    // Exception table:
    //   from	to	target	type
    //   2	14	39	finally
    //   18	24	39	finally
  }
  
  public final void a(Uri paramUri, hhm paramhhm)
  {
    efj.k();
    HashSet localHashSet = (HashSet)this.a.get(paramUri);
    if (localHashSet == null)
    {
      localHashSet = new HashSet();
      this.a.put(paramUri, localHashSet);
    }
    localHashSet.add(paramhhm);
    if (a(paramUri) != 2) {
      paramhhm.c(a(paramUri));
    }
  }
  
  public final boolean a(Uri paramUri, int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2) && (paramInt != 0) && (paramInt != 3)) {
      try
      {
        throw new IllegalArgumentException();
      }
      finally {}
    }
    Integer localInteger = (Integer)this.b.put(paramUri, Integer.valueOf(paramInt));
    if (localInteger != null) {
      if (localInteger.intValue() != paramInt) {
        break label103;
      }
    }
    for (;;)
    {
      if (bool)
      {
        hkx localhkx = new hkx(this, paramUri);
        efj.m().post(localhkx);
      }
      return bool;
      boolean bool = false;
      continue;
      label103:
      bool = true;
    }
  }
  
  final int b(Uri paramUri)
  {
    try
    {
      int i = a(paramUri);
      if (i != 1) {
        this.b.remove(paramUri);
      }
      return i;
    }
    finally {}
  }
  
  public final void b(Uri paramUri, hhm paramhhm)
  {
    efj.k();
    HashSet localHashSet = (HashSet)this.a.get(paramUri);
    if (localHashSet == null) {}
    do
    {
      return;
      localHashSet.remove(paramhhm);
    } while (localHashSet.size() != 0);
    this.a.remove(paramUri);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hkw
 * JD-Core Version:    0.7.0.1
 */