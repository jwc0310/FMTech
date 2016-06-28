import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

public final class lzq
  extends hqe<nzp[]>
{
  private static final nzp[] d = new nzp[0];
  private final int e;
  private final String f;
  private nzp[] h;
  private volatile kbw r;
  
  public lzq(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext);
    this.e = paramInt;
    this.f = paramString;
  }
  
  private nzp[] r()
  {
    if (TextUtils.isEmpty(this.f)) {
      return d;
    }
    lzr locallzr = new lzr(this.l, new kcg(this.l, this.e), this.f);
    this.r = locallzr;
    try
    {
      locallzr.i();
      if (locallzr.u)
      {
        nzp[] arrayOfnzp = d;
        return arrayOfnzp;
      }
      this.r = null;
      if (!locallzr.n()) {
        break label135;
      }
      locallzr.c("OneboxSearchLoader");
      if (locallzr.q != null)
      {
        Log.e("OneboxSearchLoader", "Failed to fetch onebox data.", locallzr.q);
        return d;
      }
    }
    finally
    {
      this.r = null;
    }
    Log.e("OneboxSearchLoader", "Failed to fetch onebox data.");
    return d;
    label135:
    if (locallzr.x) {}
    for (qat localqat = locallzr.w;; localqat = null)
    {
      nam localnam = (nam)localqat;
      nzt localnzt = null;
      if (localnam != null)
      {
        oag localoag = localnam.a;
        localnzt = null;
        if (localoag != null) {
          localnzt = localnam.a.a;
        }
      }
      if ((localnzt == null) || (localnzt.d == null)) {
        break;
      }
      return localnzt.d;
    }
    return d;
  }
  
  protected final void g()
  {
    if ((this.h == null) && (!TextUtils.isEmpty(this.f))) {
      a();
    }
  }
  
  public final boolean k()
  {
    kbw localkbw = this.r;
    if (localkbw != null) {
      localkbw.j();
    }
    this.r = null;
    return super.k();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzq
 * JD-Core Version:    0.7.0.1
 */