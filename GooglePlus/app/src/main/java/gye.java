import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class gye
  implements gxx
{
  final Context a;
  
  public gye(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final kbw a(int paramInt)
  {
    return gyh.a(this.a, paramInt);
  }
  
  public final void a(gxw paramgxw)
  {
    Context localContext = paramgxw.a;
    Iterator localIterator1 = mbb.d(localContext, gxv.class).iterator();
    while (localIterator1.hasNext())
    {
      gxv localgxv = (gxv)localIterator1.next();
      if (paramgxw.d == null) {
        paramgxw.d = localgxv.r_();
      }
      localgxv.b(paramgxw.h);
    }
    if (paramgxw.b == -1)
    {
      git localgit = (git)mbb.b(localContext, git.class);
      if (localgit != null) {
        paramgxw.b = localgit.c();
      }
    }
    if (paramgxw.b == -1) {
      return;
    }
    long l1;
    label129:
    long l2;
    label145:
    njh localnjh;
    String str1;
    String str2;
    String str3;
    Bundle localBundle;
    if (paramgxw.f != null)
    {
      l1 = paramgxw.f.longValue();
      if (paramgxw.g == null) {
        break label381;
      }
      l2 = paramgxw.g.longValue();
      localnjh = gxy.a(paramgxw.c, paramgxw.d, paramgxw.e, l1, l2, paramgxw.h);
      if (Log.isLoggable("EsAnalytics", 3))
      {
        str1 = String.valueOf(gxz.a(paramgxw.c));
        str2 = String.valueOf(gya.a(paramgxw.d));
        str3 = String.valueOf(gya.a(paramgxw.e));
        localBundle = paramgxw.h;
        if (localBundle != null) {
          break label388;
        }
      }
    }
    int i;
    label381:
    StringBuilder localStringBuilder;
    for (String str4 = "none";; str4 = localStringBuilder.toString())
    {
      String str5 = String.valueOf(str4);
      new StringBuilder(113 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str5).length()).append("recordEvent action: ").append(str1).append(" startView: ").append(str2).append(" endView: ").append(str3).append(" startTime: ").append(l1).append(" endTime: ").append(l2).append(" extras: ").append(str5);
      i = paramgxw.b;
      if (i == -1) {
        break;
      }
      if (!efj.j()) {
        break label477;
      }
      gyh.a(this.a, i, localnjh);
      return;
      l1 = System.currentTimeMillis();
      break label129;
      l2 = l1;
      break label145;
      label388:
      localStringBuilder = new StringBuilder();
      Iterator localIterator2 = localBundle.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str6 = (String)localIterator2.next();
        localStringBuilder.append('(').append(str6).append(':').append(localBundle.get(str6)).append(')');
      }
    }
    label477:
    gyf localgyf = new gyf(this, i, localnjh);
    efj.m().post(localgyf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gye
 * JD-Core Version:    0.7.0.1
 */