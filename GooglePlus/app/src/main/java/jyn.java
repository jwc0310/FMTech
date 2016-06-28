import android.content.Context;
import android.os.Bundle;

final class jyn
  extends gzf
{
  private final kcg a;
  private final int b;
  
  jyn(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, paramString);
    this.a = new kcg(paramContext, paramInt);
    this.b = paramInt;
  }
  
  protected final hae a()
  {
    jym localjym = new jym(g(), this.a);
    localjym.i();
    if (localjym.n()) {
      return new hae(localjym.o, localjym.q, null);
    }
    qat localqat1;
    if (localjym.x)
    {
      localqat1 = localjym.w;
      if (localqat1 != null) {
        if (!localjym.x) {
          break label98;
        }
      }
    }
    label98:
    for (qat localqat2 = localjym.w;; localqat2 = null)
    {
      if (((muk)localqat2).a != null) {
        break label103;
      }
      return new hae(0, null, null);
      localqat1 = null;
      break;
    }
    label103:
    hae localhae = new hae(true);
    Bundle localBundle = localhae.a();
    if (localjym.x) {}
    for (qat localqat3 = localjym.w;; localqat3 = null)
    {
      nwz localnwz = ((muk)localqat3).a.a;
      if (localnwz != null) {
        localBundle.putParcelable("psi_response", new hqw(localnwz));
      }
      return localhae;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyn
 * JD-Core Version:    0.7.0.1
 */