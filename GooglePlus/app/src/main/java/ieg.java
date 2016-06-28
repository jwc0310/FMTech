import android.content.Context;
import java.util.List;

public final class ieg
  implements gjg
{
  final hgs a;
  private final giz b;
  
  public ieg(Context paramContext)
  {
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.a = ((hgs)mbb.a(paramContext, hgs.class));
  }
  
  private static void a(gjc paramgjc, String paramString, ieh paramieh)
  {
    String str1 = String.valueOf(paramString);
    String str2 = String.valueOf("count");
    String str3;
    String str4;
    String str6;
    label70:
    gjc localgjc2;
    String str7;
    String str8;
    if (str2.length() != 0)
    {
      str3 = str1.concat(str2);
      gjc localgjc1 = paramgjc.b(str3, paramieh.b);
      str4 = String.valueOf(paramString);
      String str5 = String.valueOf("acknowledged");
      if (str5.length() == 0) {
        break label142;
      }
      str6 = str4.concat(str5);
      localgjc2 = localgjc1.b(str6, paramieh.c);
      str7 = String.valueOf(paramString);
      str8 = String.valueOf("last_accessed_time");
      if (str8.length() == 0) {
        break label156;
      }
    }
    label142:
    label156:
    for (String str9 = str7.concat(str8);; str9 = new String(str7))
    {
      localgjc2.b(str9, paramieh.a).d();
      return;
      str3 = new String(str1);
      break;
      str6 = new String(str4);
      break label70;
    }
  }
  
  public final ieh a(int paramInt, String paramString)
  {
    gjc localgjc = this.b.b(paramInt).f("com.google.android.libraries.social.help.TooltipSettingsExtension");
    String str1 = String.valueOf(paramString);
    String str2 = String.valueOf("count");
    String str3;
    int i;
    String str4;
    String str6;
    label90:
    long l;
    String str7;
    String str8;
    if (str2.length() != 0)
    {
      str3 = str1.concat(str2);
      i = localgjc.a(str3, 0);
      if (i == 0) {
        break label191;
      }
      str4 = String.valueOf(paramString);
      String str5 = String.valueOf("last_accessed_time");
      if (str5.length() == 0) {
        break label163;
      }
      str6 = str4.concat(str5);
      l = localgjc.a(str6, 0L);
      str7 = String.valueOf(paramString);
      str8 = String.valueOf("acknowledged");
      if (str8.length() == 0) {
        break label177;
      }
    }
    label163:
    label177:
    for (String str9 = str7.concat(str8);; str9 = new String(str7))
    {
      return new ieh(this, i, l, localgjc.a(str9, false));
      str3 = new String(str1);
      break;
      str6 = new String(str4);
      break label90;
    }
    label191:
    return new ieh(this);
  }
  
  public final void a(int paramInt, String paramString, ieh paramieh)
  {
    a(this.b.b(paramInt).f("com.google.android.libraries.social.help.TooltipSettingsExtension"), paramString, paramieh);
  }
  
  public final void a(Context paramContext, gje paramgje) {}
  
  public final void a(gjc paramgjc, String paramString)
  {
    ieh localieh = new ieh(this, 1, 0L, true);
    a(paramgjc.f("com.google.android.libraries.social.help.TooltipSettingsExtension"), paramString, localieh);
  }
  
  public final void a(List<gji> paramList) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ieg
 * JD-Core Version:    0.7.0.1
 */