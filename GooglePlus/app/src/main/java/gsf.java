import android.content.Context;
import android.content.res.Resources;

public final class gsf
{
  final lqp a;
  final oxz b;
  final grc c;
  final bp d;
  final ics e;
  gsq f;
  gsh g = new gsh(this);
  
  gsf(Context paramContext, lqp paramlqp, grl paramgrl, oxz paramoxz, grc paramgrc, bp parambp, ics paramics)
  {
    this.a = paramlqp;
    this.b = paramoxz;
    this.c = paramgrc;
    this.d = parambp;
    this.e = paramics;
    Resources localResources = paramContext.getResources();
    paramlqp.l = paramgrl;
    int i = localResources.getInteger(efj.EF);
    int j = localResources.getDimensionPixelOffset(efj.Ez);
    paramlqp.m = localResources.getDimensionPixelOffset(efj.EA);
    paramlqp.n = i;
    paramlqp.o = j;
    paramlqp.x = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gsf
 * JD-Core Version:    0.7.0.1
 */