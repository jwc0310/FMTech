import android.content.Context;
import com.google.android.libraries.social.help.TooltipView;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class iee
  implements iek
{
  private static final long b = TimeUnit.DAYS.toMillis(1L);
  private static final long c = TimeUnit.SECONDS.toMillis(3L);
  private static final long d = TimeUnit.SECONDS.toMillis(30L);
  public final hgs a;
  private final giz e;
  private final ieg f;
  private long g;
  private int h;
  
  public iee(Context paramContext)
  {
    this.e = ((giz)mbb.a(paramContext, giz.class));
    this.f = new ieg(paramContext);
    this.g = 0L;
    this.a = ((hgs)mbb.a(paramContext, hgs.class));
  }
  
  static boolean a(hgs paramhgs, long paramLong)
  {
    return paramhgs.a() - paramLong >= c;
  }
  
  static ief b(TooltipView paramTooltipView)
  {
    ief localief = (ief)paramTooltipView.getTag(efj.MH);
    paramTooltipView.setTag(efj.MH, null);
    if (localief != null) {
      ((lvj)mbb.b(paramTooltipView.getContext(), lvj.class)).a.a.remove(localief);
    }
    return localief;
  }
  
  private static long e(TooltipView paramTooltipView)
  {
    Long localLong = (Long)paramTooltipView.getTag(efj.MI);
    paramTooltipView.setTag(efj.MI, null);
    if (localLong != null) {
      return localLong.longValue();
    }
    return 0L;
  }
  
  public final void a(TooltipView paramTooltipView)
  {
    int i = paramTooltipView.d.b;
    if (!this.e.c(i)) {
      return;
    }
    boolean bool = true;
    ief localief = b(paramTooltipView);
    if (localief != null)
    {
      bool = localief.a();
      if (localief.a()) {
        localief.b.d(localief.a);
      }
      label62:
      if (this.h <= 0) {
        break label144;
      }
      this.h = (-1 + this.h);
      if (!bool) {
        break label146;
      }
    }
    label144:
    label146:
    for (long l2 = this.a.a();; l2 = 0L)
    {
      this.g = l2;
      return;
      long l1 = e(paramTooltipView);
      if ((l1 != 0L) && (a(this.a, l1)))
      {
        d(paramTooltipView);
        break label62;
      }
      if (l1 == 0L) {
        break label62;
      }
      bool = false;
      break label62;
      break;
    }
  }
  
  public final void a(TooltipView paramTooltipView, boolean paramBoolean)
  {
    long l1 = 0L;
    ief localief = b(paramTooltipView);
    int i;
    if ((paramBoolean) || ((localief != null) && (localief.a())))
    {
      d(paramTooltipView);
      i = 1;
    }
    for (;;)
    {
      if (paramBoolean)
      {
        ied localied = paramTooltipView.d;
        String str = Integer.toString(localied.a.a);
        ieh localieh = this.f.a(localied.b, str);
        localieh.c = true;
        this.f.a(localied.b, str, localieh);
      }
      if (this.h > 0)
      {
        this.h = (-1 + this.h);
        if (i != 0) {
          l1 = this.a.a();
        }
        this.g = l1;
      }
      return;
      if (localief == null)
      {
        long l2 = e(paramTooltipView);
        if ((paramBoolean) || ((l2 != l1) && (a(this.a, l2))))
        {
          d(paramTooltipView);
          i = 1;
          continue;
        }
        if (l2 != l1)
        {
          i = 0;
          continue;
        }
      }
      i = 1;
    }
  }
  
  public final boolean a(ied paramied)
  {
    if (this.h > 0) {}
    label32:
    label164:
    for (;;)
    {
      return false;
      int i;
      String str;
      ieh localieh;
      int j;
      if (this.a.a() - this.g <= d)
      {
        i = 1;
        if (i != 0) {
          break label112;
        }
        str = Integer.toString(paramied.a.a);
        localieh = this.f.a(paramied.b, str);
        if (!localieh.c) {
          break label114;
        }
        j = 0;
      }
      for (;;)
      {
        if (j == 0) {
          break label164;
        }
        localieh.a();
        this.f.a(paramied.b, str, localieh);
        this.h = (1 + this.h);
        return true;
        i = 0;
        break label32;
        label112:
        break;
        label114:
        if (localieh.b >= paramied.c) {
          j = 0;
        } else if (this.a.a() - localieh.a <= b) {
          j = 0;
        } else {
          j = 1;
        }
      }
    }
  }
  
  public final boolean b(ied paramied)
  {
    String str = Integer.toString(paramied.a.a);
    ieh localieh = this.f.a(paramied.b, str);
    return (localieh.c) || (localieh.b >= paramied.c);
  }
  
  public final void c(TooltipView paramTooltipView)
  {
    efj.e(paramTooltipView, "Attempted to register null TooltipView");
    paramTooltipView.e.add(this);
    int i;
    if (paramTooltipView.getTag(efj.MH) != null) {
      i = 1;
    }
    while ((i != 0) || (paramTooltipView.getTag(efj.MI) != null))
    {
      return;
      lvj locallvj = (lvj)mbb.b(paramTooltipView.getContext(), lvj.class);
      if (locallvj != null)
      {
        ief localief = new ief(this, paramTooltipView);
        locallvj.a.a.add(localief);
        paramTooltipView.setTag(efj.MH, localief);
        i = 1;
      }
      else
      {
        i = 0;
      }
    }
    paramTooltipView.setTag(efj.MI, Long.valueOf(this.a.a()));
  }
  
  final void d(TooltipView paramTooltipView)
  {
    ied localied = paramTooltipView.d;
    int i = localied.b;
    String str = Integer.toString(localied.a.a);
    ieh localieh = this.f.a(i, str);
    localieh.b = (1 + localieh.b);
    localieh.a();
    this.f.a(i, str, localieh);
    efj.g(paramTooltipView);
    efj.f(paramTooltipView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iee
 * JD-Core Version:    0.7.0.1
 */