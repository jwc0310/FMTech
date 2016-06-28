import android.content.Intent;
import android.os.Bundle;

final class hov
  implements guf
{
  hov(hou paramhou) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if ((paramInt == -1) && (paramIntent != null))
    {
      Bundle localBundle = paramIntent.getExtras();
      hou localhou;
      if (localBundle != null)
      {
        this.a.c = localBundle.getString("clx_id");
        this.a.d = localBundle.getString("clx_name");
        int i = localBundle.getInt("clx_acl");
        localhou = this.a;
        if (i != 2) {
          break label107;
        }
      }
      label107:
      for (boolean bool = true;; bool = false)
      {
        localhou.Z = bool;
        if (this.a.aa != null)
        {
          this.a.aa.aA_();
          this.a.f().finish();
        }
        return;
      }
    }
    this.a.f().finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hov
 * JD-Core Version:    0.7.0.1
 */