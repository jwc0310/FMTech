import android.content.Context;

public final class kmv
{
  public final kog a;
  
  public kmv(kog paramkog)
  {
    this.a = paramkog;
  }
  
  public static gnb a(kob paramkob)
  {
    int i = 0;
    if (paramkob == null) {
      return null;
    }
    jjd[] arrayOfjjd2;
    if (paramkob.a != null)
    {
      arrayOfjjd2 = new jjd[paramkob.a.length];
      for (int m = 0; m < arrayOfjjd2.length; m++)
      {
        koe localkoe = paramkob.a[m];
        arrayOfjjd2[m] = new jjd(localkoe.a, localkoe.b, localkoe.c, localkoe.d, localkoe.e.booleanValue(), localkoe.f.booleanValue());
      }
    }
    for (jjd[] arrayOfjjd1 = arrayOfjjd2;; arrayOfjjd1 = null)
    {
      jgs[] arrayOfjgs2;
      if (paramkob.b != null)
      {
        arrayOfjgs2 = new jgs[paramkob.b.length];
        for (int k = 0; k < arrayOfjgs2.length; k++)
        {
          koc localkoc = paramkob.b[k];
          arrayOfjgs2[k] = new jgs(localkoc.a, localkoc.c.intValue(), localkoc.b, localkoc.d.intValue());
        }
      }
      for (jgs[] arrayOfjgs1 = arrayOfjgs2;; arrayOfjgs1 = null)
      {
        lhp[] arrayOflhp2;
        if (paramkob.c != null)
        {
          arrayOflhp2 = new lhp[paramkob.c.length];
          for (int j = 0; j < arrayOflhp2.length; j++)
          {
            kof localkof = paramkob.c[j];
            arrayOflhp2[j] = new lhp(localkof.a, localkof.b, localkof.c, localkof.d, localkof.e.booleanValue());
          }
        }
        for (lhp[] arrayOflhp1 = arrayOflhp2;; arrayOflhp1 = null)
        {
          kod[] arrayOfkod = paramkob.d;
          hps[] arrayOfhps = null;
          if (arrayOfkod != null)
          {
            arrayOfhps = new hps[paramkob.d.length];
            while (i < arrayOfhps.length)
            {
              kod localkod = paramkob.d[i];
              arrayOfhps[i] = new hps(localkod.a, localkod.b, localkod.c.booleanValue());
              i++;
            }
          }
          return new gnb(arrayOfjjd1, arrayOfjgs1, arrayOflhp1, arrayOfhps);
        }
      }
    }
  }
  
  public static kob a(gnb paramgnb, Context paramContext)
  {
    int i = 0;
    if (paramgnb == null) {
      return null;
    }
    koe[] arrayOfkoe2;
    if (paramgnb.a > 0)
    {
      jjd[] arrayOfjjd = paramgnb.b;
      arrayOfkoe2 = new koe[arrayOfjjd.length];
      for (int n = 0; n < arrayOfjjd.length; n++)
      {
        koe localkoe = new koe();
        localkoe.d = arrayOfjjd[n].d;
        localkoe.c = arrayOfjjd[n].c;
        localkoe.e = Boolean.valueOf(arrayOfjjd[n].e);
        localkoe.f = Boolean.valueOf(arrayOfjjd[n].f);
        localkoe.b = arrayOfjjd[n].b;
        localkoe.a = arrayOfjjd[n].a;
        arrayOfkoe2[n] = localkoe;
      }
    }
    for (koe[] arrayOfkoe1 = arrayOfkoe2;; arrayOfkoe1 = null)
    {
      koc[] arrayOfkoc2;
      if (paramgnb.c.length > 0)
      {
        jgs[] arrayOfjgs = paramgnb.c;
        arrayOfkoc2 = new koc[arrayOfjgs.length];
        for (int m = 0; m < arrayOfjgs.length; m++)
        {
          koc localkoc = new koc();
          localkoc.c = Integer.valueOf(arrayOfjgs[m].c);
          localkoc.a = arrayOfjgs[m].a;
          localkoc.b = arrayOfjgs[m].b;
          localkoc.d = Integer.valueOf(arrayOfjgs[m].d);
          arrayOfkoc2[m] = localkoc;
        }
      }
      for (koc[] arrayOfkoc1 = arrayOfkoc2;; arrayOfkoc1 = null)
      {
        kof[] arrayOfkof2;
        if (paramgnb.d.length > 0)
        {
          lhp[] arrayOflhp = paramgnb.d;
          arrayOfkof2 = new kof[arrayOflhp.length];
          for (int k = 0; k < arrayOflhp.length; k++)
          {
            kof localkof = new kof();
            localkof.e = Boolean.valueOf(arrayOflhp[k].e);
            localkof.a = arrayOflhp[k].a;
            localkof.b = arrayOflhp[k].b;
            localkof.c = arrayOflhp[k].c;
            localkof.d = arrayOflhp[k].d;
            arrayOfkof2[k] = localkof;
          }
        }
        for (kof[] arrayOfkof1 = arrayOfkof2;; arrayOfkof1 = null)
        {
          int j = paramgnb.e.length;
          kod[] arrayOfkod = null;
          if (j > 0)
          {
            hps[] arrayOfhps = paramgnb.e;
            arrayOfkod = new kod[arrayOfhps.length];
            while (i < arrayOfhps.length)
            {
              kod localkod = new kod();
              localkod.a = arrayOfhps[i].a;
              localkod.b = arrayOfhps[i].b;
              localkod.c = Boolean.valueOf(arrayOfhps[i].c);
              arrayOfkod[i] = localkod;
              i++;
            }
          }
          kob localkob = new kob();
          localkob.a = arrayOfkoe1;
          localkob.b = arrayOfkoc1;
          localkob.c = arrayOfkof1;
          localkob.d = arrayOfkod;
          localkob.e = paramgnb.b(paramContext);
          return localkob;
        }
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.trim().isEmpty());
  }
  
  public final String a()
  {
    if (this.a.n == null) {
      return null;
    }
    return this.a.n.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmv
 * JD-Core Version:    0.7.0.1
 */