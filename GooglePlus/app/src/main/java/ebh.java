import android.content.Intent;

public class ebh
  extends ebe
{
  private final Intent a;
  
  public ebh(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.a = paramIntent;
  }
  
  public final Intent a()
  {
    if (this.a == null) {
      return null;
    }
    return new Intent(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ebh
 * JD-Core Version:    0.7.0.1
 */