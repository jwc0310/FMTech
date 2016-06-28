import android.media.AudioManager;

final class acd
  extends aaj
{
  acd(acc paramacc) {}
  
  public final void b(int paramInt)
  {
    this.a.i.setStreamVolume(3, paramInt, 0);
    this.a.a();
  }
  
  public final void c(int paramInt)
  {
    int i = this.a.i.getStreamVolume(3);
    if (Math.min(this.a.i.getStreamMaxVolume(3), Math.max(0, i + paramInt)) != i) {
      this.a.i.setStreamVolume(3, i, 0);
    }
    this.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acd
 * JD-Core Version:    0.7.0.1
 */