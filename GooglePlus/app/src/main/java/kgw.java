import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.Map;

public final class kgw
  implements mfb, mfd
{
  final bk a;
  final Map<rac, rgq<khi>> b;
  final ics c;
  PreferenceScreen d;
  khj e;
  private final rgq<PreferenceScreen> f;
  
  kgw(mek parammek, bk parambk, Map<rac, rgq<khi>> paramMap, rgq<PreferenceScreen> paramrgq, ics paramics)
  {
    this.a = parambk;
    this.f = paramrgq;
    this.b = paramMap;
    this.c = paramics;
    parammek.a(this);
  }
  
  public final void a()
  {
    this.d = ((PreferenceScreen)this.f.a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kgw
 * JD-Core Version:    0.7.0.1
 */