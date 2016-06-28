import android.content.Context;
import android.os.Bundle;

public final class bup
  extends kck
{
  int a;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  private gxz p;
  private gya q;
  
  /* Error */
  public final void a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 27	bup:d	()V
    //   6: invokestatic 32	efj:j	()Z
    //   9: ifeq +12 -> 21
    //   12: aload_0
    //   13: aload_1
    //   14: iload_2
    //   15: invokevirtual 34	bup:b	(Landroid/content/Context;I)V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: new 36	buq
    //   24: dup
    //   25: aload_0
    //   26: aload_1
    //   27: iload_2
    //   28: invokespecial 39	buq:<init>	(Lbup;Landroid/content/Context;I)V
    //   31: astore 4
    //   33: invokestatic 43	efj:m	()Landroid/os/Handler;
    //   36: aload 4
    //   38: invokevirtual 49	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   41: pop
    //   42: goto -24 -> 18
    //   45: astore_3
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_3
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	bup
    //   0	50	1	paramContext	Context
    //   0	50	2	paramInt	int
    //   45	4	3	localObject	Object
    //   31	6	4	localbuq	buq
    // Exception table:
    //   from	to	target	type
    //   2	18	45	finally
    //   21	42	45	finally
  }
  
  public final void a(String paramString, gya paramgya, gxz paramgxz)
  {
    try
    {
      b(paramString);
      this.q = paramgya;
      this.p = paramgxz;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void b(Context paramContext, int paramInt)
  {
    Bundle localBundle = new Bundle();
    if (this.b > 0) {
      localBundle.putInt("extra_photo_count", this.b);
    }
    if (this.a > 0) {
      localBundle.putInt("extra_video_count", this.a);
    }
    if (this.l > 0L) {
      localBundle.putLong("extra_total_bytes", this.l);
    }
    if (this.c > 0) {
      localBundle.putInt("extra_thumbnail_count", this.c);
    }
    if (this.d > 0) {
      localBundle.putInt("extra_max_highlight_item_count", this.d);
    }
    if (this.f > 0) {
      localBundle.putInt("extra_max_highlight_page_count", this.f);
    }
    if (this.e > 0) {
      localBundle.putInt("extra_highlight_item_count", this.e);
    }
    if (this.g > 0) {
      localBundle.putInt("extra_highlight_page_count", this.g);
    }
    if (this.h > 0) {
      localBundle.putInt("extra_all_photos_item_count", this.h);
    }
    if (this.j > 0) {
      localBundle.putInt("extra_max_all_photos_item_count", this.j);
    }
    if (this.i > 0) {
      localBundle.putInt("extra_all_photos_page_count", this.i);
    }
    if (this.k > 0) {
      localBundle.putInt("extra_cache_evictions", this.k);
    }
    if ((this.q == null) || (this.p == null)) {
      return;
    }
    gxx localgxx = (gxx)mbb.a(paramContext, gxx.class);
    gxw localgxw = new gxw(paramContext, paramInt);
    localgxw.c = this.p;
    localgxw.d = this.q;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bup
 * JD-Core Version:    0.7.0.1
 */