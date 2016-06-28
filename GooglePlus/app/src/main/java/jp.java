import android.os.CancellationSignal.OnCancelListener;

final class jp
  implements CancellationSignal.OnCancelListener
{
  jp(jo paramjo) {}
  
  public final void onCancel()
  {
    this.a.a.a();
    this.a.cancel(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jp
 * JD-Core Version:    0.7.0.1
 */