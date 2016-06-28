import android.content.Context;

public final class hzl
{
  public static final String a = hyk.class.getName();
  public static final String b = kbz.class.getName();
  public static final String c = ilp.class.getName();
  public static final String d = hyh.class.getName();
  public static final String e = hze.class.getName();
  public static final String f = hyi.class.getName();
  public static final String g = hyf.class.getName();
  public static final String h = mcn.class.getName();
  private static hzk i;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (i == null) {
      i = new hzk();
    }
    ilp[] arrayOfilp = new ilp[1];
    arrayOfilp[0] = new hzc(paramContext);
    parammbb.a(ilp.class, arrayOfilp);
  }
  
  public static void a(mbb parammbb)
  {
    if (i == null) {
      i = new hzk();
    }
    parammbb.a(hyk.class, (hyk)parammbb.a(hyi.class));
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (i == null) {
      i = new hzk();
    }
    parammbb.a(hyh.class, new hzg(paramContext));
  }
  
  public static void b(mbb parammbb)
  {
    if (i == null) {
      i = new hzk();
    }
    kbz[] arrayOfkbz = new kbz[1];
    arrayOfkbz[0] = new hzm();
    parammbb.a(kbz.class, arrayOfkbz);
  }
  
  public static void c(Context paramContext, mbb parammbb)
  {
    if (i == null) {
      i = new hzk();
    }
    parammbb.a(hze.class, new hzf(paramContext));
  }
  
  public static void c(mbb parammbb)
  {
    if (i == null) {
      i = new hzk();
    }
    hyf[] arrayOfhyf = new hyf[2];
    arrayOfhyf[0] = hyl.a;
    arrayOfhyf[1] = hyl.b;
    parammbb.a(hyf.class, arrayOfhyf);
  }
  
  public static void d(Context paramContext, mbb parammbb)
  {
    if (i == null) {
      i = new hzk();
    }
    parammbb.a(hyi.class, new hzh(paramContext, (hze)mbb.a(paramContext, hze.class), (hyh)mbb.a(paramContext, hyh.class)));
  }
  
  public static void d(mbb parammbb)
  {
    if (i == null) {
      i = new hzk();
    }
    parammbb.a(mcn.class, new mcn[0]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzl
 * JD-Core Version:    0.7.0.1
 */