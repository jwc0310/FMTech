import android.content.Intent;
import android.widget.Toast;

final class diq
  implements had
{
  diq(dik paramdik) {}
  
  public final void a(hae paramhae)
  {
    if (hae.a(paramhae))
    {
      Toast.makeText(this.a.bn, aw.z, 0).show();
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("should_refresh_data", true);
    this.a.f().setResult(-1, localIntent);
    this.a.f().finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     diq
 * JD-Core Version:    0.7.0.1
 */