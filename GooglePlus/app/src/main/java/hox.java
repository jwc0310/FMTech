import android.os.Bundle;

public final class hox
{
  public final Bundle a = new Bundle();
  
  public final hou a()
  {
    hou localhou = new hou();
    localhou.f(this.a);
    return localhou;
  }
  
  public final hox a(boolean paramBoolean)
  {
    this.a.putBoolean("is_share_to_space", true);
    if (!this.a.containsKey("show_reshare_shortcut")) {
      this.a.putBoolean("show_reshare_shortcut", false);
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hox
 * JD-Core Version:    0.7.0.1
 */