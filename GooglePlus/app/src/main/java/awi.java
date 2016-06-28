import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public final class awi
  extends bj
{
  awq Z;
  private List<aws> aa;
  
  public static awi a(Context paramContext, ojf paramojf, Uri paramUri)
  {
    if (paramojf != null)
    {
      awp localawp = new awp();
      if (paramojf.u != null)
      {
        localawp.a = paramojf.u.a;
        localawp.b = paramojf.u.b;
      }
      localawp.g = paramojf.i;
      Double localDouble = paramojf.m;
      double d;
      Integer localInteger1;
      int j;
      label103:
      Integer localInteger2;
      int k;
      label130:
      Long localLong;
      if (localDouble == null)
      {
        d = 0.0D;
        localawp.c = Long.valueOf(Math.round(d * 1000.0D));
        if (paramojf.a != null)
        {
          localInteger1 = paramojf.a.b;
          if (localInteger1 != null) {
            break label372;
          }
          j = 0;
          localawp.d = Long.valueOf(j);
          localInteger2 = paramojf.a.c;
          if (localInteger2 != null) {
            break label382;
          }
          k = 0;
          localawp.e = Long.valueOf(k);
        }
        localawp.i = paramojf.v;
        if (paramojf.l != null) {
          localawp.q = paramojf.l.d;
        }
        if (paramojf.t != null)
        {
          localLong = paramojf.t.h;
          if (localLong != null) {
            break label392;
          }
        }
      }
      label392:
      for (long l = 0L;; l = localLong.longValue())
      {
        localawp.c = Long.valueOf(l * 1000L);
        localawp.f = paramojf.t.i;
        localawp.n = paramojf.t.a;
        localawp.o = paramojf.t.b;
        if (paramojf.t.g != null)
        {
          boolean bool = paramojf.t.g.booleanValue();
          int i = 0;
          if (bool) {
            i = 1;
          }
          localawp.p = Integer.valueOf(i);
        }
        localawp.j = paramojf.t.f;
        localawp.k = paramojf.t.e;
        localawp.l = paramojf.t.d;
        localawp.m = paramojf.t.c;
        Bundle localBundle1 = new Bundle();
        localBundle1.putParcelableArrayList("info_list", a(paramContext, localawp));
        awi localawi1 = new awi();
        localawi1.f(localBundle1);
        return localawi1;
        d = localDouble.doubleValue();
        break;
        label372:
        j = localInteger1.intValue();
        break label103;
        label382:
        k = localInteger2.intValue();
        break label130;
      }
    }
    Bundle localBundle2 = new Bundle();
    localBundle2.putParcelable("local_uri", paramUri);
    awi localawi2 = new awi();
    localawi2.f(localBundle2);
    return localawi2;
  }
  
  static ArrayList<aws> a(Context paramContext, awp paramawp)
  {
    aww localaww = new aww(paramContext);
    if (paramawp == null) {
      return localaww.a;
    }
    double d4;
    double d3;
    label120:
    Double localDouble1;
    double d1;
    label132:
    Double localDouble4;
    double d2;
    label153:
    Long localLong1;
    long l1;
    label279:
    Long localLong2;
    if ((paramawp.a != null) && (Math.abs(paramawp.a.doubleValue()) > 90.0D))
    {
      d4 = paramawp.a.doubleValue() / 10000000.0D;
      if (d4 > 90.0D) {
        paramawp.a = null;
      }
    }
    else
    {
      if ((paramawp.b != null) && (Math.abs(paramawp.b.doubleValue()) > 180.0D))
      {
        d3 = paramawp.b.doubleValue() / 10000000.0D;
        if (d3 <= 180.0D) {
          break label543;
        }
        paramawp.b = null;
      }
      localDouble1 = paramawp.a;
      if (localDouble1 != null) {
        break label555;
      }
      d1 = 0.0D;
      if (d1 == 0.0D)
      {
        localDouble4 = paramawp.b;
        if (localDouble4 != null) {
          break label564;
        }
        d2 = 0.0D;
        if (d2 == 0.0D) {}
      }
      else
      {
        Double localDouble2 = paramawp.a;
        Double localDouble3 = paramawp.b;
        if ((!aww.a(localDouble2)) && (!aww.a(localDouble3))) {
          localaww.a.add(new aws(localDouble2, localDouble3));
        }
        int i = aau.hq;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = paramawp.a;
        arrayOfObject1[1] = paramawp.b;
        localaww.a(i, String.format("%.3f, %.3f", arrayOfObject1));
      }
      localaww.a(aau.hv, paramawp.c, new awj());
      localLong1 = paramawp.d;
      if (localLong1 != null) {
        break label574;
      }
      l1 = 0L;
      if (l1 != 0L)
      {
        localLong2 = paramawp.e;
        if (localLong2 != null) {
          break label584;
        }
      }
    }
    label543:
    label555:
    label564:
    label574:
    label584:
    for (long l2 = 0L;; l2 = localLong2.longValue())
    {
      if (l2 != 0L)
      {
        int j = aau.hf;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = paramawp.d;
        arrayOfObject2[1] = paramawp.e;
        localaww.a(j, String.format("%d x %d", arrayOfObject2));
      }
      localaww.a(aau.hg, paramawp.q, new awo());
      localaww.a(aau.hu, paramawp.f);
      localaww.a(aau.hw, paramawp.g);
      localaww.a(aau.hl, paramawp.i, new awx(paramContext));
      localaww.a(aau.hn, paramawp.j, new awk(paramContext));
      localaww.a(aau.hc, paramawp.k, new awl(paramContext));
      localaww.a(aau.hh, paramawp.l, new awm(paramContext));
      localaww.a(aau.hp, paramawp.m);
      localaww.a(aau.hr, paramawp.n);
      localaww.a(aau.hs, paramawp.o);
      localaww.a(aau.hm, paramawp.p, new awn(paramContext));
      localaww.a(aau.hk, paramawp.h);
      return localaww.a;
      paramawp.a = Double.valueOf(d4);
      break;
      paramawp.b = Double.valueOf(d3);
      break label120;
      d1 = localDouble1.doubleValue();
      break label132;
      d2 = localDouble4.doubleValue();
      break label153;
      l1 = localLong1.longValue();
      break label279;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.tI, paramViewGroup, false);
    ListView localListView = (ListView)localView.findViewById(aaw.du);
    localListView.setEmptyView(localView.findViewById(aaw.eH));
    this.Z = new awq(this.aa, paramLayoutInflater);
    localListView.setAdapter(this.Z);
    this.d.setTitle(aau.he);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (this.m.getParcelable("local_uri") != null)
    {
      k().a(0, this.m, new awu(this, f()));
      return;
    }
    this.aa = this.m.getParcelableArrayList("info_list");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     awi
 * JD-Core Version:    0.7.0.1
 */