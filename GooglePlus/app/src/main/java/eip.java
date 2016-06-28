import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

final class eip
{
  private final String a;
  private final ComponentName b;
  
  public eip(ComponentName paramComponentName)
  {
    this.a = null;
    this.b = ((ComponentName)efj.a(paramComponentName));
  }
  
  public eip(String paramString)
  {
    this.a = efj.d(paramString);
    this.b = null;
  }
  
  public final Intent a()
  {
    if (this.a != null) {
      return new Intent(this.a).setPackage("com.google.android.gms");
    }
    return new Intent().setComponent(this.b);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    eip localeip;
    do
    {
      return true;
      if (!(paramObject instanceof eip)) {
        return false;
      }
      localeip = (eip)paramObject;
    } while ((efj.a(this.a, localeip.a)) && (efj.a(this.b, localeip.b)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = this.b;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    if (this.a == null) {
      return this.b.flattenToString();
    }
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eip
 * JD-Core Version:    0.7.0.1
 */