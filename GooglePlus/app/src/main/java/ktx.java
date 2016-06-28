import android.content.Intent;
import java.util.Set;

final class ktx
  implements ktu
{
  ktx(ktr paramktr) {}
  
  public final boolean a(Intent paramIntent)
  {
    Set localSet = paramIntent.getCategories();
    return (localSet != null) && (localSet.contains("android.intent.category.INFO"));
  }
  
  public final gxq b(Intent paramIntent)
  {
    return new gxq(pjp.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ktx
 * JD-Core Version:    0.7.0.1
 */