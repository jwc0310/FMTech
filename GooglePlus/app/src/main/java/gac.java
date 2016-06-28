import android.content.Context;

final class gac
  implements fym
{
  private static final ftb<fyq, fla> b = new gad();
  private static final ftb<fyu, flh> c = new gae();
  private static final ftb<fys, flf> d = new gaf();
  private final Context a;
  
  public gac(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static efd a(fyy paramfyy)
  {
    if ((paramfyy instanceof gax)) {
      return ((gax)paramfyy).a;
    }
    return null;
  }
  
  public final fsg<fys> a(fyy paramfyy, fyr paramfyr)
  {
    flc localflc = flp.c;
    efd localefd = a(paramfyy);
    fle localfle = new fle();
    localfle.b = false;
    localfle.c = 0;
    return new fsg(localflc.a(localefd, localfle), d);
  }
  
  public final fsg<fyq> a(fyy paramfyy, String paramString1, String paramString2, fyp paramfyp)
  {
    flc localflc = flp.c;
    efd localefd = a(paramfyy);
    fld localfld = new fld();
    localfld.c = paramfyp.b;
    localfld.d = paramfyp.c;
    localfld.e = paramfyp.d;
    localfld.b = paramfyp.a;
    return new fsg(localflc.a(localefd, paramString1, paramString2, localfld), b);
  }
  
  public final fsg<fyu> a(fyy paramfyy, String paramString1, String paramString2, fyt paramfyt)
  {
    flc localflc = flp.c;
    efd localefd = a(paramfyy);
    flg localflg = new flg();
    localflg.b = paramfyt.a;
    localflg.c = paramfyt.b;
    localflg.d = paramfyt.c;
    localflg.e = paramfyt.d;
    localflg.f = paramfyt.e;
    localflg.g = paramfyt.f;
    localflg.h = paramfyt.g;
    localflg.i = paramfyt.h;
    localflg.j = paramfyt.i;
    return new fsg(localflc.a(localefd, paramString1, paramString2, localflg), c);
  }
  
  public final fyy a()
  {
    int i = 1;
    efe localefe = new efe(this.a);
    eew localeew = flp.b;
    fls localfls = new fls();
    localfls.a = i;
    if (localfls.a >= 0) {}
    for (;;)
    {
      efj.b(i, "Must provide valid client application ID!");
      return new gax(localefe.a(localeew, new flr(localfls)).a());
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gac
 * JD-Core Version:    0.7.0.1
 */