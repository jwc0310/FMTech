import android.text.TextUtils;
import com.google.android.apps.plus.views.VideoProgressView;

public class jqe
{
  public jqe(azm paramazm) {}
  
  public void a(jqf paramjqf, double paramDouble1, double paramDouble2)
  {
    if ((paramjqf != null) && (!TextUtils.isEmpty(paramjqf.a)) && (this.a.a.a() != null) && (paramjqf.a.equals(this.a.a.a().c)) && (this.a.c != null))
    {
      azm.a(this.a, true, false);
      this.a.c.a(paramDouble1);
      this.a.c.b(paramDouble2);
    }
  }
  
  public void a(jqf paramjqf, boolean paramBoolean)
  {
    if ((paramjqf != null) && (!TextUtils.isEmpty(paramjqf.a)) && (this.a.a.a() != null) && (paramjqf.a.equals(this.a.a.a().c)))
    {
      this.a.a(paramBoolean);
      if (paramBoolean) {
        azm.a(this.a, true, true);
      }
      return;
    }
    this.a.a(false);
    azm.a(this.a, false, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqe
 * JD-Core Version:    0.7.0.1
 */