import android.content.Context;
import android.text.TextUtils;

final class bsh
{
  final boolean a;
  final bup b;
  final bsb c;
  final boolean d;
  final int e;
  final int f;
  final Context g;
  String h;
  String i;
  int j = 0;
  
  public bsh(Context paramContext, int paramInt1, bup parambup, String paramString, int paramInt2, bsb parambsb, boolean paramBoolean)
  {
    this.g = paramContext;
    this.f = paramInt1;
    this.h = paramString;
    this.b = parambup;
    this.e = paramInt2;
    this.c = parambsb;
    this.d = paramBoolean;
    this.a = TextUtils.isEmpty(this.h);
    if (this.b != null)
    {
      bup localbup = this.b;
      localbup.j = (this.e + localbup.j);
    }
  }
  
  public final bsi a()
  {
    if (!d()) {
      return bsi.a;
    }
    if (!c()) {
      return bsi.b;
    }
    if (b()) {
      return bsi.c;
    }
    String str = String.valueOf("Unknown stop reason, valid resume token: ");
    boolean bool1 = d();
    boolean bool2 = c();
    throw new IllegalStateException(34 + String.valueOf(str).length() + str + bool1 + ", under metadata limit: " + bool2);
  }
  
  final boolean b()
  {
    return (this.b != null) && (this.b.b());
  }
  
  final boolean c()
  {
    return jqx.b(this.g, this.f) < this.e;
  }
  
  final boolean d()
  {
    return (!TextUtils.isEmpty(this.h)) && (!this.h.equals(this.i));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsh
 * JD-Core Version:    0.7.0.1
 */