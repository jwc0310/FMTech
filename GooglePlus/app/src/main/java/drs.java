import android.content.Context;
import java.util.Map;

public final class drs
  implements khi
{
  final Context a;
  final fxb b;
  private final ics c;
  private final kez d;
  private final pec e;
  
  drs(Context paramContext, ics paramics, fxb paramfxb, kez paramkez, pec parampec)
  {
    this.a = paramContext;
    this.c = paramics;
    this.b = paramfxb;
    this.d = paramkez;
    this.e = parampec;
  }
  
  public final void a(qzz paramqzz, Map<String, qzz> paramMap, kfg paramkfg, khj paramkhj)
  {
    boolean bool;
    String str1;
    if (paramqzz.o() == rac.f)
    {
      bool = true;
      str1 = String.valueOf(paramqzz.o().name());
      if (str1.length() == 0) {
        break label158;
      }
    }
    label158:
    for (String str2 = "GplusLocaltionSettingsConverter cannot handle ".concat(str1);; str2 = new String("GplusLocaltionSettingsConverter cannot handle "))
    {
      efj.d(bool, str2);
      qvt localqvt = (qvt)paramqzz.b(qvt.c);
      String str3 = this.c.b(localqvt.b().b());
      String str4 = this.c.b(localqvt.b().c());
      ket localket = this.d.a(str3, str4);
      localket.d(localqvt.a);
      localket.p = new ped(this.e, "Click Google Location Settings", new drt(this));
      paramkfg.b(localket);
      return;
      bool = false;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     drs
 * JD-Core Version:    0.7.0.1
 */