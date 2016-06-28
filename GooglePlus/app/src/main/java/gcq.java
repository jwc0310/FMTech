import android.content.Intent;

public final class gcq
  extends gcp
  implements gcm
{
  private Intent a = new Intent();
  
  public gcq()
  {
    this.a.setPackage("com.google.android.gms");
    this.a.setAction("com.google.android.gms.people.smart_profile.ACTION_SHOW_PROFILE");
  }
  
  public final Intent a()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gcq
 * JD-Core Version:    0.7.0.1
 */