import android.content.Context;

public final class lih
  extends gzf
{
  private final kcg a;
  private final kbu b;
  private final int c;
  private final String d;
  private final Integer l;
  private final Boolean m;
  
  public lih(Context paramContext, int paramInt, String paramString, Boolean paramBoolean, Integer paramInteger)
  {
    super("SetSquareVolumeControlsTask");
    this.c = paramInt;
    this.a = new kch().a(paramContext, paramInt).a();
    this.d = paramString;
    this.l = paramInteger;
    this.m = paramBoolean;
    this.b = ((kbu)mbb.a(paramContext, kbu.class));
  }
  
  private final String a(Context paramContext, boolean paramBoolean)
  {
    int i;
    if ((this.m != null) && (this.l == null)) {
      if (this.m.booleanValue()) {
        if (paramBoolean) {
          i = fh.i;
        }
      }
    }
    for (;;)
    {
      return paramContext.getString(i);
      i = fh.m;
      continue;
      if (paramBoolean)
      {
        i = fh.g;
      }
      else
      {
        i = fh.l;
        continue;
        if (paramBoolean) {
          i = fh.o;
        } else {
          i = fh.p;
        }
      }
    }
  }
  
  protected final hae a(Context paramContext)
  {
    int i = 2;
    omv localomv1;
    int i3;
    int i4;
    label127:
    int j;
    int k;
    Exception localException1;
    if (kyo.a(paramContext, this.c))
    {
      localomv1 = new omv();
      if (this.l == null) {
        break label573;
      }
      kcg localkcg = this.a;
      String str = this.d;
      switch (this.l.intValue())
      {
      default: 
        i3 = 0;
        lif locallif = new lif(paramContext, localkcg, str, i3);
        locallif.a.i();
        locallif.a.c("SetSquareVolumeOp");
        if (locallif.a.n())
        {
          i4 = 1;
          int i5 = locallif.a.o;
          Exception localException4 = locallif.a.q;
          j = i5;
          k = i4;
          localException1 = localException4;
        }
        break;
      }
    }
    for (;;)
    {
      int n;
      int i2;
      Object localObject;
      if (this.m != null)
      {
        lie locallie = new lie(paramContext, this.a, this.d, this.m.booleanValue());
        locallie.a.i();
        locallie.a.c("SetSquareShowNotificationsOp");
        if (locallie.a.n())
        {
          n = 1;
          int i1 = locallie.a.o;
          if ((j != 200) || (i1 == 200)) {
            break label548;
          }
          Exception localException3 = locallie.a.q;
          j = i1;
          i2 = n;
          localObject = localException3;
        }
      }
      for (;;)
      {
        boolean bool;
        if (k == 0)
        {
          bool = false;
          if (i2 == 0) {}
        }
        else
        {
          bool = true;
        }
        if (!bool) {
          ((kyn)mbb.a(paramContext, kyn.class)).a(this.c, this.d, localomv1);
        }
        return new hae(j, (Exception)localObject, a(paramContext, bool));
        i3 = 1;
        break;
        i3 = i;
        break;
        i3 = 3;
        break;
        i3 = 4;
        break;
        localomv1.a = this.l.intValue();
        i4 = 0;
        break label127;
        if (this.m.booleanValue()) {}
        for (;;)
        {
          localomv1.b = i;
          n = 0;
          break;
          i = 1;
        }
        omv localomv2 = new omv();
        if (this.l != null) {
          localomv2.a = this.l.intValue();
        }
        if (this.m != null) {
          if (!this.m.booleanValue()) {
            break label543;
          }
        }
        for (;;)
        {
          localomv2.b = i;
          lig locallig = new lig(paramContext, this.a, this.d, localomv2);
          this.b.a(locallig);
          if (!locallig.n()) {
            ((kyn)mbb.a(paramContext, kyn.class)).a(this.c, this.d, localomv2);
          }
          return new hae(locallig.o, locallig.q, a(paramContext, locallig.n()));
          label543:
          i = 1;
        }
        label548:
        Exception localException2 = localException1;
        i2 = n;
        localObject = localException2;
        continue;
        localObject = localException1;
        i2 = 0;
      }
      label573:
      j = 200;
      localException1 = null;
      k = 0;
    }
  }
  
  public final String b(Context paramContext)
  {
    if ((this.m != null) && (this.l == null))
    {
      if (this.m.booleanValue()) {}
      for (int i = fh.j;; i = fh.h) {
        return paramContext.getString(i);
      }
    }
    return paramContext.getString(fh.q);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lih
 * JD-Core Version:    0.7.0.1
 */