import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class khe
  implements khi
{
  private final ics a;
  private final Map<rac, rgq<khi>> b;
  private final kez c;
  
  khe(Map<rac, rgq<khi>> paramMap, ics paramics, kez paramkez)
  {
    this.a = paramics;
    this.b = paramMap;
    this.c = paramkez;
  }
  
  public final void a(qzz paramqzz, Map<String, qzz> paramMap, kfg paramkfg, khj paramkhj)
  {
    boolean bool = paramqzz.o().equals(rac.e);
    String str1 = String.valueOf(paramqzz.o().name());
    String str2;
    PreferenceCategory localPreferenceCategory;
    label123:
    qzz localqzz1;
    if (str1.length() != 0)
    {
      str2 = "GroupCardToPreferenceConverter cannot handle ".concat(str1);
      efj.d(bool, str2);
      qvv localqvv = (qvv)paramqzz.b(qvv.c);
      localPreferenceCategory = (PreferenceCategory)this.c.a(this.a.b(localqvv.b().b()));
      localPreferenceCategory.d(paramqzz.c);
      paramkfg.b(localPreferenceCategory);
      Iterator localIterator = ((qvv)paramqzz.b(qvv.c)).a.iterator();
      if (!localIterator.hasNext()) {
        return;
      }
      localqzz1 = (qzz)localIterator.next();
      if (localqzz1.o() != rac.b) {
        break label226;
      }
    }
    label226:
    for (qzz localqzz2 = (qzz)paramMap.get(localqzz1.c);; localqzz2 = localqzz1)
    {
      ((khi)((rgq)this.b.get(localqzz2.o())).a()).a(localqzz2, paramMap, localPreferenceCategory, paramkhj);
      break label123;
      str2 = new String("GroupCardToPreferenceConverter cannot handle ");
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     khe
 * JD-Core Version:    0.7.0.1
 */