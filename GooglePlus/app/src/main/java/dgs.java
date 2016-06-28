import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.phone.sharebox.PlusShareboxActivity;

public final class dgs
{
  public final Intent a;
  
  public dgs(Context paramContext)
  {
    this.a = new Intent(paramContext, PlusShareboxActivity.class);
    this.a.putExtra("disable_location", true);
  }
  
  public final dgs a(boolean paramBoolean)
  {
    this.a.putExtra("restrict_to_domain", paramBoolean);
    Intent localIntent = this.a;
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      localIntent.putExtra("enable_domain_restrict_toggle", bool);
      return this;
    }
  }
  
  public final dgs b(boolean paramBoolean)
  {
    this.a.putExtra("is_limited_sharing", paramBoolean);
    this.a.putExtra("is_limited", paramBoolean);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgs
 * JD-Core Version:    0.7.0.1
 */