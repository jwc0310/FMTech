import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;

final class djf
  implements View.OnClickListener
{
  djf(dje paramdje) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.f == null) {
      return;
    }
    jzl localjzl = new jzl(this.a.aM);
    int i = this.a.ar;
    localjzl.a.putExtra("account_id", i);
    String str1 = this.a.f;
    localjzl.a.putExtra("profile_gaia_id", str1);
    String str2 = this.a.b();
    localjzl.a.putExtra("profile_name", str2);
    if (this.a.a != null) {
      if ((this.a.a.a == null) || (this.a.a.a.getCount() <= 0)) {
        break label181;
      }
    }
    Intent localIntent;
    label181:
    for (boolean bool = true;; bool = false)
    {
      localjzl.a.putExtra("has_collexions", bool);
      localjzl.a.putExtra("has_squares", true);
      localIntent = localjzl.a;
      if (Build.VERSION.SDK_INT >= 16) {
        break;
      }
      this.a.aM.startActivity(localIntent);
      return;
    }
    this.a.aM.startActivity(localIntent, ((gvj)mbb.a(this.a.aM, gvj.class)).a());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     djf
 * JD-Core Version:    0.7.0.1
 */