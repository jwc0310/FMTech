import android.widget.Toast;
import com.google.android.apps.plus.service.EsSyncAdapterService;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import java.util.Collections;

final class doa
  implements jpe, kex
{
  doa(dny paramdny) {}
  
  public final void a(jpg paramjpg)
  {
    boolean bool1 = paramjpg.a("android.permission.READ_CONTACTS");
    if ((this.a.d.b) && (bool1)) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      int i = this.a.a.c();
      if (bgp.g(this.a.bn, i) != bool2)
      {
        bgp.d(this.a.bn, i, bool2);
        EsSyncAdapterService.a(this.a.bn, i);
      }
      if (this.a.d.b != bool2) {
        this.a.d.a(bool2);
      }
      if (!bool1) {
        Toast.makeText(this.a.bn, aau.eo, 1).show();
      }
      return;
    }
  }
  
  public final boolean a(ket paramket, Object paramObject)
  {
    this.a.b.a(this.a.c, aaw.iV, Collections.singletonList("android.permission.READ_CONTACTS"));
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     doa
 * JD-Core Version:    0.7.0.1
 */