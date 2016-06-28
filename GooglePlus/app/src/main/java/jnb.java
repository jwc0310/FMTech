import android.os.Bundle;
import java.util.ArrayList;

class jnb
  implements hrh
{
  private final String a;
  private final int b;
  
  jnb(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public final bk a(ArrayList<String> paramArrayList)
  {
    jmp localjmp = new jmp();
    Bundle localBundle = new Bundle();
    localBundle.putString("ShareouselSlide.ARG_ENSEMBLE_NAME", this.a);
    localBundle.putStringArrayList("ShareouselSlide.ARG_SHAREOUSEL_ORDER", paramArrayList);
    localjmp.f(localBundle);
    return localjmp;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public void a(hrg paramhrg) {}
  
  public final int b()
  {
    return this.b;
  }
  
  public final hrg c()
  {
    hrg localhrg = new hrg();
    a(localhrg);
    return localhrg;
  }
  
  public final boolean d()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jnb
 * JD-Core Version:    0.7.0.1
 */