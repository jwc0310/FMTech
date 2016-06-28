import android.text.TextUtils;
import com.google.android.libraries.social.settings.CheckBoxPreference;

final class dqn
  implements key
{
  dqn(dqk paramdqk) {}
  
  public final boolean a(ket paramket)
  {
    String str = paramket.s;
    boolean bool1 = ((CheckBoxPreference)paramket).b;
    ojj localojj = new ojj();
    int i = this.a.d.c();
    boolean bool2;
    if (TextUtils.equals(str, "photo_location")) {
      if (this.a.a.a.booleanValue() != bool1)
      {
        bool2 = true;
        this.a.a.a = Boolean.valueOf(bool1);
        localojj.a = this.a.a.a;
      }
    }
    for (;;)
    {
      if (bool2)
      {
        dqt localdqt = new dqt(this.a.bn, i, localojj);
        gzj localgzj = this.a.c;
        localgzj.d.a(localdqt, false);
        localgzj.b(localdqt);
      }
      return bool2;
      bool2 = false;
      break;
      bool2 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqn
 * JD-Core Version:    0.7.0.1
 */