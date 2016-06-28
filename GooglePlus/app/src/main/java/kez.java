import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.LabelPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class kez
{
  public final Context a;
  private rgq<PreferenceScreen> b;
  private PreferenceScreen c;
  
  public kez(Context paramContext)
  {
    this.a = paramContext;
    this.c = ((kfs)mbb.a(paramContext, kfs.class)).a();
  }
  
  kez(Context paramContext, rgq<PreferenceScreen> paramrgq)
  {
    this.a = paramContext;
    this.b = paramrgq;
  }
  
  public final PreferenceCategory a(CharSequence paramCharSequence)
  {
    PreferenceCategory localPreferenceCategory = new PreferenceCategory(this.a);
    localPreferenceCategory.b(paramCharSequence);
    return localPreferenceCategory;
  }
  
  public final PreferenceScreen a()
  {
    if (this.c == null) {
      this.c = ((PreferenceScreen)this.b.a());
    }
    return this.c;
  }
  
  public final ket a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    ket localket = new ket(this.a);
    localket.b(paramCharSequence1);
    localket.a_(paramCharSequence2);
    return localket;
  }
  
  public final ket a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, Intent paramIntent)
  {
    ket localket = a(paramCharSequence1, paramCharSequence2);
    localket.t = paramIntent;
    return localket;
  }
  
  public final LabelPreference b(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    LabelPreference localLabelPreference = new LabelPreference(this.a);
    localLabelPreference.b(paramCharSequence1);
    localLabelPreference.a_(paramCharSequence2);
    return localLabelPreference;
  }
  
  public final LabelPreference b(CharSequence paramCharSequence1, CharSequence paramCharSequence2, Intent paramIntent)
  {
    LabelPreference localLabelPreference = new LabelPreference(this.a);
    localLabelPreference.b(paramCharSequence1);
    localLabelPreference.a_(null);
    localLabelPreference.t = paramIntent;
    return localLabelPreference;
  }
  
  public final PreferenceCategory b(CharSequence paramCharSequence)
  {
    PreferenceCategory localPreferenceCategory = a(paramCharSequence);
    a().b(localPreferenceCategory);
    return localPreferenceCategory;
  }
  
  public final CheckBoxPreference c(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    CheckBoxPreference localCheckBoxPreference = new CheckBoxPreference(this.a);
    localCheckBoxPreference.b(paramCharSequence1);
    localCheckBoxPreference.a_(paramCharSequence2);
    return localCheckBoxPreference;
  }
  
  public final ked c(CharSequence paramCharSequence1, CharSequence paramCharSequence2, Intent paramIntent)
  {
    ked localked = new ked(this.a);
    localked.b(paramCharSequence1);
    localked.a_(paramCharSequence2);
    localked.a = paramIntent;
    return localked;
  }
  
  public final kfx d(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    kfx localkfx = new kfx(this.a);
    localkfx.b(paramCharSequence1);
    localkfx.a_(paramCharSequence2);
    return localkfx;
  }
  
  public final CheckBoxPreference e(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    ker localker = new ker(this.a);
    localker.b(paramCharSequence1);
    localker.a_(paramCharSequence2);
    return localker;
  }
  
  public final kea f(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    kea localkea = new kea(this.a);
    localkea.b(paramCharSequence1);
    localkea.h = paramCharSequence1;
    localkea.a_(paramCharSequence2);
    int i = ei.d;
    localkea.i = localkea.l.getString(i);
    int j = ei.a;
    localkea.j = localkea.l.getString(j);
    return localkea;
  }
  
  public final kej g(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    kej localkej = new kej(this.a);
    localkej.b(paramCharSequence1);
    localkej.h = paramCharSequence1;
    localkej.a_(paramCharSequence2);
    return localkej;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kez
 * JD-Core Version:    0.7.0.1
 */