import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import java.util.Map;

public final class khb
  implements khi
{
  private final ics a;
  private final kez b;
  private final pec c;
  
  khb(ics paramics, kez paramkez, pec parampec)
  {
    this.a = paramics;
    this.b = paramkez;
    this.c = parampec;
  }
  
  public final void a(qzz paramqzz, Map<String, qzz> paramMap, kfg paramkfg, khj paramkhj)
  {
    boolean bool = paramqzz.o().equals(rac.d);
    String str1 = String.valueOf(paramqzz.o().name());
    String str2;
    qvm localqvm;
    String str3;
    String str4;
    rau localrau;
    label125:
    int i;
    label170:
    Uri localUri;
    if (str1.length() != 0)
    {
      str2 = "BooleanCardToPreferenceConverter cannot handle ".concat(str1);
      efj.d(bool, str2);
      localqvm = (qvm)paramqzz.b(qvm.d);
      qwi localqwi = localqvm.c();
      str3 = this.a.b(localqwi.b());
      str4 = this.a.b(localqwi.c());
      if (!localqwi.d()) {
        break label362;
      }
      qzt localqzt = localqwi.o();
      if (!localqzt.b()) {
        break label350;
      }
      localrau = localqzt.c();
      if ((localrau == null) || (localrau.a.size() != 1)) {
        break label362;
      }
      if ((0x4 & ((ras)localrau.a.get(0)).a) != 4) {
        break label356;
      }
      i = 1;
      if ((i == 0) || (((ras)localrau.a.get(0)).c().b() != rbj.b)) {
        break label362;
      }
      localUri = Uri.parse(((ras)localqzt.c().a.get(0)).c().a);
    }
    label350:
    label356:
    label362:
    for (Object localObject = this.b.c(str3, str4, new Intent("android.intent.action.VIEW", localUri));; localObject = null)
    {
      if (localObject == null) {
        localObject = this.b.e(str3, str4);
      }
      ((CheckBoxPreference)localObject).d(localqvm.b().b);
      ((ket)localObject).w = false;
      ((CheckBoxPreference)localObject).a(localqvm.b);
      ((ket)localObject).o = new pee(this.c, "Toggle Boolean Setting", new khc(this, paramkhj));
      paramkfg.b((ket)localObject);
      return;
      str2 = new String("BooleanCardToPreferenceConverter cannot handle ");
      break;
      localrau = null;
      break label125;
      i = 0;
      break label170;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     khb
 * JD-Core Version:    0.7.0.1
 */