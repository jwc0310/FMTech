import android.content.Context;
import android.content.res.Resources;

public final class bws
{
  final int a;
  final boolean b;
  final boolean c;
  final Context d;
  final bwv e;
  private final String f;
  private final bk g;
  private final String h;
  
  public bws(bk parambk, int paramInt, String paramString, boolean paramBoolean, bwv parambwv)
  {
    this(parambk, paramInt, paramString, paramBoolean, false, parambwv);
  }
  
  public bws(bk parambk, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, bwv parambwv)
  {
    if ((parambk == null) || (paramInt == -1) || (paramString == null)) {
      throw new IllegalArgumentException("Requires non null fragment, account and syncDialogTag.");
    }
    this.g = parambk;
    this.h = paramString;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = parambk.f().getApplicationContext();
    this.e = parambwv;
    this.a = paramInt;
    this.f = ((giz)mbb.a(parambk.f(), giz.class)).a(paramInt).b("account_name");
  }
  
  public final void a()
  {
    if (!hbj.a())
    {
      bz localbz = this.g.x;
      if (localbz.a(this.h) == null)
      {
        Resources localResources = this.d.getResources();
        int i = aau.mJ;
        Object[] arrayOfObject = new Object[2];
        int j = efj.Fz;
        arrayOfObject[0] = this.d.getResources().getString(j);
        arrayOfObject[1] = this.f;
        String str1 = localResources.getString(i, arrayOfObject);
        int k = aau.oj;
        String str2 = this.d.getResources().getString(k);
        int m = aau.uY;
        String str3 = this.d.getResources().getString(m);
        int n = aau.lP;
        lut locallut = lut.b(str2, str1, str3, this.d.getResources().getString(n));
        locallut.n = this.g;
        locallut.p = 0;
        locallut.ab = new bwu(this);
        locallut.a(localbz, this.h);
      }
      return;
    }
    new bwt(this).execute(null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bws
 * JD-Core Version:    0.7.0.1
 */