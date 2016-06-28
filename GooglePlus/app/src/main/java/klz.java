import android.content.Context;
import android.os.Bundle;

final class klz
  extends gzf
{
  private final String a;
  
  public klz(String paramString)
  {
    super("SelectShareboxTask");
    this.a = paramString;
  }
  
  protected final hae a(Context paramContext)
  {
    hae localhae = new hae(true);
    localhae.a().putString("sharelet_name_extra", this.a);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     klz
 * JD-Core Version:    0.7.0.1
 */