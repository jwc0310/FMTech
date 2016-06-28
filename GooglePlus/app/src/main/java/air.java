import android.os.AsyncTask;

final class air
  extends AsyncTask<Object, Void, Void>
{
  private final ais a;
  
  public air(aiq paramaiq, ais paramais)
  {
    if (paramais == null) {
      throw new IllegalStateException("Invalid update filter chain listener");
    }
    this.a = paramais;
  }
  
  protected final void onPreExecute()
  {
    this.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     air
 * JD-Core Version:    0.7.0.1
 */