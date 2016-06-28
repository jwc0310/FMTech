import android.content.ComponentName;

public final class aai
{
  final ComponentName a;
  
  aai(ComponentName paramComponentName)
  {
    if (paramComponentName == null) {
      throw new IllegalArgumentException("componentName must not be null");
    }
    this.a = paramComponentName;
  }
  
  public final String toString()
  {
    return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aai
 * JD-Core Version:    0.7.0.1
 */