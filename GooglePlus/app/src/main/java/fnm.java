import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.regex.Pattern;

public final class fnm
  extends ehn
  implements fns
{
  private final Bundle a;
  
  static
  {
    new String[] { "_id", "qualified_id", "gaia_id", "name", "sort_key", "sort_key_irank", "avatar", "profile_type", "v_circle_ids", "blocked", "in_viewer_domain", "last_modified", "name_verified", "given_name", "family_name", "affinity1", "affinity2", "affinity3", "affinity4", "affinity5", "people_in_common", "v_emails", "v_phones" };
  }
  
  public fnm(DataHolder paramDataHolder, int paramInt, Bundle paramBundle, fmd paramfmd1, fmd paramfmd2)
  {
    super(paramDataHolder, paramInt);
    this.a = paramBundle;
    this.a.getBoolean("emails_with_affinities", false);
  }
  
  public final long c()
  {
    return a("_id");
  }
  
  public final String d()
  {
    return d("qualified_id");
  }
  
  public final String e()
  {
    return d("gaia_id");
  }
  
  public final String f()
  {
    return d("name");
  }
  
  public final String g()
  {
    return d("sort_key");
  }
  
  public final String h()
  {
    return d("sort_key_irank");
  }
  
  public final String i()
  {
    return fmp.a.a(d("avatar"));
  }
  
  public final int j()
  {
    return b("profile_type");
  }
  
  public final String[] k()
  {
    String str = d("v_circle_ids");
    if (TextUtils.isEmpty(str)) {
      return fne.a;
    }
    return fne.b.split(str, -1);
  }
  
  public final int l()
  {
    return b("in_viewer_domain");
  }
  
  public final long m()
  {
    return a("last_modified");
  }
  
  public final boolean n()
  {
    return b("name_verified") != 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fnm
 * JD-Core Version:    0.7.0.1
 */