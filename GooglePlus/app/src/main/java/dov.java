import android.content.Intent;

final class dov
  implements key
{
  dov(doq paramdoq) {}
  
  public final boolean a(ket paramket)
  {
    if (!"TRUE".equalsIgnoreCase(dun.d.a()))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(efj.a(this.a.bn, "auto_backup", "https://support.google.com/plus/?hl=%locale%"));
      this.a.a(localIntent);
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dov
 * JD-Core Version:    0.7.0.1
 */