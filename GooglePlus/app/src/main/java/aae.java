import android.os.Bundle;
import java.util.List;

public final class aae
{
  final Bundle a;
  aam b;
  
  public aae(aam paramaam, boolean paramBoolean)
  {
    if (paramaam == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    this.a = new Bundle();
    this.b = paramaam;
    this.a.putBundle("selector", paramaam.a);
    this.a.putBoolean("activeScan", paramBoolean);
  }
  
  final void a()
  {
    if (this.b == null)
    {
      this.b = aam.a(this.a.getBundle("selector"));
      if (this.b == null) {
        this.b = aam.c;
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof aae;
    boolean bool2 = false;
    if (bool1)
    {
      aae localaae = (aae)paramObject;
      a();
      aam localaam = this.b;
      localaae.a();
      boolean bool3 = localaam.equals(localaae.b);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = this.a.getBoolean("activeScan");
        boolean bool5 = localaae.a.getBoolean("activeScan");
        bool2 = false;
        if (bool4 == bool5) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    a();
    int i = this.b.hashCode();
    if (this.a.getBoolean("activeScan")) {}
    for (int j = 1;; j = 0) {
      return j ^ i;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("DiscoveryRequest{ selector=");
    a();
    localStringBuilder2.append(this.b);
    localStringBuilder1.append(", activeScan=").append(this.a.getBoolean("activeScan"));
    StringBuilder localStringBuilder3 = localStringBuilder1.append(", isValid=");
    a();
    aam localaam = this.b;
    localaam.a();
    if (localaam.b.contains(null)) {}
    for (boolean bool = false;; bool = true)
    {
      localStringBuilder3.append(bool);
      localStringBuilder1.append(" }");
      return localStringBuilder1.toString();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aae
 * JD-Core Version:    0.7.0.1
 */