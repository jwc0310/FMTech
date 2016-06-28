import android.content.Context;
import android.util.Log;

public final class dqj
  extends hqe<ojj>
{
  private Context d;
  private int e;
  private String f;
  private ojl h;
  
  public dqj(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext);
    this.d = paramContext;
    this.e = paramInt;
    this.f = paramString;
    this.h = new ojl();
  }
  
  private ojj r()
  {
    this.h.a = Boolean.valueOf(true);
    jru localjru;
    try
    {
      ojl localojl1 = new ojl();
      byte[] arrayOfByte = qat.a(this.h);
      ojl localojl2 = (ojl)qat.b(localojl1, arrayOfByte, 0, arrayOfByte.length);
      kcg localkcg = new kch().a(this.d, this.e).a();
      localjru = new jru(this.d, localkcg, this.f, localojl2);
      localjru.i();
      if (localjru.n()) {
        return null;
      }
    }
    catch (qas localqas)
    {
      Log.e("PhotosSettingsLoader", "Failed to create SettingsToFetch request", localqas);
      return null;
    }
    return localjru.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqj
 * JD-Core Version:    0.7.0.1
 */